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
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
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
  
    <!-- 修改模态框 -->
  <div class="modal fade" id="UpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">修改公告</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label class="col-sm-2 control-label">标题</label>
		    <div class="col-sm-10">
		      <input type="text" name="title" class="form-control" id="title_input" placeholder="请输入标题">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">内容</label>
		    <div class="col-sm-10">
		       <textarea name="content" class="form-control" id="content_input"  cols="4"   rows="6"   style="OVERFLOW:   hidden" placeholder="请输入公告内容"></textarea>
		      <span class="help-block"></span>
		    </div>
		  </div>

		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="modifyUpdate_btn">更新</button>
      </div>
    </div>
  </div>
</div>

  <!-- 模态框 -->
  <div class="modal fade" id="announceAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">新建公告</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label class="col-sm-2 control-label">标题</label>
		    <div class="col-sm-10">
		      <input type="text" name="title" class="form-control" id="title_add_input" placeholder="请输入标题">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">内容</label>
		    <div class="col-sm-10">
		       <textarea name="content" class="form-control"   cols="4"   rows="6"   style="OVERFLOW:   hidden" placeholder="请输入公告内容"></textarea>
		      <span class="help-block"></span>
		    </div>
		  </div>

		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="announce_save_btn">保存</button>
      </div>
    </div>
  </div>
</div>

  <!-- Content Wrapper. Contains page content -->
  
<div class="content-wrapper">
<!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        	公告管理
        <small>Announce Management </small>
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
                                    <button id="announce_add_modal_btn" class="btn btn-sm waves-effect btn-primary" ><i class="fa fa-plus-circle"></i> 新增</button>
                                </div>
                            </div>
              <div class="table-responsive">
                <table id="admin-table"  class="table table-striped m-b-0">
                  <thead>
                  <tr>
                    <th class="text-center"> ID</th>
                    <th class="text-center">标题</th>
                    <th class="text-center">时间</th>
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
  
  
	var user_id=parseInt(1);
	var totalRecord,currentPage;
	//1、页面加载完成以后，直接去发送ajax请求,要到分页数据
	$(function(){
		//去首页
		to_page(1);
	});
	
	function to_page(pn){
		//console.log("调用。。。。")
		$.ajax({
			url:"${APP_PATH}/announce/getAnnounce",
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
		var admins = result.data.list.list;
		$.each(admins,function(index,item){
			//console.log(item);
			var IdTd = $("<td class='text-center'></td>").append(item.id);
			var TitleTd = $("<td class='text-center'></td>").append(item.title);
			var timeTd = $("<td class='text-center'></td>").append(formatDate(item.post_time));

			var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
							.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
	
			
			editBtn.attr("content",item.content);
			editBtn.attr("title",item.title);
			editBtn.attr("edit-id",item.id);
			var delBtn =  $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
							.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
			//为删除按钮添加一个自定义的属性来表示当前删除的员工id
			delBtn.attr("del-id",item.id);
			var btnTd = $("<td></td>").addClass("text-right width-60 text-nowrap").append(editBtn).append(" ").append(delBtn);
			//var delBtn = 
			//append方法执行完成以后还是返回原来的元素
			$("<tr></tr>")
				.append(IdTd)
				.append(TitleTd)
				.append(timeTd)
				.append(btnTd)
				.appendTo("#admin-table tbody");
		});
	}
	//解析显示分页信息
	function build_page_info(result){
		$("#page_info_area").empty();
		$("#page_info_area").append("当前"+result.data.list.pageNum+"页,总"+
				result.data.list.pages+"页,总"+
				result.data.list.total+"条记录");
		totalRecord = result.data.list.total;
		currentPage = result.data.list.pageNum;
	}
	//解析显示分页条，点击分页要能去下一页....
	function build_page_nav(result){
		//page_nav_area
		$("#page_nav_area").empty();
		var ul = $("<ul></ul>").addClass("pagination");
		
		//构建元素
		var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
		var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
		if(result.data.list.hasPreviousPage == false){
			firstPageLi.addClass("disabled");
			prePageLi.addClass("disabled");
		}else{
			//为元素添加点击翻页的事件
			firstPageLi.click(function(){
				to_page(1);
			});
			prePageLi.click(function(){
				to_page(result.data.list.pageNum -1);
			});
		}
		
		
		
		var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
		var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
		if(result.data.list.hasNextPage == false){
			nextPageLi.addClass("disabled");
			lastPageLi.addClass("disabled");
		}else{
			nextPageLi.click(function(){
				to_page(result.data.list.pageNum +1);
			});
			lastPageLi.click(function(){
				to_page(result.data.list.pages);
			});
		}
		
		
		
		//添加首页和前一页 的提示
		ul.append(firstPageLi).append(prePageLi);
		//1,2，3遍历给ul中添加页码提示
		$.each(result.data.list.navigatepageNums,function(index,item){
			
			var numLi = $("<li></li>").append($("<a></a>").append(item));
			if(result.data.list.pageNum == item){
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
	$("#announce_add_modal_btn").click(function(){
		//清除表单数据（表单完整重置（表单的数据，表单的样式））
		reset_form("#announceAddModal form");
		//s$("")[0].reset();
		//发送ajax请求，查出部门信息，显示在下拉列表中
		//getDepts("#empAddModal select");
		//弹出模态框
		$("#announceAddModal").modal({
			backdrop:"static"
		});
	});
  
	//点击保存
	$("#announce_save_btn").click(function(){
		//1、模态框中填写的表单数据提交给服务器进行保存
		console.log($("#announceAddModal form").serialize()+"&sender_id="+user_id);
		
		//2、发送ajax请求保存
 		 $.ajax({
			url:"${APP_PATH}/announce/newAnnounce",
			type:"POST",
			data:$("#announceAddModal form").serialize()+"&sender_id="+user_id,
			success:function(result){
				//alert(result.msg);
				if(result.code == 200){
					//员工保存成功；
					//1、关闭模态框
					$("#announceAddModal").modal('hide');
					
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
				url:"${APP_PATH}/announce/deleteById?id="+Id,
				type:"DELETE",
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
	
	
 	$(document).on("click",".edit_btn",function(){
		//alert("edit");
		
		var title=$(this).attr("title");
		var content=$(this).attr("content");
		var id=$(this).attr("edit-id");
		
		//console.log(title,content,$(this).attr("edit-id"));
		$("#title_input").val(title);
		$("#content_input").val(content);


		$("#modifyUpdate_btn").attr("id",$(this).attr("edit-id"));
		$("#UpdateModal").modal({
			backdrop:"static"
		});
	}); 
	

	//点击更新，更新员工信息
	$("#modifyUpdate_btn").click(function(){

		//console.log($(this).attr("id"));
		$.ajax({
			url:"${APP_PATH}/announce/modify?id="+$(this).attr("id"),
			type:"PUT",
			data:$("#UpdateModal form").serialize()+"&sender_id="+user_id,
			success:function(result){
				//alert(result.msg);
				//1、关闭对话框
				$("#UpdateModal").modal("hide");
				//2、回到本页面
				to_page(currentPage);
			}
		});
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
  </script>
<script src="${APP_PATH }/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="${APP_PATH }/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="${APP_PATH }/dist/js/adminlte.min.js"></script>
  </div>


  </body>
</html>