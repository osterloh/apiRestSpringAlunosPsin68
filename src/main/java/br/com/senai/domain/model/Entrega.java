package br.com.senai.domain.model;

import br.com.senai.domain.exception.NegocioException;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "entregas")
public class Entrega {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;

	@Embedded
	private Destinatario destinatario;

	private BigDecimal taxa;

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	@Enumerated(EnumType.STRING)
	private StatusEntrega status;

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private LocalDateTime dataPedido;

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private LocalDateTime dataFinalizacao;

    public void finalizar() {
    	if(naoPodeSerFinalizada()){
    		throw new NegocioException("Entrega não pode ser finalizada.");
		}

    	setStatus(StatusEntrega.FINALIZADA);
    	setDataFinalizacao(LocalDateTime.now());
    }

    public boolean podeSerFinalizada(){
    	return StatusEntrega.PENDENTE.equals(getStatus());
	}

	public boolean naoPodeSerFinalizada(){
    	return !podeSerFinalizada();
	}
}
