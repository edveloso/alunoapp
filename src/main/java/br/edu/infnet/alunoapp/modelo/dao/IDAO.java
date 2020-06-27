package br.edu.infnet.alunoapp.modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;

public interface IDAO<T> {

	void salvar(T obj);

	EntityManager getEm();

	T findOne(Integer id);

	void setEm(EntityManager em);

	List<T> listarTodos();

	void delete(T obj);

}