package br.edu.infnet.alunoapp.modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.edu.infnet.alunoapp.modelo.Aluno;

@Repository
public class AlunoDAO {

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

	public List<Aluno> listarTodos() {
		return em.createQuery("select a from Aluno a").getResultList();
	}
	
}
