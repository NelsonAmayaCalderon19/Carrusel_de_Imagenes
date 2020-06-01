<%-- 
    Document   : index
    Created on : 13/01/2020, 11:09:26 AM
    Author     : TURBO Core i3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carrusel</title>
        <link rel="stylesheet" href="estilos.css">
        <link rel="stylesheet" href="fonts.css">
    </head>
    <body>
        <div class="main">
            <div class="slides">
                <img src="img/1.jpg" width="100%" height="100%" alt="">
                <img src="img/2.jpg" width="100%" height="100%" alt="">
                <img src="img/3.jpg" width="100%" height="100%" alt="">
                <img src="img/4.jpg" width="100%" height="100%" alt="">
                <img src="img/5.jpg" width="100%" height="100%" alt="">
                <img src="img/6.jpg" width="100%" height="100%" alt="">
            </div>
        </div>
        <div class="contenedor">
            <p>Hola</p>
            <ul id="hola">
                <li>Mundo</li>
                <li>Usuario</li>
                <li>Nelson</li>
            </ul>
        </div>
        <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
        <script src="js/jquery.slides.js"></script>
        <script>
            /*$(function(){
                $(".slides").slidesjs({
                   
                });
                
            });*/
    $(function(){
    $(".slides").slidesjs({  
        play:{
            active: true,
            
            effect: "slide",
            
            interval: 3000,
            
            auto: true,
            
            swap: true,
            
            pauseOnHover: false,
            
            restarDelay: 2500
            
        }
    });
        });
            </script>
    </body>
</html>
