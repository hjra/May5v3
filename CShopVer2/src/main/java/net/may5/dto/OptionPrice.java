package net.may5.dto;

public class OptionPrice {

	private int optionCode;		// 옵션코드
	private String optionType;	// 항목
	private int optionPrice;	// 금액
	
	public int getOptionCode() {
		return optionCode;
	}
	public void setOptionCode(int optionCode) {
		this.optionCode = optionCode;
	}
	public String getOptionType() {
		return optionType;
	}
	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}
	public int getOptionPrice() {
		return optionPrice;
	}
	public void setOptionPrice(int optionPrice) {
		this.optionPrice = optionPrice;
	}
	@Override
	public String toString() {
		return "OptionPrice [optionCode=" + optionCode + ", optionType="
				+ optionType + ", optionPrice=" + optionPrice + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + optionCode;
		result = prime * result + optionPrice;
		result = prime * result
				+ ((optionType == null) ? 0 : optionType.hashCode());
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
		OptionPrice other = (OptionPrice) obj;
		if (optionCode != other.optionCode)
			return false;
		if (optionPrice != other.optionPrice)
			return false;
		if (optionType == null) {
			if (other.optionType != null)
				return false;
		} else if (!optionType.equals(other.optionType))
			return false;
		return true;
	}
}
