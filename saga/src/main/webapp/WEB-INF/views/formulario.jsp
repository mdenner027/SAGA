<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form id="formulario" method="post" action="adiciona-atendimento">
                     <input type="text" name="mvc" value="AdicionaAtendimentoLogica" hidden="true">
                        <fieldset>
                           <legend>Informações do Discente</legend>
                           <div class="row">
                              <div class="col-md-6 pr-1">
                                 <div class="form-group">
                                    <label onclick="teste()" for="nome">Nome do Discente</label>
                                    <input type="text"  id="nome" name="nomeDiscente" list="nomes" class="form-control" placeholder="Ex.: João Costa Figuereido">
                                    <datalist id="nomes">
                                    	<c:forEach items="${discentes}" var="discente">
                                    		<option value="${discente.nomeDiscente}">${discente.nomeDiscente}</option>
                                    	</c:forEach>
                                    </datalist>
                                 </div>
                              </div>
                              <div class="col-md-2 pl-1 pr-1">
                                 <div class="form-group">
                                    <label for="matricula">Matrícula</label>
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
                                    <select name="codigoCurso" id="curso" class="form-control">
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
                                    <input type="text" id="rua" name="ruaDiscente" class="form-control" placeholder="Ex.: João Barbosa Figuereido">
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
                                    <label for="numero">Número</label>
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
                                    <input id="contato" type="text" name="contatoDiscente" class="form-control" placeholder="Ex.: 9962744110">
                                 </div>
                              </div>
                           </div>
                        </fieldset>
                        <fieldset>
                           <legend>Dados do Atendimento</legend>
                           <div class="row">
                           		<div class="col-md-4 pr-1">
                                 <div class="form-group">
                                    <label for="coletivo">Coletivo?</label>
                                    <select id="coletivo" onchange="controle(this.value)" name="coletivo" class="form-control">
                                     <option selected="selected"></option>
                                       <option value="0" id="coletivo">Sim</option>
                                       <option value="1" id="individual">Não</option>
                                    </select>
                                 </div>
                              </div>
                           </div>
                           <div class="row">
                              <div class="col-md-4 pr-1">
                                 <div class="form-group">
                                    <label for="tipo">Tipo do Atendimento</label>
                                    <select id="tipo" name="codigoTipoAtendimento" class="form-control">
                                       <c:forEach var="tipo" items="${tipos}">
                                       		<option value="${tipo.codigoTipoAtendimento}">${tipo.nomeTipoAtendimento}</option>
                                       </c:forEach>
                                    </select>
                                 </div>
                              </div>
                              <div class="col-md-4 pl-1 pr-1">
                                 <div class="form-group">
                                    <label for="demanda">Demanda</label>
                                    <select id="demanda" class="form-control" name="codigoDemandaAtendimento">
                                       <c:forEach var="demanda"  items="${demandas}">
                                       		<option value="${demanda.codigoDemandaAtendimento}">${demanda.nomeDemandaAtendimento}</option>
                                       </c:forEach>
                                    </select>
                                 </div>
                              </div>
                              <div class="col-md-4 pl-1">
                                 <div class="form-group">
                                    <label for="encaminhamento">Encaminhamento</label>
                                    <input type="text" id="encaminhamento" class="form-control" name="encaminhamentoAtendimento">
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
                                 <a href="javascript:{}" onclick="document.getElementById('voltar').submit();"><button type="button" class="btn btn-primary form-control"><i class="now-ui-icons arrows-1_minimal-left"></i>&nbsp; Voltar
                                 </button></a>
                              </div>
                           </div>
                           <div class="col-md-6">
                              <div class="form-group">
                                 <button type="submit" class="form-control btn btn-success">Registrar &nbsp;<i class="now-ui-icons ui-1_check"></i></button>
                              </div>
                           </div>
                        </div>
                     </form>
                     <form method="post" action="controller" id="voltar">
                     	<input type="text" value="ListaAtendimentosLogica" name="mvc" hidden="true"/>
                     </form>
</body>
</html>