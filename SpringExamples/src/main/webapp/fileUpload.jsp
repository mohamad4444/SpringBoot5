<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>File Upload Example</h1>
    <form method="POST" action="upload" enctype="multipart/form-data">
        <input type="file" name="file"/>
        <input type="submit" value="Upload"/>
    </form>
    <form method="POST" action="upload" enctype="multipart/form-data">
    <input type="file" name="files" multiple="multiple" />
    <input type="submit" value="Upload" />
</form>
</body>
</html>