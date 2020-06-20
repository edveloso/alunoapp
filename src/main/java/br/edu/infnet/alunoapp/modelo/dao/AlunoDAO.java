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
		em.merge(aluno);
	}

	public EntityManager getEm() {
		return em;
	}
	
	public Aluno getAluno(Integer id) {
		return em.find(Aluno.class, id);
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public List<Aluno> listarTodos() {
		return em.createQuery("select a from Aluno a").getResultList();
	}
	
}
