package fpt.fa.entities;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

@Embeddable
public class Id_SuDungMay implements Serializable{
	
	@ManyToOne
	@JoinColumn(name = "MaKH")
	protected KhachHang kh;
	
	@ManyToOne
	@JoinColumn(name = "MaMay")
    protected May may;
	
	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	protected Date NgayBatDauSuDung ;
	
	@Column(nullable = true)
	protected int GioBatDauSuDung ;


	public Id_SuDungMay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhachHang getKh() {
		return kh;
	}

	public void setKh(KhachHang kh) {
		this.kh = kh;
	}

	

	public Date getNgayBatDauSuDung() {
		return NgayBatDauSuDung;
	}

	public void setNgayBatDauSuDung(Date ngayBatDauSuDung) {
		NgayBatDauSuDung = ngayBatDauSuDung;
	}

	public int getGioBatDauSuDung() {
		return GioBatDauSuDung;
	}

	public void setGioBatDauSuDung(int gioBatDauSuDung) {
		GioBatDauSuDung = gioBatDauSuDung;
	}

	public Id_SuDungMay(KhachHang kh, May may, Date ngayBatDauSuDung, int gioBatDauSuDung) {
		super();
		this.kh = kh;
		this.may = may;
		NgayBatDauSuDung = ngayBatDauSuDung;
		GioBatDauSuDung = gioBatDauSuDung;
	}

	public May getMay() {
		return may;
	}

	public void setMay(May may) {
		this.may = may;
	}

	
    

}

