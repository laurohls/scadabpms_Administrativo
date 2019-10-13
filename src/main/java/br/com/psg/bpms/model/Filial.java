package br.com.psg.bpms.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Filial {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;

	private String nomeFantasia;
    private String documento;
    private String responsavel;
    private String documentoResponsavel;
    
    @ManyToOne
    @JoinColumn(name="empresa_id")
    private Empresa empresa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getDocumentoResponsavel() {
		return documentoResponsavel;
	}

	public void setDocumentoResponsavel(String documentoResponsavel) {
		this.documentoResponsavel = documentoResponsavel;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Filial [id=" + id + ", nomeFantasia=" + nomeFantasia + ", documento=" + documento + ", responsavel="
				+ responsavel + ", documentoResponsavel=" + documentoResponsavel + ", empresa=" + empresa + "]";
	}
    
	
	
	
	
    
    
}
