package br.edu.infnet.alunoapp.modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class JpaDao<T> implements IDAO<T> {

	private Class classe = null;
	
	@PersistenceContext(unitName = "mitjava")
	private EntityManager em;
	
	
	
	@Override
	public void salvar(T obj) {
		em.merge(obj);   
	}

	@Override
	public EntityManager getEm() {
		return em;
	}
	
	@Override
	public T findOne(Integer id) {
		return (T) em.find(classe, id);
	}

	@Override
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<T> listarTodos() {
		return em.createQuery("select a from Aluno a").getResultList();
	}

	@Override
	public void delete(T obj) {
		em.remove(obj);
	}

}
