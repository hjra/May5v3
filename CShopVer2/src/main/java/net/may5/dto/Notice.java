package net.may5.dto;

public class Notice {

	private int noticeCode;		// 알리미코드
	private String noticeType;	// 항목
	
	public int getNoticeCode() {
		return noticeCode;
	}
	public void setNoticeCode(int noticeCode) {
		this.noticeCode = noticeCode;
	}
	public String getNoticeType() {
		return noticeType;
	}
	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}
	@Override
	public String toString() {
		return "Notice [noticeCode=" + noticeCode + ", noticeType="
				+ noticeType + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noticeCode;
		result = prime * result
				+ ((noticeType == null) ? 0 : noticeType.hashCode());
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
		Notice other = (Notice) obj;
		if (noticeCode != other.noticeCode)
			return false;
		if (noticeType == null) {
			if (other.noticeType != null)
				return false;
		} else if (!noticeType.equals(other.noticeType))
			return false;
		return true;
	}
}
