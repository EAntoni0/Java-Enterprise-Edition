package com.erick.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hola-mundo")
public class HolaMundoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Establecer el tipo de contenido de la respuesta como HTML
        resp.setContentType("text/html");

        // Obtener el PrintWriter para escribir la respuesta
        PrintWriter out = resp.getWriter();

        String msg = "Hola jakarta ee";

        // Escribir el contenido HTML de la respuesta
        out.print("""
                <!DOCTYPE html>
                <html lang="es">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Java EE</title>
                </head>
                <body>
                    <h1>Mi primer servlet Java EE</h1>
                    <h2>Hola mundo</h2>
                    <h4>Hola mundo 2</h3>
                </body>
                </html>
                """);

        out.print("<h1>" + msg + "</h1");
    }
}