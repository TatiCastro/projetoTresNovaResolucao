# Pedra, Papel, Tesoura - Jogo em Java com Spring Boot e Thymeleaf

Este projeto é uma solução para o exercício proposto em aula de um jogo de Pedra, Papel, Tesoura. Foi desenvolvido utilizando Java, Spring Boot e Thymeleaf, e inclui algumas melhorias, como o contador de pontos e a opção de salvar e zerar o score.

## Descrição

A primeira resolução, "projetoTres", continha erros ao rodar a aplicação e foi aprimorada para incluir algumas funcionalidades propostas, como:

- Contador de pontos (score)
- Salvamento do score
- Opção para zerar o score

Na versão mais recente, o código foi refeito utilizando uma lógica diferente e também houve melhorias significativas na interface do usuário. Agora, a aplicação roda sem erros e oferece uma experiência mais fluida para os usuários.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto.
- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Thymeleaf**: Motor de templates para renderização de páginas HTML.

## Funcionalidades

- Jogo de Pedra, Papel e Tesoura entre o usuário e o computador.
- Exibição do resultado da partida (Vitória, Derrota ou Empate).
- Contador de pontos que acompanha o desempenho do jogador.
- Opções para salvar o score e zerá-lo.

## Como Executar o Projeto

1. Clone o repositório:
    ```bash
    git clone https://github.com/TatiCastro/projetoTresNovaResolucao.git
    ```

2. Navegue até o diretório do projeto:
    ```bash
    cd projetoTres
    ```

3. Compile e execute o projeto usando o Maven ou a IDE de sua preferência.

   Com o Maven, você pode executar o seguinte comando para rodar a aplicação:
    ```bash
    mvn spring-boot:run
    ```

4. A aplicação estará disponível em [http://localhost:8080](http://localhost:8080).

## Como Jogar

1. Escolha entre as opções **Pedra**, **Papel** ou **Tesoura**.
2. O computador também fará uma escolha aleatória.
3. O resultado será exibido na tela, junto com a pontuação acumulada.
4. Você pode zerar o score a qualquer momento ou salvar a pontuação atual.

## Melhorias Realizadas

- **Lógica refatorada**: A resolução foi reescrita utilizando uma abordagem mais eficiente e com menos erros.
- **Interface de usuário melhorada**: A experiência do usuário foi otimizada para uma navegação mais simples e intuitiva.
- **Score persistente**: Agora é possível salvar o score e zerá-lo quando desejar.

## Contribuindo

Sinta-se à vontade para fazer um fork deste repositório e enviar suas contribuições para melhorias ou novas funcionalidades. Caso queira contribuir, basta seguir os passos abaixo:

1. Faça um fork do repositório.
2. Crie uma nova branch para a sua funcionalidade:
    ```bash
    git checkout -b minha-nova-funcionalidade
    ```
3. Faça commit de suas alterações:
    ```bash
    git commit -am 'Adicionando nova funcionalidade'
    ```
4. Envie a branch para o repositório remoto:
    ```bash
    git push origin minha-nova-funcionalidade
    ```
5. Crie um Pull Request explicando as mudanças.

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Autores

- Tatiana de Castro Pimentel - [TatiCastro](https://github.com/TatiCastro)


