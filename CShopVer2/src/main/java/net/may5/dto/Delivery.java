package net.may5.dto;

public class Delivery {

	private int dlvChargeCode;		// 배송비코드
	private String dlvChargeType;	// 배송비항목
	private int dlvCharge;			// 배송비
	
	public int getDlvChargeCode() {
		return dlvChargeCode;
	}
	public void setDlvChargeCode(int dlvChargeCode) {
		this.dlvChargeCode = dlvChargeCode;
	}
	public String getDlvChargeType() {
		return dlvChargeType;
	}
	public void setDlvChargeType(String dlvChargeType) {
		this.dlvChargeType = dlvChargeType;
	}
	public int getDlvCharge() {
		return dlvCharge;
	}
	public void setDlvCharge(int dlvCharge) {
		this.dlvCharge = dlvCharge;
	}
	@Override
	public String toString() {
		return "Delivery [dlvChargeCode=" + dlvChargeCode + ", dlvChargeType="
				+ dlvChargeType + ", dlvCharge=" + dlvCharge + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dlvCharge;
		result = prime * result + dlvChargeCode;
		result = prime * result
				+ ((dlvChargeType == null) ? 0 : dlvChargeType.hashCode());
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
		Delivery other = (Delivery) obj;
		if (dlvCharge != other.dlvCharge)
			return false;
		if (dlvChargeCode != other.dlvChargeCode)
			return false;
		if (dlvChargeType == null) {
			if (other.dlvChargeType != null)
				return false;
		} else if (!dlvChargeType.equals(other.dlvChargeType))
			return false;
		return true;
	}
}
