package br.com.psg.bpms.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.psg.bpms.Repository.EmpresaRepository;
import br.com.psg.bpms.model.Empresa;

@RestController
@RequestMapping({"/empresas"})
public class EmpresaController {
	
	private EmpresaRepository repository;
	
	EmpresaController(EmpresaRepository empresaRepository) {
       this.repository = empresaRepository;
   }
	
	@GetMapping
	public List findAll(){
	   return repository.findAll();
	}
	
	@GetMapping(path = {"/{id}"})
	public ResponseEntity findById(@PathVariable long id){
	   return repository.findById(id)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public Empresa create(@RequestBody Empresa entity){
	   return repository.save(entity);
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity update(@PathVariable("id") long id,
	                                      @RequestBody Empresa entity) {
	   return repository.findById(id)
	           .map(record -> {
	               record.setNomeFantasia(entity.getNomeFantasia());
	               record.setDocumento(entity.getDocumento());
	               record.setResponsavel(entity.getResponsavel());
	               record.setDocumentoResponsavel(entity.getDocumentoResponsavel());
	               Empresa updated = repository.save(record);
	               return ResponseEntity.ok().body(updated);
	           }).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping(path ={"/{id}"})
	public ResponseEntity<?> delete(@PathVariable long id) {
	   return repository.findById(id)
	           .map(record -> {
	               repository.deleteById(id);
	               return ResponseEntity.ok().build();
	           }).orElse(ResponseEntity.notFound().build());
	}
	
}
