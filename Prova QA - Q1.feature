#language: pt

Contexto:
	Dado que eu entro no Whatsapp
	Seleciono o Contato/Grupo

Cenario: Enviar localização atual
	
	Quando toco em Anexar
	E acesso a Localização
	E toco em uma das localizações atuais
	Então a localização atual é enviada

Cenario: Compartilhar localização atual

	Quando toco em Anexar
	E acesso a Localização
	E toco em Compartilhar localização atual
	E selecione o tempo de duração
	E clico em Enviar
	Então a localização atual e compartilhada pelo tempo de duração selecionado

Cenario: Encerrar compartilhamento de localização atual

	Quanto o compartilhamento de localização atual está ativo
	E toco em Encenrrar
	E confirmo o cancelamento
	O compartilhamento de localização atual é encerrado
	