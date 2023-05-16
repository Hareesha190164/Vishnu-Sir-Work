package com.hari.multiplehyperlinks;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ArithmaticServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw=resp.getWriter();

        String s1Val=req.getParameter("s1");
        float val1=0.0f,val2=0.0f;
        if(!s1Val.equalsIgnoreCase("link1") && !s1Val.equalsIgnoreCase("link2"))
        {
            val1=Float.parseFloat(req.getParameter("t1"));
            val2=Float.parseFloat(req.getParameter("t2"));
        }
        LocalDateTime ldt=LocalDateTime.now();
        if(s1Val.equalsIgnoreCase("add")){
            pw.println("<h1 style='color:red;text-align:center'>Addition::"+(val1+val2)+"</h1>");
        }
        else if(s1Val.equalsIgnoreCase("sub")){
            pw.println("<h1 style='color:red;text-align:center'>Substraction::"+(val1-val2)+"</h1>");
        }
        else if(s1Val.equalsIgnoreCase("mul")){
            pw.println("<h1 style='color:red;text-align:center'>Multiplication::"+(val1*val2)+"</h1>");
        }
        else if(s1Val.equalsIgnoreCase("div")){
            pw.println("<h1 style='color:red;text-align:center'>Division::"+(val1/val2)+"</h1>");
        }
        else if(s1Val.equalsIgnoreCase("link1")){
            int hour=ldt.getHour();
            if(hour<12){
                pw.println("<h1 style='color:red;text-align:center'>Good Morning</h1>");
            } else if (hour<16) {
                pw.println("<h1 style='color:red;text-align:center'>Good Afternoon</h1>");
            } else if (hour<20) {
                pw.println("<h1 style='color:red;text-align:center'>Good Evening</h1>");
            }
            else {
                pw.println("<h1 style='color:red;text-align:center'>Good Night</h1>");
            }
        }
        else {
            int month= ldt.getMonthValue();
            if(month>=3 && month<=6){
                pw.println("<h1 style='color:red;text-align:center'>Summer Seasion</h1>");
            }
            else if(month>=7 && month<=10){
                pw.println("<h1 style='color:red;text-align:center'>Rainy Seasion</h1>");
            }
            else{
                pw.println("<h1 style='color:red;text-align:center'>Winter Seasion</h1>");
            }
        }
        pw.println("<br><br><a href='input.html'>Home</a>");
        pw.close();

    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
