$(document).ready(function () {

    layui.use('layer', function () { //独立版的layer无需执行这一句
        var $ = layui.jquery, layer = layui.layer;


        $(".layui-btn,.account").on("click", function () {
            var account = {};

            $(".layui-form-label").find("input").each(function () {
                var k = $(this).attr("name");
                var v = $(this).val();
                account[k] = v;
            });
            JSON.stringify(account)

            console.log(account);
            $.ajax({
                url: "/login/register",
                dataType: "json",
                type: "post",
                contentType: "application/json; charset=utf-8",
                async: true,
                data: JSON.stringify(account),
                success: function (data) {
                    data
                    if (data.success == "true") {

                        layer.msg('注册成功', {
                            time: 2000 //2s后自动关闭
                        });
                        window.location.href = "/login/index";

                    } else {
                        layer.msg('注册失败，失败原因：' + data.msg, {
                            time: 2000 //2s后自动关闭
                        });
                    }
                },
                error: function () {
                    layer.msg('请求失败，请重试 ', {
                        time: 2000 //2s后自动关闭
                    });
                }
            });
        });
    });

});