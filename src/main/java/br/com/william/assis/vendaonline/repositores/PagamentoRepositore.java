package br.com.william.assis.vendaonline.repositores;

import br.com.william.assis.vendaonline.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PagamentoRepositore extends JpaRepository<Pagamento, Integer> {
}
