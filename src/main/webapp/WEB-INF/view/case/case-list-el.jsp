<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>说说动态</title>
    <link rel="stylesheet" href="/layui/css/layui.css">
    <script src="/scripts/jquery-3.2.1.min.js"></script>
    <script src="/js/case/case-list.js" charset="utf-8"></script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">说说管理平台</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="">说说管理</a></li>
            <li class="layui-nav-item"><a href="">用户管理</a></li>
            <li class="layui-nav-item"><a href="">其它系统</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">刷新</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    贤心
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退了</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="/case/index">最新动态</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">特别关心</a></dd>
                        <dd><a href="/case/beforeAdd">发说说</a></dd>
                        <dd><a href="javascript:;">谁看过我</a></dd>
                        <dd><a href="http://app.tanwan.com/htmlcode/17443.html">大家都在玩，贼好玩</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 20px;">
            <div class="text" style=" font-size: 38px; color: deeppink; text-align:center;">说说展示中心</div>
            <br><br>
            <c:forEach items="${moodList}" var="mood">
                <div class="layui-row">
                    <div class="layui-col-xs-offset4 layui-col-xs4">
                        <div class="layui-card">
                            <div class="layui-card-header">
                                <div class="layui-fluid">
                                    <div style="font-size:150%;color: #FF5722" class="layui-col-xs8 ">${mood.name}</div>
                                    <div style="font-size:120%;color: #FD482C" class="layui-col-xs4">${mood.date}</div>
                                </div>
                            </div>
                            <div class="layui-card-body">
                                <div style="font-size:150%;color: chartreuse" class="layui-fluid">${mood.content}</div>
                                <div class="layui-fluid"><img width="200" src="/upload-img/${mood.picture}"/></div>
                                <c:forEach items="${commentList}" var="comment">
                                <div style="font-size:120%;color: #FFB800 " class="layui-fluid">${comment.comments}</div>
                                </c:forEach>
                            </div>
                        </div>
                        <form method="POST" action="/case/discuss">
                        <div>
                            <textarea id="mma" name="comment" placeholder="评论：" cols="60" rows="0"></textarea>
                            <button class="layui-btn add onclick=climeMe()">
                                <input class="comment" type="hidden" value=""/>确定
                            </button>
                        </div>
                        </form>
                        <hr class="layui-bg-orange">
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>

    <a href="/case/${page-1}">上一页</a>

    <a href="/case/${page+1}">下一页</a>


    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script src="../src/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function () {
        var element = layui.element;
    });
</script>
</body>
</html>