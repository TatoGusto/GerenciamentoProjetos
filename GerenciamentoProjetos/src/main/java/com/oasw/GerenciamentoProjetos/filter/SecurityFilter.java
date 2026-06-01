package com.oasw.GerenciamentoProjetos.filter;


import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;

@Controller // Recebe as requisições HTTP, as direciona para o Service, e retorna a resposta em View
@EnableWebSecurity /* Habilita os recursos de segurança web do SpringSecurity */
public class SecurityFilter {

    @Bean // Registra um método como um componente gerenciado pelo container
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
        return http.csrf(csrf -> csrf.disable())
                .sessionManagement(session
                        -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(auth
                        -> auth.requestMatchers(HttpMethod.GET,"/projetos").permitAll())
                .authorizeHttpRequests(auth
                        -> auth.requestMatchers(HttpMethod.POST,"/projetos").permitAll())
                .build();
    }

}









