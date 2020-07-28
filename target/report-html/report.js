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
  "name": "",
  "description": "",
  "id": "logar-no-ecommerce;",
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
  "duration": 16512111700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.tentoLogarNoSiteComUsuarioInvalido()"
});
formatter.result({
  "duration": 29500,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});