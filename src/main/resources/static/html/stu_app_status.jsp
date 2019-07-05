<%--
  Created by IntelliJ IDEA.
  User: wait
  Date: 2019/6/24
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Students Application-SCU</title>
    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="icon" type="image/png" href="../assets/i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <link rel="stylesheet" href="../assets/css/amazeui.min.css" />
    <link rel="stylesheet" href="../assets/css/admin.css">
    <link rel="stylesheet" href="../assets/css/app.css">
</head>

<body data-type="generalComponents">
<%@ include file="leftNav.jsp" %>

<header class="am-topbar am-topbar-inverse admin-header">
    <div class="am-topbar-brand">
        <a href="javascript:" class="tpl-logo">
            <img src="../assets/img/logo.png" alt="">
        </a>
    </div>
    <div class="am-icon-list tpl-header-nav-hover-ico am-fl am-margin-right">

    </div>
    <!--
    <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#topbar-collapse'}">
        <span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span>
    </button>
    -->
    <div class="am-collapse am-topbar-collapse" id="topbar-collapse">

        <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list tpl-header-list">
            <li class="am-hide-sm-only"><a href="javascript:;" id="admin-fullscreen" class="tpl-header-list-link"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
            <li class="am-dropdown" data-am-dropdown data-am-dropdown-toggle>
                <a class="am-dropdown-toggle tpl-header-list-link" href="javascript:;">
                    <span class="tpl-header-list-user-nick">Username</span><span class="tpl-header-list-user-ico"> <img src="assets/img/user01.png"></span>
                </a>
                <ul class="am-dropdown-content">
                    <li><a href="#"><span class="am-icon-bell-o"></span>填写表格/Fill Forms</a></li>
                    <li><a href="#"><span class="am-icon-cog"></span>申请状态查询/Application Status</a></li>
                    <li><a href="signin.jsp"><span class="am-icon-power-off"></span> 退出/Exit</a></li>
                </ul>
            </li>
            <li><a href="###" class="tpl-header-list-link"><span class="am-icon-sign-out tpl-header-list-ico-out-size"></span></a></li>
        </ul>
    </div>
</header>


<div class="tpl-page-container tpl-page-header-fixed">


    <div class="tpl-content-wrapper">
        <div class="tpl-content-page-title">
            Application-Status 申请-状态
        </div>
        <!--
        <div class="tpl-content-scope">
            <div class="note note-info">
                <h3>Explanation 说明
                    <span class="close" data-close="note"></span>
                </h3>
                <p><span class="label label-danger"></span>Please check your application status at any time.请随时查询你的申请状态。</p>

            </div>
        </div>
        -->
        <div class="row">
            <div class="am-u-lg-3 am-u-md-6 am-u-sm-12">
                <div class="dashboard-stat blue">
                    <div class="visual">
                        <i class="am-icon-comments-o"></i>
                    </div>
                    <div class="details">
                        <div class="number"> SUBMITTED </div>
                        <div class="desc"> 材料状态 </div>
                    </div>
                </div>
            </div>
            <div class="am-u-lg-3 am-u-md-6 am-u-sm-12">
                <div class="dashboard-stat red">
                    <div class="visual">
                        <i class="am-icon-bar-chart-o"></i>
                    </div>
                    <div class="details">
                        <div class="number"> PASS </div>
                        <div class="desc"> 初审 </div>
                    </div>

                </div>
            </div>
            <div class="am-u-lg-3 am-u-md-6 am-u-sm-12">
                <div class="dashboard-stat green">
                    <div class="visual">
                        <i class="am-icon-apple"></i>
                    </div>
                    <div class="details">
                        <div class="number"> PASS </div>
                        <div class="desc"> 复审 </div>
                    </div>
                </div>
            </div>
            <div class="am-u-lg-3 am-u-md-6 am-u-sm-12">
                <div class="dashboard-stat purple">
                    <div class="visual">
                        <i class="am-icon-android"></i>
                    </div>
                    <div class="details">
                        <div class="number"> PASS </div>
                        <div class="desc"> 终审 </div>
                    </div>
                </div>
            </div>



        </div>
    </div>
    <div class="tpl-content-wrapper">
        <div class="tpl-content-page-title">
            Admission Confirmation  录取信息确认
        </div>
        <div class="tpl-portlet-components">
            <div class="portlet-title">
                <div class="caption font-green bold">
                    <span class="am-icon-code"></span> 确认表/Form #A03
                </div>
            </div>

            <div class="tpl-block">
                <div class="am-g">
                    <div class="tpl-form-body tpl-form-line">
                        <form class="am-form tpl-form-line-form">
                            <div class="am-form-group">
                                <label  class="am-u-sm-3 am-form-label">专业/Major</label>
                                <div class="am-u-sm-9">
                                    <span id="stu_app_major" >computer science</span>
                                </div>
                            </div>

                            <div class="am-form-group">
                                <label  class="am-u-sm-3 am-form-label">学号/Student No.</label>
                                <div class="am-u-sm-9">
                                    <span id="stu_id" >2016141462240</span>
                                </div>
                            </div>

                            <div class="am-form-group">
                                <label class="am-u-sm-3 am-form-label">选择/Option</label>
                                <div class="am-u-sm-9">
                                    <select data-am-selected="{searchBox: 1}">
                                        <option value="1">接受/Accept</option>
                                        <option value="2">拒绝/Refuse</option>
                                    </select>
                                </div>
                            </div>

                            <div class="am-form-group">
                                <label  class="am-u-sm-3 am-form-label">说明/Explanation</label>
                                <div class="am-u-sm-9">
                                    <textarea class="" rows="3" id="user-intro" placeholder="Explanation"></textarea>
                                    <small>Fill the blank if you refuse this offer /当拒绝录取时填写</small>
                                </div>
                            </div>

                            <div class="am-form-group">
                                <div class="am-u-sm-9 am-u-sm-push-3">
                                    <button type="button" class="am-btn am-btn-primary tpl-btn-bg-color-success ">提交</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>


        </div>










    </div>

</div>


<script src="../js/jquery.min.js"></script>
<script src="../js/amazeui.min.js"></script>
<script src="../js/app.js"></script>
</body>

</html>
