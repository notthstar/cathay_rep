<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>华夏ERP/其它入库</title>
     <#include "../header/headerLink.html"/>
  </head>
  <body>
    <#--<div class="page">-->
      <#--<!-- Main Navbar&ndash;&gt;-->
      <#--<header class="header">-->
        <#--<nav class="navbar">-->
          <#--<!-- Search Box&ndash;&gt;-->
          <#--<div class="search-box">-->
            <#--<button class="dismiss"><i class="icon-close"></i></button>-->
            <#--<form id="searchForm" action="#" role="search">-->
              <#--<input type="search" placeholder="What are you looking for..." class="form-control">-->
            <#--</form>-->
          <#--</div>-->
          <#--<div class="container-fluid">-->
            <#--<div class="navbar-holder d-flex align-items-center justify-content-between">-->
              <#--<!-- Navbar Header&ndash;&gt;-->
              <#--<div class="navbar-header">-->
                <#--<!-- Navbar Brand &ndash;&gt;<a href="index.html" class="navbar-brand d-none d-sm-inline-block">-->
                  <#--<div class="brand-text d-none d-lg-inline-block"><strong>华夏ERP</strong></div>-->
                  <#--<div class="brand-text d-none d-sm-inline-block d-lg-none"><strong>BD</strong></div></a>-->
                <#--<!-- Toggle Button&ndash;&gt;<a id="toggle-btn" href="#" class="menu-btn active"><span></span><span></span><span></span></a>-->
              <#--</div>-->
              <#--<!-- Navbar Menu &ndash;&gt;-->
              <#--<ul class="nav-menu list-unstyled d-flex flex-md-row align-items-md-center">-->
                <#--<!-- Search&ndash;&gt;-->
                <#--<li class="nav-item d-flex align-items-center"><a id="search" href="#"><i class="icon-search"></i></a></li>-->
                <#--<!-- Notifications&ndash;&gt;-->
                <#--<li class="nav-item dropdown"> <a id="notifications" rel="nofollow" data-target="#" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="nav-link"><i class="fa fa-bell-o"></i><span class="badge bg-red badge-corner">0</span></a>-->
                  <#--<ul aria-labelledby="notifications" class="dropdown-menu">-->
                    <#--<li><a rel="nofollow" href="#" class="dropdown-item"> -->
                        <#--<div class="notification">-->
                          <#--<div class="notification-content"><i class="fa fa-envelope bg-green"></i>您有0条消息</div>-->
                          <#--<div class="notification-time"><small>信箱空空如也</small></div>-->
                        <#--</div></a></li>-->
                  <#--</ul>-->
                <#--</li>-->
                <#---->
                <#--<!-- Languages dropdown    &ndash;&gt;-->
                 <#--<li class="nav-item dropdown">-->
                	<#--<a id="languages" rel="nofollow" data-target="#" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="nav-link language dropdown-toggle">-->
                		<#--<span class="fa fa-user-o"></span>-->
                		<#--<span class="d-none d-sm-inline-block">管理员</span>-->
                	<#--</a>-->
                  <#--<ul aria-labelledby="languages" class="dropdown-menu">-->
                    <#--<li><a rel="nofollow" href="#" class="dropdown-item"> <i class="img-fluid rounded-circle fa fa-key"></i>修改密码</a></li>-->
                    <#--<li><a rel="nofollow" href="login.html" class="dropdown-item"> <i class="img-fluid rounded-circle fa fa-share"></i>退出登录</a></li>-->
                  <#--</ul>-->
                <#--</li>-->
                  <#--</ul>-->
                <#--</li>-->
                <#--<!-- Logout    &ndash;&gt;-->
                <#--<!--<li class="nav-item"><a href="login.html" class="nav-link logout"> <span class="d-none d-sm-inline">Logout</span><i class="fa fa-sign-out"></i></a></li>&ndash;&gt;-->
              <#--</ul>-->
            <#--</div>-->
          <#--</div>-->
        <#--</nav>-->
      <#--</header>-->
      <#--<div class="page-content d-flex align-items-stretch"> -->
        <#--<!-- Side Navbar &ndash;&gt;-->
        <#--<nav class="side-navbar">-->
          <#--<!-- Sidebar Header&ndash;&gt;-->
          <#--<div class="sidebar-header d-flex align-items-center">-->
            <#--<div class="avatar"><img src="img/nerd%20bot.png" width="50px" height="50px" title="欢迎你,管理员"></div>-->
            <#--<div class="title">-->
              <#--<h1 class="h4">管理员</h1>-->
              <#--<p>欢迎你</p>-->
            <#--</div>-->
          <#--</div>-->
          <#--<!-- Sidebar Navidation Menus&ndash;&gt;<span class="heading">Main</span>-->
          <#--<ul class="list-unstyled">-->
          	<#--<!--下拉列表1&ndash;&gt;-->
                    <#--<li><a href="#retailmanagement" aria-expanded="false" data-toggle="collapse" id="retailadministration"> <i class="fa fa-podcast"></i>零售管理 </a>-->
                    	<#--<ul class="collapse list-unstyled" id="retailmanagement">-->
                    		<#--<li><a href="retailmanagement/storage.html"><i class="fa fa-toggle-off"></i>零售出库</a></li>-->
                    		<#--<li><a href="retailmanagement/returned.html"><i class="fa fa-toggle-off"></i>零售退货</a></li>-->
                    	<#--</ul>-->
                    <#--</li>-->
                    <#--<!--下拉列表2&ndash;&gt;-->
                    <#--<li><a href="#purchasingmanagement" aria-expanded="false" data-toggle="collapse"> <i class="fa fa-bookmark-o"></i>采购管理</a>-->
                    	<#--<ul class="collapse list-unstyled" id="purchasingmanagement">-->
                    		<#--<li><a href="purchasingmanagement/purchaseorder.html"><i class="fa fa-toggle-off"></i>采购订单</a></li>-->
                    		<#--<li><a href="purchasingmanagement/procurementandstorage.html"><i class="fa fa-toggle-off"></i>采购入库</a></li>-->
                    		<#--<li><a href="purchasingmanagement/Purchasereturn.html"><i class="fa fa-toggle-off"></i>采购退货</a></li>-->
                    	<#--</ul>-->
                    <#--</li>-->
                    <#--<!--下拉列表3&ndash;&gt;-->
                    <#--<li><a href="#salesmanagement" aria-expanded="false" data-toggle="collapse"> <i class="fa fa-plus-square-o"></i>销售管理</a>-->
                    	<#--<ul class="collapse list-unstyled" id="salesmanagement">-->
                    		<#--<li><a href="salesmanagement/sell.html"><i class="fa fa-toggle-off"></i>销售订单</a></li>-->
                    		<#--<li><a href="salesmanagement/Salesofoutbound.html"><i class="fa fa-toggle-off"></i>销售出库</a></li>-->
                    		<#--<li><a href="salesmanagement/Salesreturn.html"><i class="fa fa-toggle-off"></i>销售退货</a></li>-->
                    	<#--</ul>-->
                    <#--</li>-->
                    <#--<!--下拉列表4&ndash;&gt;-->
                    <#--<li><a href="#storemanagement" aria-expanded="false" data-toggle="collapse" id="warehousemanagement">-->
						<#--<i class="fa fa-plus-square"></i>仓库管理</a>-->
                    	<#--<ul class="collapse list-unstyled" id="storemanagement">-->
                    		<#--<li class="active"><a href="inWarehouseVO"><i class="fa fa-toggle-off"></i>其他入库</a></li>-->
                    		<#--<li><a href="outWareBillVO"><i class="fa fa-toggle-off"></i>其他出库</a></li>-->
                    		<#--<li><a href="allocateBillVO"><i class="fa fa-toggle-off"></i>调拨出库</a></li>-->
                    		<#--<li><a href="assembleBillVO"><i class="fa fa-toggle-off"></i>组装单</a></li>-->
                    		<#--<li><a href="disAssembleBillVO"><i class="fa fa-toggle-off"></i>拆卸单</a></li>-->
                    	<#--</ul>-->
                    <#--</li>-->
          <#--</ul><!--<span class="heading">Extras</span>-->
          <#--<ul class="list-unstyled">-->
            <#--<li> <a href="#"> <i class="icon-flask"></i>Demo </a></li>-->
            <#--<li> <a href="#"> <i class="icon-screen"></i>Demo </a></li>-->
            <#--<li> <a href="#"> <i class="icon-mail"></i>Demo </a></li>-->
            <#--<li> <a href="#"> <i class="icon-picture"></i>Demo </a></li>-->
          <#--</ul>&ndash;&gt;-->
        <#--</nav>-->
		<#include "../header/header.html"/>
		<#include "../leftList/left_list.html"/>
        <div class="content-inner">
          <!-- Page Header-->
          <header class="page-header">
            <div class="container-fluid">
              <h2 class="no-margin-bottom">仓库管理</h2>
            </div>
          </header>
          <!-- Breadcrumb-->
          <div class="breadcrumb-holder container-fluid">
            <ul class="breadcrumb">
              <li class="breadcrumb-item"><a href="index.html">首页</a></li>
              <li class="breadcrumb-item active">其他入库</li>
            </ul>
          </div>
          
          
          
          
          <!--表单-->
          <section class="forms"> 
            <div class="container-fluid">
              <div class="row">
                <!-- Basic Form-->
                <div class="col-lg-12">
                  <div class="card">
                    <div class="card-close">
                    </div>
                    <div class="card-header d-flex align-items-center">
                    	<strong>
                    			<i class="fa fa-window-maximize" aria-hidden="true"></i>
                      		其他入库列表</strong>
                    </div>
                    <div class="card-body">
                    	<form class="form-horizontal" role="form" action="/inWareByCond" method="post">
                      <table>
                      	<tr>
                      		<div class="form-group">
                      		<td>单据编号：</td>
                      		<td width="150px">
                      			<input type="text" class="form-control">
                      		</td>
                      		</div>
                      		<div class="form-group">
                      		<td>商品信息：</td>
                      		<td width="150px"><input type="text" class="form-control" id="mate" name="mate" placeholder="名称/型号"></td>
                      		</div>
                      		<div class="form-group">
                      		<td>单据日期：</td>
                      		<td width="170px"><input type="date" class="form-control" id="startTime" name="startTime" pattern="yyyy-MM-dd"></td>
                      		</div>
                      		<div class="form-group">
                      		<td>-</td>
                      		<td width="170px"><input type="date" class="form-control" id="endTime" name="endTime" pattern="yyyy-MM-dd"></td>
                      		</div>
                      		<div class="form-group">
                      		<td>

                      			<button class="btn btn-success" style="width: 122px;" type="submit">

                      				查询
                      			</button>
                      			</a>
                      		</td>	
                      		</div>
                      		<div class="form-group">
                      		<td>
                      			<a href="#">
                      			<button type="reset" class="btn btn-success"  style="width: 122px;">
                      				<i class="fa fa-share-square"></i>
                      				重置
                      			</button>
                      			</a>
                      		</td>
                      		</div>
                      	</tr>
                      </table>
                     </form>
                      <div style="margin-top: 20px;">
                      	<table class="table table-hover text-center">
                      		<tr class="text-bold">
                      			<td><input type="checkbox" title="全选" id="chElt" onclick="checkOrCancelAll()"></td>
                      			<td>操作</td>
                      			<td>供应商名称</td>
                      			<td>单据编号</td>
                      			<td>商品信息</td>
                      			<td>单据日期</td>
                      			<td>操作员</td>
                      			<td>金额合计</td>
                      		</tr>
                      		<#list inWareBillVOList as list>
							<tr>
                      			<td><input type="checkbox" name="cElt"></td>
                      			<td style="display: flex; justify-content: space-between;">
                                    <a href="#">
                                        <i class="fa fa-list" title="查看"></i>
                                    </a>
                                    <a data-toggle="modal" data-target="#select" style="color: green;">
                                        <i class="fa fa-pencil-square-o" title="编辑"></i>
                                    </a>
                                    <a data-toggle="modal" data-target="#deleteModal"  style="color: red;">
                                      <input type="hidden" id="mytd" value="${list.id}"> <i class="fa fa-trash-o" title="删除"></i>
                                    </a>
                                </td>
                      			<td>${list.supplier}</td>
                      			<td>${list.number}</td>
                      			<td>${list.mate}</td>
                      			<td>${list.opertime?string("yyyy-MM-dd HH:mm:ss")}</td>
                      			<td>${list.operPersonName}</td>
                      			<td>${list.totalPrice}</td>
                      		</tr>
							</#list>
                      	</table>
                      </div>
                      <div style="display: flex;justify-content: flex-end;">
                      	<button class="btn btn-success" title="添加" data-toggle="modal" data-target="#insert">
                      		<i class="fa fa-plus"></i>
                      		添加
                      	</button>&nbsp;
                      	<button class="btn btn-danger" title="删除"><i class="fa fa-times"></i>
                      		删除
                      	</button>
                      </div>

                    </div>
                  </div>
                </div>
              </div>
            </div>
          </section> 
        </div>
      </div>
    </div>

    <div class="modal fade" id="select" tabindex="-1" role="dialog" aria-hidden="true" data-backdrop="static" aria-labelledby="myModalLabel">
        <div class="modal-dialog modal-lg" role="document" aria-hidden="true" >
            <div class="modal-content" style="border-radius: 10px;width: 886px">
                <div class="modal-header">
										<span class="modal-title" id="myModalLabel">
											<h3>查看其它入库信息</h3>
										</span>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><i class="fa fa-times"></i>
                    </button>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" method="post">
                        <table class="form-group">
                            <tr>
                                <td>会员卡号：</td>
                                <td width="120px">
                                    <input type="text" class="form-control" readonly="readonly" style="border-radius: 3px">
                                </td>
                                <td>单据日期：</td>
                                <td width="170px"><input type="date" class="form-control" readonly="readonly" pattern="yyyy-MM-dd" style="border-radius: 3px"></td>
                                <td>单据编号：</td>
                                <td width="120px">
                                    <input type="text" class="form-control" readonly="readonly" style="border-radius: 3px">
                                </td>
                                <td>付款方式：</td>
                                <td width="120px">
                                    <input type="text" class="form-control" readonly="readonly" style="border-radius: 3px">
                                </td>
                            </tr>
                        </table>
                        <div style="margin-top: 20px;">
                            <table class="table table-hover text-center table-bordered">
                                <tr>
                                    <th>仓库名称</th>
                                    <th>品名(型号)</th>
                                    <th>库存</th>
                                    <th>单位</th>
                                    <th>数量</th>
                                    <th>单价</th>
                                    <th>金额</th>
                                    <th>备注</th>
                                </tr>
                                <tr>
                                    <td>数据</td>
                                    <td>数据</td>
                                    <td>数据</td>
                                    <td>数据</td>
                                    <td>数据</td>
                                    <td>数据</td>
                                    <td>数据</td>
                                    <td>数据</td>
                                </tr>
                            </table>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-danger col-md-12" data-dismiss="modal">取消</button>&nbsp;
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
	<#--删除数据模态框-->
    <div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-hidden="true" data-keyboard="true" data-backdrop="static">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <span class="modal-title">
                        <i class="fa fa-cog fa-spin fa-3x fa-fw" style="font-size: 23px;"></i>
                        删除提示
                    </span>
                </div>
                <div class="modal-body">
                    请确认是否删除该信息
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" onclick="deleteWare()">确认</button>
                    <button type="button" class="btn btn-danger" data-dismiss="modal">取消</button>
                </div>

            </div>
        </div>
    </div>
    
    			<!--模态框-->
          <div class="modal fade" id="insert" tabindex="-1" role="dialog" aria-hidden="false"aria-labelledby="mymodalriLabel" data-backdrop="static" data-keyboard="true">
							<div class="modal-dialog modal-lg">
								<div class="modal-content" style="width: 878px;">
									<div class="modal-header">
										<span class="modal-title" id="mymodalriLabel">
											<i class="fa fa-cog fa-spin fa-3x fa-fw" style="font-size: 23px;"></i>
											添加其他入库信息
										</span>
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true"><i class="fa fa-times" style="color: red;"></i>
										</button>
									</div>
									<div class="modal-body">
										<form class="form-horizontal" method="post">
											<table class="form-group">
												<tr>
													<td>供应商名称：</td>
													<td width="205px">
														<select class="form-control">
															<#list SuppList as supp>
                                                                <option id="supp" value="${supp.id}">${supp.supplier}</option>
															</#list>
														</select>
													</td>
													<td>单据日期：</td>
													<td width="205px"><input id="dateTime" type="date" class="form-control" pattern="yyyy-MM-dd HH:mm:ss" value=""></td>
													<td>单据编号：</td>
													<td width="205px">
														<input id="number" value="${code}" type="hidden">${code}
													</td>
												</tr>
											</table>
													<div style="display: flex;justify-content: space-between;">
														<a href="#">
															<button class="btn btn-success btn-sm" title="添加行">
                      					<i class="fa fa-plus-square"></i>
                      					添加
                      				</button>
                      			</a>
                      			<a href="#">
                      				<button class="btn btn-danger btn-sm" title="删除行">
                      					<i class="fa fa-trash-o"></i>
                      					删除
                      				</button>
                      			</a>
                      			<a href="#">
                      				<button class="btn btn-success btn-sm" title="新增仓库">
                      					<i class="fa fa-cart-arrow-down"></i>
                      					添加仓库
                      				</button>
                      			</a>
                      			<a href="#">
                      				<button class="btn btn-success btn-sm" title="新增商品">
                      					<i class="fa fa-cart-plus"></i>
                      					添加商品
                      				</button>
                      			</a>
                      			<a href="#">
                      				<button class="btn btn-warning btn-sm" title="撤销">
                      					<i class="fa fa-mail-reply"></i>
                      					撤销
                      				</button>
                      			</a>
                      				<button class="btn btn-success btn-sm" title="新增会员" data-toggle='modal' data-target="#rigerth" type="button">
                      					<i class="fa fa-shopping-cart"></i>
                      					添加供应商
                      				</button>
													</div>
										<div style="margin-top: 20px;">
                      	<table class="table table-hover text-center">
                      		<tr class="text-bold">
                      			<td><input type="checkbox" title="全选" id="thElt" onclick="checkOrCancelMo()"></td>
                      			<td>仓库名称</td>
                      			<td>品名(型号)</td>
                      			<td>金额</td>
                      		</tr>
                      		<tr>
                      			<td><input type="checkbox" name="tElt"></td>

                      			<td>
									<select>
									<#list DeptList as dept>
									<option id="dept" value="${dept.id}">${dept.name}</option>
									</#list>
									</select>
								</td>

                      			<td>
                                    <select>
									<#list mate as name>
                                        <option id="name" value="${name.id}">${name.mate}</option>
									</#list>
                                    </select>
								</td>
                      			<td><input type="text" id="price"></td>
                      		</tr>
                      	</table>
                      </div>
                      <div>
                      	<div style="margin-top: 10px;">
                      		<textarea class="form-control" rows="2" placeholder="备注信息"></textarea>
                      	</div>
                      </div>
                      <div class="modal-footer">
                      	<button class="btn btn-success col-md-12" type="button" onclick="addWare()">保存</button>&nbsp;
                      </div>
                  </form>
							</div>
						</div>
					</div>
			</div>
			
			
			<!--新增供应商模态框-->
			<div class="modal fade" role="dialog" tabindex="-1" aria-hidden="false" aria-labelledby="mymodalrigerth" data-backdrop="static" data-keyboard="true" id="rigerth">
			<div class="modal-dialog modal-lg">
				<div class="modal-content" style="width: 878px;">
					<div class="modal-header">
						<span class="modal-title" id="mymodalriLabel">
											<i class="fa fa-cog fa-spin fa-3x fa-fw" style="font-size: 23px;"></i>
											添加供应商
										</span>
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true"><i class="fa fa-times" style="color: red;"></i>
										</button>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" method="post">
							<table>
								<tr>
									<td style="width: 500px;">
										<input type="text" class="form-control" placeholder="用户名">
									</td>
									<td style="width: 500px;">
										<input type="text" class="form-control" placeholder="联系人">
									</td>
								</tr>
								<tr>
									<td style="width: 500px;">
										<input type="text" class="form-control" placeholder="手机号码">
									</td>
									<td style="width: 500px;">
										<input type="text" class="form-control" placeholder="邮箱">
									</td>
								</tr>
								<tr>
									<td style="width: 500px;">
										<input type="text" class="form-control" placeholder="联系电话">
									</td>
									<td style="width: 500px;">
										<input type="text" class="form-control" placeholder="传真">
									</td>
								</tr>
								<tr>
									<td style="width: 500px;">
										<input type="text" class="form-control" placeholder="期初应收">
									</td>
									<td style="width: 500px;">
										<input type="text" class="form-control" placeholder="期初应付">
									</td>
								</tr>
								<tr>
									<td style="width: 500px;">
										<input type="text" class="form-control" placeholder="累计应收" readonly="readonly">
									</td>
									<td style="width: 500px;">
										<input type="text" class="form-control" placeholder="累计应付" readonly="readonly">
									</td>
								</tr>
								<tr>
									<td style="width: 500px;">
										<input type="text" class="form-control" placeholder="纳税人识别号">
									</td>
									<td style="width: 500px;">
										<input type="text" class="form-control" placeholder="税率(%)">
									</td>
								</tr>
								<tr>
									<td style="width: 500px;">
										<input type="text" class="form-control" placeholder="开户行">
									</td>
									<td style="width: 500px;">
										<input type="text" class="form-control" placeholder="账号">
									</td>
								</tr>
								<tr>
									<td style="width: 1000px;" colspan="2">
										<input type="text" class="form-control" placeholder="地址">
									</td>
								</tr>
								<tr>
									<td style="width: 1000px;" colspan="2">
										<textarea class="form-control" rows="2" placeholder="备注"></textarea>
									</td> 
								</tr>
							</table>
							<div class="modal-footer">
									<button class="btn btn-success col-md-12" type="submit">保存</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	<#include "../footer/footerLink.html"/>
    <!--全选框-->
    <script type="text/javascript">
    	function checkOrCancelAll(){
				var chElt=document.getElementById("chElt");
				var checkedElt=chElt.checked;
				var allCheck=document.getElementsByName("cElt");
				if(checkedElt){
					for(var i=0;i<allCheck.length;i++){
					allCheck[i].checked=true;
					}
				}else{
					for(var i=0;i<allCheck.length;i++){
					allCheck[i].checked=false;
					}
				}
			}
        function deleteWare(){
            var id = document.getElementById("mytd").innerText;
            window.location.href="deleteWare?id="+id;
        }
        function addWare(){
            var number = $("#number").val();
            var supp = $("#supp").val();
            var dateTime = $("#dateTime").val();
            var price  = $("#price").val();
            var dept = document.getElementById("dept").value;
            var name = document.getElementById("name").value;
            window.location.href="addWare?number="number+"&name="+name+
					"&dept="+dept+"&price="+price+"&dateTime="+dateTime+"&supp="+supp;

        }
    	function checkOrCancelMo(){
				var chElt = document.getElementById("thElt");
				var checkedElt = chElt.checked;
				var allCheck = document.getElementsByName("tElt");
				if(checkedElt){
					for(var i=0;i<allCheck.length;i++){
					allCheck[i].checked=true;
					}
				}else{
					for(var i=0;i<allCheck.length;i++){
					allCheck[i].checked=false;
					}
				}
			}
        window.onload = function(){
    		document.getElementById("warehousemanagement").click();
    	}
    </script>
  </body>
</html>