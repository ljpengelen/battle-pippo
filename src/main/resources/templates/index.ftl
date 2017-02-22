<html>
<head>
  <title>Posts</title>
</head>
<body>
  <p>Add post</p>
  <form method="post" action="/posts/new">
      <p>Content</p>
      <input type="text" name="content">
      <p>User</p>
      <input type="text" name="user">
      <input type="submit" name="Create">
  </form>
  <p>List of posts</p>
  <ul>
  <#list posts as post>
    <li>${post.content} - ${post.user}</li>
  </#list>
  </ul>
  <form method="get" action="/posts/search">
      <input type="text" name="user">
      <input type="submit" name="Search">
  </form>
</body>
</html>