package br.com.psg.bpms.model;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Empresa {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;

	private String nomeFantasia;
    private String documento;
    private String responsavel;
    private String documentoResponsavel;
    
    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<Filial> filiais;

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

	public List<Filial> getFiliais() {
		return filiais;
	}

	public void setFiliais(List<Filial> filiais) {
		this.filiais = filiais;
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nomeFantasia=" + nomeFantasia + ", documento=" + documento + ", responsavel="
				+ responsavel + ", documentoResponsavel=" + documentoResponsavel + ", filiais=" + filiais + "]";
	}

	
}
