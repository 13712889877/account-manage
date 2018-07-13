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




            console.log("json："+JSON.stringify(account));

        });
    });

});