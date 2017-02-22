<html>
<head>
  <title>Posts</title>
</head>
<body>
  <form method="post" action="/posts/new">
    <input type="text" name="content"></input>
  </form>
  <ul>
  <#list posts as post>
    <li>${post}</li>
  </#list>
  </ul>
</body>
</html>