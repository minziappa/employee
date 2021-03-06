<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
		<meta http-equiv="content-language" content="ja" />
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		<title>index</title>
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
		<!-- Optional theme -->
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
	</head>

	<body>
		<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div class="navbar-collapse collapse">
          <form class="navbar-form navbar-right" role="form">
            <div class="form-group">
              <input type="text" placeholder="Email" class="form-control">
            </div>
            <div class="form-group">
              <input type="password" placeholder="Password" class="form-control">
            </div>
            <button type="submit" class="btn btn-success">Sign in</button>
          </form>
        </div><!--/.navbar-collapse -->
        
      </div>
    </div><!--/navigation -->

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
				<div>
<table>
		<tr>
			<td><h2><a href="/employee/index/">Welcome to Spring Security Test</a></h2></td>
			<td></td>
		</tr>
		<tr>
			<td><a href="/employee/admin/admin.do">Admin Page</a></td>
			<td><a href="/employee/user/user.do">User Page</a></td>
		</tr>
		<tr>
			<td><a href="/employee/auth/logout">logout</a></td>
			<td></td>
		</tr>
	</table>

					<form action="/employee/employee/service/selectUser.do" method="POST">
	            <fieldset>
	                <legend>Select Data</legend>
	                <b style="color:red" >${errorMessage?if_exists}</b>
									<table>
										<tr>
											<td>User Name</td><td><input type="text" name="userName" size="45"></td><td>例)tomcluse</td>
										</tr>
										<tr>
											<td><input type="submit" value="Search" style="width:60pt;height:20pt;background-color:#566D7E;color:white;" /></td><td></td><td></td>
										</tr>
									</table>
	            </fieldset>
					</form>
				</div>
        <h1>
<#if model??>
	<#if model.employee?has_content>
		${model.employee.userModel.userId?if_exists} |
		${model.employee.userModel.userName?if_exists} |
		${model.employee.userModel.userAge?if_exists} |
		<img alt="user image" src="${model.employee.userImage}" />
	<#else>
	 No data
	</#if>
<#else>
 This is index page
</#if>
				</h1>
				<hr/>
				<div>
					<form action="/employee/employee/service/insertUser.do" enctype="multipart/form-data" method="POST">
		            <fieldset>
	                <legend>Insert Data</legend>
	                <b style="color:red" >${errorMessage?if_exists}</b>
									<table>
										<tr>
											<td>User Name</td><td><input type="text" name="userName" size="45"></td><td>例)tomcluse</td>
										</tr>
										<tr>
											<td>User Age</td><td><input type="text" name="userAge" size="45"></td><td>例)20</td>
										</tr>
										<tr>
											<td>Image File</td><td><input type="file" name="userImg"></td><td>例)image.png</td>
										</tr>
										<tr>
											<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
										</tr>
										<tr>
											<td><input type="submit" value="Register" style="width:60pt;height:20pt;background-color:#566D7E;color:white;" /></td><td></td><td></td>
										</tr>
									</table>
	            </fieldset>
					</form>
				</div>

      </div>
    </div>

	</body>

</html>
