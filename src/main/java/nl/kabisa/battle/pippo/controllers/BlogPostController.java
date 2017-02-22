package nl.kabisa.battle.pippo.controllers;

import java.util.ArrayList;
import java.util.List;

import nl.kabisa.battle.pippo.models.BlogPost;
import ro.pippo.controller.*;
import ro.pippo.controller.extractor.Param;

@Path("/posts")
public class BlogPostController extends Controller {

    List<BlogPost> posts = new ArrayList<>();

    @GET("/index")
    public void posts() {
        getResponse().bind("posts", posts).render("index");
    }

    @POST("/new")
    public void newPost(@Param("content") String content, @Param("user") String user) {
        BlogPost blogPost = new BlogPost();
        blogPost.setContent(content);
        blogPost.setUser(user);
        posts.add(blogPost);
        getResponse().bind("posts", posts).render("index");
    }

    @GET("/search")
    public void searchForUser(@Param("user") String user) {
        List<BlogPost> blogPosts = new ArrayList<>();
        for(BlogPost post : posts) {
            if(post.getUser().equals(user)) {
                blogPosts.add(post);
            }
        }
        getResponse().bind("posts", blogPosts).bind("user", user).render("searchUser");
    }
}
