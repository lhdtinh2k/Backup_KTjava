package fpt.fa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "May")
public class May {
	@Id
	private String MaMay;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private String ViTri;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private String TrangThai;
	
	public String getMaMay() {
		return MaMay;
	}
	public void setMaMay(String maMay) {
		MaMay = maMay;
	}
	public String getViTri() {
		return ViTri;
	}
	public void setViTri(String viTri) {
		ViTri = viTri;
	}
	public String getTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}
	
	
	public May() {
	}
	
	
	public May(String maMay, String viTri, String trangThai) {
		super();
		MaMay = maMay;
		ViTri = viTri;
		TrangThai = trangThai;
	}
	
	
	@Override
	public String toString() {
		return "May [MaMay=" + MaMay + ", ViTri=" + ViTri + ", TrangThai=" + TrangThai + "]";
	}
	
	

	
	
	
}
