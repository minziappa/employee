<#macro myLayout title="FreeMarker example">
<html class="full">
<#include "../common/header.ftl"/>
	<body style="width:100%;height:100%">
		<#include "../common/navi.ftl"/>

	    <#nested/>

		<#include "../common/footer.ftl"/>
	</body>
</html>
</#macro>