package com.nksolucoes.ordersystem.domain.enums;

public enum EstadoPagamento {

	PENDENTE(1, "Pendente"), QUITADO(2, "Quitado"), CANCELADO(3, "Cancelado");

	private Integer estado;
	private String descricao;

	private EstadoPagamento(int estado, String descricao) {
		this.estado = estado;
		this.descricao = descricao;
	}

	public int getEstado() {
		return estado;
	}

	public String getDescricao() {
		return descricao;
	}

	public static EstadoPagamento toEnum(Integer estado) {

		if (estado == null) {
			return null;
		}

		for (EstadoPagamento x : EstadoPagamento.values()) {
			if (estado.equals(x.getEstado())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + estado);
	}

}