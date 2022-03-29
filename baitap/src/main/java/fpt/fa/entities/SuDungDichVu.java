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
@Table(name = "SuDungDichVu")
public class SuDungDichVu implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "MaDV")
	private DichVu MaDV;

	@Id
	@ManyToOne
	@JoinColumn(name = "MaKH")
	private KhachHang MaKH;
	
	@Id
	@Column(name = "NgaySuDung")
	@Temporal(TemporalType.DATE)
	protected Date NgaySuDung ;
	
	@Id
	@Column(name = "GioSuDung")
	protected int GioSuDung ;
	
	@Column(name = "SoLuong")
	private int SoLuong ;



	public DichVu getMaDV() {
		return MaDV;
	}

	public void setMaDV(DichVu maDV) {
		MaDV = maDV;
	}

	public KhachHang getMaKH() {
		return MaKH;
	}

	public void setMaKH(KhachHang maKH) {
		MaKH = maKH;
	}

	public Date getNgaySuDung() {
		return NgaySuDung;
	}

	public void setNgaySuDung(Date ngaySuDung) {
		NgaySuDung = ngaySuDung;
	}

	public int getGioSuDung() {
		return GioSuDung;
	}

	public void setGioSuDung(int gioSuDung) {
		GioSuDung = gioSuDung;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}


	
	
	
}
