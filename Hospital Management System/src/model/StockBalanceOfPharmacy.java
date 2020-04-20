package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StockBalanceOfPharmacy")
public class StockBalanceOfPharmacy {

	@Id
	@Column(name="codeNoSBOP")
	private String codeNoSBOP;
	@Column(name="productNameSBOP")
	private String productNameSBOP;
	@Column(name="opBlSBOP")
	private String opBlSBOP;
	@Column(name="mrnSBOP")
	private String mrnSBOP;
	@Column(name="minSBOP")
	private String minSBOP;
	@Column(name="balanceSBOP")
	private String balanceSBOP;
	@Column(name="pRateSBOP")
	private String pRateSBOP;
	@Column(name="amountSBOP")
	private String amountSBOP;
	public String getCodeNoSBOP() {
		return codeNoSBOP;
	}
	public void setCodeNoSBOP(String codeNoSBOP) {
		this.codeNoSBOP = codeNoSBOP;
	}
	public String getProductNameSBOP() {
		return productNameSBOP;
	}
	public void setProductNameSBOP(String productNameSBOP) {
		this.productNameSBOP = productNameSBOP;
	}
	public String getOpBlSBOP() {
		return opBlSBOP;
	}
	public void setOpBlSBOP(String opBlSBOP) {
		this.opBlSBOP = opBlSBOP;
	}
	public String getMrnSBOP() {
		return mrnSBOP;
	}
	public void setMrnSBOP(String mrnSBOP) {
		this.mrnSBOP = mrnSBOP;
	}
	public String getMinSBOP() {
		return minSBOP;
	}
	public void setMinSBOP(String minSBOP) {
		this.minSBOP = minSBOP;
	}
	public String getBalanceSBOP() {
		return balanceSBOP;
	}
	public void setBalanceSBOP(String balanceSBOP) {
		this.balanceSBOP = balanceSBOP;
	}
	public String getpRateSBOP() {
		return pRateSBOP;
	}
	public void setpRateSBOP(String pRateSBOP) {
		this.pRateSBOP = pRateSBOP;
	}
	public String getAmountSBOP() {
		return amountSBOP;
	}
	public void setAmountSBOP(String amountSBOP) {
		this.amountSBOP = amountSBOP;
	}
	
}
