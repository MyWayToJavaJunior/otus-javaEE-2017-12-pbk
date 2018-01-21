package org.examples.pbk.otus.hw2;

import org.examples.pbk.otus.dao.PreparedStatements;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/create_tables")
public class CreateTableServlet extends HttpServlet {

    @Inject
    PreparedStatements preparedStatements;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        preparedStatements.createTables();
        resp.sendRedirect(getServletContext().getContextPath());
    }
}
