<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <!-- Bootstrap 3.3.7 -->
  <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="bower_components/font-awesome/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="bower_components/Ionicons/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">
  <!-- Morris chart -->
  <link rel="stylesheet" href="bower_components/morris.js/morris.css">
  <!-- jvectormap -->
  <link rel="stylesheet" href="bower_components/jvectormap/jquery-jvectormap.css">
  <!-- Date Picker -->
  <link rel="stylesheet" href="bower_components/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css">
  <!-- Daterange picker -->
  <link rel="stylesheet" href="bower_components/bootstrap-daterangepicker/daterangepicker.css">
  <!-- bootstrap wysihtml5 - text editor -->
  <link rel="stylesheet" href="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">

</head>
<body>
<!-- Content Header (Page header) -->
<div >
    <section class="content">
        
        <div class="container-fluid">
            <!-- Basic Table -->
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12">
                    <div class="card">
                        <div class="header">
                            <h2><strong>我的项目</strong></h2>
                            <!-- <div ng-include src="'template/headerDropdown.html'"></div> -->
                        </div>
                        <div class="body">
 <!--                            <div class="form-inline filter-option">
                                <div class="pull-right input-group-sm">
                                    <input type="text"  class="form-control input-sm" placeholder="项目名称模糊检索" />
                                    <button class="btn btn-sm waves-effect btn-info" ><i class="fa fa-search"></i> 筛选</button>
                               
                                </div>
                                
                            </div> -->
                            <div class="table-responsive">
                                <table id="data-table"  class="table table-striped m-b-0">
                                    <tr >
                                        <td data-title="'序号'" class="text-center">1</td>
                                        <td data-title="'项目编号'"  class="text-center width-55 text-nowrap">2</td>
                                        <td data-title="'项目名称'"  class="text-center">3</td>
                                        <td data-title="'创建/最后修改时间'"  class="text-center">4</td>
                                        <td data-title="'开始时间'"  class="text-center">5</td>
                                        <td data-title="'结束时间'"  class="text-center">6</td>
                                        <td data-title="'负责人'"  class="text-center">7</td>
                                        <td class="text-right width-60 text-nowrap">
                                            <button   class="btn btn-xs waves-effect btn-primary" style="color: pink"  title="子项目列表"><i class="fa fa-table"></i></button>
                                            <button  class="btn btn-danger btn-xs"  title="删除项目"><i class="fa fa-trash-o"></i></button>
                                            <button class="btn btn-warning btn-xs "  title="修改项目"><i class="fa fa-edit"></i></button>
                                            <button  class="btn btn-info btn-xs"  title="查看项目"><i class="fa fa-search"></i></button>
                                            <button class="btn btn-xs waves-effect btn-primary"  title="成员列表"><i class="fa fa-th-list"></i></button>
                                         </td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</div>
</body>
</html>