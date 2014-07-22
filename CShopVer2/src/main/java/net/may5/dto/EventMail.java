package net.may5.dto;

import java.sql.Date;

public class EventMail {

	private int mailCode;			// 글번호
	private Date mailDate;			// 작성날짜
	private String mngId;			// 직원정보.관리ID
	private String mailTitle;		// 제목
	private String mailContents;	// 내용
	
	public int getMailCode() {
		return mailCode;
	}
	public void setMailCode(int mailCode) {
		this.mailCode = mailCode;
	}
	public Date getMailDate() {
		return mailDate;
	}
	public void setMailDate(Date mailDate) {
		this.mailDate = mailDate;
	}
	public String getMngId() {
		return mngId;
	}
	public void setMngId(String mngId) {
		this.mngId = mngId;
	}
	public String getMailTitle() {
		return mailTitle;
	}
	public void setMailTitle(String mailTitle) {
		this.mailTitle = mailTitle;
	}
	public String getMailContents() {
		return mailContents;
	}
	public void setMailContents(String mailContents) {
		this.mailContents = mailContents;
	}
	@Override
	public String toString() {
		return "EventMail [mailCode=" + mailCode + ", mailDate=" + mailDate
				+ ", mngId=" + mngId + ", mailTitle=" + mailTitle
				+ ", mailContents=" + mailContents + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mailCode;
		result = prime * result
				+ ((mailContents == null) ? 0 : mailContents.hashCode());
		result = prime * result
				+ ((mailDate == null) ? 0 : mailDate.hashCode());
		result = prime * result
				+ ((mailTitle == null) ? 0 : mailTitle.hashCode());
		result = prime * result + ((mngId == null) ? 0 : mngId.hashCode());
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
		EventMail other = (EventMail) obj;
		if (mailCode != other.mailCode)
			return false;
		if (mailContents == null) {
			if (other.mailContents != null)
				return false;
		} else if (!mailContents.equals(other.mailContents))
			return false;
		if (mailDate == null) {
			if (other.mailDate != null)
				return false;
		} else if (!mailDate.equals(other.mailDate))
			return false;
		if (mailTitle == null) {
			if (other.mailTitle != null)
				return false;
		} else if (!mailTitle.equals(other.mailTitle))
			return false;
		if (mngId == null) {
			if (other.mngId != null)
				return false;
		} else if (!mngId.equals(other.mngId))
			return false;
		return true;
	}
}
