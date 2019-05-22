package com.wellingtonthiago.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellingtonthiago.cursomc.domain.Pedido;
import com.wellingtonthiago.cursomc.repositories.PedidoRepository;
import com.wellingtonthiago.cursomc.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		
		if(obj ==  null)
			throw new ObjectNotFoundException("Objeto não encontrado! Id.: "+ id + ", Tipo: "+Pedido.class.getName());
		return obj;
	}
}