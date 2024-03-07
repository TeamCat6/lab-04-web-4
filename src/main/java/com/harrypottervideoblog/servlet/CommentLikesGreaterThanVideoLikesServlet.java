package com.harrypottervideoblog.servlet;

import com.harrypottervideoblog.model.HarryPotterVideoBlog;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CommentLikesGreaterThanVideoLikesServlet", urlPatterns = {"/comment-likes-greater-than-video-likes-servlet"})
public class CommentLikesGreaterThanVideoLikesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        request.setAttribute("videoBlog", HarryPotterVideoBlog.VIDEO_BLOG);
        request.getRequestDispatcher("commentLikesGreaterThanVideoLikes.jsp").forward(request, response);
    }
}
