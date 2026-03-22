package com.oasw.GerenciamentoProjetos.Repositories;

import com.oasw.GerenciamentoProjetos.Models.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<ProjetoModel,Long> {
}
