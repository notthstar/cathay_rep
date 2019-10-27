<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>华夏ERP登录</title>
    <#include "header/headerLink.html"/>
  </head>
  <body>
    <div class="page login-page">
      <div class="container d-flex align-items-center">
        <div class="form-holder has-shadow">
          <div class="row">
            <!-- Logo & Information Panel-->
            <div class="col-lg-6">
              <div class="info d-flex align-items-center">
                <div class="content">
                  <div class="logo">
                    <h1>华夏ERP</h1>
                  </div>
                  <p>请登录</p>
                </div>
              </div>
            </div>
            <!-- Form Panel    -->
            <div class="col-lg-6 bg-white">
              <div class="form d-flex align-items-center">
                <div class="content">
                  <form method="post" class="form-validate" action="/login">
                    <#if msg??>
                      <p style="color: red;">${msg}</p>
                    </#if>
                    <div class="form-group">
                      <input id="login-username" type="text" name="loginName" value="<#if loginName??>${loginName}</#if>" required data-msg="Please enter your username" class="input-material">
                      <label for="login-username" class="label-material">用户名</label>
                    </div>
                    <div class="form-group">
                      <input id="login-password" type="password" name="password" required data-msg="Please enter your password" class="input-material">
                      <label for="login-password" class="label-material">密码</label>
                    </div><#--<a id="login" href="" class="btn btn-primary">登录</a>-->
                    <div class="form-group">
                      <button type="submit" class="btn btn-primary">登录</button>
                    </div>
                    <!-- This should be submit button but I replaced it with <a> for demo purposes-->
                  </form><small>还没有账号？</small><a href="/toPage?page=register" class="signup">注册</a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="copyrights text-center">
        <p>Copyright &copy; 2015-2020&nbsp;华夏ERP&nbsp;Dome - Powered By&nbsp;<a href="#" target="_blank">官方网站</a></p>
      </div>
    </div>
    <#include "footer/footerLink.html"/>
  </body>
</html>