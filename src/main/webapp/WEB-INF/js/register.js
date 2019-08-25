
$(function(){

    $(document).keyup(function (event) {
        if (event.keyCode == 13){
            $('#register-submit').trigger("click");
        }
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