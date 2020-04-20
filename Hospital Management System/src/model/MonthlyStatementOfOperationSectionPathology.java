package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MonthlyStatementOfOperationSectionPathology")
public class MonthlyStatementOfOperationSectionPathology {

	@Id
	@Column(name="slNoMSOSP")
	private String slNoMSOSP;
	@Column(name="datePathMSOSP")
	private String datePathMSOSP;
	@Column(name="ptnNamePathMSOSP")
	private String ptnNamePathMSOSP;
	@Column(name="operNamePathMSOSP")
	private String operNamePathMSOSP;
	@Column(name="contMoneyPathMSOSP")
	private String contMoneyPathMSOSP;
	@Column(name="anesthPaymentPathMSOSP")
	private String anesthPaymentPathMSOSP;
	@Column(name="srgnPaymentPathMSOSP")
	private String srgnPaymentPathMSOSP;
	@Column(name="agntCommPathMSOSP")
	private String agntCommPathMSOSP;
	@Column(name="medicinePathMSOSP")
	private String medicinePathMSOSP;
	@Column(name="nurseCommPathMSOSP")
	private String nurseCommPathMSOSP;
	@Column(name="netAmountMSOSP")
	private String netAmountMSOSP;
	
	public String getSlNoMSOSP() {
		return slNoMSOSP;
	}
	public void setSlNoMSOSP(String slNoMSOSP) {
		this.slNoMSOSP = slNoMSOSP;
	}
	public String getDatePathMSOSP() {
		return datePathMSOSP;
	}
	public void setDatePathMSOSP(String datePathMSOSP) {
		this.datePathMSOSP = datePathMSOSP;
	}
	public String getPtnNamePathMSOSP() {
		return ptnNamePathMSOSP;
	}
	public void setPtnNamePathMSOSP(String ptnNamePathMSOSP) {
		this.ptnNamePathMSOSP = ptnNamePathMSOSP;
	}
	public String getOperNamePathMSOSP() {
		return operNamePathMSOSP;
	}
	public void setOperNamePathMSOSP(String operNamePathMSOSP) {
		this.operNamePathMSOSP = operNamePathMSOSP;
	}
	public String getContMoneyPathMSOSP() {
		return contMoneyPathMSOSP;
	}
	public void setContMoneyPathMSOSP(String contMoneyPathMSOSP) {
		this.contMoneyPathMSOSP = contMoneyPathMSOSP;
	}
	public String getAnesthPaymentPathMSOSP() {
		return anesthPaymentPathMSOSP;
	}
	public void setAnesthPaymentPathMSOSP(String anesthPaymentPathMSOSP) {
		this.anesthPaymentPathMSOSP = anesthPaymentPathMSOSP;
	}
	public String getSrgnPaymentPathMSOSP() {
		return srgnPaymentPathMSOSP;
	}
	public void setSrgnPaymentPathMSOSP(String srgnPaymentPathMSOSP) {
		this.srgnPaymentPathMSOSP = srgnPaymentPathMSOSP;
	}
	public String getAgntCommPathMSOSP() {
		return agntCommPathMSOSP;
	}
	public void setAgntCommPathMSOSP(String agntCommPathMSOSP) {
		this.agntCommPathMSOSP = agntCommPathMSOSP;
	}
	public String getMedicinePathMSOSP() {
		return medicinePathMSOSP;
	}
	public void setMedicinePathMSOSP(String medicinePathMSOSP) {
		this.medicinePathMSOSP = medicinePathMSOSP;
	}
	public String getNurseCommPathMSOSP() {
		return nurseCommPathMSOSP;
	}
	public void setNurseCommPathMSOSP(String nurseCommPathMSOSP) {
		this.nurseCommPathMSOSP = nurseCommPathMSOSP;
	}
	public String getNetAmountMSOSP() {
		return netAmountMSOSP;
	}
	public void setNetAmountMSOSP(String netAmountMSOSP) {
		this.netAmountMSOSP = netAmountMSOSP;
	}
	
}
