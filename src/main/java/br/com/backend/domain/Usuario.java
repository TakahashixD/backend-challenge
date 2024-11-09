package br.com.backend.domain;

import java.math.BigDecimal;

import br.com.backend.enums.TipoUsuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name="usuario")
@Table(name="usuario")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Usuario {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String primeiroNome;
	
	@Column
	private String ultimoNome;
	
	@Column(unique=true)
	private String documento;
	
	@Column(unique=true)
	private String email;
	
	@Column
	private String senha;
	
	@Column
	private BigDecimal saldo;
	
	@Column
	@Enumerated(EnumType.STRING)
	private TipoUsuario tipo;
	
}
