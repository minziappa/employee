<#import "../layout/defaultLayout.ftl" as layout>
<@layout.myLayout>

<div class="row bgIndex">

  <div class="col-xs-6">
	<form class="form-signin" role="form" action="/employee/login/sendEmail" method="POST">
	    <h3 class="form-signin-heading">Please sign up for employee</h3>
	    <input  type="text" name="userName" class="form-control" placeholder="User Name" required autofocus>
	    <input  type="text" name="userEmail" class="form-control" placeholder="Email address" required>
	    <input type="password" name="userPassword" class="form-control" placeholder="Password" required>
	    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign up for employee</button>
    </form>
  </div>
  <div class="col-xs-6">

  </div>
</div>

</@layout.myLayout>