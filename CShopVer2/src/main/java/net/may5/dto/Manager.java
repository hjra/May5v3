package net.may5.dto;

public class Manager {
	
	private String mngId;					// 관리ID
	private String mngPassword;				// 비밀번호
	private String mngRank;					// 직급
	private String mngName;					// 이름
	private String mngCP;					// H.P
	private String mngPhone;				// 자택번호
	private String mngEmail;				// 이메일
	private String mngAddress;				// 주소
	private String mngEditPermission;		// 관리ID 권한설정(Edit)
	private String sttPermission;			// 통계정보 권한부여
	private String mngInfoPermission;		// 직원정보 권한부여(select)
	private String boardAccessPermission;	// 게시판접근 권한부여
	private String cstInfoPermission;		// 고객정보 권한부여
	private String orderInfoPermission;		// 주문정보 권한부여
	private String dlvInfoPermission;		// 배송정보 권한부여
	private String itemInfoPermission;		// 상품정보 권한부여
	
	public String getMngId() {
		return mngId;
	}
	public void setMngId(String mngId) {
		this.mngId = mngId;
	}
	public String getMngPassword() {
		return mngPassword;
	}
	public void setMngPassword(String mngPassword) {
		this.mngPassword = mngPassword;
	}
	public String getMngRank() {
		return mngRank;
	}
	public void setMngRank(String mngRank) {
		this.mngRank = mngRank;
	}
	public String getMngName() {
		return mngName;
	}
	public void setMngName(String mngName) {
		this.mngName = mngName;
	}
	public String getMngCP() {
		return mngCP;
	}
	public void setMngCP(String mngCP) {
		this.mngCP = mngCP;
	}
	public String getMngPhone() {
		return mngPhone;
	}
	public void setMngPhone(String mngPhone) {
		this.mngPhone = mngPhone;
	}
	public String getMngEmail() {
		return mngEmail;
	}
	public void setMngEmail(String mngEmail) {
		this.mngEmail = mngEmail;
	}
	public String getMngAddress() {
		return mngAddress;
	}
	public void setMngAddress(String mngAddress) {
		this.mngAddress = mngAddress;
	}
	public String getMngEditPermission() {
		return mngEditPermission;
	}
	public void setMngEditPermission(String mngEditPermission) {
		this.mngEditPermission = mngEditPermission;
	}
	public String getSttPermission() {
		return sttPermission;
	}
	public void setSttPermission(String sttPermission) {
		this.sttPermission = sttPermission;
	}
	public String getMngInfoPermission() {
		return mngInfoPermission;
	}
	public void setMngInfoPermission(String mngInfoPermission) {
		this.mngInfoPermission = mngInfoPermission;
	}
	public String getBoardAccessPermission() {
		return boardAccessPermission;
	}
	public void setBoardAccessPermission(String boardAccessPermission) {
		this.boardAccessPermission = boardAccessPermission;
	}
	public String getCstInfoPermission() {
		return cstInfoPermission;
	}
	public void setCstInfoPermission(String cstInfoPermission) {
		this.cstInfoPermission = cstInfoPermission;
	}
	public String getOrderInfoPermission() {
		return orderInfoPermission;
	}
	public void setOrderInfoPermission(String orderInfoPermission) {
		this.orderInfoPermission = orderInfoPermission;
	}
	public String getDlvInfoPermission() {
		return dlvInfoPermission;
	}
	public void setDlvInfoPermission(String dlvInfoPermission) {
		this.dlvInfoPermission = dlvInfoPermission;
	}
	public String getItemInfoPermission() {
		return itemInfoPermission;
	}
	public void setItemInfoPermission(String itemInfoPermission) {
		this.itemInfoPermission = itemInfoPermission;
	}
	@Override
	public String toString() {
		return "Manager [mngId=" + mngId + ", mngPassword=" + mngPassword
				+ ", mngRank=" + mngRank + ", mngName=" + mngName + ", mngCP="
				+ mngCP + ", mngPhone=" + mngPhone + ", mngEmail=" + mngEmail
				+ ", mngAddress=" + mngAddress + ", mngEditPermission="
				+ mngEditPermission + ", sttPermission=" + sttPermission
				+ ", mngInfoPermission=" + mngInfoPermission
				+ ", boardAccessPermission=" + boardAccessPermission
				+ ", cstInfoPermission=" + cstInfoPermission
				+ ", orderInfoPermission=" + orderInfoPermission
				+ ", dlvInfoPermission=" + dlvInfoPermission
				+ ", itemInfoPermission=" + itemInfoPermission + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((boardAccessPermission == null) ? 0 : boardAccessPermission
						.hashCode());
		result = prime
				* result
				+ ((cstInfoPermission == null) ? 0 : cstInfoPermission
						.hashCode());
		result = prime
				* result
				+ ((dlvInfoPermission == null) ? 0 : dlvInfoPermission
						.hashCode());
		result = prime
				* result
				+ ((itemInfoPermission == null) ? 0 : itemInfoPermission
						.hashCode());
		result = prime * result
				+ ((mngAddress == null) ? 0 : mngAddress.hashCode());
		result = prime * result + ((mngCP == null) ? 0 : mngCP.hashCode());
		result = prime
				* result
				+ ((mngEditPermission == null) ? 0 : mngEditPermission
						.hashCode());
		result = prime * result
				+ ((mngEmail == null) ? 0 : mngEmail.hashCode());
		result = prime * result + ((mngId == null) ? 0 : mngId.hashCode());
		result = prime
				* result
				+ ((mngInfoPermission == null) ? 0 : mngInfoPermission
						.hashCode());
		result = prime * result + ((mngName == null) ? 0 : mngName.hashCode());
		result = prime * result
				+ ((mngPassword == null) ? 0 : mngPassword.hashCode());
		result = prime * result
				+ ((mngPhone == null) ? 0 : mngPhone.hashCode());
		result = prime * result + ((mngRank == null) ? 0 : mngRank.hashCode());
		result = prime
				* result
				+ ((orderInfoPermission == null) ? 0 : orderInfoPermission
						.hashCode());
		result = prime * result
				+ ((sttPermission == null) ? 0 : sttPermission.hashCode());
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
		Manager other = (Manager) obj;
		if (boardAccessPermission == null) {
			if (other.boardAccessPermission != null)
				return false;
		} else if (!boardAccessPermission.equals(other.boardAccessPermission))
			return false;
		if (cstInfoPermission == null) {
			if (other.cstInfoPermission != null)
				return false;
		} else if (!cstInfoPermission.equals(other.cstInfoPermission))
			return false;
		if (dlvInfoPermission == null) {
			if (other.dlvInfoPermission != null)
				return false;
		} else if (!dlvInfoPermission.equals(other.dlvInfoPermission))
			return false;
		if (itemInfoPermission == null) {
			if (other.itemInfoPermission != null)
				return false;
		} else if (!itemInfoPermission.equals(other.itemInfoPermission))
			return false;
		if (mngAddress == null) {
			if (other.mngAddress != null)
				return false;
		} else if (!mngAddress.equals(other.mngAddress))
			return false;
		if (mngCP == null) {
			if (other.mngCP != null)
				return false;
		} else if (!mngCP.equals(other.mngCP))
			return false;
		if (mngEditPermission == null) {
			if (other.mngEditPermission != null)
				return false;
		} else if (!mngEditPermission.equals(other.mngEditPermission))
			return false;
		if (mngEmail == null) {
			if (other.mngEmail != null)
				return false;
		} else if (!mngEmail.equals(other.mngEmail))
			return false;
		if (mngId == null) {
			if (other.mngId != null)
				return false;
		} else if (!mngId.equals(other.mngId))
			return false;
		if (mngInfoPermission == null) {
			if (other.mngInfoPermission != null)
				return false;
		} else if (!mngInfoPermission.equals(other.mngInfoPermission))
			return false;
		if (mngName == null) {
			if (other.mngName != null)
				return false;
		} else if (!mngName.equals(other.mngName))
			return false;
		if (mngPassword == null) {
			if (other.mngPassword != null)
				return false;
		} else if (!mngPassword.equals(other.mngPassword))
			return false;
		if (mngPhone == null) {
			if (other.mngPhone != null)
				return false;
		} else if (!mngPhone.equals(other.mngPhone))
			return false;
		if (mngRank == null) {
			if (other.mngRank != null)
				return false;
		} else if (!mngRank.equals(other.mngRank))
			return false;
		if (orderInfoPermission == null) {
			if (other.orderInfoPermission != null)
				return false;
		} else if (!orderInfoPermission.equals(other.orderInfoPermission))
			return false;
		if (sttPermission == null) {
			if (other.sttPermission != null)
				return false;
		} else if (!sttPermission.equals(other.sttPermission))
			return false;
		return true;
	}
}
