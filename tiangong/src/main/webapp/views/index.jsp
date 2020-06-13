<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>后台管理系统</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="stylesheet" href="${APP_PATH }/bower_components/bootstrap/dist/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="${APP_PATH }/bower_components/font-awesome/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="${APP_PATH }/bower_components/Ionicons/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="${APP_PATH }/dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
        page. However, you can choose any other skin. Make sure you
        apply the skin class to the body tag so the changes take effect. -->
  <link rel="stylesheet" href="${APP_PATH }/dist/css/skins/skin-blue.min.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

  <!-- Google Font -->
  <link rel="stylesheet"
        href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>

<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Main Header -->
  <header class="main-header">

    <!-- Logo -->
    <a href="index.jsp" class="logo">
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>天工</b></span>
    </a>

    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- User Account Menu -->
          <li class="dropdown user user-menu">
            <!-- Menu Toggle Button -->
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <span class="hidden-xs">你好管理员！</span>
            </a>
          </li>
          <!-- Control Sidebar Toggle Button -->
          <li>
            <a href="login.jsp" ><i class="fa fa-power-off"></i></a>
          </li>
        </ul>
      </div>
    </nav>
  </header>
  
  <!-- 导航栏 -->
  <aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

      <!-- Sidebar user panel (optional) -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="${APP_PATH }/images/ava1.png" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info" >
          <h4>后台管理系统</h4>
        </div>
      </div>
      <!-- Sidebar Menu -->
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header"> </li>
        <!-- Optionally, you can add icons to the links -->
 
        <li ><a href="${APP_PATH }/views/adminManager.jsp"><i class="fa fa-link"></i> <span>权限管理</span></a></li>
        <li class="active"><a href="${APP_PATH }/views/announceManager.jsp"><i class="fa fa-link"></i> <span>公告管理</span></a></li>
        <li class="treeview">
          <a href="#"><i class="fa fa-link"></i> <span>审核管理</span>
            <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="${APP_PATH }/views/CourseAudit.jsp">教程审核</a></li>
            <li><a href="${APP_PATH }/views/VideoAudit.jsp">视频审核</a></li>
            <li><a href="${APP_PATH }/views/ArticleAudit.jsp">文章审核</a></li>
            <li><a href="${APP_PATH }/views/CommentsAudit.jsp">评论审核</a></li>
            <li><a href="${APP_PATH }/views/ArtistAudit.jsp">匠人认证审核</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#"><i class="fa fa-link"></i> <span>分析管理</span>
            <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="#">视频流量分析</a></li>
            <li><a href="#">教程流量分析</a></li>
            <li><a href="#">文章流量分析</a></li>
          </ul>
        </li>
        <li ><a href="${APP_PATH }/views/entriesManage.jsp"><i class="fa fa-link"></i> <span>词条管理</span></a></li>
        <li ><a href="${APP_PATH }/views/activityManage.jsp"><i class="fa fa-link"></i> <span>线下活动管理</span></a></li>
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <iframe src="${APP_PATH }/views/welcome.jsp" width="100%" height="670" name="iframe" scrolling="auto" class="iframe" framborder="0"></iframe>
  </div>
  <!-- /.content-wrapper -->

  <!-- Main Footer -->
<!--   <footer class="main-footer">
    To the right
    <div class="pull-right hidden-xs">
      Anything you want
    </div>
    Default to the left
    <strong>Copyright &copy; 2016 <a href="#">Company</a>.</strong> All rights reserved.
  </footer> -->

</div>
<!-- ./wrapper -->


<!-- jQuery 3 -->
<script src="${APP_PATH }/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="${APP_PATH }/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="${APP_PATH }/dist/js/adminlte.min.js"></script>

<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. -->
</body>
</html>