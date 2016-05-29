<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script>
/*
 * 对代码进行制空，使得界面刷新
 @author HighTaoism
 */
$(function(){
	var form = $("#addCategoryForm");
	form.off();
	form.on("submit",function(){
		form.ajaxSubmit(function(){
			
			form[0].reset();//重置表单
			alert("添加成功");
		});
		return false;
	})
})
</script>
<h1>添加栏目界面</h1>
<hr>
<form action="addCategory.action" method="post"id="addCategoryForm">
    栏目名称<input type="text" name="name"/><br/>
    栏目编号<input type="text" name="code"/><br/>
       <input type="submit" value="提交"/><br/>
</form>