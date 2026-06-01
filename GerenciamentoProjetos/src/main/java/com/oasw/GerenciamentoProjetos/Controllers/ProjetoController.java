package com.oasw.GerenciamentoProjetos.Controllers;

import com.oasw.GerenciamentoProjetos.Models.ProjetoModel;
import com.oasw.GerenciamentoProjetos.Services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController // Recebe as requisições HTTP, as direciona para o Service, e retorna a resposta em JSON
@RequestMapping(path = "/projetos") // Mapeia as rotas(URL)
public class ProjetoController {

    @Autowired
    ProjetoService projetoService;

    // @RequestBody : Indica que os dados enviados pela requisição HTTP devem ser lidos e convertidos para o objeto java especiicado no parâmetro.
    @PostMapping // Mapeia a requisição HTTP POST dentro do controller
    public ResponseEntity<ProjetoModel> createProjeto(@RequestBody ProjetoModel projetoModel){
        ProjetoModel request = projetoService.createProjeto(projetoModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(projetoModel.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping // Mapeia a requisição HTTP GET dentro do controller
    public ResponseEntity<List<ProjetoModel>> getAll(){
        List<ProjetoModel> request = projetoService.getAll();
        return ResponseEntity.ok().body(request);
    }

    // PathVariable : Extrai valores diretamente da própria URL e associa ao parâmetro
    @GetMapping("/{id}") // Mapeia a requisição HTTP GET dentro do controller
    public ResponseEntity<ProjetoModel> getById(@PathVariable Long id){
        ProjetoModel request = projetoService.getById(id);
        return ResponseEntity.ok().body(request);
    }


    @DeleteMapping("/{id}") // Mapeia a requisição HTTP DELETE dentro do controller
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        projetoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
