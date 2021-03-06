<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<#include "../common/head.ftl">
	<body>
<#include "../common/navi.ftl">

    <div class="container">
		<div class="jumbotron">
			<ul role="tablist" class="nav nav-tabs">
			<li><a href="/employee/">Welcome to employee Project</a></li>
			<li><a href="/employee/admin/admin.do">Admin Page</a></li>
			<li><a href="/employee/user/userList.do">User Page</a></li>
			<li><a href="/employee/file/uploadFiles.do">Upload files</a></li>
			<li class="active"><a href="/employee/file/downloadFiles.do">Download files</a></li>
			<li><a href="/employee/vali.do">Validate</a></li>
			<li><a href="/employee/layout.do">layout</a></li>
			</ul>

				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">CSV File</h3>
					</div>
					<div class="panel-body">
		      	<form action="/employee/file/downloadCsvFile.do" method="POST">

							<a href="${filePath?if_exists}">${filePath?if_exists}</a>

							<table style="border-collapse: collapse;">
								<tr>
									<td style="padding: 3px;">File Name</td>
									<td style="padding: 3px;"><input type="text" name="fileName" size="45"></td>
									<td style="padding: 3px;">Example) tomcluse</td>
								</tr>
								<tr>
									<td style="padding: 3px;">Option</td>
									<td style="padding: 3px;">
										<input type="radio" name="option" value="0" checked="checked"/>Download directly
										<input type="radio" name="option" value="1"/>Download from link
									</td>
									<td style="padding: 3px;"></td>
								</tr>
								<tr>
									<td style="padding: 3px;"><input class="btn btn-success" type="submit" value="DownLoad"/></td>
									<td style="padding: 3px;"></td>
									<td style="padding: 3px;"></td>
								</tr>
							</table>
						</form>
					</div>
				</div> <!-- /panel panel-primary -->

				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">PDF File</h3>
					</div>
					<div class="panel-body">
		      	<form action="/employee/file/downloadPdfFile.do" method="POST">

							<a href="${filePath?if_exists}">${filePath?if_exists}</a>

							<table style="border-collapse: collapse;">
								<tr>
									<td style="padding: 3px;">File Name</td>
									<td style="padding: 3px;"><input type="text" name="fileName" size="45"></td>
									<td style="padding: 3px;">Example) tomcluse</td>
								</tr>
								<tr>
									<td style="padding: 3px;">Option</td>
									<td style="padding: 3px;">
										<input type="radio" name="option" value="0" checked="checked"/>Download directly
										<input type="radio" name="option" value="1"/>Download from link
									</td>
									<td style="padding: 3px;"></td>
								</tr>
								<tr>
									<td style="padding: 3px;"><input class="btn btn-success" type="submit" value="DownLoad"/></td>
									<td style="padding: 3px;"></td>
									<td style="padding: 3px;"></td>
								</tr>
							</table>
						</form>
					</div>
				</div> <!-- /panel panel-primary -->
		</div> <!-- /jumbotron -->
<#include "../common/foot.ftl">
    </div> <!-- /container -->

	</body>

</html>
