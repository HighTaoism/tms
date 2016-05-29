<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script>
/*
 * 对代码进行制空，使得界面刷新
 @author HighTaoism
 */
 var form = $("#updMusicForm");
$(function(){
	form.off();
	form.on("submit",function(){
		form.ajaxSubmit(function(){
			alert("修改成功");
			$(".baseUI li:contains('音乐管理')").trigger("click");
		});
		return false;
	})
})
</script>
<h1><font color="red">这是一个修改音乐的界面</font></h1>
<hr>
<form action="updMusic.action" method="post" id="updMusicForm">
 <input type = "hidden" name = "id" value = "${music.id}"/>
    音乐名称<input type="text" name="m_name" value ="${music.m_name }"/><br/>
    音乐作者<input type="text" name="author" value = "${music.author }"/><br/>
    音乐备注<textarea name="content" rows="5" cols="20">${music.content}</textarea>
       <input type="submit" value="提交"/><br/>
</form>