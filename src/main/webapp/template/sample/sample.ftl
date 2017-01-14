<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="content-language" content="ja" />
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<title>employee</title>

</head>
<body>
<h1>employee</h1>
<br/>

<#if model.employee?has_content>
${model.employee.name?if_exists}
<#else>
 No data
</#if>

</body>
</html>