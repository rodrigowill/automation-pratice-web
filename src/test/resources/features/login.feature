# language: pt

Funcionalidade: logar no ecommerce
	Como um usuario
	Eu quero efetuar um cadastro
	Para logar no ecommerce
	
Cenario: Login com sucesso
	Dado que estou cadastrado no ecommerce
	Quando tento logar no site com o usuario criado
	Entao o login eh realizado com sucesso
	
Cenario: Login invalido
	Dado que estou na tela de login
	Quando tento logar no site com um e-mail invalido
	Entao valido uma mensagem de e-mail invalido
	
Cenario: Login em branco
	Dado que estou na tela de login
	Quando tento logar sem preencher o e-mail
	Entao valido uma mensagem de e-mail obrigatorio
	
