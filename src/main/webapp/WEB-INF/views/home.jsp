<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <h1>Veio do controller</h1>
   
   <h2> ${msg}  </h2>
   
   <h2> ${data}   </h2>
   
   
   <form action="salvar"  method="post" >
   
   	<p>
       <label>Nome</label>
       <input type="text" name="nome" >
    </p>
    
      
   	<p>
       <label>Email</label>
       <input type="text" name="email" >
    </p>   
    
    
    <input type="submit" value="Enviar">
          
   
   </form>
   

</body>
</html>










