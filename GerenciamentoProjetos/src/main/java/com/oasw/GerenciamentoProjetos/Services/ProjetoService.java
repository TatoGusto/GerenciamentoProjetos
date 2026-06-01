package com.oasw.GerenciamentoProjetos.Services;

import com.oasw.GerenciamentoProjetos.Models.ProjetoModel;
import com.oasw.GerenciamentoProjetos.Repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service /* Serve para identificar as regras operacionais, é um intermedio entre o controller e o repository
            Ex: a classe projetoService compoem os metodos de criação, edição, pesquisa e exclusão de projetos.*/
public class ProjetoService {

    @Autowired /* Serve para injeção de dependência automática, sem que precise instanciar uma classe de forma manual.
                  Ex: A classe ProjetoRepository já está sendo instaciada de forma automática.*/
    ProjetoRepository projetoRepository;

    public ProjetoModel createProjeto(ProjetoModel projetoModel){
        return projetoRepository.save(projetoModel);
    }

    public List<ProjetoModel> getAll(){
        return projetoRepository.findAll();
    }

    public ProjetoModel getById(Long id){
        return projetoRepository.getById(id);
    }

    public void deleteById(Long id){
        projetoRepository.deleteById(id);
    }
}
