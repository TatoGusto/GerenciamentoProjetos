package com.oasw.GerenciamentoProjetos.Services;

import com.oasw.GerenciamentoProjetos.Models.ProjetoModel;
import com.oasw.GerenciamentoProjetos.Repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    ProjetoRepository projetoRepository;

    public ProjetoModel create(ProjetoModel projetoModel){
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
