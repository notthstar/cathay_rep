<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>华夏ERP注册</title>
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
                  <p>请注册</p>
                </div>
              </div>
            </div>
            <!-- Form Panel    -->
            <div class="col-lg-6 bg-white">
              <div class="form d-flex align-items-center">
                <div class="content">
                  <form class="form-validate" action="/register">
                    <div class="form-group">
                      <input id="register-username" type="text" name="loginName" required data-msg="Please enter your username" class="input-material">
                      <label for="register-username" class="label-material">用户名</label>
                    </div>
                    <div class="form-group">
                      <input id="register-password" type="password" name="password" required data-msg="Please enter your password" class="input-material">
                      <label for="register-password" class="label-material">密码        </label>
                    </div>
                    <div class="form-group">
                      <button id="regidter" type="submit" name="registerSubmit" class="btn btn-primary">注册</button>
                    </div>
                  </form><small>已有账号？请</small><a href="/toPage?page=login" class="signup">登录</a>
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