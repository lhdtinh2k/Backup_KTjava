package fpt.fa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DichVu")
public class DichVu {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int MaDV;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private String TenDV;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private String DonViTinh;

	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private double DonGia;

	public int getMaDV() {
		return MaDV;
	}

	public void setMaDV(int maDV) {
		MaDV = maDV;
	}

	public String getTenDV() {
		return TenDV;
	}

	public void setTenDV(String tenDV) {
		TenDV = tenDV;
	}

	public String getDonViTinh() {
		return DonViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		DonViTinh = donViTinh;
	}

	public double getDonGia() {
		return DonGia;
	}

	public void setDonGia(double donGia) {
		DonGia = donGia;
	}

	public DichVu(int maDV, String tenDV, String donViTinh, double donGia) {
		super();
		MaDV = maDV;
		TenDV = tenDV;
		DonViTinh = donViTinh;
		DonGia = donGia;
	}

	public DichVu() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DichVu [MaDV=" + MaDV + ", TenDV=" + TenDV + ", DonViTinh=" + DonViTinh + ", DonGia=" + DonGia + "]";
	}

	
	
}
