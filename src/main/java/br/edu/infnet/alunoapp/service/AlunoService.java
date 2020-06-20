package br.edu.infnet.alunoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.infnet.alunoapp.modelo.Aluno;
import br.edu.infnet.alunoapp.modelo.dao.AlunoDAO;

@Service
public class AlunoService {

	
	private AlunoDAO dao;
	
	@Autowired //injetando a depencia - no construtor
	public AlunoService(AlunoDAO dao) {
		this.dao = dao;
	}
	
	@Transactional
	public void salvar(Aluno aluno) {
		dao.salvar(aluno);
	}
	
}
