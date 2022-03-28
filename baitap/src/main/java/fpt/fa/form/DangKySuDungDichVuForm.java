package fpt.fa.form;

import java.util.Date;

import fpt.fa.entities.DichVu;

public class DangKySuDungDichVuForm {
	private int MaDV;
	private int MaKH;
	
	protected Date NgaySuDung;
	protected int GioSuDung ;
	private int SoLuong ;
	public int getMaDV() {
		return MaDV;
	}
	public void setMaDV(int maDV) {
		MaDV = maDV;
	}
	public int getMaKH() {
		return MaKH;
	}
	public void setMaKH(int maKH) {
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
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	
}
