package br.com.senac.api.controllers;

import br.com.senac.api.controllers.dtos.ProdutoRequestDTO;
import br.com.senac.api.controllers.dtos.ProdutoRequestDTO;
import br.com.senac.api.entidades.Produto;
import br.com.senac.api.entidades.Produto;
import br.com.senac.api.services.ProdutoService;
import br.com.senac.api.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Produto>> listarTodos(){
        return ResponseEntity.ok(produtoService.listarTodos());

    }

    @PostMapping("/criar")
    public ResponseEntity<Produto > criar(@RequestBody ProdutoRequestDTO produto){
        try {
            return ResponseEntity.ok(produtoService.criar(produto));

        } catch (Exception e) {
            e.printStackTrace();
            return  ResponseEntity.badRequest().body(null);

        }
    }
    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Produto> atualizar (@PathVariable long id, @RequestBody ProdutoRequestDTO produto){
        try{
            return ResponseEntity.ok(produtoService.atualizar(id, produto));

        }catch (Exception e ){
            return ResponseEntity.badRequest().body(null);

        }



    }




}
