<html>
<head>
    <title>Posts</title>
</head>
<body>
<p>List of posts for user ${user}</p>
<#list posts as post>
    <li>${post.content} - ${post.user}</li>
</#list>

</html>