package com.oasw.GerenciamentoProjetos.Controllers;

import com.oasw.GerenciamentoProjetos.Models.ProjetoModel;
import com.oasw.GerenciamentoProjetos.Services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/projetos")
public class ProjetoController {

    @Autowired
    ProjetoService projetoService;

    @PostMapping
    public ResponseEntity<ProjetoModel> create(ProjetoModel projetoModel){
        ProjetoModel request = projetoService.create(projetoModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(projetoModel.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<ProjetoModel>> getAll(){
        List<ProjetoModel> request = projetoService.getAll();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjetoModel> getById(@PathVariable Long id){
        ProjetoModel request = projetoService.getById(id);
        return ResponseEntity.ok().body(request);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        projetoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
