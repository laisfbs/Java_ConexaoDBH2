AS CAMADAS :


API - Unica exposta na web, aqui vc constroe seus endpoints REST que serao expostos na web e podem ser chamados pelo FrontEnd ou browser
SERVICE -  Camada onde vc vai colocar TODA a regra de negocio
REPOSITORY -  Camada que fara a comunicacao entre o banco de dados e aplicacao

A sequencia correta de nagevaçao entre pacotes:

 NA IDA

WEB---------------> API -> SERVICE -> Repository --- 


NA VOLTA
Repository -> SERVICE -> API ----------> WEB


jpa repository example baeldung