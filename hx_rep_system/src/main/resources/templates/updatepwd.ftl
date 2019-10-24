<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>修改密码</title>
    <#include "header/headerLink.html"/>
      </head>
  <body>
    <div class="page login-page">
      <div class="container d-flex align-items-center">
        <div class="form-holder has-shadow">
          <div class="row">
            <!-- Logo & Information Panel-->
            <div class="col-lg-3"></div>
            <!-- Form Panel    -->
            <div class="col-lg-6  bg-white">
              <div class="form d-flex align-items-center">
                <div class="content">
                  <form class="form-validate">
                      <div class="form-group">
                          <input id="register-password" type="password" name="registerEmail" class="input-material">
                          <label for="register-password" class="label-material">旧密码:</label>
                        </div>
                    <div class="form-group">
                      <input id="register-password" type="password" name="registerEmail" class="input-material">
                      <label for="register-password" class="label-material">新密码:</label>
                    </div>
                    <div class="form-group">
                      <button id="regidter" type="submit" class="btn btn-primary">保存</button>
                    </div>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="copyrights text-center">
        <p>Copyright &copy; 2019.Company name All rights reserved.More Templates 华夏ERP</p>
      </div>
    </div>
    <#include "footer/footerLink.html"/>
  </body>
</html>