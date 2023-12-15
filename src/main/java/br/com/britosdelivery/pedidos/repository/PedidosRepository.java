package br.com.britosdelivery.pedidos.repository;

import br.com.britosdelivery.pedidos.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedidos, Long> {
}
