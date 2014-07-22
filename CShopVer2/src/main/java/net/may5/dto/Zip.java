package net.may5.dto;

public class Zip {

	private String zipCode;				// 우편코드
	private String zipNumber;			// 우편번호
	private String sido;				// 시도
	private String sigungu;				// 시군구
	private String dongubmyon;			// 읍면
	private String doromyong;			// 도로명
	private String buildingNum1;		// 건물번호본번
	private String buildingNum2;		// 건물번호부번
	private String sigunguBuildingName;	// 시군구용건물명
	private String dong;				// 법정동명
	private String li;					// 리
	private String jibunNum1;			// 지번본번
	private String jibunNum2;			// 지번부번

	/* DB에서 가공해서 가져올 DATA */
	private String zipKeyword;			// 도로명 주소 검색
	
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getZipNumber() {
		return zipNumber;
	}

	public void setZipNumber(String zipNumber) {
		this.zipNumber = zipNumber;
	}

	public String getSido() {
		return sido;
	}

	public void setSido(String sido) {
		this.sido = sido;
	}

	public String getSigungu() {
		return sigungu;
	}

	public void setSigungu(String sigungu) {
		this.sigungu = sigungu;
	}

	public String getDongubmyon() {
		return dongubmyon;
	}

	public void setDongubmyon(String dongubmyon) {
		this.dongubmyon = dongubmyon;
	}

	public String getDoromyong() {
		return doromyong;
	}

	public void setDoromyong(String doromyong) {
		this.doromyong = doromyong;
	}

	public String getBuildingNum1() {
		return buildingNum1;
	}

	public void setBuildingNum1(String buildingNum1) {
		this.buildingNum1 = buildingNum1;
	}

	public String getBuildingNum2() {
		return buildingNum2;
	}

	public void setBuildingNum2(String buildingNum2) {
		this.buildingNum2 = buildingNum2;
	}

	public String getSigunguBuildingName() {
		return sigunguBuildingName;
	}

	public void setSigunguBuildingName(String sigunguBuildingName) {
		this.sigunguBuildingName = sigunguBuildingName;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public String getLi() {
		return li;
	}

	public void setLi(String li) {
		this.li = li;
	}

	public String getJibunNum1() {
		return jibunNum1;
	}

	public void setJibunNum1(String jibunNum1) {
		this.jibunNum1 = jibunNum1;
	}

	public String getJibunNum2() {
		return jibunNum2;
	}

	public void setJibunNum2(String jibunNum2) {
		this.jibunNum2 = jibunNum2;
	}

	public String getZipKeyword() {
		return zipKeyword;
	}

	public void setZipKeyword(String zipKeyword) {
		this.zipKeyword = zipKeyword;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((buildingNum1 == null) ? 0 : buildingNum1.hashCode());
		result = prime * result
				+ ((buildingNum2 == null) ? 0 : buildingNum2.hashCode());
		result = prime * result + ((dong == null) ? 0 : dong.hashCode());
		result = prime * result
				+ ((dongubmyon == null) ? 0 : dongubmyon.hashCode());
		result = prime * result
				+ ((doromyong == null) ? 0 : doromyong.hashCode());
		result = prime * result
				+ ((jibunNum1 == null) ? 0 : jibunNum1.hashCode());
		result = prime * result
				+ ((jibunNum2 == null) ? 0 : jibunNum2.hashCode());
		result = prime * result + ((li == null) ? 0 : li.hashCode());
		result = prime * result + ((sido == null) ? 0 : sido.hashCode());
		result = prime * result + ((sigungu == null) ? 0 : sigungu.hashCode());
		result = prime
				* result
				+ ((sigunguBuildingName == null) ? 0 : sigunguBuildingName
						.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		result = prime * result
				+ ((zipKeyword == null) ? 0 : zipKeyword.hashCode());
		result = prime * result
				+ ((zipNumber == null) ? 0 : zipNumber.hashCode());
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
		Zip other = (Zip) obj;
		if (buildingNum1 == null) {
			if (other.buildingNum1 != null)
				return false;
		} else if (!buildingNum1.equals(other.buildingNum1))
			return false;
		if (buildingNum2 == null) {
			if (other.buildingNum2 != null)
				return false;
		} else if (!buildingNum2.equals(other.buildingNum2))
			return false;
		if (dong == null) {
			if (other.dong != null)
				return false;
		} else if (!dong.equals(other.dong))
			return false;
		if (dongubmyon == null) {
			if (other.dongubmyon != null)
				return false;
		} else if (!dongubmyon.equals(other.dongubmyon))
			return false;
		if (doromyong == null) {
			if (other.doromyong != null)
				return false;
		} else if (!doromyong.equals(other.doromyong))
			return false;
		if (jibunNum1 == null) {
			if (other.jibunNum1 != null)
				return false;
		} else if (!jibunNum1.equals(other.jibunNum1))
			return false;
		if (jibunNum2 == null) {
			if (other.jibunNum2 != null)
				return false;
		} else if (!jibunNum2.equals(other.jibunNum2))
			return false;
		if (li == null) {
			if (other.li != null)
				return false;
		} else if (!li.equals(other.li))
			return false;
		if (sido == null) {
			if (other.sido != null)
				return false;
		} else if (!sido.equals(other.sido))
			return false;
		if (sigungu == null) {
			if (other.sigungu != null)
				return false;
		} else if (!sigungu.equals(other.sigungu))
			return false;
		if (sigunguBuildingName == null) {
			if (other.sigunguBuildingName != null)
				return false;
		} else if (!sigunguBuildingName.equals(other.sigunguBuildingName))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		if (zipKeyword == null) {
			if (other.zipKeyword != null)
				return false;
		} else if (!zipKeyword.equals(other.zipKeyword))
			return false;
		if (zipNumber == null) {
			if (other.zipNumber != null)
				return false;
		} else if (!zipNumber.equals(other.zipNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Zip [zipCode=" + zipCode + ", zipNumber=" + zipNumber
				+ ", sido=" + sido + ", sigungu=" + sigungu + ", dongubmyon="
				+ dongubmyon + ", doromyong=" + doromyong + ", buildingNum1="
				+ buildingNum1 + ", buildingNum2=" + buildingNum2
				+ ", sigunguBuildingName=" + sigunguBuildingName + ", dong="
				+ dong + ", li=" + li + ", jibunNum1=" + jibunNum1
				+ ", jibunNum2=" + jibunNum2 + ", zipKeyword=" + zipKeyword
				+ "]";
	}
}
