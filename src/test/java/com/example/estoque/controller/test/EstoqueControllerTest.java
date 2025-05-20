package com.example.estoque.controller.test;

import com.example.estoque.controller.EstoqueController;
import com.example.estoque.domain.ItemPedido;
import com.example.estoque.domain.Produto;
import com.example.estoque.service.ProdutoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class EstoqueControllerTest {

    @Mock
    private ProdutoService service;

    @InjectMocks
    private EstoqueController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCadastrarProduto() {
        Produto produto = new Produto("Arroz", 10);

        ResponseEntity<String> response = controller.cadastraProduto( produto );

        verify(service, times(1)).cadastrarProduto(produto);
        assertEquals("Cadastrado com Sucesso", response.getBody());
        assertEquals(200, response.getStatusCode().value());
    }

    @Test
    void testAtualizarEstoque() {

        ItemPedido item = new ItemPedido();
        item.setId( 1L );
        item.setQtd( 5 );
        List<ItemPedido> itens = List.of(item);

        ResponseEntity<String> response = controller.atualizarEstoque(itens);

        verify( service, times(1) ).atualizarEstoque(itens);
        assertEquals("Atualizado com Sucesso", response.getBody());
        assertEquals(200, response.getStatusCode().value());

    }

    @Test
    void testListarProdutos() {
        Produto produto1 = new Produto("Arroz", 10);
        Produto produto2 = new Produto("Feijão", 20);
        List<Produto> produtos = List.of(produto1, produto2);

        OngoingStubbing<T> tOngoingStubbing = when( service.listarProdutos() ).thenReturn( produtos );

        ResponseEntity<List<Produto>> response = controller.listarProdutos();

        verify(service, times(1)).listarProdutos();
        assertEquals(2, response.getBody().size());
        assertEquals(200, response.getStatusCodeValue());
    }
}
