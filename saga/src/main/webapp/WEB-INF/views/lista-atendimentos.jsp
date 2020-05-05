<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html lang="pt-br" class="">

   <head>
      <meta charset="utf-8">
      <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
      <link rel="icon" type="image/png" href="assets/img/ufersa.png">
      <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
      <title>
         Atendimentos Registrados
      </title>
      <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no" name="viewport">
      <!--     Fonts and icons     -->
      <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet">
      <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
      <!-- CSS Files -->
      <link href="assets/css/bootstrap.min.css" rel="stylesheet">
      <link href="assets/css/outros.css" rel="stylesheet">
      <link href="assets/css/now-ui-dashboard.css?v=1.3.0" rel="stylesheet">
      <!-- CSS Just for demo purpose, don't include it in your project -->
      <link href="assets/demo/demo.css" rel="stylesheet">
      <style type="text/css">/* Chart.js */
         @-webkit-keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}@keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}.chartjs-render-monitor{-webkit-animation:chartjs-render-animation 0.001s;animation:chartjs-render-animation 0.001s;}
      </style>
      <script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/10/intl/pt_br/common.js"></script><script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/10/intl/pt_br/util.js"></script>
      <style type="text/css">/* Chart.js */
         @-webkit-keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}@keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}.chartjs-render-monitor{-webkit-animation:chartjs-render-animation 0.001s;animation:chartjs-render-animation 0.001s;}
      </style>
      <script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/10/intl/pt_br/common.js"></script><script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/10/intl/pt_br/util.js"></script>
      <style type="text/css">/* Chart.js */
         @-webkit-keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}@keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}.chartjs-render-monitor{-webkit-animation:chartjs-render-animation 0.001s;animation:chartjs-render-animation 0.001s;}
      </style>
      <script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/10/intl/pt_br/common.js"></script><script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/10/intl/pt_br/util.js"></script>
      <style type="text/css">/* Chart.js */
         @-webkit-keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}@keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}.chartjs-render-monitor{-webkit-animation:chartjs-render-animation 0.001s;animation:chartjs-render-animation 0.001s;}
      </style>
      <script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/10/intl/pt_br/common.js"></script><script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/10/intl/pt_br/util.js"></script>
      <style type="text/css">/* Chart.js */
         @-webkit-keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}@keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}.chartjs-render-monitor{-webkit-animation:chartjs-render-animation 0.001s;animation:chartjs-render-animation 0.001s;}
      </style>
      <script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/11/intl/pt_br/common.js"></script><script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/11/intl/pt_br/util.js"></script>
      <style type="text/css">/* Chart.js */
         @-webkit-keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}@keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}.chartjs-render-monitor{-webkit-animation:chartjs-render-animation 0.001s;animation:chartjs-render-animation 0.001s;}
      </style>
      <script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/11/intl/pt_br/common.js"></script><script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/11/intl/pt_br/util.js"></script>
      <style type="text/css">/* Chart.js */
         @-webkit-keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}@keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}.chartjs-render-monitor{-webkit-animation:chartjs-render-animation 0.001s;animation:chartjs-render-animation 0.001s;}
      </style>
      <script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/11/intl/pt_br/common.js"></script><script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/11/intl/pt_br/util.js"></script>
      <style type="text/css">/* Chart.js */
         @-webkit-keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}@keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}.chartjs-render-monitor{-webkit-animation:chartjs-render-animation 0.001s;animation:chartjs-render-animation 0.001s;}
      </style>
      <script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/11/intl/pt_br/common.js"></script><script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/11/intl/pt_br/util.js"></script>
      <style type="text/css">/* Chart.js */
         @-webkit-keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}@keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}.chartjs-render-monitor{-webkit-animation:chartjs-render-animation 0.001s;animation:chartjs-render-animation 0.001s;}
      </style>
      <script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/11/intl/pt_br/common.js"></script><script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/11/intl/pt_br/util.js"></script>
   </head>
   <body class="">
      <div class="wrapper ">
         <div class="sidebar" data-color="green">
            <!--
               Tip 1: You can change the color of the sidebar using: data-color="blue | green | orange | red | yellow"
               -->
            <div class="logo">
               <a href="#" class="simple-text logo-normal d-flex justify-content-center"><b>SAGA</b></a>
            </div>
            <c:import url="header.jsp"></c:import>
            </div>
         <div class="main-panel ps ps--active-y" id="main-panel">
            <!-- Navbar -->
            <nav class="navbar navbar-expand-lg navbar-transparent  bg-primary  navbar-absolute">
               <div class="container-fluid">
                  <div class="navbar-wrapper">         
                     <a class="navbar-brand" href="#">Registro de Atendimentos</a>
                  </div>
               </div>
            </nav>
            <!-- End Navbar -->
            <div class="panel-header panel-header-sm">
               <div class="chartjs-size-monitor" style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; pointer-events: none; visibility: hidden; z-index: -1;">
                  <div class="chartjs-size-monitor-expand" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;">
                     <div style="position:absolute;width:1000000px;height:1000000px;left:0;top:0"></div>
                  </div>
                  <div class="chartjs-size-monitor-shrink" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;">
                     <div style="position:absolute;width:200%;height:200%;left:0; top:0"></div>
                  </div>
               </div>
            </div>
            <div class="content">
        <div class="row">
          <div class="col-md-12">
          	<div class="card">
          		<div class="card-header">
                	<h4 class="card-title">Registrar Atendimento</h4>
             	</div>
             	<div class="card-body">
             		<div class="col-md-12">
             			<form action="registrar-atendimento" method="post">
             				<button title="Registrar Atendimento" type="submit" class="btn btn-info btn-block redondo">
             					Registrar Novo Atendimento &nbsp; <i class="now-ui-icons ui-1_simple-add"></i>
             				</button>
             			</form>	
             		</div>
             	</div>
             	
          	</div>
          	<div class="card">
	          	<div class="card-header">
	                <h4 class="card-title">Buscas</h4>
	             </div>
	             <div class="card-body">
	             	
	             	<div class="row">
	             		<div class="col-md-6">
	             		<form action="atendimentos-por-discente" method="post">
		             		<div class="input-group no-border">
	                			<input type="text" id="nomeDiscente" list="discentes" required="required" value="" class="form-control" name="matricula" placeholder="Buscar atendimento pelo discente">
	                			<datalist id="discentes">
                                 		<c:forEach var="d" items="${discentes}">
                                 			<option value="${d.matriculaDiscente}">${d.nomeDiscente}</option>
                                 		</c:forEach>
                                 </datalist>
	                			<div class="input-group-append">
	                  			<div class="input-group-text">
	                  			<button style="margin: -5px;font-size: 12px" class="redondo btn-info btn">Buscar &nbsp;<i class="now-ui-icons ui-1_zoom-bold"></i></button>
	                  			</div>
	                		</div>
	              			</div>
	              		</form>
              			</div>
              			<div class="col-md-6">
              			<form action="atendimentos-por-data" method="post">
		             		<div class="input-group no-border">
	                			<input type="date" title="Buscar atendimento pela data" id="nomeDiscente" list="discentes" required="required" value="" class="form-control" name="data">
	                			<input type="text" hidden="hidden" name="busca" value="1">
	                			<div class="input-group-append">
	                  			<div class="input-group-text">
	                  			<button style="margin: -5px;font-size: 12px" class="redondo btn-info btn">Buscar &nbsp;<i class="now-ui-icons ui-1_zoom-bold"></i></button>
	                  			</div>
	                		</div>
	              			</div>
	              		</form>
             		</div>	
	          		</div>
	          		
	          	</div>
          	</div>
            <div class="card">
              <div class="card-header">
                <h4 class="card-title"> Atendimentos Registrados</h4>
              </div>
              <div class="card-body">
                <div class="table table-hover table-responsive">
                  <table class="table fonte-reduzida">
                    <thead class="text-primary">
                      <tr>
                      <th>
                        <b>Data</b>
                      </th>
                      <th>
                        <b>Discente</b>
                      </th>
                      <th>
                      	<b>Curso</b>
                      </th>
                      <th>
                      	<b><span class="d-flex justify-content-center">Detalhes</span></b>
                      </th>
                      <th>
                      	<b><span class="d-flex justify-content-center">Excluir</span></b>
                      </th>
                    </tr></thead>
                    <tbody>
                      <c:forEach var="a" items="${atendimentos}">
                      		<tr>
                      			<td>
                      				<form action="atendimentos-por-data" method="post">
                      					<input type="text" name="data" hidden="true" value="<fmt:formatDate value='${a.dataAtendimento.time}' pattern='dd/MM/yyyy'/>">
	                      				<button type="submit" class="botao">
		                      				<span class="text-dark">
		                      					<fmt:formatDate value="${a.dataAtendimento.time}" pattern="dd/MM/yyyy"/>
		                      				</span>
                      					</button>
                      				</form>
                      			</td>
                      			<td>
                      				<form id="sub" action="atendimentos-por-discente" method="post">
                      					<input type="text" value="${a.discenteAtendimento.matriculaDiscente}" hidden="true" name="matricula">
                      					<button type="submit" class="botao"><span class="text-dark">${a.discenteAtendimento.nomeDiscente}</span></button>
                      				</form>
                      			</td>
                      			<td>
                      			<form action="atendimentos-por-curso" method="post">
                      				<input type="text" value="${a.discenteAtendimento.cursoDiscente.codigoCurso}" hidden="true" name="codigo">
                      				<button type="submit" class="botao"><span class="text-dark">${a.discenteAtendimento.cursoDiscente.nomeCurso}</span></button>
                      			</form>	
                      			</td>
                      			<td>
	                      			<form method="post" action="exibir-atendimento">
	                      				<input type="text" value="${a.codigoAtendimento}" hidden="true" name="id">
	                      				<button type="submit" class="btn btn-success form-control"><i class="now-ui-icons arrows-1_minimal-right"></i></button>
	                      			</form>
                      			</td>
                      			<td>
                      				<form method="post" action="excluir-atendimento">
	                      				<input type="text" value="${a.codigoAtendimento}" hidden="true" name="id">
	                      				<button type="submit" class="btn btn-danger form-control"><i class="now-ui-icons ui-1_simple-remove"></i></button>
	                      			</form>
                      			</td>
                      		</tr>
                      </c:forEach>
                    </tbody>
                  </table>
                </div>
              	<div class="col-md-12">
      				<form method="post" action="dashboard">
      					<button class="btn btn-primary btn-block redondo" type="submit"><i class="now-ui-icons arrows-1_minimal-left"></i> &nbsp; Voltar</button>
      				</form>
      			</div>
              </div>
            </div>
          </div>
          </div>
      </div>
            </div>
      </div>
      <footer class="footer">
        <div class="container-fluid">
          <nav>
            <ul>
              <li>
                <a href="https://www.creative-tim.com">
                  Creative Tim
                </a>
              </li>
              <li>
                <a href="http://presentation.creative-tim.com">
                  About Us
                </a>
              </li>
              <li>
                <a href="http://blog.creative-tim.com">
                  Blog
                </a>
              </li>
            </ul>
          </nav>
          <div class="copyright" id="copyright">
            ©
            <script>
              document.getElementById('copyright').appendChild(document.createTextNode(new Date().getFullYear()))
            </script> &nbsp; <a href="https://www.invisionapp.com" target="_blank">Invision</a>. Coded by
            <a href="https://www.creative-tim.com" target="_blank">Creative Tim</a>.
          </div>
        </div>
      </footer>
      <div class="ps__rail-x" style="left: 0px; bottom: 0px;">
         <div class="ps__thumb-x" tabindex="0" style="left: 0px; width: 0px;"></div>
      </div>
      <div class="ps__rail-y" style="top: 0px; right: 0px;">
         <div class="ps__thumb-y" tabindex="0" style="top: 0px; height: 0px;"></div>
      </div>
      <div class="ps__rail-x" style="left: 0px; bottom: -100px;">
         <div class="ps__thumb-x" tabindex="0" style="left: 0px; width: 0px;"></div>
      </div>
      <div class="ps__rail-y" style="top: 100px; height: 438px; right: 0px;">
         <div class="ps__thumb-y" tabindex="0" style="top: 39px; height: 173px;"></div>
      </div>
      <div class="ps__rail-x" style="left: 0px; bottom: 0px;">
         <div class="ps__thumb-x" tabindex="0" style="left: 0px; width: 0px;"></div>
      </div>
      <div class="ps__rail-y" style="top: 0px; height: 438px; right: 0px;">
         <div class="ps__thumb-y" tabindex="0" style="top: 0px; height: 172px;"></div>
      </div>
      <div class="ps__rail-x" style="left: 0px; bottom: -100px;">
         <div class="ps__thumb-x" tabindex="0" style="left: 0px; width: 0px;"></div>
      </div>
      <div class="ps__rail-y" style="top: 100px; height: 394px; right: 0px;">
         <div class="ps__thumb-y" tabindex="0" style="top: 35px; height: 139px;"></div>
      </div>
      <div class="ps__rail-x" style="left: 0px; bottom: 0px;">
         <div class="ps__thumb-x" tabindex="0" style="left: 0px; width: 0px;"></div>
      </div>
      <div class="ps__rail-y" style="top: 0px; height: 438px; right: 0px;">
         <div class="ps__thumb-y" tabindex="0" style="top: 0px; height: 178px;"></div>
      </div>
      <div class="ps__rail-x" style="left: 0px; bottom: -42px;">
         <div class="ps__thumb-x" tabindex="0" style="left: 0px; width: 0px;"></div>
      </div>
      <div class="ps__rail-y" style="top: 42px; height: 438px; right: 0px;">
         <div class="ps__thumb-y" tabindex="0" style="top: 31px; height: 330px;"></div>
      </div>
      <div class="ps__rail-x" style="left: 0px; bottom: -100px;">
         <div class="ps__thumb-x" tabindex="0" style="left: 0px; width: 0px;"></div>
      </div>
      <div class="ps__rail-y" style="top: 100px; height: 438px; right: 0px;">
         <div class="ps__thumb-y" tabindex="0" style="top: 76px; height: 330px;"></div>
      </div>
      <div class="ps__rail-x" style="left: 0px; bottom: 0px;">
         <div class="ps__thumb-x" tabindex="0" style="left: 0px; width: 0px;"></div>
      </div>
      <div class="ps__rail-y" style="top: 0px; height: 394px; right: 0px;">
         <div class="ps__thumb-y" tabindex="0" style="top: 0px; height: 288px;"></div>
      </div>
      <div class="ps__rail-x" style="left: 0px; bottom: 0px;">
         <div class="ps__thumb-x" tabindex="0" style="left: 0px; width: 0px;"></div>
      </div>
      <div class="ps__rail-y" style="top: 0px; height: 394px; right: 0px;">
         <div class="ps__thumb-y" tabindex="0" style="top: 0px; height: 288px;"></div>
      </div>
      <!--   Core JS Files   -->
      <script src="assets/js/core/jquery.min.js"></script>
      <script src="assets/js/core/popper.min.js"></script>
      <script src="assets/js/core/bootstrap.min.js"></script>
      <script src="assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
      <!--  Google Maps Plugin    -->
      <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
      <!-- Chart JS -->
      <script src="assets/js/plugins/chartjs.min.js"></script>
      <!--  Notifications Plugin    -->
      <script src="assets/js/plugins/bootstrap-notify.js"></script>
      <!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->
      <script src="assets/js/now-ui-dashboard.min.js?v=1.3.0" type="text/javascript"></script>
      <!-- Now Ui Dashboard DEMO methods, don't include it in your project! -->
      <script src="assets/demo/demo.js"></script>
      <script>
         $(document).ready(function() {
           // Javascript method's body can be found in assets/js/demos.js
           demo.initDashboardPageCharts();
         
         });
      </script>
   </body>
</html>   