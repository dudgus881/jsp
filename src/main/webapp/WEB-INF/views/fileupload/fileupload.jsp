<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
<!-- client form method : post 
	 			 encType : multipart/form-date 
	 server - servlet @MultipartConfig
	 		- spring Framworked multipartResolver -->
	<h1>파일 업로드</h1>
	<form action="${cp} /fileupload/upload" method="post"  enctype="multipart/form-data">
		userid : <input type="text" name="userid" value="브라운"><br>
		file : <input type="file" name="file"><br>
		<br>
		<input type="submit" value="전송">
	</form>
</body>
</html>