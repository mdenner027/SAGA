<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="pt-br" class="">
   <head>
      <meta charset="utf-8">
      <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
      <link rel="icon" type="image/png" href="assets/img/ufersa.png">
      <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
      <title>
         Registrar Discente
      </title>
      <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no" name="viewport">
      <!--     Fonts and icons     -->
      <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet">
      <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
      <!-- CSS Files -->
      <link href="assets/css/bootstrap.min.css" rel="stylesheet">
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
      <script type="text/javascript" charset="UTF-8" src="assets/libs/js/funcoes-gerais.js"></script>
      <script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/11/intl/pt_br/common.js"></script><script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/38/11/intl/pt_br/util.js"></script>
   		<script>
			function teste() {
				document.getElementById("nome").readOnly = true;
			}
   		</script>
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
            <c:import url="header.jsp"/>
            <script>
				ativaMenu("discentes");
			</script>
           </div>
         <div class="main-panel ps ps--active-y" id="main-panel">
            <!-- Navbar -->
            <nav class="navbar navbar-expand-lg navbar-transparent  bg-primary  navbar-absolute">
               <div class="container-fluid">
                  <div class="navbar-wrapper">         
                     <a class="navbar-brand" href="#">Registro de Discentes</a>
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
               <div class="card">
                  <div class="card-header">
                     <h5 class="title">Registrar Discente</h5>
                  </div>
                  <div class="card-body">
                     <form id="formulario" method="post" action="adiciona-discente">
                        <fieldset>
                           <legend>Informa��es do Discente</legend>
                           <div class="row">
                              <div class="col-md-6 pr-1">
                                 <div class="form-group">
                                    <label onclick="teste()" for="nome">Nome do Discente</label>
                                    <input type="text"  id="nome" name="nomeDiscente" list="nomes" class="form-control" placeholder="Ex.: Jo�o Costa Figuereido">
                                    <datalist id="nomes">
                                    	<c:forEach items="${discentes}" var="discente">
                                    		<option value="${discente.nomeDiscente}">${discente.nomeDiscente}</option>
                                    	</c:forEach>
                                    </datalist>
                                 </div>
                              </div>
                              <div class="col-md-2 pl-1 pr-1">
                                 <div class="form-group">
                                    <label for="matricula">Matr�cula</label>
                                    <input type="text" id="matricula" list="matriculas" name="matriculaDiscente" class="form-control" maxlength="10" placeholder="Ex.: 2016010800">
                                 	<datalist id="matriculas">
                                 		<c:forEach var="discente" items="${discentes}">
                                 			<option value="${discente.matriculaDiscente}">${discente.nomeDiscente}</option>
                                 		</c:forEach>
                                 	</datalist>
                                 </div>
                              </div>
                              <div class="col-md-4 pl-1">
                                 <div class="form-group">
                                    <label for="curso">Curso</label>
                                    <select name="cursoDiscente.codigoCurso" id="curso" class="form-control">
                                       <c:forEach var="curso" items="${cursos}">
                                       		<option value="${curso.codigoCurso}">${curso.nomeCurso}</option>
                                       </c:forEach>
                                    </select>
                                 </div>
                              </div>
                           </div>
                           <div class="row">
                              <div class="col-md-3 pr-1">
                                 <div class="form-group">
                                    <label for="rua">Rua</label>
                                    <input type="text" id="rua" name="ruaDiscente" class="form-control" placeholder="Ex.: Jo�o Barbosa Figuereido">
                                 </div>
                              </div>
                              <div class="col-md-3 pl-1 pr-1">
                                 <div class="form-group">
                                    <label for="bairro">Bairro</label>
                                    <input id="bairro" type="text" class="form-control" name="bairroDiscente" placeholder="Ex.: Centro">
                                 </div>
                              </div>
                              <div class="col-2 pl-1 pr-1">
                                 <div class="form-group">
                                    <label for="numero">N�mero</label>
                                    <input id="numero" type="text" name="numeroResidenciaDiscente" class="form-control" placeholder="Ex.: 22A">
                                 </div>
                              </div>
                              <div class="col-4 pl-1">
                                 <div class="form-group">
                                    <label for="cidade">Cidade</label>
                                    <input id="cidade" type="text" name="cidadeDiscente" class="form-control" placeholder="Ex.: Angicos">
                                 </div>
                              </div>
                           </div>
                           <div class="row">
                              <div class="col-3 pr-1">
                                 <div class="form-group">
                                    <label for="contato">Contato</label>
                                    <input id="contato" maxlength="15" type="text" name="telefoneDiscente" class="form-control" placeholder="Ex.: 9962744110">
                                 </div>
                              </div>
                           </div>
                        </fieldset>
                        <div class="row">
                           <div class="col-md-12"><br></div>
                        </div>
                        <div class="row">
                           <div class="col-md-6">
                              <div class="form-group">
                                 <a href="discentes-registrados"><button type="button" class="btn btn-primary form-control"><i class="now-ui-icons arrows-1_minimal-left"></i>&nbsp; Voltar
                                 </button></a>
                              </div>
                           </div>
                           <div class="col-md-6">
                              <div class="form-group">
                                 <button type="submit" class="form-control btn btn-success">Registrar Discente&nbsp;<i class="now-ui-icons ui-1_check"></i></button>
                              </div>
                           </div>
                        </div>
                     </form>
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
            �
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
      </div>
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