<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>测试</title>
</head>
<body>
    <h2>欢迎你:${msg}</h2>
    <table>
        <#list queryList as list>
        <tr>
            <td>${list.supplier}</td>
            <td>${list.number}</td>
            <td>${list.name}${list.model}</td>
            <td>${list.createTime}</td>
            <td>${list.operPersonName}</td>
            <td>${list.totalPrice}</td>
            <td>${list.allPrice}</td>
        </tr>
        </#list>
    </table>



</body>
</html>