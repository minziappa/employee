<#import "../layout/defaultLayout.ftl" as layout>
<@layout.myLayout>

<br/><br/>
<form class="form-horizontal" role="form" action="/employee/login/registerPwd" method="POST">
	<div class="form-group">
		<label for="inputPassword1" class="col-sm-3 control-label">Password</label>
		<div class="col-sm-5">
	    <input type="password" class="form-control" id="inputPassword1" placeholder="Password">
	    </div>
	</div>
	<div class="form-group">
		<label for="inputPassword2" class="col-sm-3 control-label">Password for confirm</label>
		<div class="col-sm-5">
		<input type="password" class="form-control" id="inputPassword2" placeholder="Password again">
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
		<button type="submit" class="btn btn-default">Sign in</button>
		</div>
	</div>
</form>

</@layout.myLayout>