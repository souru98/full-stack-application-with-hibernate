package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AdmissionForm")
public class AdmissionForm {

	@Id
	@Column(name="serialNoAF")
	private String serialNoAF;
	@Column(name="dateAF")
	private String dateAF;
	@Column(name="patientName")
	private String patientName;
	@Column(name="addressAF")
	private String addressAF;
	@Column(name="mobileNoAF")
	private String mobileNoAF;
	@Column(name="sexAF")
	private String sexAF;
	@Column(name="ageAF")
	private String ageAF;
	@Column(name="referenceNameAF")
	private String referenceNameAF;
	@Column(name="nameOfOperation")
	private String nameOfOperation;
	@Column(name="typeOfOperationAF")
	private String typeOfOperationAF;
	@Column(name="nameOfSurgeonAF")
	private String nameOfSurgeonAF;
	@Column(name="medicineAF")
	private String medicineAF;
	@Column(name="normalPriceAF")
	private String normalPriceAF;
	@Column(name="contPriceAF")
	private String contPriceAF;
	@Column(name="medicinePriceAF")
	private String medicinePriceAF;
	@Column(name="discountMAF")
	private String discountMAF;
	@Column(name="discountOAF")
	private String discountOAF;
	@Column(name="discountAuthorityAF")
	private String discountAuthorityAF;
	@Column(name="totalAF")
	private String totalAF;
	@Column(name="firstPaymentAF")
	private String firstPaymentAF;
	@Column(name="secondPaymentAF")
	private String secondPaymentAF;
	@Column(name="lastPaymentAF")
	private String lastPaymentAF;
	@Column(name="othersClearanceAF")
	private String othersClearanceAF;
	
	public String getDateAF() {
		return dateAF;
	}
	public void setDateAF(String dateAF) {
		this.dateAF = dateAF;
	}
	public String getSerialNoAF() {
		return serialNoAF;
	}
	public void setSerialNoAF(String serialNoAF) {
		this.serialNoAF = serialNoAF;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAddressAF() {
		return addressAF;
	}
	public void setAddressAF(String addressAF) {
		this.addressAF = addressAF;
	}
	public String getMobileNoAF() {
		return mobileNoAF;
	}
	public void setMobileNoAF(String mobileNoAF) {
		this.mobileNoAF = mobileNoAF;
	}
	public String getSexAF() {
		return sexAF;
	}
	public void setSexAF(String sexAF) {
		this.sexAF = sexAF;
	}
	public String getAgeAF() {
		return ageAF;
	}
	public void setAgeAF(String ageAF) {
		this.ageAF = ageAF;
	}
	public String getReferenceNameAF() {
		return referenceNameAF;
	}
	public void setReferenceNameAF(String referenceNameAF) {
		this.referenceNameAF = referenceNameAF;
	}
	public String getNameOfOperation() {
		return nameOfOperation;
	}
	public void setNameOfOperation(String nameOfOperation) {
		this.nameOfOperation = nameOfOperation;
	}
	public String getTypeOfOperationAF() {
		return typeOfOperationAF;
	}
	public void setTypeOfOperationAF(String typeOfOperationAF) {
		this.typeOfOperationAF = typeOfOperationAF;
	}
	public String getNameOfSurgeonAF() {
		return nameOfSurgeonAF;
	}
	public void setNameOfSurgeonAF(String nameOfSurgeonAF) {
		this.nameOfSurgeonAF = nameOfSurgeonAF;
	}
	public String getMedicineAF() {
		return medicineAF;
	}
	public void setMedicineAF(String medicineAF) {
		this.medicineAF = medicineAF;
	}
	public String getNormalPriceAF() {
		return normalPriceAF;
	}
	public void setNormalPriceAF(String normalPriceAF) {
		this.normalPriceAF = normalPriceAF;
	}
	public String getContPriceAF() {
		return contPriceAF;
	}
	public void setContPriceAF(String contPriceAF) {
		this.contPriceAF = contPriceAF;
	}
	public String getMedicinePriceAF() {
		return medicinePriceAF;
	}
	public void setMedicinePriceAF(String medicinePriceAF) {
		this.medicinePriceAF = medicinePriceAF;
	}
	public String getDiscountMAF() {
		return discountMAF;
	}
	public void setDiscountMAF(String discountMAF) {
		this.discountMAF = discountMAF;
	}
	public String getDiscountOAF() {
		return discountOAF;
	}
	public void setDiscountOAF(String discountOAF) {
		this.discountOAF = discountOAF;
	}
	public String getDiscountAuthorityAF() {
		return discountAuthorityAF;
	}
	public void setDiscountAuthorityAF(String discountAuthorityAF) {
		this.discountAuthorityAF = discountAuthorityAF;
	}
	public String getTotalAF() {
		return totalAF;
	}
	public void setTotalAF(String totalAF) {
		this.totalAF = totalAF;
	}
	public String getFirstPaymentAF() {
		return firstPaymentAF;
	}
	public void setFirstPaymentAF(String firstPaymentAF) {
		this.firstPaymentAF = firstPaymentAF;
	}
	public String getSecondPaymentAF() {
		return secondPaymentAF;
	}
	public void setSecondPaymentAF(String secondPaymentAF) {
		this.secondPaymentAF = secondPaymentAF;
	}
	public String getLastPaymentAF() {
		return lastPaymentAF;
	}
	public void setLastPaymentAF(String lastPaymentAF) {
		this.lastPaymentAF = lastPaymentAF;
	}
	public String getOthersClearanceAF() {
		return othersClearanceAF;
	}
	public void setOthersClearanceAF(String othersClearanceAF) {
		this.othersClearanceAF = othersClearanceAF;
	}
	

}
