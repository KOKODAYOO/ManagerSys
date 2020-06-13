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
<!-- 提示框 -->
<script src="https://cdn.bootcss.com/sweetalert/1.1.3/sweetalert.min.js"></script>
  <!-- Google Font -->
  <link rel="stylesheet"
        href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>
<style type="text/css">
	.video-link .vjs-big-play-button{
    font-size: 2.5em;
    line-height: 2.3em;
    height: 2.5em;
    width: 2.5em;
    -webkit-border-radius: 2.5em;
    -moz-border-radius: 2.5em;
    border-radius: 2.5em;
    background-color: #73859f;
    background-color: rgba(115,133,159,.5);
    border-width: 0.15em;
    margin-top: -1.25em;
    margin-left: -1.75em;
}
/* 中间的播放箭头 */
.vjs-big-play-button .vjs-icon-placeholder {
    font-size: 1.63em;
}
/* 加载圆圈 */
.vjs-loading-spinner {
    font-size: 2.5em;
    width: 2em;
    height: 2em;
    border-radius: 1em;
    margin-top: -1em;
    margin-left: -1.5em;
}
.video-link.vjs-playing .vjs-tech {
    pointer-events: auto;
}
.video-link .vjs-time-control{display:block;}
.video-link .vjs-remaining-time{display: none;}
</style>
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
        <span class="sr-only"></span>
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
 
        <li><a href="${APP_PATH }/views/adminManager.jsp"><i class="fa fa-link"></i> <span>权限管理</span></a></li>
        <li><a href="${APP_PATH }/views/announceManager.jsp"><i class="fa fa-link"></i> <span>公告管理</span></a></li>
        <li class="treeview">
          <a href="#"><i class="fa fa-link"></i> <span>审核管理</span>
            <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
          </a>
          <ul class="treeview-menu" style="display: block;">
            <li class="active"><a href="${APP_PATH }/views/CourseAudit.jsp">教程审核</a></li>
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


<!-- 模态框 -->
  <div class="modal fade" id="viewModal" role="dialog" aria-labelledby="videoPlayModal" aria-hidden="true" >
    <div class="modal-dialog" style="width:960px;">
    <div class="modal-content" style="border: 0px;border-radius: 0px;">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
      	<h4 class="modal-title" id="myModalLabel">视频播放</h4>
      </div>
       <div id="filelist">
           <video id="videodemo" poster="" src="" class="video_link vjs-big-play-centered" controls preload="auto"  controls="controls" width="960"  height="600" >
           </video>
      </div>
       <div class="modal-footer">
			<textarea id="desc" class="form-control" style="OVERFLOW:   hidden" rows="2" cols="6" readonly="readonly"></textarea>
      </div>
      </div>
    </div>
</div>
  <!-- Content Wrapper. Contains page content -->
  
<div class="content-wrapper">
<!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        	教程审核
        <small>Course Audit </small>
      </h1>
    </section>

    <!-- Main content -->
    <section class="content container-fluid">
    <!-- /.content -->
    <div class="row clearfix">
		<section class="col-lg-12 col-md-12 col-sm-12">
		<div class="box box-info">
            <div class="box-header with-border">
            	<h3 class="box-title">待审核课程列表</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
<div class="table-responsive">
                <table id="admin-table"  class="table table-striped m-b-0">
                  <thead>
                  <tr>
                    <th class="text-center">教程ID</th>
                    <th class="text-center">教程名</th>
                    <th class="text-center">上传时间</th>
                  </tr>
                  </thead>
                  <tbody>

                  </tbody>
                </table>
              </div>
              <!-- /.table-responsive -->
            </div>
            <!-- /.box-body -->
		<!-- 显示分页信息 -->
		<div class="row">
			<!--分页文字信息  -->
			<div class="col-md-6" id="page_info_area"></div>
			<!-- 分页条信息 -->
			<div class="col-md-6" id="page_nav_area">
				
			</div>
		</div>
            <!-- /.box-footer -->
          </div>
		</section>
	</div>
    </section>
 </div>
