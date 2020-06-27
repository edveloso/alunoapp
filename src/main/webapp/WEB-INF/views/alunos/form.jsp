<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>


	<div class="container">
	
		<div class="jumbotron">
		   <h1> <i class="fa fa-tachometer" aria-hidden="true"></i> Aplicacao com springmvc</h1>
		   <h3>Com configuracao manual</h3>
		</div>

		<h1>${tipoForm} alunos</h1>
		
		
		<form action='<c:url value="/salvar" />'  method="post">
		
		   <input  type="hidden" name="codigo" value="${aluno.codigo}">
		
		   <div class="form-group" >
		   	   <label for="nome">Nome</label>
		   	   <input
		   	      type="text"
		   	      class="form-control"
		   	      name="nome"
		   	      id="nome"
		   	      value="${aluno.nome}"
		   	   >		   
		   </div>
		   
		   <div class="form-group" >
		   	   <label  for="email">Email</label>
		   	   <input
		   	      type="text"
		   	      class="form-control"
		   	      name="email"
		   	      id="email"
		   	      value="${aluno.email}"
		   	   >		   
		   </div>
		   
		   <input type="submit"  class="btn btn-primary" value="Salvar" >  
		  
		    <a class="btn btn-secondary" href='<c:url value="/" />' ><i class="fa fa-chevron-circle-left" aria-hidden="true"></i> Voltar a listagem </a>
		
		
		</form>
		
		
		

	</div>





	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
		integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
		crossorigin="anonymous"></script>

</body>
</html>