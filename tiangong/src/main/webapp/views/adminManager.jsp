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
            <a href="${APP_PATH }/views/login.jsp" ><i class="fa fa-power-off"></i></a>
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
 
        <li class="active"><a href="${APP_PATH }/views/adminManager.jsp"><i class="fa fa-link"></i> <span>权限管理</span></a></li>
        <li><a href="${APP_PATH }/views/announceManager.jsp"><i class="fa fa-link"></i> <span>公告管理</span></a></li>
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
  
  <!-- ------------------------------------------------------------------------------------------ -->
  <!-- 模态框 -->
  <div class="modal fade" id="adminAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">管理员添加</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label class="col-sm-2 control-label">账户</label>
		    <div class="col-sm-10">
		      <input type="text" name="name" class="form-control" id="adminName_add_input" placeholder="请输入用户名">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">密码</label>
		    <div class="col-sm-10">
		      <input type="password" name="password" class="form-control" id="password_add_input" placeholder="请输入密码">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">权限</label>
		    <div class="col-sm-4">

		      <select class="form-control" name="level">
		      	<option value=false>管理员</option>
		      	<option value=true>超级管理员</option>
		      </select>
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="admin_save_btn">保存</button>
      </div>
    </div>
  </div>
</div>

  <!-- Content Wrapper. Contains page content -->
  
<div class="content-wrapper">
<!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        	权限管理
        <small>Privilege Management </small>
      </h1>
    </section>

    <!-- Main content -->
    <section class="content container-fluid">
    <!-- /.content -->
    <div class="row clearfix">
		<section class="col-lg-12 col-md-12 col-sm-12">
		<div class="box box-info">
            <div class="box-header with-border">
            	<h3 class="box-title">管理员列表</h3>
            </div>

            <!-- /.box-header -->
            <div class="box-body">
                            <div class="form-inline filter-option">
                                <div class="pull-right input-group-sm">
                                    <button id="admin_add_modal_btn" class="btn btn-sm waves-effect btn-primary" ><i class="fa fa-plus-circle"></i> 新增</button>
                                </div>
                            </div>
              <div class="table-responsive">
                <table id="admin-table"  class="table table-striped m-b-0">
                  <thead>
                  <tr>
                    <th class="text-center">管理员 ID</th>
                    <th class="text-center">名称</th>
                    <th class="text-center">权限</th>
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
		console.log("调用。。。。")
		$.ajax({
			url:"${APP_PATH}/admin/getAdminList",
			data:"pn="+pn,
			type:"GET",
			success:function(result){
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
			//console.log(item.id+" "+item.name+" "+item.level);
			var adminIdTd = $("<td class='text-center'></td>").append(item.id);
			var adminNameTd = $("<td class='text-center'></td>").append(item.name);
			var levelTd = $("<td class='text-center'></td>").append(item.level==true?"超级管理员":"管理员");

			var delBtn =  $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
							.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
			//为删除按钮添加一个自定义的属性来表示当前删除的员工id
			delBtn.attr("del-id",item.id);
			var btnTd = $("<td></td>").addClass("text-right width-60 text-nowrap").append(delBtn);
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
	
	//清空表单样式及内容
	function reset_form(ele){
		$(ele)[0].reset();
		//清空表单样式
		$(ele).find("*").removeClass("has-error has-success");
		$(ele).find(".help-block").text("");
	}
	
	//点击新增按钮弹出模态框。
	$("#admin_add_modal_btn").click(function(){
		//清除表单数据（表单完整重置（表单的数据，表单的样式））
		reset_form("#adminAddModal form");
		//s$("")[0].reset();
		//发送ajax请求，查出部门信息，显示在下拉列表中
		//getDepts("#empAddModal select");
		//弹出模态框
		$("#adminAddModal").modal({
			backdrop:"static"
		});
	});
	
	
	
	//校验表单数据
	function validate_add_form(){
		//1、拿到要校验的数据，使用正则表达式
		var adminName = $("#adminName_add_input").val();
		var regName = /(^[a-zA-Z0-9_-]{4,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
		if(!regName.test(adminName)){
			//alert("用户名可以是2-5位中文或者6-16位英文和数字的组合");
			show_validate_msg("#adminName_add_input", "error", "用户名可以是2-5位中文或者4-16位英文和数字的组合");
			return false;
		}else{
			show_validate_msg("#adminName_add_input", "success", "");
		};
		
		return true;
	}
	
	//显示校验结果的提示信息
	function show_validate_msg(ele,status,msg){
		//清除当前元素的校验状态
		$(ele).parent().removeClass("has-success has-error");
		$(ele).next("span").text("");
		if("success"==status){
			$(ele).parent().addClass("has-success");
			$(ele).next("span").text(msg);
		}else if("error" == status){
			$(ele).parent().addClass("has-error");
			$(ele).next("span").text(msg);
		}
	}
	
	//校验用户名是否可用
	$("#adminName_add_input").change(function(){
		//发送ajax请求校验用户名是否可用
		var adminName = this.value;
		$.ajax({
			url:"${APP_PATH}/admin/check",
			data:"account="+adminName,
			type:"GET",
			success:function(result){
				if(result.code==200){
					show_validate_msg("#adminName_add_input","success","用户名可用");
					$("#admin_save_btn").attr("ajax-va","success");
				}else{
					show_validate_msg("#adminName_add_input","error",result.data.va_msg);
					$("#admin_save_btn").attr("ajax-va","error");
				}
			}
		});
	});
	
	//点击保存
	$("#admin_save_btn").click(function(){
		//1、模态框中填写的表单数据提交给服务器进行保存
		console.log($("#adminAddModal form").serialize());
		//1、先对要提交给服务器的数据进行校验
		if(!validate_add_form()){
			return false;
		};
		//1、判断之前的ajax用户名校验是否成功。如果成功。
		if($(this).attr("ajax-va")=="error"){
			return false;
		}
		
		//console.log($("#adminAddModal form").serialize());
		
		//2、发送ajax请求保存
		 $.ajax({
			url:"${APP_PATH}/admin/addAdmin",
			type:"POST",
			data:$("#adminAddModal form").serialize(),
			success:function(result){
				//alert(result.msg);
				if(result.code == 200){
					//员工保存成功；
					//1、关闭模态框
					$("#adminAddModal").modal('hide');
					
					//2、来到最后一页，显示刚才保存的数据
					//发送ajax请求显示最后一页数据即可
					to_page(totalRecord);
				}else{
					//显示失败信息
					//console.log(result);
					alert("创建失败");
					
				}
			}
		}); 
	});
	

	
	
	
	//单个删除
	$(document).on("click",".delete_btn",function(){
		//1、弹出是否确认删除对话框
		var Id = $(this).attr("del-id");

		if(confirm("确认删除吗？")){
			//确认，发送ajax请求删除即可
			$.ajax({
				url:"${APP_PATH}/admin/deleteAdmin?id="+Id,
				type:"DELETE",
				success:function(result){
					alert(result.msg);
					//回到本页
					to_page(currentPage);
				}
			});
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