package br.com.william.assis.vendaonline.repositores;

import br.com.william.assis.vendaonline.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepositore extends JpaRepository <Pedido, Integer> {
}
