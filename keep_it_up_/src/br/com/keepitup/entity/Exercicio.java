package br.com.keepitup.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Exercicio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome_exercicio;
	private String descricao;
	private String imagem;
	private Integer repeticoes;
	private Integer peso;
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome_exercicio() {
		return nome_exercicio;
	}
	public void setNome_exercicio(String nome_exercicio) {
		this.nome_exercicio = nome_exercicio;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public Integer getRepeticoes() {
		return repeticoes;
	}
	public void setRepeticoes(Integer repeticoes) {
		this.repeticoes = repeticoes;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public Exercicio() {
	
	}
	
	
	

}
