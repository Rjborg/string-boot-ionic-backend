package com.ruibranco.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ruibranco.cursomc.domain.Categoria;
import com.ruibranco.cursomc.domain.Produto;
import com.ruibranco.cursomc.dto.CategoriaDto;
import com.ruibranco.cursomc.dto.ProdutoDto;
import com.ruibranco.cursomc.services.ProdutoService;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Produto> find(@PathVariable Integer id) {
		Produto obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Page<ProdutoDto>> findPage(
			@RequestParam(value="nome", defaultValue="") Integer nome,
			@RequestParam(value="categorias", defaultValue="") Integer categorias,
			@RequestParam(value="page", defaultValue="0") Integer page,
			@RequestParam(value="linesPerPage", defaultValue="24") Integer linesPerPage,
			@RequestParam(value="oderBy", defaultValue="nome") String orderBy,
			@RequestParam(value="direction", defaultValue="ASC") String direction) {
		Page<Categoria> list = service.search(nome, ids, page, linesPerPage, orderBy, direction)(page, linesPerPage, orderBy, direction);
		Page<CategoriaDto> listDto = list.map(obj -> new CategoriaDto(obj));
		return ResponseEntity.ok().body(listDto);
	}
	
}
