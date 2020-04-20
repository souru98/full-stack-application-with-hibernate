package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MonthlyAccountOfPharmacy")
public class MonthlyAccountOfPharmacy {

	@Id
	@Column(name="dateMAO")
	private String dateMAO;
	@Column(name="totalDebitMAO")
	private String totalDebitMAO;
	@Column(name="totCreditMAO")
	private String totCreditMAO;
	@Column(name="remarkMAO")
	private String remarkMAO;
	@Column(name="balanceMAO")
	private String balanceMAO;
	
	public String getDateMAO() {
		return dateMAO;
	}
	public void setDateMAO(String dateMAO) {
		this.dateMAO = dateMAO;
	}
	public String getTotalDebitMAO() {
		return totalDebitMAO;
	}
	public void setTotalDebitMAO(String totalDebitMAO) {
		this.totalDebitMAO = totalDebitMAO;
	}
	public String getTotCreditMAO() {
		return totCreditMAO;
	}
	public void setTotCreditMAO(String totCreditMAO) {
		this.totCreditMAO = totCreditMAO;
	}
	public String getRemarkMAO() {
		return remarkMAO;
	}
	public void setRemarkMAO(String remarkMAO) {
		this.remarkMAO = remarkMAO;
	}
	public String getBalanceMAO() {
		return balanceMAO;
	}
	public void setBalanceMAO(String balanceMAO) {
		this.balanceMAO = balanceMAO;
	}

}
