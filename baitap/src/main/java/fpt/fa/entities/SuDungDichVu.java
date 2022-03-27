//package fpt.fa.entities;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//@Entity
//@Table(name = "SuDungDichVu")
//public class SuDungDichVu {
//
//	@Id
//	@ManyToOne
//	@JoinColumn(name = "MaKH")
//	protected KhachHang KH;
//	
//	@Id
//	@ManyToOne
//	@JoinColumn(name = "MaDv")
//    protected DichVu DV;
//	
//	@Id
//	@Column(nullable = true)
//	@Temporal(TemporalType.DATE)
//	protected Date NgayBatDauSuDung ;
//	
//	@Id
//	@Column(nullable = true)
//	protected int GioBatDauSuDung ;
//	
//	@Column(nullable = true)
//	private int SoLuong ;
//
//
//	public KhachHang getKH() {
//		return KH;
//	}
//
//	public void setKH(KhachHang kH) {
//		KH = kH;
//	}
//
//	public DichVu getDV() {
//		return DV;
//	}
//
//	public void setDV(DichVu dV) {
//		DV = dV;
//	}
//
//	public Date getNgayBatDauSuDung() {
//		return NgayBatDauSuDung;
//	}
//
//	public void setNgayBatDauSuDung(Date ngayBatDauSuDung) {
//		NgayBatDauSuDung = ngayBatDauSuDung;
//	}
//
//	public int getGioBatDauSuDung() {
//		return GioBatDauSuDung;
//	}
//
//	public void setGioBatDauSuDung(int gioBatDauSuDung) {
//		GioBatDauSuDung = gioBatDauSuDung;
//	}
//
//	public int getSoLuong() {
//		return SoLuong;
//	}
//
//	public void setSoLuong(int soLuong) {
//		SoLuong = soLuong;
//	}
//
//	public SuDungDichVu() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public SuDungDichVu(KhachHang kH, DichVu dV, Date ngayBatDauSuDung, int gioBatDauSuDung, int soLuong) {
//		super();
//
//		KH = kH;
//		DV = dV;
//		NgayBatDauSuDung = ngayBatDauSuDung;
//		GioBatDauSuDung = gioBatDauSuDung;
//		SoLuong = soLuong;
//	}
//
//	@Override
//	public String toString() {
//		return "SuDungDichVu [KH=" + KH + ", DV=" + DV + ", NgayBatDauSuDung=" + NgayBatDauSuDung
//				+ ", GioBatDauSuDung=" + GioBatDauSuDung + ", SoLuong=" + SoLuong + "]";
//	}	
//	
//	
//	
//	
//}
