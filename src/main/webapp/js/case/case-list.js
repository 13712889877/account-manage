$(document).ready(function () {

    layui.use('layer', function () { //独立版的layer无需执行这一句
        var $ = layui.jquery, layer = layui.layer;

        $(".add").om("click", function () {
            var comment = $("#mma").var();
            console.log(comment);
            $.ajax({
                url: "/case/discuss",
                dateType: "json",
                type: "get",
                contentType: "application/json",
                async: true,
                data: JSON.stringify(comment),
                sueecss: function (data) {
                    if (data.success == true) {
                        layer.msg("评论成功", {
                            time: 2000
                        });
                        window.location.href = "/case/index";
                    } else {
                        layer.msg('评论失败，失败原因：' + data.msg, {
                            time: 2000
                        });
                    }
                },
                error: function () {
                    layer.msg("请求失败，请重试", {
                        time: 2000
                    });
                }
            });
        });
    });
});