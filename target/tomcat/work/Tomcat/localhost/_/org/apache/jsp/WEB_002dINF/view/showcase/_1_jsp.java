/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2018-07-06 03:00:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.showcase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>layui 后台大框架布局 - 在线演示</title>\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("    <meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"//res.layui.com/layui/dist/css/layui.css?t=1527693307626\"  media=\"all\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"//res.layui.com/static/css/global.css?t=1527693307626-6\" media=\"all\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"layui-layout layui-layout-admin\">\r\n");
      out.write("    <div class=\"layui-header header header-demo\" summer>\r\n");
      out.write("        <div class=\"layui-main\">\r\n");
      out.write("            <a class=\"logo\" href=\"/\">\r\n");
      out.write("                <img src=\"//res.layui.com/static/images/layui/logo.png\" alt=\"layui\">\r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"layui-form component\">\r\n");
      out.write("                <select lay-search lay-filter=\"component\">\r\n");
      out.write("                    <option value=\"\">搜索组件或模块</option>\r\n");
      out.write("                    <option value=\"element/layout.html\">grid 栅格布局</option>\r\n");
      out.write("                    <option value=\"element/layout.html#admin\">admin 后台布局</option>\r\n");
      out.write("                    <option value=\"element/color.html\">color 颜色</option>\r\n");
      out.write("                    <option value=\"element/icon.html\">iconfont 字体图标</option>\r\n");
      out.write("                    <option value=\"element/anim.html\">animation 动画</option>\r\n");
      out.write("                    <option value=\"element/button.html\">button 按钮</option>\r\n");
      out.write("                    <option value=\"element/form.html\">form 表单组</option>\r\n");
      out.write("                    <option value=\"element/form.html#input\">input 输入框</option>\r\n");
      out.write("                    <option value=\"element/form.html#select\">select 下拉选择框</option>\r\n");
      out.write("                    <option value=\"element/form.html#checkbox\">checkbox 复选框</option>\r\n");
      out.write("                    <option value=\"element/form.html#switch\">switch 开关</option>\r\n");
      out.write("                    <option value=\"element/form.html#radio\">radio 单选框</option>\r\n");
      out.write("                    <option value=\"element/form.html#textarea\">textarea 文本域</option>\r\n");
      out.write("                    <option value=\"element/nav.html\">nav 导航菜单</option>\r\n");
      out.write("                    <option value=\"element/nav.html#breadcrumb\">breadcrumb 面包屑</option>\r\n");
      out.write("                    <option value=\"element/tab.html\">tabs 选项卡</option>\r\n");
      out.write("                    <option value=\"element/progress.html\">progress 进度条</option>\r\n");
      out.write("                    <option value=\"element/collapse.html\">collapse 折叠面板/手风琴</option>\r\n");
      out.write("                    <option value=\"element/table.html\">table 表格元素</option>\r\n");
      out.write("                    <option value=\"element/badge.html\">badge 徽章</option>\r\n");
      out.write("                    <option value=\"element/timeline.html\">timeline 时间线</option>\r\n");
      out.write("                    <option value=\"element/auxiliar.html#blockquote\">blockquote 引用块</option>\r\n");
      out.write("                    <option value=\"element/auxiliar.html#fieldset\">fieldset 字段集</option>\r\n");
      out.write("                    <option value=\"element/auxiliar.html#hr\">hr 分割线</option>\r\n");
      out.write("\r\n");
      out.write("                    <option value=\"modules/layer.html\">layer 弹出层/弹窗综合</option>\r\n");
      out.write("                    <option value=\"modules/laydate.html\">laydate 日期时间选择器</option>\r\n");
      out.write("                    <option value=\"modules/layim.html\">layim 即时通讯/聊天</option>\r\n");
      out.write("                    <option value=\"modules/laypage.html\">laypage 分页</option>\r\n");
      out.write("                    <option value=\"modules/laytpl.html\">laytpl 模板引擎</option>\r\n");
      out.write("                    <option value=\"modules/form.html\">form 表单模块</option>\r\n");
      out.write("                    <option value=\"modules/table.html\">table 数据表格</option>\r\n");
      out.write("                    <option value=\"modules/upload.html\">upload 文件/图片上传</option>\r\n");
      out.write("                    <option value=\"modules/element.html\">element 常用元素操作</option>\r\n");
      out.write("                    <option value=\"modules/rate.html\">rate 评分</option>\r\n");
      out.write("                    <option value=\"modules/carousel.html\">carousel 轮播/跑马灯</option>\r\n");
      out.write("                    <option value=\"modules/layedit.html\">layedit 富文本编辑器</option>\r\n");
      out.write("                    <option value=\"modules/tree.html\">tree 树形菜单</option>\r\n");
      out.write("                    <option value=\"modules/flow.html\">flow 信息流/图片懒加载</option>\r\n");
      out.write("                    <option value=\"modules/util.html\">util 工具集</option>\r\n");
      out.write("                    <option value=\"modules/code.html\">code 代码修饰</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"layui-nav\">\r\n");
      out.write("                <li class=\"layui-nav-item \">\r\n");
      out.write("                    <a href=\"/doc/\">文档<!-- <span class=\"layui-badge-dot\"></span> --></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"layui-nav-item layui-this\">\r\n");
      out.write("                    <a href=\"/demo/\">示例<!--  --></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"layui-nav-item layui-hide-xs\">\r\n");
      out.write("                    <a href=\"http://fly.layui.com/\" target=\"_blank\">社区</a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <li class=\"layui-nav-item\">\r\n");
      out.write("                    <!--<span class=\"layui-badge-dot\" style=\"margin: -4px 3px 0;\"></span>-->\r\n");
      out.write("                    <a href=\"javascript:;\">周边</a>\r\n");
      out.write("                    <dl class=\"layui-nav-child\">\r\n");
      out.write("                        <dd class=\"layui-hide-sm layui-show-xs\"><a href=\"http://fly.layui.com/\" target=\"_blank\">社区交流</a><hr></dd>\r\n");
      out.write("                        <dd><a href=\"http://layim.layui.com/\" target=\"_blank\">即时聊天</a></dd>\r\n");
      out.write("\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <dd><a href=\"/admin/\" target=\"_blank\">后台模板</a></dd>\r\n");
      out.write("                        <dd><a href=\"/template/fly/\" target=\"_blank\">社区模板</a></dd>\r\n");
      out.write("                        <dd><a href=\"/template/xianyan/\" target=\"_blank\">轻博客模板<span class=\"layui-badge-dot\"></span></a></dd>\r\n");
      out.write("\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <dd><a href=\"/alone.html\" target=\"_blank\">独立组件</a></dd>\r\n");
      out.write("                        <dd><a href=\"http://fly.layui.com/jie/24209/\" target=\"_blank\">Axure组件</a></dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"layui-nav-item layui-hide-xs\" lay-unselect>\r\n");
      out.write("                    <a href=\"/admin/\">官方后台模板<span class=\"layui-badge-dot\"></span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/html5shiv/r29/html5.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <div class=\"layui-side layui-bg-black\">\r\n");
      out.write("        <div class=\"layui-side-scroll\">\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"layui-nav layui-nav-tree site-demo-nav\">\r\n");
      out.write("\r\n");
      out.write("                <li class=\"layui-nav-item layui-nav-itemed\">\r\n");
      out.write("                    <a class=\"javascript:;\" href=\"javascript:;\">开发工具</a>\r\n");
      out.write("                    <dl class=\"layui-nav-child\">\r\n");
      out.write("                        <dd>\r\n");
      out.write("                            <a href=\"/demo/\">调试预览</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"layui-nav-item layui-nav-itemed\">\r\n");
      out.write("                    <a class=\"javascript:;\" href=\"javascript:;\">布局</a>\r\n");
      out.write("                    <dl class=\"layui-nav-child\">\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/grid.html\">栅格</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"layui-this\">\r\n");
      out.write("                            <a href=\"/demo/admin.html\">后台布局</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"layui-nav-item layui-nav-itemed\">\r\n");
      out.write("                    <a class=\"javascript:;\" href=\"javascript:;\">基本元素</a>\r\n");
      out.write("                    <dl class=\"layui-nav-child\">\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/button.html\">按钮</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/form.html\">表单</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/nav.html\">导航/面包屑</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/tab.html\">选项卡</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/progress.html\">进度条</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/panel.html\">面板</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/badge.html\">徽章</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/timeline.html\">时间线</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/table-element.html\">静态表格</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/anim.html\">动画</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/auxiliar.html\">辅助元素</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"layui-nav-item layui-nav-itemed\">\r\n");
      out.write("                    <a class=\"javascript:;\" href=\"javascript:;\">组件示例</a>\r\n");
      out.write("                    <dl class=\"layui-nav-child\">\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/layer.html\">\r\n");
      out.write("                                弹出层\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/laydate.html\">\r\n");
      out.write("                                日期与时间选择\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/layim.html\">\r\n");
      out.write("                                即时通讯\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/table.html\">\r\n");
      out.write("                                数据表格\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/laypage.html\">\r\n");
      out.write("                                分页\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/upload.html\">\r\n");
      out.write("                                文件上传\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/rate.html\">\r\n");
      out.write("                                评分\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/carousel.html\">\r\n");
      out.write("                                轮播\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/laytpl.html\">\r\n");
      out.write("                                模板引擎\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/flow.html\">\r\n");
      out.write("                                流加载\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/util.html\">\r\n");
      out.write("                                工具集\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd class=\"\">\r\n");
      out.write("                            <a href=\"/demo/code.html\">\r\n");
      out.write("                                代码修饰器\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"layui-nav-item\" style=\"height: 30px; text-align: center\"></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-tab layui-tab-brief\" lay-filter=\"demoTitle\">\r\n");
      out.write("        <ul class=\"layui-tab-title site-demo-title\">\r\n");
      out.write("            <li class=\"layui-this\">预览</li>\r\n");
      out.write("            <li>查看代码</li>\r\n");
      out.write("            <li>帮助</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"layui-body layui-tab-content site-demo site-demo-body\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"layui-tab-item layui-show\">\r\n");
      out.write("                <div class=\"layui-main\">\r\n");
      out.write("                    <div id=\"LAY_preview\">\r\n");
      out.write("                        <blockquote class=\"layui-elem-quote\">\r\n");
      out.write("                            你也可以单独打开后台布局的例子：\r\n");
      out.write("                            <a class=\"layui-btn layui-btn-normal\" href=\"layuiAdmin.html\" target=\"_blank\">单独打开</a>\r\n");
      out.write("                        </blockquote>\r\n");
      out.write("\r\n");
      out.write("                        <iframe src=\"layuiAdmin.html?from=demo\" frameborder=\"0\" id=\"demoAdmin\" style=\"width: 100%; height: 300px;\"></iframe>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"layui-tab-item\">\r\n");
      out.write("<textarea class=\"layui-border-box site-demo-text site-demo-code\" id=\"LAY_democode\" spellcheck=\"false\" readonly>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <title>layui</title>\r\n");
      out.write("  <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/layui/css/layui.css\"  media=\"all\">\r\n");
      out.write("    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->\r\n");
      out.write("</head>\r\n");
      out.write("</textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"layui-tab-item\">\r\n");
      out.write("                <div class=\"layui-main\">\r\n");
      out.write("                    <p></p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div style=\"margin: 15px 0;\">\r\n");
      out.write("                        <ins class=\"adsbygoogle\"\r\n");
      out.write("                             style=\"display:inline-block;width:970px;height:90px\"\r\n");
      out.write("                             data-ad-client=\"ca-pub-6111334333458862\"\r\n");
      out.write("                             data-ad-slot=\"6835627838\"></ins>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <fieldset class=\"layui-elem-field layui-field-title\" style=\"margin-top: 50px;\">\r\n");
      out.write("                        <legend>相关</legend>\r\n");
      out.write("                    </fieldset>\r\n");
      out.write("                    <a class=\"layui-btn layui-btn-normal\" href=\"/doc/element/layout.html#admin\" target=\"_blank\">后台布局文档</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-footer footer footer-demo\">\r\n");
      out.write("        <div class=\"layui-main\">\r\n");
      out.write("            <p>&copy; 2018 <a href=\"/\">layui.com</a> MIT license</p>\r\n");
      out.write("            <p>\r\n");
      out.write("                <a href=\"http://fly.layui.com/case/2018/\" target=\"_blank\">案例</a>\r\n");
      out.write("                <a href=\"http://fly.layui.com/jie/3147/\" target=\"_blank\">支持</a>\r\n");
      out.write("                <a href=\"javascript:;\" site-event=\"contactInfo\">联系</a>\r\n");
      out.write("                <a href=\"https://github.com/sentsin/layui/\" target=\"_blank\" rel=\"nofollow\">GitHub</a>\r\n");
      out.write("                <a href=\"https://gitee.com/sentsin/layui\" target=\"_blank\" rel=\"nofollow\">码云</a>\r\n");
      out.write("                <a href=\"http://fly.layui.com/jie/2461/\" target=\"_blank\">微信公众号</a>\r\n");
      out.write("            </p>\r\n");
      out.write("            <p class=\"site-union\">\r\n");
      out.write("                <a href=\"https://www.upyun.com?from=layui\" target=\"_blank\" rel=\"nofollow\" upyun><img src=\"//res.layui.com/static/images/other/upyun.png?t=1\"></a>\r\n");
      out.write("                <span>提供 CDN 赞助</span>\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script async src=\"https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\"></script>\r\n");
      out.write("    <div class=\"site-tree-mobile layui-hide\">\r\n");
      out.write("        <i class=\"layui-icon\">&#xe602;</i>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"site-mobile-shade\"></div>\r\n");
      out.write("    <script src=\"//res.layui.com/layui/dist/layui.js?t=1527693307626\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        window.global = {\r\n");
      out.write("            pageType: 'demo'\r\n");
      out.write("            ,preview: function(){\r\n");
      out.write("                var preview = document.getElementById('LAY_preview');\r\n");
      out.write("                return preview ? preview.innerHTML : '';\r\n");
      out.write("            }()\r\n");
      out.write("        };\r\n");
      out.write("        layui.config({\r\n");
      out.write("            base: '//res.layui.com/static/lay/modules/layui/'\r\n");
      out.write("            ,version: '1527693307626'\r\n");
      out.write("        }).use('global');\r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\">var cnzz_protocol = ((\"https:\" == document.location.protocol) ? \" https://\" : \" http://\");document.write(unescape(\"%3Cspan id='cnzz_stat_icon_30088308'%3E%3C/span%3E%3Cscript src='\" + cnzz_protocol + \"w.cnzz.com/c.php%3Fid%3D30088308' type='text/javascript'%3E%3C/script%3E\"));</script>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"LAY_democodejs\">\r\n");
      out.write("    <script>\r\n");
      out.write("    </script>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use('layer', function(){\r\n");
      out.write("        var $ = layui.$\r\n");
      out.write("            ,setIframe = function(){\r\n");
      out.write("            var height = $(window).height() - 370;\r\n");
      out.write("            $('#demoAdmin').height(height);\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        setIframe();\r\n");
      out.write("        $(window).on('resize', setIframe);\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
