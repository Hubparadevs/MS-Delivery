package br.com.britosdelivery.pedidos.dto;

import br.com.britosdelivery.pedidos.model.Pedidos;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ItemPedidoDto {

    private Long id;
    private Integer quantidade;
    private String descricao;
    private Pedidos pedidos;
}
