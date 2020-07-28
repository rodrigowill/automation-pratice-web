$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "logar no ecommerce",
  "description": "Como um usuario\nEu quero efetuar um cadastro\nPara logar no ecommerce",
  "id": "logar-no-ecommerce",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Login com sucesso",
  "description": "",
  "id": "logar-no-ecommerce;login-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 9,
  "name": "que estou cadastrado no ecommerce",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "tento logar no site com o usuario criado",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "o login eh realizado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.queEstouCadastradoNoEcommerce()"
});
formatter.result({
  "duration": 21890749000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.tentoLogarNoSiteComUsuarioCriado()"
});
formatter.result({
  "duration": 2867461100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.oLoginEhRealizadoComSucesso()"
});
formatter.result({
  "duration": 755383500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login invalido",
  "description": "",
  "id": "logar-no-ecommerce;login-invalido",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 14,
  "name": "que estou na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 15,
  "name": "tento logar no site com um e-mail invalido",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "valido uma mensagem de e-mail invalido",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.queEstouNaTelaDeLogin()"
});
formatter.result({
  "duration": 11902214300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.tentoLogarNoSiteComUmEMailInvalido()"
});
formatter.result({
  "duration": 2051168900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.validoUmaMensagemDeEMailInvalido()"
});
formatter.result({
  "duration": 754251000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Login em branco",
  "description": "",
  "id": "logar-no-ecommerce;login-em-branco",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 19,
  "name": "que estou na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 20,
  "name": "tento logar sem preencher o e-mail",
  "keyword": "Quando "
});
formatter.step({
  "line": 21,
  "name": "valido uma mensagem de e-mail obrigatorio",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.queEstouNaTelaDeLogin()"
});
formatter.result({
  "duration": 12287572400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.tentoLogarSemPreencherOEMail()"
});
formatter.result({
  "duration": 1886935000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.validoUmaMensagemDeEMailObrigatorio()"
});
formatter.result({
  "duration": 761556800,
  "status": "passed"
});
});