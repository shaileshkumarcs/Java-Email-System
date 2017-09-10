<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Java Email System With JSP Servlet</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="color:#673ab7;">
	<div class="container" style="padding-top:70px;">
		<div class="col-md-4">
		</div>
		<div class="col-md-4" style="background-color:#4CAF50;padding:20px;border-radius:5px;">
			<div class="text-center">
				<h1 style="color:#673ab7;">Java Mail System</h1>
			</div>
			<div class="text-center">
				
			</div>
			<form action="send" method="post"> 
			<div class="form-group">
				<label for="email">To Email:</label>
				<input type="email" class="form-control" id="email" required placeholder="Enter email" name="email">
			</div>
			<div class="form-group">
				<label for="subject">Subject:</label>
				<input type="text" class="form-control" id="subject" placeholder="Enter Subject" name="subject" required>
			</div>
			<div class="form-group">
				<label for="comment">Comment:</label>
				<textarea class="form-control" rows="5" id="comment" name="comments" required></textarea>
			</div>
			<div class="text-center">
				<input type="submit" value="SEND" class="btn btn-warning" >
			</div> 
			</form>
			<p style="font-size:8px; color:red;padding-top:20px;" class="pull-right">Designed & Developed By: SHAILESH</p>
		</div>
		<div class="col-md-4">
		</div>
	</div>
</body>
</html>