<script src="${APP_PATH }/bower_components/jquery/dist/jquery.min.js"></script>
  <script type="text/javascript" >
  
	var totalRecord,currentPage;
	//1、页面加载完成以后，直接去发送ajax请求,要到分页数据
	$(function(){
		//去首页
		to_page(1);
	});
	
	function to_page(pn){
		//console.log("调用。。。。")
		$.ajax({
			url:"${APP_PATH}/check/courseList",
			data:"pn="+pn,
			type:"GET",
			success:function(result){
				
				if(result.code==400) {
					swal({
						  title: "列表为空",
						  text: "暂时没有教程啦",
						  icon: "success",
						  button: "确定",
						});
				}
				//console.log(result);
				//1、解析并显示员工数据
				build_emps_table(result);
				//2、解析并显示分页信息
				build_page_info(result);
				//3、解析显示分页条数据
				build_page_nav(result);
			}
		});
	}
	
	function build_emps_table(result){
		//清空table表格
		$("#admin-table tbody").empty();
		var admins = result.data.pageInfo.list;
		//console.log(admins);
		$.each(admins,function(index,item){
			//console.log(item);
			var adminIdTd = $("<td class='text-center'></td>").append(item.id);
			var adminNameTd = $("<td class='text-center'></td>").append(item.name);
			var levelTd = $("<td class='text-center'></td>").append(formatDate(item.release_time));

			var passBtn =  $("<button></button>").addClass("btn btn-success btn-sm pass_btn")
							.append($("<span></span>").addClass("glyphicon glyphicon-ok")).append("过审");
			
			
			var notPassBtn =  $("<button></button>").addClass("btn btn-danger btn-sm nopass_btn")
							.append($("<span></span>").addClass("glyphicon glyphicon-remove")).append("未过审");
			
			var viewBtn =  $("<button data-toggle='control-sidebar'></button>").addClass("btn btn-info btn-sm view_btn")
							.append($("<span></span>").addClass("glyphicon glyphicon-eye-open")).append("查看");
			
			viewBtn.attr("content",item.course_url);
			viewBtn.attr("poster",item.cover_url);
			viewBtn.attr("desc",item.des);
			viewBtn.attr("tag",item.tag);
			passBtn.attr("pass-id",item.id);
			notPassBtn.attr("noPass-id",item.id);
			var btnTd = $("<td></td>").addClass("text-right width-60 text-nowrap")
			.append(viewBtn).append(" ").append(passBtn).append(" ").append(notPassBtn);
			//var delBtn = 
			//append方法执行完成以后还是返回原来的元素
			$("<tr></tr>")
				.append(adminIdTd)
				.append(adminNameTd)
				.append(levelTd)
				.append(btnTd)
				.appendTo("#admin-table tbody");
		});
	}
	//解析显示分页信息
	function build_page_info(result){
		$("#page_info_area").empty();
		$("#page_info_area").append("当前"+result.data.pageInfo.pageNum+"页,总"+
				result.data.pageInfo.pages+"页,总"+
				result.data.pageInfo.total+"条记录");
		totalRecord = result.data.pageInfo.total;
		currentPage = result.data.pageInfo.pageNum;
	}
	//解析显示分页条，点击分页要能去下一页....
	function build_page_nav(result){
		//page_nav_area
		$("#page_nav_area").empty();
		var ul = $("<ul></ul>").addClass("pagination");
		
		//构建元素
		var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
		var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
		if(result.data.pageInfo.hasPreviousPage == false){
			firstPageLi.addClass("disabled");
			prePageLi.addClass("disabled");
		}else{
			//为元素添加点击翻页的事件
			firstPageLi.click(function(){
				to_page(1);
			});
			prePageLi.click(function(){
				to_page(result.data.pageInfo.pageNum -1);
			});
		}
		
		
		
		var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
		var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
		if(result.data.pageInfo.hasNextPage == false){
			nextPageLi.addClass("disabled");
			lastPageLi.addClass("disabled");
		}else{
			nextPageLi.click(function(){
				to_page(result.data.pageInfo.pageNum +1);
			});
			lastPageLi.click(function(){
				to_page(result.data.pageInfo.pages);
			});
		}
		
		
		
		//添加首页和前一页 的提示
		ul.append(firstPageLi).append(prePageLi);
		//1,2，3遍历给ul中添加页码提示
		$.each(result.data.pageInfo.navigatepageNums,function(index,item){
			
			var numLi = $("<li></li>").append($("<a></a>").append(item));
			if(result.data.pageInfo.pageNum == item){
				numLi.addClass("active");
			}
			numLi.click(function(){
				to_page(item);
			});
			ul.append(numLi);
		});
		//添加下一页和末页 的提示
		ul.append(nextPageLi).append(lastPageLi);
		
		//把ul加入到nav
		var navEle = $("<nav></nav>").append(ul);
		navEle.appendTo("#page_nav_area");
	}


	
	$(document).on("click",".pass_btn",function(){
		//1、弹出是否确认删除对话框
		var Id = $(this).attr("pass-id");

		if(confirm("确定这么做吗？")){
			//确认，发送ajax请求删除即可
			$.ajax({
				url:"${APP_PATH}/check/courseAudit?result=true&id="+Id,
				type:"PUT",
				success:function(result){
					swal({
		                title: '操作成功！',
		                icon: 'success',
		                button: '确定'
		            });
					//回到本页
					to_page(currentPage);
				}
			});
		}
	});
	
	$(document).on("click",".nopass_btn",function(){
		//1、弹出是否确认删除对话框
		var Id = $(this).attr("noPass-id");

		if(confirm("确定这么做吗？")){
			//确认，发送ajax请求删除即可
			$.ajax({
				url:"${APP_PATH}/check/courseAudit?result=false&id="+Id,
				type:"PUT",
				success:function(result){
					swal({
		                title: '操作成功！',
		                icon: 'success',
		                button: '确定'
		            });
					//回到本页
					to_page(currentPage);
				}
			});
		}
	});
	

	function formatDate(date) { 
		var now=new Date(date);
		var year=now.getFullYear();  //取得4位数的年份
		var month=now.getMonth()+1;  //取得日期中的月份，其中0表示1月，11表示12月
		var date=now.getDate();      //返回日期月份中的天数（1到31）
		var hour=now.getHours();     //返回日期中的小时数（0到23）
		var minute=now.getMinutes(); //返回日期中的分钟数（0到59）
		var second=now.getSeconds(); //返回日期中的秒数（0到59）
		return year+"-"+month+"-"+date+" "+hour+":"+minute+":"+second; 
		} 
  
	

	

	
	$(document).on("click",".view_btn",function(){
		
		var content = $(this).attr("content");
		//document.getElementById('container').innerHTML = content;
		//var newWin = window.open('', '_blank');
		//newWin.document.write(content);
		//console.log($(this).attr("tag"),typeof($(this).attr("tag")));
		
		if($(this).attr("tag")=="true"){
			var myPlayer =document.getElementById('videodemo');
			//console.log(myPlayer);
			myPlayer.setAttribute("poster",$(this).attr("poster"));
			myPlayer.setAttribute("src",$(this).attr("content"));
			$('#desc').val($(this).attr("desc"));
	/* 		myPlayer.poster($(this).attr("poster"));
			myPlayer.src($(this).attr("content")); */
			
			$('#viewModal').modal({
				
				backdrop:"static",
				keyboard: true
			});
			
			$("#viewModal").on('hidden.bs.modal', function () {
		        var vadiodom = document.getElementById("videodemo");
		        vadiodom.controls = true;
		        if (!vadiodom.paused) {
		            vadiodom.pause();
		        }
		    });
		}else{
			var newWin = window.open(content, '_blank');
		}
		
		
	});
	

  </script>
<script src="${APP_PATH }/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="${APP_PATH }/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="${APP_PATH }/dist/js/adminlte.min.js"></script>
  </div>
  </body>
</html>