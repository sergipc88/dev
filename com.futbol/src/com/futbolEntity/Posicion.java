package com.futbolEntity;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posicion")
public class Posicion {
	@Id
	private int cod_demarc;
	private String demarcacion;

	public int getCod_demarc() {
		return cod_demarc;
	}

	public void setCod_demarc(int cod_demarc) {
		this.cod_demarc = cod_demarc;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

}
