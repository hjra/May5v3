package net.may5.dto;

public class SizeInfo {

	private String sizeCode;
	private String sizeType;
	private String sizeImg;
	
	public String getSizeCode() {
		return sizeCode;
	}
	public void setSizeCode(String sizeCode) {
		this.sizeCode = sizeCode;
	}
	public String getSizeType() {
		return sizeType;
	}
	public void setSizeType(String sizeType) {
		this.sizeType = sizeType;
	}
	public String getSizeImg() {
		return sizeImg;
	}
	public void setSizeImg(String sizeImg) {
		this.sizeImg = sizeImg;
	}
	@Override
	public String toString() {
		return "SizeInfo [sizeCode=" + sizeCode + ", sizeType=" + sizeType
				+ ", sizeImg=" + sizeImg + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((sizeCode == null) ? 0 : sizeCode.hashCode());
		result = prime * result + ((sizeImg == null) ? 0 : sizeImg.hashCode());
		result = prime * result
				+ ((sizeType == null) ? 0 : sizeType.hashCode());
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
		SizeInfo other = (SizeInfo) obj;
		if (sizeCode == null) {
			if (other.sizeCode != null)
				return false;
		} else if (!sizeCode.equals(other.sizeCode))
			return false;
		if (sizeImg == null) {
			if (other.sizeImg != null)
				return false;
		} else if (!sizeImg.equals(other.sizeImg))
			return false;
		if (sizeType == null) {
			if (other.sizeType != null)
				return false;
		} else if (!sizeType.equals(other.sizeType))
			return false;
		return true;
	}
}
