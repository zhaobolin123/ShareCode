//选择图片后预览
function imgChanged(f){
		var rd = new FileReader();//创建文件读取对象
        var files = f.files[0];//获取file组件中的文件
        rd.readAsDataURL(files);//文件读取装换为base64类型
        rd.onloadend = function(e) {
            //加载完毕之后获取结果赋值给img
            document.getElementById("img-updateImg").src = this.result;
            $('#bt-changeImg').html("重新选择");
        }
	}
$(function(){
	var form_updateImg = $('#modal-updateImg > div > div > div.modal-body > #form-updateImg').html();
	var form_updatePswd = $('#modal-updatePswd > div > div > div.modal-body > #form-updatePswd').html();
	var form_updateInfo = $('#modal-updateInfo > div > div > div.modal-body > #form-updateInfo').html();
	
	//修改图片
	//点击选择图片(用上级元素绑定，以免动态添加绑定失效)
	$('#modal-updateImg > div > div > div.modal-body').on('click','#bt-changeImg',function(){
		document.getElementById('input-updateImg').click();
	});
	//点击确定修改图片
	$('#modal-updateImg-bt').click(function(){
		var formData = new FormData($('#form-updateImg')[0]);
		$.ajax({
			url:"update_pic",
			type:"post",
			contentType: false,//enctype已在form中定义为multipart/form-data，此处需防止JQuery修改contentType
			processData: false,//防止JQuery修改form数据
			dataType:'json',
			data: formData,
			success: function(result){
				if(result.isOK){
                    alert("修改成功");
                    $(window).attr('location', result.url);//跳转刷新
                }
                else{
                    alert("修改失败:"+result.errMsg);
                }
			},
			error: function(){
				alert("警告：系统错误");
				$('#modal-updateImg').modal('hide');//关闭
			}
		});
	}),
	//关闭模态框时复原表单
	$('#modal-updateImg').on('hide.bs.modal',function(){
		$('#modal-updateImg > div > div > div.modal-body').empty();
		$('#modal-updateImg > div > div > div.modal-body').append(form_updateImg);
	});
	
	//修改密码
	//点击确定修改密码
	$('#modal-updatePswd-bt').click(function(){
        var str_oldPassword = $('#oldPassword').val();
        var str_newPassword = $('#newPassword').val();
        var str_newPassword2 = $('#newPassword2').val();
        if(isNull(str_oldPassword) || isNull(str_newPassword) || isNull(str_newPassword2)){
            alert("警告：请输入完整");
        }
        else if (!lengthMax(str_oldPassword,20) || !lengthMax(str_newPassword,20) || !lengthMax(str_newPassword2,20)){
            alert("警告: 密码不能多于20个字符");
        }
        else if (str_newPassword != str_newPassword2) {
            alert("警告: 两次新密码不相同");
        }
        else if (str_oldPassword == str_newPassword) {
            alert("警告: 新旧密码相同");
        }
        else{
            $.ajax({
                url:'update_pswd',
                type:'post',
                dataType:'json',
                data:$('#form-updatePswd').serialize(),//序列化
                success: function(result){
                    if(result.isOK){
                        alert("修改成功，重新登录");
                        $(window).attr('location', result.url);//跳转到登录
                    }
                    else{
                        alert("修改失败:"+result.errMsg);
                    }
                },
                error: function(){
                    alert("警告: 系统错误");
					$('#modal-updatePswd').modal('hide');//关闭
                }
            });
        }
	}),
	//关闭模态框时复原表单
	$('#modal-updatePswd').on('hide.bs.modal',function(){
		$('#modal-updatePswd > div > div > div.modal-body').empty();
		$('#modal-updatePswd > div > div > div.modal-body').append(form_updatePswd);
	});
	
	//修改资料
	//点击确定修改资料
	$('#modal-updateInfo-bt').click(function(){
        var str_userNickname = $('#userNickname').val();
        var str_userPhone = $('#userPhone').val();
        var str_userName = $('#userName').val();
        var str_userNumber = $('#userNumber').val();
        var str_userHeight = $('#userHeight').val();
        var str_userWeight = $('#userWeight').val();
        var str_userBirth = $('#userBirth').val();
        var str_sex = $('input:radio[name="sex"]:checked').val();
        var str_hometown = $('#hometown').val();
        if(isNull(str_userNickname) || isNull(str_userPhone)){
            alert("警告：请输入完整");
        }
        else if (!lengthMax(str_userNickname,10)) {
            alert("警告: 昵称不能多于10个字符");
        }
        else if (!isPhone(str_userPhone)){
            alert("警告: 手机号格式不正确");
        }
        else if (!isNull(str_userName) && !isChinese(str_userName)){
            alert("警告: 姓名为中文");
        }
        else if (!isNull(str_userName) && !lengthMin(str_userName,2)){
            alert("警告: 姓名至少2个字");
        }
        else if (!isNull(str_userName) && !lengthMax(str_userName,5)){
            alert("警告: 姓名最多5个字");
        }
        else if (!isNull(str_userNumber) && !isCardID(str_userNumber)){
            alert("警告: 身份证号不正确");
        }
        else if (!isNull(str_userHeight) && !isHeight(str_userHeight)){
            alert("警告: 身高（cm）输入不正确");
        }
        else if (!isNull(str_userWeight) && !isWeight(str_userWeight)){
            alert("警告: 体重（kg）输入不正确");
        }
        else if (!isNull(str_hometown) && !lengthMax(str_hometown,50)){
            alert("警告: 地址不超过50个字符");
        }
        else{
            $.ajax({
                url:'',
                type:'post',
                dataType:'json',
                data:$('#form-updateInfo').serialize(),//序列化
                success: function(result){
                    if(result.isOK){
                        alert("修改成功");
                        $(window).attr('location', result.url);//跳转刷新
                    }
                    else{
                        alert("修改失败:"+result.errMsg);
                    }
                },
                error: function(){
                    alert("警告: 系统错误");
					$('#modal-updateInfo').modal('hide');//关闭
                }
            });
        }
	}),
	//关闭模态框时复原表单
	$('#modal-updateInfo').on('hide.bs.modal',function(){
		$('#modal-updateInfo > div > div > div.modal-body').empty();
		$('#modal-updateInfo > div > div > div.modal-body').append(form_updateInfo);
	});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    //注册
    $('#register-submit').click(function(){
        var str_userNickname = $('#userNickname-input').val();
        var str_userPhone = $('#userPhone-input').val();
        var str_userPassword = $('#userPassword-input').val();
        if(isNull(str_userNickname) || isNull(str_userPhone) || isNull(str_userPassword)){
            alert("警告：请输入完整");
        }
        else if (!isPhone(str_userPhone)){
            alert("警告: 手机号格式不正确");
        }
        else if (!lengthMax(str_userPassword,20)) {
            alert("警告: 密码不能多于20个字符");
        }
        else{
            $.ajax({
                url:'register_do',
                type:'post',
                dataType:'json',
                data:$('#register-form').serialize(),//序列化
                success: function(result){
                    if(result.isOK){
                        alert("注册成功: 前往登录");
                        $(window).attr('location', result.url);
                    }
                    else{
                        alert("注册失败:"+result.errMsg);
                    }
                },
                error: function(){
                    alert("警告: 系统错误");
                }
            });
        }

    })
});