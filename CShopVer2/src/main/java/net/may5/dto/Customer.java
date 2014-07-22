package net.may5.dto;

import java.sql.Date;

public class Customer {

	private String cstId;					// 회원아이디
	private String cstName;					// 이름
	private String cstPassword;				// 비밀번호
	private String zipCode;					// 우편정보.우편코드
	private String cstDetailAddress;		// 상세주소
	private String cstCP;					// 휴대폰번호
	private String cstEmail;				// E-mail
	private String cstGender;				// 성별
	private Date cstBirthday;				// 생일
	private String cstEmailAgreement;		// E-mail 수신 동의
	private String cstQnAPermission;		// Q&A 쓰기
	private String cstEvaluationPermission;	// 평가 쓰기
	private Date cstJoinDate;				// 가입일
	private Date cstLastVisitDate;			// 최종방문일
	private int cstPostCount;				// 게시글 수
	private String levelCode;				// 고객등급.등급코드
	private int cstCode;					// 회원코드
	
	/* 다른 Table에서 join한 컬럼 */
	private int cntr;						// 회원수
	private String levelName;				// 회원등급명
	
	private String zipNumber;				// 우편번호
	private String sido;					// 시도
	private String sigungu;					// 시군구
	private String dongubmyon;				// 읍면
	private String doromyong;				// 도로명
	private String buildingNum1;			// 건물번호본번
	private String buildingNum2;			// 건물번호부번
	private String sigunguBuildingName;		// 시군구용건물명
	private String dong;					// 법정동명
	private String li;						// 리
	private String jibunNum1;				// 지번본번
	private String jibunNum2;				// 지번부번
	private String zipKeyword;				// 도로명주소(빈칸없음)
	
