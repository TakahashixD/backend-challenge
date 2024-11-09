package br.com.backend.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name="transacao")
@Table(name="transacao")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Transacao {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name="pagador_id")
	private Usuario pagador; 
	
	@ManyToOne
	@JoinColumn(name="receptor_id")
	private Usuario receptor; 
	
	@Column
	private LocalDateTime timestamp;
}
