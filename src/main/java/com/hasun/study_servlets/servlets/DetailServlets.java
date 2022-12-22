package com.hasun.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;

import com.hasun.study_servlets.dao.PollWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/polls/PollServlet")
public class DetailServlets extends HttpServlet {
    @Override
    // a 태그(details.html에서 a 태그 사용)는 post가 아니라 get 사용
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 클라이언트를 통해서 들어올때는 getParameter
        // input type
        String questions_uid = request.getParameter("QUESTIONS_UID");

        // biz with DB and Class
        PollWithDB pollWithDB = new PollWithDB();
        HashMap<String, Object> question = null;
        try {
            question = pollWithDB.getQuestion(questions_uid);
            System.out.println(question.get("QUESTIONS_UID"));
            System.out.println(question.get("QUESTIONS"));
            System.out.println(question.get("ORDERS"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // output with html
        request.setAttribute("question", question);
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/polls/details.jsp");
        requestDispatcher.forward(request, response);
    }
}
