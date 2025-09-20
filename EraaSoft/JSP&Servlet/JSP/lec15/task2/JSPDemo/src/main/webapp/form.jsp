<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form Input</title>
</head>
<body>

    <h2>Enter Your Details</h2>
    <form action="receiveData.jsp" method="POST">
        <!-- Full Name -->
        <label for="fullName">Full Name:</label>
        <input type="text" id="fullName" name="fullName" required/><br/><br/>

        <!-- Password -->
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required/><br/><br/>

        <!-- Age -->
        <label for="age">Age:</label>
        <input type="text" id="age" name="age" required/><br/><br/>

        <!-- Address (Radio Buttons) -->
        <label>Address (Choose One):</label><br/>
        <input type="radio" id="cairo" name="address" value="Cairo">
        <label for="cairo">Cairo</label><br/>
        <input type="radio" id="alex" name="address" value="Alex">
        <label for="alex">Alex</label><br/>
        <input type="radio" id="menofia" name="address" value="Menofia">
        <label for="menofia">Menofia</label><br/><br/>

        <!-- Address (Dropdown) -->
        <label for="selectAddress">Select Address:</label>
        <select id="selectAddress" name="selectAddress">
            <option value="Cairo">Cairo</option>
            <option value="Alex">Alex</option>
            <option value="Menofia">Menofia</option>
        </select><br/><br/>

        <input type="submit" value="Submit"/>
    </form>

</body>
</html>
