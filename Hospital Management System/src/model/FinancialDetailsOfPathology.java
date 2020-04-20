package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FinancialDetailsOfPathology")
public class FinancialDetailsOfPathology {

	@Id
	@Column(name="descriptionFDOP")
	private String descriptionFDOP;
	@Column(name="creditFDOP")
	private String creditFDOP;
	@Column(name="debitFDOP")
	private String debitFDOP;
	@Column(name="balanceFDOP")
	private String balanceFDOP;
	
	public String getDescriptionFDOP() {
		return descriptionFDOP;
	}
	public void setDescriptionFDOP(String descriptionFDOP) {
		this.descriptionFDOP = descriptionFDOP;
	}
	public String getCreditFDOP() {
		return creditFDOP;
	}
	public void setCreditFDOP(String creditFDOP) {
		this.creditFDOP = creditFDOP;
	}
	public String getDebitFDOP() {
		return debitFDOP;
	}
	public void setDebitFDOP(String debitFDOP) {
		this.debitFDOP = debitFDOP;
	}
	public String getBalanceFDOP() {
		return balanceFDOP;
	}
	public void setBalanceFDOP(String balanceFDOP) {
		this.balanceFDOP = balanceFDOP;
	}
	
}
