$(function(){
	$('#username').focus().blur(checkName);
	$('#password').blur(checkPassword);
	$('#register').click(registerJump);

	//--------------------------------开始登陆处理-------------------------------------------

	var $username = $("#username");
	var $password = $("#password");
	var $checkcode = $("#checkcode");
	var $btnlogin = $("#btnlogin");
	var $emerrormsg = $("#emerrormsg");
    $username.keydown(function() {
        $emerrormsg.html('');
	});
    $password.keydown(function() {
        $emerrormsg.html('');
	});
    $btnlogin.click(function() {
        var parms = {"username": $username.val(), "password": $password.val(), "checkCode": $checkcode.val()};
    	console.log(parms);
        edop.ajax({
            type: "POST",
            url: "/login/toLogin",
            dataType: 'json',
            contentType: "application/json",
            data: JSON.stringify(parms),
            timeout: 20000,
            success: function(data) {
                if (data.success) {
                    console.log("登陆成功--开始跳转---------------------------------->>>>>");
                	window.location.href = 'index.html';
				} else {
					$emerrormsg.html(data.content);
				}
            },
            error: function(data) {
                return null;
            }
        })
	});
});

function checkName(){
	var name = $('#username').val();
	if(name == null || name == ""){
		//提示错误
		$('#count-msg').html("用户名不能为空");
		return false;
	}
	var reg = /^\w{3,10}$/;
	if(!reg.test(name)){
		$('#count-msg').html("输入3-10个字母或数字或下划线");
		return false;
	}
	$('#count-msg').empty();
	return true;
}

function checkPassword(){
	var password = $('#password').val();
	if(password == null || password == ""){
		//提示错误
		$('#password-msg').html("密码不能为空");
		return false;
	}
	var reg = /^\w{3,10}$/;
	if(!reg.test(password)){
		$('#password-msg').html("输入3-10个字母或数字或下划线");
		return false;
	}
	$('#password-msg').empty();
	return true;
}

function registerJump() {

    console.log("开始跳转到注册页面。。。");
	$('.page').load("register.html");
}