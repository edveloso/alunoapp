package br.edu.infnet.alunoapp.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.edu.infnet.alunoapp.modelo.Aluno;

@Repository
public class AlunoDao {

	
	@PersistenceContext(unitName = "mitjava")
	private EntityManager em;

	public void salvar(Aluno aluno) {
		em.persist(aluno);
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	
	
	
}
