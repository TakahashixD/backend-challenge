package br.com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.backend.domain.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
