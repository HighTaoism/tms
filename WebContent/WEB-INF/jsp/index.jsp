<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link rel="stylesheet" type="text/css" href="theme/1/css/common.css">
<link rel="stylesheet" type="text/css" href="theme/1/css/front/style.css">
</head>

<body>
<div id="main">
    <div class="top">
    	<div class="topbg">
            <div class="logo_sign">
            	<div class="logo"></div>
                <div class="sign">
                	<span>欢迎您系统管理员</span>
                    <span class="sp_home">首页</span>
                    <span class="sp_backstage"><a href="manager/toIndex.action">后台管理</a></span>
                    <span class="sp_signout">退出</span>
                </div>
            </div> 
            <div class="nav">
            	<ul class="navUI">
                	<li><a href="toIndex.action">首页</a></li>
                	<c:forEach items="${categoryList }" var="c">
                		<li><a href="toList.action">${c.name }</a></li>
                	</c:forEach>
                </ul>
            </div>
            <div class="banner">
            	<div class="banimg"><img src="theme/1/images/front/banner.png"></div>
            </div>
        </div>
    </div>
    <div class="content">
    	<div class="congw">
            
            <div class="clear"></div>
            <div class="box">
            	<div class="box_b">
                	<div class="title">
                    	<span class="txt_title">好书相伴</span>
                        <span class="txt_discipline">学科</span>
                        <span class="txt_time">更多>></span>
                    </div>
                    <div class="cont">
                    	<ul class="discipUI">
                        	<li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                          
                        </ul>
                    </div>
                </div>
                
                <div class="box_b">
                	<div class="title">
                    	<span class="txt_title">爱在身边</span>
                        <span class="txt_discipline">学科</span>
                        <span class="txt_time">更多>></span>
                    </div>
                    <div class="cont">
                    	<ul class="discipUI">
                        	<li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                           
                        </ul>
                    </div>
                </div>
                
                <div class="box_b">
                	<div class="title">
                    	<span class="txt_title">特色活动</span>
                        <span class="txt_discipline">学科</span>
                        <span class="txt_time">更多>></span>
                    </div>
                    <div class="cont">
                    	<ul class="discipUI">
                        	<li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                     
                        </ul>
                    </div>
                </div>
            </div>
            <div class="box">
            	<div class="box_f">
                	<div class="title">
                    	<span class="txt_title">教育科研</span>
                        <span class="txt_discipline">学科</span>
                        <span class="txt_time">更多>></span>
                    </div>
                    <div class="cont">
                    	<ul class="discipUI">
                        	<li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                    
                        </ul>
                    </div>
                </div>
                
                <div class="box_f">
                	<div class="title">
                    	<span class="txt_title">智慧课堂</span>
                        <span class="txt_discipline">学科</span>
                        <span class="txt_time">更多>></span>
                    </div>
                    <div class="cont">
                    	<ul class="discipUI">
                        	<li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                       
                        </ul>
                    </div>
                </div>
                
               <div class="box_f">
                	<div class="title">
                    	<span class="txt_title">智慧课堂</span>
                        <span class="txt_discipline">学科</span>
                        <span class="txt_time">更多>></span>
                    </div>
                    <div class="cont">
                    	<ul class="discipUI">
                        	<li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                            <li>
                            	<a href="javascript:void(0)" class="txt_title">地壳运动的奥秘</a><span class="txt_discipline">语文</span><span class="txt_time">2015-03-20</span>
                            </li>
                       
                        </ul>
                    </div>
                </div>
            </div>
            <div class="link">
            	<div class="linelink">
            		<span>友情链接：</span><a href="javascript:void(0)">上海教育网</a><a href="javascript:void(0)">上海杰普软件科技有限公司</a><a href="javascript:void(0)">郑州轻工学院</a><a href="javascript:void(0)">郑州大学</a>
                </div>
            </div>
        </div>
    </div>
    <div class="footer">
    	<div class="foot">
        	<p>杰普信息发布系统 技术支持：<a href="javascript:void(0)">上海杰普软件科技有限公司</a>      电话：021-xxxxxxx</p>
        </div>
    </div>
</div>
</body>
</html>
