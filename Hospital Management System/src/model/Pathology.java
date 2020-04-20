package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pathology")
public class Pathology {

	@Id
	@Column(name="patientsNamePathology")
	private String patientsNamePathology;
	@Column(name="labPathology")
	private String labPathology;
	@Column(name="usPathology")
	private String usPathology;
	@Column(name="ecgPathology")
	private String ecgPathology;
	@Column(name="othersPathology")
	private String othersPathology;
	@Column(name="totaPathology")
	private String totaPathology;
	@Column(name="commissionPathology")
	private String commissionPathology;
	@Column(name="agentCommissionPathology")
	private String agentCommissionPathology;
	@Column(name="agentNamePathology")
	private String agentNamePathology;
	@Column(name="netAmountPathology")
	private String netAmountPathology;
	@Column(name="xRayPathology")
	private String xRayPathology;
	@Column(name="remarksPathology")
	private String remarksPathology;
	
	public String getPatientsNamePathology() {
		return patientsNamePathology;
	}
	public void setPatientsNamePathology(String patientsNamePathology) {
		this.patientsNamePathology = patientsNamePathology;
	}
	public String getLabPathology() {
		return labPathology;
	}
	public void setLabPathology(String labPathology) {
		this.labPathology = labPathology;
	}
	public String getUsPathology() {
		return usPathology;
	}
	public void setUsPathology(String usPathology) {
		this.usPathology = usPathology;
	}
	public String getEcgPathology() {
		return ecgPathology;
	}
	public void setEcgPathology(String ecgPathology) {
		this.ecgPathology = ecgPathology;
	}
	public String getOthersPathology() {
		return othersPathology;
	}
	public void setOthersPathology(String othersPathology) {
		this.othersPathology = othersPathology;
	}
	public String getTotaPathology() {
		return totaPathology;
	}
	public void setTotaPathology(String totaPathology) {
		this.totaPathology = totaPathology;
	}
	public String getCommissionPathology() {
		return commissionPathology;
	}
	public void setCommissionPathology(String commissionPathology) {
		this.commissionPathology = commissionPathology;
	}
	public String getAgentCommissionPathology() {
		return agentCommissionPathology;
	}
	public void setAgentCommissionPathology(String agentCommissionPathology) {
		this.agentCommissionPathology = agentCommissionPathology;
	}
	public String getAgentNamePathology() {
		return agentNamePathology;
	}
	public void setAgentNamePathology(String agentNamePathology) {
		this.agentNamePathology = agentNamePathology;
	}
	public String getNetAmountPathology() {
		return netAmountPathology;
	}
	public void setNetAmountPathology(String netAmountPathology) {
		this.netAmountPathology = netAmountPathology;
	}
	public String getxRayPathology() {
		return xRayPathology;
	}
	public void setxRayPathology(String xRayPathology) {
		this.xRayPathology = xRayPathology;
	}
	public String getRemarksPathology() {
		return remarksPathology;
	}
	public void setRemarksPathology(String remarksPathology) {
		this.remarksPathology = remarksPathology;
	}
	
}
