package net.may5.dto;

public class Payment {
	private int cardCode;
	private String cardName;
	private int payCode;
	private String payType;
	private int cardSectionCode;
	private String cardSectionType;
	private String saveCode;
	private String saveType;
	private int telecomCode;
	private String telecomName;
	private int termCode;
	private String installmentTerm;
	private int deductionCode;
	private String deductionName;
	private int wayCode;
	private String wayType;
	
	public int getCardCode() {
		return cardCode;
	}
	public void setCardCode(int cardCode) {
		this.cardCode = cardCode;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public int getPayCode() {
		return payCode;
	}
	public void setPayCode(int payCode) {
		this.payCode = payCode;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public int getCardSectionCode() {
		return cardSectionCode;
	}
	public void setCardSectionCode(int cardSectionCode) {
		this.cardSectionCode = cardSectionCode;
	}
	public String getCardSectionType() {
		return cardSectionType;
	}
	public void setCardSectionType(String cardSectionType) {
		this.cardSectionType = cardSectionType;
	}
	public String getSaveCode() {
		return saveCode;
	}
	public void setSaveCode(String saveCode) {
		this.saveCode = saveCode;
	}
	public String getSaveType() {
		return saveType;
	}
	public void setSaveType(String saveType) {
		this.saveType = saveType;
	}
	public int getTelecomCode() {
		return telecomCode;
	}
	public void setTelecomCode(int telecomCode) {
		this.telecomCode = telecomCode;
	}
	public String getTelecomName() {
		return telecomName;
	}
	public void setTelecomName(String telecomName) {
		this.telecomName = telecomName;
	}
	public int getTermCode() {
		return termCode;
	}
	public void setTermCode(int termCode) {
		this.termCode = termCode;
	}
	public String getInstallmentTerm() {
		return installmentTerm;
	}
	public void setInstallmentTerm(String installmentTerm) {
		this.installmentTerm = installmentTerm;
	}
	public int getDeductionCode() {
		return deductionCode;
	}
	public void setDeductionCode(int deductionCode) {
		this.deductionCode = deductionCode;
	}
	public String getDeductionName() {
		return deductionName;
	}
	public void setDeductionName(String deductionName) {
		this.deductionName = deductionName;
	}
	public int getWayCode() {
		return wayCode;
	}
	public void setWayCode(int wayCode) {
		this.wayCode = wayCode;
	}
	public String getWayType() {
		return wayType;
	}
	public void setWayType(String wayType) {
		this.wayType = wayType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cardCode;
		result = prime * result
				+ ((cardName == null) ? 0 : cardName.hashCode());
		result = prime * result + cardSectionCode;
		result = prime * result
				+ ((cardSectionType == null) ? 0 : cardSectionType.hashCode());
		result = prime * result + deductionCode;
		result = prime * result
				+ ((deductionName == null) ? 0 : deductionName.hashCode());
		result = prime * result
				+ ((installmentTerm == null) ? 0 : installmentTerm.hashCode());
		result = prime * result + payCode;
		result = prime * result + ((payType == null) ? 0 : payType.hashCode());
		result = prime * result
				+ ((saveCode == null) ? 0 : saveCode.hashCode());
		result = prime * result
				+ ((saveType == null) ? 0 : saveType.hashCode());
		result = prime * result + telecomCode;
		result = prime * result
				+ ((telecomName == null) ? 0 : telecomName.hashCode());
		result = prime * result + termCode;
		result = prime * result + wayCode;
		result = prime * result + ((wayType == null) ? 0 : wayType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (cardCode != other.cardCode)
			return false;
		if (cardName == null) {
			if (other.cardName != null)
				return false;
		} else if (!cardName.equals(other.cardName))
			return false;
		if (cardSectionCode != other.cardSectionCode)
			return false;
		if (cardSectionType == null) {
			if (other.cardSectionType != null)
				return false;
		} else if (!cardSectionType.equals(other.cardSectionType))
			return false;
		if (deductionCode != other.deductionCode)
			return false;
		if (deductionName == null) {
			if (other.deductionName != null)
				return false;
		} else if (!deductionName.equals(other.deductionName))
			return false;
		if (installmentTerm == null) {
			if (other.installmentTerm != null)
				return false;
		} else if (!installmentTerm.equals(other.installmentTerm))
			return false;
		if (payCode != other.payCode)
			return false;
		if (payType == null) {
			if (other.payType != null)
				return false;
		} else if (!payType.equals(other.payType))
			return false;
		if (saveCode == null) {
			if (other.saveCode != null)
				return false;
		} else if (!saveCode.equals(other.saveCode))
			return false;
		if (saveType == null) {
			if (other.saveType != null)
				return false;
		} else if (!saveType.equals(other.saveType))
			return false;
		if (telecomCode != other.telecomCode)
			return false;
		if (telecomName == null) {
			if (other.telecomName != null)
				return false;
		} else if (!telecomName.equals(other.telecomName))
			return false;
		if (termCode != other.termCode)
			return false;
		if (wayCode != other.wayCode)
			return false;
		if (wayType == null) {
			if (other.wayType != null)
				return false;
		} else if (!wayType.equals(other.wayType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Payment [cardCode=" + cardCode + ", cardName=" + cardName
				+ ", payCode=" + payCode + ", payType=" + payType
				+ ", cardSectionCode=" + cardSectionCode + ", cardSectionType="
				+ cardSectionType + ", saveCode=" + saveCode + ", saveType="
				+ saveType + ", telecomCode=" + telecomCode + ", telecomName="
				+ telecomName + ", termCode=" + termCode + ", installmentTerm="
				+ installmentTerm + ", deductionCode=" + deductionCode
				+ ", deductionName=" + deductionName + ", wayCode=" + wayCode
				+ ", wayType=" + wayType + "]";
	}
	
	
}
