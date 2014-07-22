package net.may5.dto;

import java.sql.Date;

public class Anniversary {

	private int anvCode;		// 기념일코드
	private String cstCode;		// 고객정보.회원코드
	private Date anvStartDate;	// 시작날짜
	private Date anvEndDate;	// 끝날짜
	private String anvTitle;	// 제목
	private String anvMemo;		// 메모
	
	public int getAnvCode() {
		return anvCode;
	}
	public void setAnvCode(int anvCode) {
		this.anvCode = anvCode;
	}
	public String getCstCode() {
		return cstCode;
	}
	public void setCstCode(String cstCode) {
		this.cstCode = cstCode;
	}
	public Date getAnvStartDate() {
		return anvStartDate;
	}
	public void setAnvStartDate(Date anvStartDate) {
		this.anvStartDate = anvStartDate;
	}
	public Date getAnvEndDate() {
		return anvEndDate;
	}
	public void setAnvEndDate(Date anvEndDate) {
		this.anvEndDate = anvEndDate;
	}
	public String getAnvTitle() {
		return anvTitle;
	}
	public void setAnvTitle(String anvTitle) {
		this.anvTitle = anvTitle;
	}
	public String getAnvMemo() {
		return anvMemo;
	}
	public void setAnvMemo(String anvMemo) {
		this.anvMemo = anvMemo;
	}
	@Override
	public String toString() {
		return "Anniversary [anvCode=" + anvCode + ", cstCode=" + cstCode
				+ ", anvStartDate=" + anvStartDate + ", anvEndDate="
				+ anvEndDate + ", anvTitle=" + anvTitle + ", anvMemo="
				+ anvMemo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anvCode;
		result = prime * result
				+ ((anvEndDate == null) ? 0 : anvEndDate.hashCode());
		result = prime * result + ((anvMemo == null) ? 0 : anvMemo.hashCode());
		result = prime * result
				+ ((anvStartDate == null) ? 0 : anvStartDate.hashCode());
		result = prime * result
				+ ((anvTitle == null) ? 0 : anvTitle.hashCode());
		result = prime * result + ((cstCode == null) ? 0 : cstCode.hashCode());
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
		Anniversary other = (Anniversary) obj;
		if (anvCode != other.anvCode)
			return false;
		if (anvEndDate == null) {
			if (other.anvEndDate != null)
				return false;
		} else if (!anvEndDate.equals(other.anvEndDate))
			return false;
		if (anvMemo == null) {
			if (other.anvMemo != null)
				return false;
		} else if (!anvMemo.equals(other.anvMemo))
			return false;
		if (anvStartDate == null) {
			if (other.anvStartDate != null)
				return false;
		} else if (!anvStartDate.equals(other.anvStartDate))
			return false;
		if (anvTitle == null) {
			if (other.anvTitle != null)
				return false;
		} else if (!anvTitle.equals(other.anvTitle))
			return false;
		if (cstCode == null) {
			if (other.cstCode != null)
				return false;
		} else if (!cstCode.equals(other.cstCode))
			return false;
		return true;
	}
}
