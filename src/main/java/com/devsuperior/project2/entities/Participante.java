package com.devsuperior.project2.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_participante")
public class Participante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	@Column(unique = true)
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "atividade_principal_id")
	private Atividade atividadePrincipal;

	
	@ManyToMany(mappedBy = "participantesExtras")
	private Set<Atividade> atividadesExtras = new HashSet<>();
	
	public Participante() {
	}

	public Participante(Long id, String nome, String email, Atividade atividadePrincipal, Atividade atividadesExtras) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Atividade getAtividadePrincipal() {
		return atividadePrincipal;
	}

	public void setAtividadePrincipal(Atividade atividadePrincipal) {
		this.atividadePrincipal = atividadePrincipal;
	}

	public Set<Atividade> getAtividadesExtras() {
		return atividadesExtras;
	}
	
	
	
	
	
	
	
	
}
