package com.harrypottervideoblog.servlet;

import com.harrypottervideoblog.model.HarryPotterVideoBlog;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "VideoWithMostDislikesServlet", urlPatterns = {"/video-with-most-dislikes"})
public class VideoWithMostDislikesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        request.setAttribute("videoList", new ArrayList<>());
        request.setAttribute("maxDislikes", Integer.MIN_VALUE);
        request.setAttribute("videoBlog", HarryPotterVideoBlog.VIDEO_BLOG);
        request.getRequestDispatcher("videoWithMostDislikes.jsp").forward(request, response);
    }
}
