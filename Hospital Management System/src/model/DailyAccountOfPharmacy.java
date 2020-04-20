package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DailyAccountOfPharmacy")
public class DailyAccountOfPharmacy {
	
	@Id
	@Column(name="descriptionDAOP")
	private String descriptionDAOP;
	@Column(name="debitDAOP")
	private String debitDAOP;
	@Column(name="creditDAOP")
	private String creditDAOP;
	@Column(name="balanceDAOP")
	private String balanceDAOP;
	
	public String getDescriptionDAOP() {
		return descriptionDAOP;
	}
	public void setDescriptionDAOP(String descriptionDAOP) {
		this.descriptionDAOP = descriptionDAOP;
	}
	public String getDebitDAOP() {
		return debitDAOP;
	}
	public void setDebitDAOP(String debitDAOP) {
		this.debitDAOP = debitDAOP;
	}
	public String getCreditDAOP() {
		return creditDAOP;
	}
	public void setCreditDAOP(String creditDAOP) {
		this.creditDAOP = creditDAOP;
	}
	public String getBalanceDAOP() {
		return balanceDAOP;
	}
	public void setBalanceDAOP(String balanceDAOP) {
		this.balanceDAOP = balanceDAOP;
	}
	
}
