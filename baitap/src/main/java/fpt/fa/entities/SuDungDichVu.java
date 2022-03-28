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
	
	
	@ManyToOne
	@JoinColumn(name = "MaDV")
	private DichVu dichvu;

	
	@ManyToOne
	@JoinColumn(name = "MaKH")
	private KhachHang khachhang;
	
	@Id
	@Column(name = "NgaySuDung")
	@Temporal(TemporalType.DATE)
	protected Date NgaySuDung ;
	
	@Id
	@Column(name = "GioSuDung")
	protected int GioSuDung ;
	
	@Column(name = "SoLuong")
	private int SoLuong ;

	public DichVu getDichvu() {
		return dichvu;
	}

	public void setDichvu(DichVu dichvu) {
		this.dichvu = dichvu;
	}

	public KhachHang getKhachhang() {
		return khachhang;
	}

	public void setKhachhang(KhachHang khachhang) {
		this.khachhang = khachhang;
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

	public SuDungDichVu(DichVu dichvu, KhachHang khachhang, Date ngaySuDung, int gioSuDung, int soLuong) {
		super();
		this.dichvu = dichvu;
		this.khachhang = khachhang;
		NgaySuDung = ngaySuDung;
		GioSuDung = gioSuDung;
		SoLuong = soLuong;
	}

	public SuDungDichVu() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SuDungDichVu [dichvu=" + dichvu + ", khachhang=" + khachhang + ", NgaySuDung=" + NgaySuDung
				+ ", GioSuDung=" + GioSuDung + ", SoLuong=" + SoLuong + "]";
	}
	
	
	
}
