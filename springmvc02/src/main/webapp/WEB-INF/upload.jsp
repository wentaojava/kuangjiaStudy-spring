<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/1 0001
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>视屏上传页面</title>
</head>
<body>
<div class="panel panel-default">
    <div class="panel-body">
        <div class="panel-heading" align="center"><h1 class="sub-header h3">文件上传</h1></div>
        <hr>
        <form class="form-horizontal" id="upload" method="post" action="/upload/uploadFile.do" enctype="multipart/form-data">
            <div class="form-group" align="center">
                <div class="col-md-4 col-sm-4 col-xs-4 col-lg-4">文件上传
                    <input type="file" class="form-control" name="file" id="file"><br>
                    <input type="submit" value="上传">
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
