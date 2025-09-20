<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Received Data</title>
</head>
<body>

    <h2>Form Data Submitted</h2>

    <p><strong>Full Name:</strong> ${param.fullName}</p>
    <p><strong>Password:</strong> ${param.password}</p>
    <p><strong>Age:</strong> ${param.age}</p>

    <p><strong>Address (Radio):</strong> ${param.address}</p>
    <p><strong>Address (Select):</strong> ${param.selectAddress}</p>

</body>
</html>