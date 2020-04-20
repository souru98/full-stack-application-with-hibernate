package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DailyAccountOfOperationSection")
public class DailyAccountOfOperationSection {
	
	@Id
	@Column(name="descriptionDAOOS")
	private String descriptionDAOOS;
	@Column(name="regInvNoDAOOS")
	private String regInvNoDAOOS;
	@Column(name="debitDAOOS")
	private String debitDAOOS;
	@Column(name="creditDAOOS")
	private String creditDAOOS;
	@Column(name="balanceDAOOS")
	private String balanceDAOOS;
	
	public String getDescriptionDAOOS() {
		return descriptionDAOOS;
	}
	public void setDescriptionDAOOS(String descriptionDAOOS) {
		this.descriptionDAOOS = descriptionDAOOS;
	}
	public String getRegInvNoDAOOS() {
		return regInvNoDAOOS;
	}
	public void setRegInvNoDAOOS(String regInvNoDAOOS) {
		this.regInvNoDAOOS = regInvNoDAOOS;
	}
	public String getDebitDAOOS() {
		return debitDAOOS;
	}
	public void setDebitDAOOS(String debitDAOOS) {
		this.debitDAOOS = debitDAOOS;
	}
	public String getCreditDAOOS() {
		return creditDAOOS;
	}
	public void setCreditDAOOS(String creditDAOOS) {
		this.creditDAOOS = creditDAOOS;
	}
	public String getBalanceDAOOS() {
		return balanceDAOOS;
	}
	public void setBalanceDAOOS(String balanceDAOOS) {
		this.balanceDAOOS = balanceDAOOS;
	}
	
}
