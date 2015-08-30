<#import "../layout/defaultLayout.ftl" as layout>
<@layout.myLayout>

<div class="row row-offcanvas row-offcanvas-right">
    <#include "../common/sideMenuAdmin.ftl"/>
    <b style="color:red" >${errorMessage?if_exists}</b>

	<div class="post">
		<form action="/admin/admin/registerAdmin.sg" method="POST">
		<fieldset>
            <legend>Register Admin</legend>

			<table id="space">
				<tr>
					<td><label>Admin Id</label></td>
					<td><input type="text" name="adminId" class="form-control" size="45" placeholder="adminId"></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td><input type="text" name="adminPwd" class="form-control" size="45" placeholder="adminPwd"></td>
				</tr>
				<tr>
					<td><label>Service Id</label></td>
					<td>
						<select name="gameId" class="form-control" >
							<option value="test1">test1</option>
							<option value="test2">test2</option>
						</select>
					</td>
				</tr>
				<tr>
					<td><label>Admin Name</label></td>
					<td><input type="text" name="adminName" class="form-control" size="45" placeholder="Joon Kim"></td>
				</tr>
				<tr>
					<td><label>Admin Mail</label></td>
					<td><input type="text" name="adminMail" class="form-control" size="45" placeholder="notification@sample.io"></td>
				</tr>

				<tr>
					<td><label>Allow Permission</label></td>
					<td>
					<select name="adminStatusFlag" class="form-control">
						<option value="0">Semi Admin</option>
						<option value="1">Super Admin</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
				</tr>
				<tr>
					<td><input type="submit" class="btn btn-primary" value="Submit Button"></td>
					<td>&nbsp;</td>
				</tr>
			</table>
		</fieldset>
		</form>
	</div>

</div>
</@layout.myLayout>