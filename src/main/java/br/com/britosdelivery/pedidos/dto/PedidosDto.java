package br.com.britosdelivery.pedidos.dto;

import br.com.britosdelivery.pedidos.model.ItemPedido;
import br.com.britosdelivery.pedidos.model.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidosDto {


    private Long id;
    private LocalDateTime dataHora;
    private Status status;

}