	public String getCstId() {
		return cstId;
	}
	public void setCstId(String cstId) {
		this.cstId = cstId;
	}
	public String getCstName() {
		return cstName;
	}
	public void setCstName(String cstName) {
		this.cstName = cstName;
	}
	public String getCstPassword() {
		return cstPassword;
	}
	public void setCstPassword(String cstPassword) {
		this.cstPassword = cstPassword;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCstDetailAddress() {
		return cstDetailAddress;
	}
	public void setCstDetailAddress(String cstDetailAddress) {
		this.cstDetailAddress = cstDetailAddress;
	}
	public String getCstCP() {
		return cstCP;
	}
	public void setCstCP(String cstCP) {
		this.cstCP = cstCP;
	}
	public String getCstEmail() {
		return cstEmail;
	}
	public void setCstEmail(String cstEmail) {
		this.cstEmail = cstEmail;
	}
	public String getCstGender() {
		return cstGender;
	}
	public void setCstGender(String cstGender) {
		this.cstGender = cstGender;
	}
	public Date getCstBirthday() {
		return cstBirthday;
	}
	public void setCstBirthday(Date cstBirthday) {
		this.cstBirthday = cstBirthday;
	}
	public String getCstEmailAgreement() {
		return cstEmailAgreement;
	}
	public void setCstEmailAgreement(String cstEmailAgreement) {
		this.cstEmailAgreement = cstEmailAgreement;
	}
	public String getCstQnAPermission() {
		return cstQnAPermission;
	}
	public void setCstQnAPermission(String cstQnAPermission) {
		this.cstQnAPermission = cstQnAPermission;
	}
	public String getCstEvaluationPermission() {
		return cstEvaluationPermission;
	}
	public void setCstEvaluationPermission(String cstEvaluationPermission) {
		this.cstEvaluationPermission = cstEvaluationPermission;
	}
	public Date getCstJoinDate() {
		return cstJoinDate;
	}
	public void setCstJoinDate(Date cstJoinDate) {
		this.cstJoinDate = cstJoinDate;
	}
	public Date getCstLastVisitDate() {
		return cstLastVisitDate;
	}
	public void setCstLastVisitDate(Date cstLastVisitDate) {
		this.cstLastVisitDate = cstLastVisitDate;
	}
	public int getCstPostCount() {
		return cstPostCount;
	}
	public void setCstPostCount(int cstPostCount) {
		this.cstPostCount = cstPostCount;
	}
	public String getLevelCode() {
		return levelCode;
	}
	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}
	public int getCstCode() {
		return cstCode;
	}
	public void setCstCode(int cstCode) {
		this.cstCode = cstCode;
	}
	public int getCntr() {
		return cntr;
	}
	public void setCntr(int cntr) {
		this.cntr = cntr;
	}
	public String getLevelName() {
		return levelName;
	}
	public void setLevelName(String levelName) {
		this.levelName = levelName;
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
	public String toString() {
		return "Customer [cstId=" + cstId + ", cstName=" + cstName
				+ ", cstPassword=" + cstPassword + ", zipCode=" + zipCode
				+ ", cstDetailAddress=" + cstDetailAddress + ", cstCP=" + cstCP
				+ ", cstEmail=" + cstEmail + ", cstGender=" + cstGender
				+ ", cstBirthday=" + cstBirthday + ", cstEmailAgreement="
				+ cstEmailAgreement + ", cstQnAPermission=" + cstQnAPermission
				+ ", cstEvaluationPermission=" + cstEvaluationPermission
				+ ", cstJoinDate=" + cstJoinDate + ", cstLastVisitDate="
				+ cstLastVisitDate + ", cstPostCount=" + cstPostCount
				+ ", levelCode=" + levelCode + ", cstCode=" + cstCode
				+ ", cntr=" + cntr + ", levelName=" + levelName
				+ ", zipNumber=" + zipNumber + ", sido=" + sido + ", sigungu="
				+ sigungu + ", dongubmyon=" + dongubmyon + ", doromyong="
				+ doromyong + ", buildingNum1=" + buildingNum1
				+ ", buildingNum2=" + buildingNum2 + ", sigunguBuildingName="
				+ sigunguBuildingName + ", dong=" + dong + ", li=" + li
				+ ", jibunNum1=" + jibunNum1 + ", jibunNum2=" + jibunNum2
				+ ", zipKeyword=" + zipKeyword + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((buildingNum1 == null) ? 0 : buildingNum1.hashCode());
		result = prime * result
				+ ((buildingNum2 == null) ? 0 : buildingNum2.hashCode());
		result = prime * result + cntr;
		result = prime * result
				+ ((cstBirthday == null) ? 0 : cstBirthday.hashCode());
		result = prime * result + ((cstCP == null) ? 0 : cstCP.hashCode());
		result = prime * result + cstCode;
		result = prime
				* result
				+ ((cstDetailAddress == null) ? 0 : cstDetailAddress.hashCode());
		result = prime * result
				+ ((cstEmail == null) ? 0 : cstEmail.hashCode());
		result = prime
				* result
				+ ((cstEmailAgreement == null) ? 0 : cstEmailAgreement
						.hashCode());
		result = prime
				* result
				+ ((cstEvaluationPermission == null) ? 0
						: cstEvaluationPermission.hashCode());
		result = prime * result
				+ ((cstGender == null) ? 0 : cstGender.hashCode());
		result = prime * result + ((cstId == null) ? 0 : cstId.hashCode());
		result = prime * result
				+ ((cstJoinDate == null) ? 0 : cstJoinDate.hashCode());
		result = prime
				* result
				+ ((cstLastVisitDate == null) ? 0 : cstLastVisitDate.hashCode());
		result = prime * result + ((cstName == null) ? 0 : cstName.hashCode());
		result = prime * result
				+ ((cstPassword == null) ? 0 : cstPassword.hashCode());
		result = prime * result + cstPostCount;
		result = prime
				* result
				+ ((cstQnAPermission == null) ? 0 : cstQnAPermission.hashCode());
		result = prime * result + ((dong == null) ? 0 : dong.hashCode());
		result = prime * result
				+ ((dongubmyon == null) ? 0 : dongubmyon.hashCode());
		result = prime * result
				+ ((doromyong == null) ? 0 : doromyong.hashCode());
		result = prime * result
				+ ((jibunNum1 == null) ? 0 : jibunNum1.hashCode());
		result = prime * result
				+ ((jibunNum2 == null) ? 0 : jibunNum2.hashCode());
		result = prime * result
				+ ((levelCode == null) ? 0 : levelCode.hashCode());
		result = prime * result
				+ ((levelName == null) ? 0 : levelName.hashCode());
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
		Customer other = (Customer) obj;
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
		if (cntr != other.cntr)
			return false;
		if (cstBirthday == null) {
			if (other.cstBirthday != null)
				return false;
		} else if (!cstBirthday.equals(other.cstBirthday))
			return false;
		if (cstCP == null) {
			if (other.cstCP != null)
				return false;
		} else if (!cstCP.equals(other.cstCP))
			return false;
		if (cstCode != other.cstCode)
			return false;
		if (cstDetailAddress == null) {
			if (other.cstDetailAddress != null)
				return false;
		} else if (!cstDetailAddress.equals(other.cstDetailAddress))
			return false;
		if (cstEmail == null) {
			if (other.cstEmail != null)
				return false;
		} else if (!cstEmail.equals(other.cstEmail))
			return false;
		if (cstEmailAgreement == null) {
			if (other.cstEmailAgreement != null)
				return false;
		} else if (!cstEmailAgreement.equals(other.cstEmailAgreement))
			return false;
		if (cstEvaluationPermission == null) {
			if (other.cstEvaluationPermission != null)
				return false;
		} else if (!cstEvaluationPermission
				.equals(other.cstEvaluationPermission))
			return false;
		if (cstGender == null) {
			if (other.cstGender != null)
				return false;
		} else if (!cstGender.equals(other.cstGender))
			return false;
		if (cstId == null) {
			if (other.cstId != null)
				return false;
		} else if (!cstId.equals(other.cstId))
			return false;
		if (cstJoinDate == null) {
			if (other.cstJoinDate != null)
				return false;
		} else if (!cstJoinDate.equals(other.cstJoinDate))
			return false;
		if (cstLastVisitDate == null) {
			if (other.cstLastVisitDate != null)
				return false;
		} else if (!cstLastVisitDate.equals(other.cstLastVisitDate))
			return false;
		if (cstName == null) {
			if (other.cstName != null)
				return false;
		} else if (!cstName.equals(other.cstName))
			return false;
		if (cstPassword == null) {
			if (other.cstPassword != null)
				return false;
		} else if (!cstPassword.equals(other.cstPassword))
			return false;
		if (cstPostCount != other.cstPostCount)
			return false;
		if (cstQnAPermission == null) {
			if (other.cstQnAPermission != null)
				return false;
		} else if (!cstQnAPermission.equals(other.cstQnAPermission))
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
		if (levelCode == null) {
			if (other.levelCode != null)
				return false;
		} else if (!levelCode.equals(other.levelCode))
			return false;
		if (levelName == null) {
			if (other.levelName != null)
				return false;
		} else if (!levelName.equals(other.levelName))
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
}
