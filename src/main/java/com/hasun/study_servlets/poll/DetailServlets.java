package com.hasun.study_servlets.poll;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/poll/PollServlet")
public class DetailServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PollDatasInfor pollDatasInfor = new PollDatasInfor();
        HashMap<String, Object> orders = pollDatasInfor.getOrders();
        ArrayList<String> questions = pollDatasInfor.getQuestions();
        ArrayList<String> examples = pollDatasInfor.getExamples();

        request.setAttribute("orders", orders);
        request.setAttribute("questions", questions);
        request.setAttribute("examples", examples);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/details.jsp");
        requestDispatcher.forward(request, response);
    }
}
