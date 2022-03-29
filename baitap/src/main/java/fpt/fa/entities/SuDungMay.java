package fpt.fa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SuDungMay")
public class SuDungMay implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "MaMay")
	private May MaMay;

	@Id
	@ManyToOne
	@JoinColumn(name = "MaKH")
	private KhachHang MaKH;
	
	@Id
	@Column(name = "NgayBatDauSuDung")
	@Temporal(TemporalType.DATE)
	protected Date NgayBatDauSuDung ;
	
	@Id
	@Column(name = "GioBatDauSuDung")
	protected int GioBatDauSuDung ;
	
	@Column(name = "ThoiGianSuDung")
	private int ThoiGianSuDung ;



	public May getMaMay() {
		return MaMay;
	}

	public void setMaMay(May maMay) {
		MaMay = maMay;
	}

	public KhachHang getMaKH() {
		return MaKH;
	}

	public void setMaKH(KhachHang maKH) {
		MaKH = maKH;
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

	public int getThoiGianSuDung() {
		return ThoiGianSuDung;
	}

	public void setThoiGianSuDung(int thoiGianSuDung) {
		ThoiGianSuDung = thoiGianSuDung;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
