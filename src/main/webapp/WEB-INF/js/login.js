
$(function(){
     //登录
    $('#login-submit').click(function(){
        var str_userPhone = $('#userPhone-input').val();
        var str_userPassword = $('#userPassword-input').val();
        if(isNull(str_userPhone) || isNull(str_userPassword)){
            alert("警告：请输入完整");
        }
        else if (!isPhone(str_userPhone)){
            alert("警告: 手机号格式不正确");
        }
        else if (!lengthMax(str_userPassword,20)) {
            alert("警告: 密码不能多于0个字符");
        }
        else{
            $.ajax({
                url:'login_do',
                type:'post',
                dataType:'json',
                data:$('#login-form').serialize(),//序列化
                success: function(result){
                    if(result.isOK){
                        $(window).attr('location', result.url);
                    }
                    else{
                        alert("登录失败:"+result.errMsg);
                    }
                },
                error: function(){
                    alert("警告: 系统错误");
                }
            });
        }

    })
});