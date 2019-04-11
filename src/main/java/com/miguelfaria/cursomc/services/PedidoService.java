package com.miguelfaria.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguelfaria.cursomc.domain.Pedido;
import com.miguelfaria.cursomc.repositories.PedidoRepository;
import com.miguelfaria.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado ! Id: " + id 
					+ ",Tipo:" + Pedido.class.getName());
		}
		return obj;
	}
}

	