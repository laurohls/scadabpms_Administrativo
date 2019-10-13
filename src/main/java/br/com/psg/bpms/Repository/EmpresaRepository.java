package br.com.psg.bpms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.psg.bpms.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {} 


