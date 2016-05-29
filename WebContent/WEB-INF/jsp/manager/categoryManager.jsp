<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1>栏目管理界面</h1>
<hr>
<table border="1" style="width:100%;border-collapse:collapse;">
<tr>
   <th>编号</th>
   <th>栏目名称</th>
   <th>栏目编号</th>
   <th>操作</th>
</tr>

<c:forEach items="${categoryList}" var="c">
<tr>
   <td><input type="checkbox"/></td>
   <td>${c.name }</td>
   <td>${c.code }</td>
   <td>
      <a href="javascript:void(0);" val="${c.id }" class="del">删除</a>
      <a href="javascript:void(0);" val="${c.id }" class="upd">修改</a>
   </td>
</tr>
</c:forEach>
</table>

<script>
$(function(){
	$(".upd").off();
	$(".upd").on("click",function(){
		alert("此功能还没完善！");
	});
});
//delCategory.action?id=${c.id}
$(function(){
	var url = "delCategory.action";
	var cc = $(".baseUI li:contains('栏目管理')");
	
	$(".del").off();
	$(".del").on("click",function(){
		var id = $(this).attr("val");
		var flag = confirm("是否删除?");
		if(flag){
			$.post(url,{id:id},function(){
				//trigger("click")是模拟点击，使得页面进行刷新
				cc.trigger("click");
			});
		}
	});
	
});
</script>