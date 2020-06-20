package br.edu.infnet.alunoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.infnet.alunoapp.modelo.Aluno;

@Service
public class AlunoService {

	private AlunoDao dao;
	
	@Autowired
	public AlunoService(AlunoDao dao) {
		this.dao = dao;
	}
	
	@Transactional
	public void salvar(Aluno aluno) {
		dao.salvar(aluno);
	}
	
	
}
