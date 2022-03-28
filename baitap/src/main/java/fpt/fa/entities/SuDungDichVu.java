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
	private DichVu dichvu;

	@Id
	@ManyToOne
	@JoinColumn(name = "MaKH")
	private KhachHang khachhang;
	
	@Id
	@Column(name = "NgayBatDauSuDung")
	@Temporal(TemporalType.DATE)
	protected Date NgayBatDauSuDung ;
	
	@Id
	@Column(name = "GioBatDauSuDung")
	protected int GioBatDauSuDung ;
	
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

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	
	
}
