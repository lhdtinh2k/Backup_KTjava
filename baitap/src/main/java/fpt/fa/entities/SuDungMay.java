package fpt.fa.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class SuDungMay implements Serializable {

	@EmbeddedId
	private Id_SuDungMay id;

	@Column(nullable = true)
	private int ThoiGianSuDung;

	public SuDungMay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuDungMay(Id_SuDungMay id, int thoiGianSuDung) {
		super();
		this.id = id;
		ThoiGianSuDung = thoiGianSuDung;
	}

	public Id_SuDungMay getId() {
		return id;
	}

	public void setId(Id_SuDungMay id) {
		this.id = id;
	}

	public int getThoiGianSuDung() {
		return ThoiGianSuDung;
	}

	public void setThoiGianSuDung(int thoiGianSuDung) {
		ThoiGianSuDung = thoiGianSuDung;
	}

}
