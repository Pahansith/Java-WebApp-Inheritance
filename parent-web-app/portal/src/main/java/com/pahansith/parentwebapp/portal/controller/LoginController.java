package com.pahansith.parentwebapp.portal.controller;

import com.pahansith.parentwebapp.portal.utility.JspPathResolverUtility;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JspPathResolverUtility.setJspPathToContext(req,"header.jsp");
        resp.sendRedirect(req.getContextPath()+"/admin-home.jsp");
    }
}
