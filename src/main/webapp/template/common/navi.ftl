<nav class="navbar navbar-default cusNavBar">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="/employee/">Manage Employees</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li <#if navi??><#if navi == "admin">class="active"</#if></#if>><a href="/employee/admin/">Admin</a></li>
        <li <#if navi??><#if navi == "user">class="active"</#if></#if>><a href="/employee/user/">Employee</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Help <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Admin</a></li>
            <li><a href="#">Employee</a></li>
            <li class="divider"></li>
            <li><a href="#">ETC</a></li>
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
<#if user??>
    <#include "naviLogout.ftl">
<#else>
    <#include "naviLogin.ftl">
</#if>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>