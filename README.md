## 基本描述

    这是一个华夏ERP系统

    所有的注意事项都在这个文档中

    此文档由小组所有成员共同维护


## 项目结构：
    com.t28.forest
        ->purchasing : 采购管理
        ->retail : 零售管理
        ->sales : 销售管理
        ->warehouse : 仓库管理
        MainApplication.java : 主程序运行类
    
    每个功能模块的单元测试类都在：test/java/com.t28.forest包下

## 日志文件配置
    在log4j.properties配置中更改完成后，
    阻止配置文件的上传：在.gitignore文件中的Your Configure
    配置*.properties,.gitignore
    
