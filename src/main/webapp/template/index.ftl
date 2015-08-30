<#import "layout/defaultLayout.ftl" as layout>
<@layout.myLayout>

<div class="row bgIndex">

  <div class="col-xs-8">
  	</br>
  	</br>
	<form class="form-signin" role="form" action="/employee/login/sendEmail" method="POST">
	    <h3 class="form-signin-heading">Please sign up for employee</h3>
	    <input  type="text" name="userEmail" class="form-control" placeholder="Email address" required>
	    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign up for employee</button>
    </form>
    </br>
    </br>
    </br>
    </br>
    </br>
    </br>
  </div>

  <div class="col-xs-4">
  </div>

</div>

</@layout.myLayout>