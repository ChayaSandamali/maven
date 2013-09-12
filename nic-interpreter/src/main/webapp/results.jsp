<%-- 
    Document   : result
    Created on : Sep 11, 2013, 10:30:08 PM
    Author     : Chaya Sandamali
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@page import="p_challenge.maven.example.NicInterpreter"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>My Page</title>
    </head>
    <body>
        <h1 align="center"><u>NIC Extracted Data</u></h1>
        
        <%  try{ 
             String number =  request.getParameter("nicNumber");
             NicInterpreter nic = new NicInterpreter(number);
        %>
        <br>
        <h3> Birthday </h3><br>
        <% out.println("Year of birth : "+nic.getYear()); %>
        <br>
        <% out.println("Month of birth : "+nic.getMonth()); %>
        <br>
        <% out.println("Date of birth : "+nic.getDate()); %>
        <br>
        <h2> Gender </h2>
        <% out.println(nic.getGender()); %>
        <br>
        <h2>Are you a voter?</h2>
        <% out.println("Is voter: "+nic.isVoter());
            }
             catch(Exception ex){
                    out.println("Enter a valid NIC number");
                }
        %>
           
            
    </body>
</html>
