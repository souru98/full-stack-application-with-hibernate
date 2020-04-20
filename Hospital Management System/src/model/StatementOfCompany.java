package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StatementOfCompany")
public class StatementOfCompany {

	@Id
	@Column(name="nameOfCompanySOC")
	private String nameOfCompanySOC;
	@Column(name="invoiceNoSOC")
	private String invoiceNoSOC;
	@Column(name="creditDateSOC")
	private String creditDateSOC;
	@Column(name="transactionCreditSOC")
	private String transactionCreditSOC;
	@Column(name="debitDateSOC")
	private String debitDateSOC;
	@Column(name="transactionDebitSOC")
	private String transactionDebitSOC;
	@Column(name="balanceSOC")
	private String balanceSOC;
	
	public String getNameOfCompanySOC() {
		return nameOfCompanySOC;
	}
	public void setNameOfCompanySOC(String nameOfCompanySOC) {
		this.nameOfCompanySOC = nameOfCompanySOC;
	}
	public String getInvoiceNoSOC() {
		return invoiceNoSOC;
	}
	public void setInvoiceNoSOC(String invoiceNoSOC) {
		this.invoiceNoSOC = invoiceNoSOC;
	}
	public String getCreditDateSOC() {
		return creditDateSOC;
	}
	public void setCreditDateSOC(String creditDateSOC) {
		this.creditDateSOC = creditDateSOC;
	}
	public String getTransactionCreditSOC() {
		return transactionCreditSOC;
	}
	public void setTransactionCreditSOC(String transactionCreditSOC) {
		this.transactionCreditSOC = transactionCreditSOC;
	}
	public String getDebitDateSOC() {
		return debitDateSOC;
	}
	public void setDebitDateSOC(String debitDateSOC) {
		this.debitDateSOC = debitDateSOC;
	}
	public String getTransactionDebitSOC() {
		return transactionDebitSOC;
	}
	public void setTransactionDebitSOC(String transactionDebitSOC) {
		this.transactionDebitSOC = transactionDebitSOC;
	}
	public String getBalanceSOC() {
		return balanceSOC;
	}
	public void setBalanceSOC(String balanceSOC) {
		this.balanceSOC = balanceSOC;
	}
	
}
