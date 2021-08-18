# mars-robots

## Requisitos do sistema
- Java JDK 11+
- Permissão de execução do utilitário `./mvnw`

## Testes
 - Em um terminal; execute o comando `./mvnw test` e aguarde. Na saída deverão ser apresentados os resultados dos casos de teste

## Execução da aplicação
 - Em um terminal, execute o comando `./mvnw spring-boot:run`
 - Caso tudo esteja correto, a aplicação levantará na porta 8080

## Comandos, saída e endpoints

 - A aplicação possui apenas o endpoint POST /rest/mars/{command}
 - O trecho do path _command_ deve ser uma string válida composta pela combinação dos seguintes argumentos: M (_move_), L (_left_) e R(_right_). Qualquer outro valor será retornada uma resposta de erro
 - Caso seja excedido o limite do terreno pré definido na aplicação (5x5) será retornada uma resposta de erro
 - Todas as respostas de erro virão com o status HTTP 400 e com a seguinte resposta no _body_: `400 Bad Request`
 - Requisições bem sucedidas, retornarão um status HTTP 200 juntamente com o posicionamento atual, seguindo o formato `(x, y, P)`, onde x é a posição no eixo x, y, a posição no eixo y e P, o posicionamento, podendo ser N, S, E ou W 

