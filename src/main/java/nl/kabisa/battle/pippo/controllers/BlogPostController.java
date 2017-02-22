package nl.kabisa.battle.pippo.controllers;

import java.util.ArrayList;
import java.util.List;

import ro.pippo.controller.*;
import ro.pippo.controller.extractor.Param;

@Path("/posts")
public class BlogPostController extends Controller {

    List<String> posts = new ArrayList<>();

    @GET("/index")
    public void posts() {
        getResponse().bind("posts", posts).render("index");
    }

    @POST("/new")
    public void newPost(@Param("content") String content) {
        posts.add(content);
        getResponse().bind("posts", posts).render("index");
    }
}
