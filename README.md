Parte 1 - Conceitos
1. Explique com suas palavras o que é Spring Security.

   R: É uma dependência do springBoot com seu foco em segurança.
  
3. Para que serve o método csrf().disable()?

   R: ele desabilita a segurança nativa do Spring Security em uma aplicação API rest stateless.
   
5. Explique o que significa SessionCreationPolicy.STATELESS.

   R: É uma parte do código onde ele evita que copiem os dados do usuário.
   
7. Qual a função do permitAll()?

   R: Permitir que o usuário utilize as funções sem verificação de autenticação.
   
9. Explique o que faz o requestMatchers().

   R: Requisita a autorização para liberar os métodos.

11. Qual a função do anyRequest().authenticated()?

R: Verifica se o usuário está autenticado.
   
13. O que é uma API Stateless?
   R: Uma API que não salva os dados dos clientes.
     
14. Explique o que a lambda abaixo faz:
session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
   R: É uma forma de chamar um método para session.
