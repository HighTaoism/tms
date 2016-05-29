<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script>
/*
 * 对代码进行制空，使得界面刷新
 @author HighTaoism
 */
$(function(){
	var form = $("#addMusicForm");
	form.off;
	form.on("submit",function(){
		form.ajaxSubmit(function(){
			
			form[0].reset();//也可与重置表单
			
			alert("添加成功");
		});
		return false;
	})
})
</script>
<h1>添加音乐界面</h1>
<hr>
<form action="addMusic.action" method="post" id="addMusicForm">
    音乐名称<input type="text" name="m_name"/><br/>
    音乐作者<input type="text" name="author"/><br/>
    所属栏目<select name="c_id">
            <option value="">-_-请选择-_-</option>
            <c:forEach items="${categoryList}" var="c">
            <option value="${c.id}">${c.name }</option>
            </c:forEach>
      </select><br/>
    音乐备注<textarea name="content" rows="5" cols="20"></textarea>
       <input type="submit" value="提交"/><br/>
</form>