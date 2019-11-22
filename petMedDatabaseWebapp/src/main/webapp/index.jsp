<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
</head>
<style type="text/css">
    div {
        width: 400px;
		margin-left: auto;
        margin-right: auto;
		
    }

    #borderimg {
        border: 10px solid transparent;
        padding: 15px;
        border-image: url(border.png) 30 stretch;
    }

    p {
        font-size: 14px;
        font-family: Verdana, Helvetica, sans-serif;
    }
	h1{
		font-size: 30px;
        font-family: Verdana, Helvetica, sans-serif;
	}

    img {
        display: block;
        margin-left: auto;
        margin-right: auto;
    }

	a:link, a:visited {
		font-family:Verdana, Helvetica, sans-serif;
		font-size:16px;
		background-color: white;
		color: black;
		border: 2px solid lightblue;
		border-radius: 5px;
		padding: 10px 100px;
		text-align: left;
		text-decoration: none;
		display: inline-block;
	
	}

	a:hover, a:active {
		font-family:Verdana, Helvetica, sans-serif;
		font-size:16px;
		background-color: lightblue;
		color: white;
	
		
	}
</style>

<body>

    <div>
        <h1>HOME PAGE</h1>
        <img class="center" src="http://clipart-library.com/images_k/dog-and-cat-transparent/dog-and-cat-transparent-11.png"
            alt="Pets" height="313" width="500">

    </div>

    <div>

        <a href="animal/list"> Animal List</a>
        <p>You can look at animal list </p>

        <br><br>

        <a href="boarding/list"> Boarding List</a>
        <p>You can look at boarding list </p>

        <br><br>

        <a href="vet/list"> Vet List</a>
        <p>You can look at vet list </p>
        <br><br>

        <a href="examination/list"> Examination List</a>
        <p>You can look at examination list </p>
        <br><br>

        <a href="examination/showArrangementForm"> Arrange an Examination</a>
        <p>You can arrange an Examination </p>
        <br><br>

        <a href="vaccine/list"> Vaccine List</a>
        <p>You can look at vaccine list </p>

    </div>

</body>

</html>