<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="kr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Signin Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=request.getContextPath() %>/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<%=request.getContextPath() %>/css/signin.css" rel="stylesheet">
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/js.cookie-2.2.1.min.js"></script>

	<script type="text/javascript">

	$(function(){
		//remember me cookie확인
		if(Cookies.get("REMEMBERME")== "Y"){
			$("input[type=checkbox]").prop("checked", true);
			$("#inputEmail").val(Cookies.get("USERNM"));
		}	
		//sign in 버튼이 클릭 되었을때 이벤트 핸들러
		$("button").on("click", function(){
			console.log("button_click");
			if($("input[type=checkbox]").prop("checked")== true){
				Cookies.set("REMEMBERME", "Y");
				Cookies.set("USERNM", $("#inputEmail").val());

			}
			else{
				Cookies.remove("REMEMBERME");
				Cookies.remove("USERNM");
			}

			//submit
			$("form").submit();
		});
	});
	
		function getCookieValue(cookieName) {
			// 자바스크립트 로직
			var cookies = document.cookie.split("; ")
			for (i = 0; i < cookies.length; i++) {
				cookie = cookies[i].split("=");
				if (cookie[0] == cookieName) {
					return cookie[1];
				}
			}
		}

		function setCookie(cookieName , cookieValue, expires){

			//"USERNM=brown; path=/; expires-Wed, 07 Oct 2020 00:38:35 GMT;"
			
			var today = new Date();
			//현재날짜에서 미래로 + expires 만큼 할 날짜 구하기
			today.setDate( today.getDate() + expires);
			
			document.cookie = cookieName + "=" + cookieValue + "; path=/; expires=" + today.toGMTString();
			console.log(document.cookie); 
		}

		//해당 쿠키의 expires속성을 과거날짜로 변경
		function deleteCookie(cookieName){

			setCookie(cookieName, "", -1);
			
		}

		
		
	</script>

  </head>

  <body>
	
	
    <div class="container">

      <form class="form-signin" action="<%=request.getContextPath() %>/login" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" name="userId" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="button">Sign in</button>
      </form>

    </div> <!-- /container -->

  </body>
</html>
