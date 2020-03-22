<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>您好Springboot</title>
</head>
<body>
	<table id="table" border="1px" width="65%" align="center">
		<tr>
			<td colspan="6" align="center"><h3>学生信息</h3></td>
		</tr>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
			<th></th>
		</tr>
	</table>
</body>
<script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
<script>
		$(function(){
			var url = "/getData";
			$.get(url,function(result){
				var trs;
				$(result).each(function(index,user){
					var id = user.id;
					var name = user.name;
					var age = user.age;
					var sex = user.sex;
					trs +="<tr align='center'><td>"+id+"</td><td>"+name+"</td><td>"+age+"</td><td>"+sex+"</td></tr>"; 
					return trs;
					
				})
					$("#table").append(trs);
			})
		})
</script>



</html>