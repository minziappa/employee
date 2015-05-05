<#import "../layout/defaultLayout.ftl" as layout>
<@layout.myLayout>

<div class="row row-offcanvas row-offcanvas-right">
    <#include "../common/sideMenu.ftl"/>
    <b style="color:red" >${errorMessage?if_exists}</b>
	<div class="post">
		<form action="/admin/admin/registerAdmin.sg" method="POST">
		<fieldset>
            <legend>管理者登録</legend>

			<table id="space">
				<tr>
					<td>Admin ＩＤ</td><td><input type="text" name="adminId" size="45" /></td><td>例)bt-admin</td>
				</tr>
				<tr>
					<td>Password</td><td><input type="password" name="adminPwd" size="45" /></td><td>例)xxxxxxxxx</td>
				</tr>
				<tr>
					<td>ゲームID</td>
					<td>
					<select name="gameId">
						<option value="test">test</option>
					</select>
					</td><td>例)bt</td>
				</tr>
				<tr>
					<td>管理者名</td><td><input type="text" name="adminName" size="45" /></td><td>例)名前　名前</td>
				</tr>
				<tr>
					<td>管理者メールアドレス</td><td><input type="text" name="adminMail" size="45" /></td><td>notification@sample.io</td>
				</tr>
				<tr>
					<td>管理者権限</td>
					<td>
					<select name="adminStatusFlag">
						<option value="0">Semi管理者</option>
						<option value="1">Super管理者</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
				</tr>
				<tr>
					<td><input type="submit" value="管理者登録" style="width:60pt;height:20pt;background-color:#566D7E;color:white;" /></td><td>&nbsp;</td><td>&nbsp;</td>
				</tr>
			</table>
		</fieldset>
		</form>
	</div>

</div>
</@layout.myLayout>