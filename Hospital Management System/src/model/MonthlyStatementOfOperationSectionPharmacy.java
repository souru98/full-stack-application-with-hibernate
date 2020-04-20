package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MonthlyStatementOfOperationSectionPharmacy")
public class MonthlyStatementOfOperationSectionPharmacy {

	@Id
	@Column(name="slNoMSOS")
	private String slNoMSOS;
	@Column(name="ptnNameMSOS")
	private String ptnNameMSOS;
	@Column(name="dateMSOS")
	private String dateMSOS;
	@Column(name="operNameMSOS")
	private String operNameMSOS;
	@Column(name="contMoneyMSOS")
	private String contMoneyMSOS;
	@Column(name="anesthPaymentMSOS")
	private String anesthPaymentMSOS;
	@Column(name="srgnPaymentMSOS")
	private String srgnPaymentMSOS;
	@Column(name="agntCommMSOS")
	private String agntCommMSOS;
	@Column(name="medicineMSOS")
	private String medicineMSOS;
	@Column(name="nurseCommMSOS")
	private String nurseCommMSOS;
	@Column(name="netAmountMSOS")
	private String netAmountMSOS;
	
	public String getSlNoMSOS() {
		return slNoMSOS;
	}
	public void setSlNoMSOS(String slNoMSOS) {
		this.slNoMSOS = slNoMSOS;
	}
	public String getPtnNameMSOS() {
		return ptnNameMSOS;
	}
	public void setPtnNameMSOS(String ptnNameMSOS) {
		this.ptnNameMSOS = ptnNameMSOS;
	}
	public String getDateMSOS() {
		return dateMSOS;
	}
	public void setDateMSOS(String dateMSOS) {
		this.dateMSOS = dateMSOS;
	}
	public String getOperNameMSOS() {
		return operNameMSOS;
	}
	public void setOperNameMSOS(String operNameMSOS) {
		this.operNameMSOS = operNameMSOS;
	}
	public String getContMoneyMSOS() {
		return contMoneyMSOS;
	}
	public void setContMoneyMSOS(String contMoneyMSOS) {
		this.contMoneyMSOS = contMoneyMSOS;
	}
	public String getAnesthPaymentMSOS() {
		return anesthPaymentMSOS;
	}
	public void setAnesthPaymentMSOS(String anesthPaymentMSOS) {
		this.anesthPaymentMSOS = anesthPaymentMSOS;
	}
	public String getSrgnPaymentMSOS() {
		return srgnPaymentMSOS;
	}
	public void setSrgnPaymentMSOS(String srgnPaymentMSOS) {
		this.srgnPaymentMSOS = srgnPaymentMSOS;
	}
	public String getAgntCommMSOS() {
		return agntCommMSOS;
	}
	public void setAgntCommMSOS(String agntCommMSOS) {
		this.agntCommMSOS = agntCommMSOS;
	}
	public String getMedicineMSOS() {
		return medicineMSOS;
	}
	public void setMedicineMSOS(String medicineMSOS) {
		this.medicineMSOS = medicineMSOS;
	}
	public String getNurseCommMSOS() {
		return nurseCommMSOS;
	}
	public void setNurseCommMSOS(String nurseCommMSOS) {
		this.nurseCommMSOS = nurseCommMSOS;
	}
	public String getNetAmountMSOS() {
		return netAmountMSOS;
	}
	public void setNetAmountMSOS(String netAmountMSOS) {
		this.netAmountMSOS = netAmountMSOS;
	}
	
}
