<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title>注册界面</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
    <script src="/layui/layui.js" charset="utf-8"></script>
    <script src="/scripts/jquery-3.2.1.min.js"></script>
    <script src="/js/login/register.js" charset="utf-8"></script>
</head>
<body>

<blockquote class="layui-elem-quote layui-text">
    鉴于小伙伴的普遍反馈，先温馨提醒两个常见“问题”：1. <a href="/login/topFirst" target="_blank">为什么点击注册，页面无反应</a> 2. <a
        href="/login/topSecond" target="_blank">如在注册过程中遇到问题，请点击这里！！！</a>
</blockquote>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>用户注册</legend>
</fieldset>

<form class="layui-form" action="">
    <div class="layui-form-item">
        <label class="layui-form-label">用户昵称</label>
        <div class="layui-input-block">
            <input name="accountName" id="account_name" lay-verify="text" style="width:280px; height:38px;"
                   autocomplete="off" placeholder="请输入昵称" class="layui-input"
                   type="text">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户地址</label>
        <div class="layui-input-block">
            <input name="accountAddress" id="account_address" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input"
                   type="text">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">验证手机</label>
            <div class="layui-input-inline">
                <input name="accountTel" id="account_tel" lay-verify="required|phone" autocomplete="off"
                       class="layui-input" type="tel">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">验证邮箱</label>
            <div class="layui-input-inline">
                <input name="accountEmail" id="account_email" lay-verify="email" autocomplete="off" class="layui-input"
                       type="text">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">用户年龄</label>
            <div class="layui-input-inline">
                <input name="accountAge" id="account_age" lay-verify="required|number" autocomplete="off"
                       class="layui-input" type="text">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">验证日期</label>
            <div class="layui-input-inline">
                <input name="date" id="date" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off"
                       class="layui-input" type="text">
            </div>
        </div>

    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">单选框</label>
        <div class="layui-input-block">
            <input name="sex" value="1" title="男" checked="" type="radio">
            <input name="sex" value="0" title="女" type="radio">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">设置密码</label>
        <div class="layui-input-inline">
            <input name="accountPassword" id="account_password" lay-verify="required|number" placeholder="请输入密码"
                   autocomplete="off" class="layui-input"
                   type="password">
        </div>
        <div class="layui-form-mid layui-word-aux">请填写6到12位密码</div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">个性签名</label>
        <div class="layui-input-block">
            <input name="accountAutograph" id="account_Autograph" lay-verify="title" placeholder="请输入内容"
                   class="layui-textarea" type="text">
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn onclick=climeMe()" lay-submit="" lay-filter="demo1"><input class='account'
                                                                                                type="hidden" value=""/>注册
            </button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>


<script>
    layui.use(['form', 'layedit', 'laydate'], function () {
        var form = layui.form
            , layer = layui.layer
            , layedit = layui.layedit
            , laydate = layui.laydate;


        //日期
        laydate.render({
            elem: '#date'
        });
        laydate.render({
            elem: '#date1'
        });

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //自定义验证规则
        form.verify({
            title: function (value) {
                if (value.length < 1) {
                    return '昵称至少得1个字符';
                }
            }
            , pass: [/(.+){6,12}$/, '密码必须6到12位']
            , content: function (value) {
                layedit.sync(editIndex);
            }
        });

        //监听指定开关
        form.on('switch(switchTest)', function (data) {
            layer.msg('开关checked：' + (this.checked ? 'true' : 'false'), {
                offset: '6px'
            });
            layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
        });

        //监听提交
        form.on('submit(demo1)', function (data) {
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            return false;
        });

        //表单初始赋值
        form.val('example', {
            "username": "陈刚" // "name": "value"
            , "password": "123456"
            , "interest": 1
            , "like[write]": true //复选框选中状态
            , "close": true //开关状态
            , "sex": "男"
            , "desc": "厉害了我的哥"
        })


    });
</script>

</body>
</html>