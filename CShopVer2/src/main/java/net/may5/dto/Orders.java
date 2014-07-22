
package net.may5.dto;

import java.sql.Date;

public class Orders {
	
	private String orderCode;	// 주문코드
	private Date orderDate;	// 주문날짜(sysdate)
	
	private String sameTimeCount;	// 동시간대카운트
	private int payCode;	// 결제구분.결제코드
	private String payType;	// 결제수단
	private int optionCode;	// 옵션가.옵션코드
	private String optionType;	// 항목
	private int optionPrice;	// 금액
	private int dlvChargeCode;	// 배송비코드
	private int dlvCharge;	// 배송비
	private int noticeCode;	// 알리미.알리미코드
	private int orderAmount;	// 주문수량
	private int pointCode;	// 적립정보.적립코드
	private String zipCode;	// 우편정보.우편코드
	private String zipNumber;	// 우편번호
	private String sido;	// 시도
	private String sigungu;	// 시군구
	private String dongubmyon;	// 읍면
	private String doromyong;	// 도로명
	private String buildingNum1;	// 건물번호본번
	private String buildingNum2;	// 건물번호부번
	private String sigunguBuildingName;	// 시군구용건물명
	private String dong;	// 법정동명
	private String li;	// 리
	private String jibunNum1;	// 지번본번
	private String jibunNum2;	// 지번부번
	private String orderDetailAddress;	// 상세주소
	private String receiverName;	// 수령자
	private String receiverCP;	// 수령자 휴대폰번호
	private String receiverEmail;
	private int stockAmount;	// 입고수량
	private String receiverPhone;	// 수령자 전화번호
	private Date dlvEndDate;	// 배송완료일
	private String sizeCode;	// 크기정보.크기ID
	private String cstCode;	// 고객정보.회원코드
	private String noticeComment;	// 코멘트
	private String noticeImg;	// 촬영이미지
	
	/*db가져오기*/
	private String itemId;	// 상품정보.상품ID
	private String cstId;	// 회원아이디
	private String levelCode;	// 고객등급.등급코드
	private String itemName;	// 상품명
	private int price;	// 가격
	private int itemCnt; //중복된 아이템 카운트
	
	/*상세정보db가져오기*/
	private String cstName;	// 이름
	private String cstCP;	// 휴대폰번호
	private String cstEmail;	// E-mail
	private String noticeType;	// 결제처리
	private String cardMessage;
	private String dlvwarn;
	
	/*payment*/
	private int cardCode;
	private String cardName;
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
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getSameTimeCount() {
		return sameTimeCount;
	}
	public void setSameTimeCount(String sameTimeCount) {
		this.sameTimeCount = sameTimeCount;
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
	public int getDlvChargeCode() {
		return dlvChargeCode;
	}
	public void setDlvChargeCode(int dlvChargeCode) {
		this.dlvChargeCode = dlvChargeCode;
	}
	public int getDlvCharge() {
		return dlvCharge;
	}
	public void setDlvCharge(int dlvCharge) {
		this.dlvCharge = dlvCharge;
	}
	public int getNoticeCode() {
		return noticeCode;
	}
	public void setNoticeCode(int noticeCode) {
		this.noticeCode = noticeCode;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public int getPointCode() {
		return pointCode;
	}
	public void setPointCode(int pointCode) {
		this.pointCode = pointCode;
	}
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
	public String getOrderDetailAddress() {
		return orderDetailAddress;
	}
	public void setOrderDetailAddress(String orderDetailAddress) {
		this.orderDetailAddress = orderDetailAddress;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverCP() {
		return receiverCP;
	}
	public void setReceiverCP(String receiverCP) {
		this.receiverCP = receiverCP;
	}
	public String getReceiverEmail() {
		return receiverEmail;
	}
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public Date getDlvEndDate() {
		return dlvEndDate;
	}
	public void setDlvEndDate(Date dlvEndDate) {
		this.dlvEndDate = dlvEndDate;
	}
	public String getSizeCode() {
		return sizeCode;
	}
	public void setSizeCode(String sizeCode) {
		this.sizeCode = sizeCode;
	}
	public String getCstCode() {
		return cstCode;
	}
	public void setCstCode(String cstCode) {
		this.cstCode = cstCode;
	}
	public String getNoticeComment() {
		return noticeComment;
	}
	public void setNoticeComment(String noticeComment) {
		this.noticeComment = noticeComment;
	}
	public String getNoticeImg() {
		return noticeImg;
	}
	public void setNoticeImg(String noticeImg) {
		this.noticeImg = noticeImg;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getCstId() {
		return cstId;
	}
	public void setCstId(String cstId) {
		this.cstId = cstId;
	}
	public String getLevelCode() {
		return levelCode;
	}
	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getItemCnt() {
		return itemCnt;
	}
	public void setItemCnt(int itemCnt) {
		this.itemCnt = itemCnt;
	}
	public String getCstName() {
		return cstName;
	}
	public void setCstName(String cstName) {
		this.cstName = cstName;
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
	public String getNoticeType() {
		return noticeType;
	}
	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}
	public String getCardMessage() {
		return cardMessage;
	}
	public void setCardMessage(String cardMessage) {
		this.cardMessage = cardMessage;
	}
	public String getDlvwarn() {
		return dlvwarn;
	}
	public void setDlvwarn(String dlvwarn) {
		this.dlvwarn = dlvwarn;
	}
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
		result = prime * result
				+ ((buildingNum1 == null) ? 0 : buildingNum1.hashCode());
		result = prime * result
				+ ((buildingNum2 == null) ? 0 : buildingNum2.hashCode());
		result = prime * result + cardCode;
		result = prime * result
				+ ((cardMessage == null) ? 0 : cardMessage.hashCode());
		result = prime * result
				+ ((cardName == null) ? 0 : cardName.hashCode());
		result = prime * result + cardSectionCode;
		result = prime * result
				+ ((cardSectionType == null) ? 0 : cardSectionType.hashCode());
		result = prime * result + ((cstCP == null) ? 0 : cstCP.hashCode());
		result = prime * result + ((cstCode == null) ? 0 : cstCode.hashCode());
		result = prime * result
				+ ((cstEmail == null) ? 0 : cstEmail.hashCode());
		result = prime * result + ((cstId == null) ? 0 : cstId.hashCode());
		result = prime * result + ((cstName == null) ? 0 : cstName.hashCode());
		result = prime * result + deductionCode;
		result = prime * result
				+ ((deductionName == null) ? 0 : deductionName.hashCode());
		result = prime * result + dlvCharge;
		result = prime * result + dlvChargeCode;
		result = prime * result
				+ ((dlvEndDate == null) ? 0 : dlvEndDate.hashCode());
		result = prime * result + ((dlvwarn == null) ? 0 : dlvwarn.hashCode());
		result = prime * result + ((dong == null) ? 0 : dong.hashCode());
		result = prime * result
				+ ((dongubmyon == null) ? 0 : dongubmyon.hashCode());
		result = prime * result
				+ ((doromyong == null) ? 0 : doromyong.hashCode());
		result = prime * result
				+ ((installmentTerm == null) ? 0 : installmentTerm.hashCode());
		result = prime * result + itemCnt;
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result
				+ ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result
				+ ((jibunNum1 == null) ? 0 : jibunNum1.hashCode());
		result = prime * result
				+ ((jibunNum2 == null) ? 0 : jibunNum2.hashCode());
		result = prime * result
				+ ((levelCode == null) ? 0 : levelCode.hashCode());
		result = prime * result + ((li == null) ? 0 : li.hashCode());
		result = prime * result + noticeCode;
		result = prime * result
				+ ((noticeComment == null) ? 0 : noticeComment.hashCode());
		result = prime * result
				+ ((noticeImg == null) ? 0 : noticeImg.hashCode());
		result = prime * result
				+ ((noticeType == null) ? 0 : noticeType.hashCode());
		result = prime * result + optionCode;
		result = prime * result + optionPrice;
		result = prime * result
				+ ((optionType == null) ? 0 : optionType.hashCode());
		result = prime * result + orderAmount;
		result = prime * result
				+ ((orderCode == null) ? 0 : orderCode.hashCode());
		result = prime * result
				+ ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime
				* result
				+ ((orderDetailAddress == null) ? 0 : orderDetailAddress
						.hashCode());
		result = prime * result + payCode;
		result = prime * result + ((payType == null) ? 0 : payType.hashCode());
		result = prime * result + pointCode;
		result = prime * result + price;
		result = prime * result
				+ ((receiverCP == null) ? 0 : receiverCP.hashCode());
		result = prime * result
				+ ((receiverEmail == null) ? 0 : receiverEmail.hashCode());
		result = prime * result
				+ ((receiverName == null) ? 0 : receiverName.hashCode());
		result = prime * result
				+ ((receiverPhone == null) ? 0 : receiverPhone.hashCode());
		result = prime * result
				+ ((sameTimeCount == null) ? 0 : sameTimeCount.hashCode());
		result = prime * result
				+ ((saveCode == null) ? 0 : saveCode.hashCode());
		result = prime * result
				+ ((saveType == null) ? 0 : saveType.hashCode());
		result = prime * result + ((sido == null) ? 0 : sido.hashCode());
		result = prime * result + ((sigungu == null) ? 0 : sigungu.hashCode());
		result = prime
				* result
				+ ((sigunguBuildingName == null) ? 0 : sigunguBuildingName
						.hashCode());
		result = prime * result
				+ ((sizeCode == null) ? 0 : sizeCode.hashCode());
		result = prime * result + stockAmount;
		result = prime * result + telecomCode;
		result = prime * result
				+ ((telecomName == null) ? 0 : telecomName.hashCode());
		result = prime * result + termCode;
		result = prime * result + wayCode;
		result = prime * result + ((wayType == null) ? 0 : wayType.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
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
		Orders other = (Orders) obj;
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
		if (cardCode != other.cardCode)
			return false;
		if (cardMessage == null) {
			if (other.cardMessage != null)
				return false;
		} else if (!cardMessage.equals(other.cardMessage))
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
		if (cstCP == null) {
			if (other.cstCP != null)
				return false;
		} else if (!cstCP.equals(other.cstCP))
			return false;
		if (cstCode == null) {
			if (other.cstCode != null)
				return false;
		} else if (!cstCode.equals(other.cstCode))
			return false;
		if (cstEmail == null) {
			if (other.cstEmail != null)
				return false;
		} else if (!cstEmail.equals(other.cstEmail))
			return false;
		if (cstId == null) {
			if (other.cstId != null)
				return false;
		} else if (!cstId.equals(other.cstId))
			return false;
		if (cstName == null) {
			if (other.cstName != null)
				return false;
		} else if (!cstName.equals(other.cstName))
			return false;
		if (deductionCode != other.deductionCode)
			return false;
		if (deductionName == null) {
			if (other.deductionName != null)
				return false;
		} else if (!deductionName.equals(other.deductionName))
			return false;
		if (dlvCharge != other.dlvCharge)
			return false;
		if (dlvChargeCode != other.dlvChargeCode)
			return false;
		if (dlvEndDate == null) {
			if (other.dlvEndDate != null)
				return false;
		} else if (!dlvEndDate.equals(other.dlvEndDate))
			return false;
		if (dlvwarn == null) {
			if (other.dlvwarn != null)
				return false;
		} else if (!dlvwarn.equals(other.dlvwarn))
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
		if (installmentTerm == null) {
			if (other.installmentTerm != null)
				return false;
		} else if (!installmentTerm.equals(other.installmentTerm))
			return false;
		if (itemCnt != other.itemCnt)
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
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
		if (li == null) {
			if (other.li != null)
				return false;
		} else if (!li.equals(other.li))
			return false;
		if (noticeCode != other.noticeCode)
			return false;
		if (noticeComment == null) {
			if (other.noticeComment != null)
				return false;
		} else if (!noticeComment.equals(other.noticeComment))
			return false;
		if (noticeImg == null) {
			if (other.noticeImg != null)
				return false;
		} else if (!noticeImg.equals(other.noticeImg))
			return false;
		if (noticeType == null) {
			if (other.noticeType != null)
				return false;
		} else if (!noticeType.equals(other.noticeType))
			return false;
		if (optionCode != other.optionCode)
			return false;
		if (optionPrice != other.optionPrice)
			return false;
		if (optionType == null) {
			if (other.optionType != null)
				return false;
		} else if (!optionType.equals(other.optionType))
			return false;
		if (orderAmount != other.orderAmount)
			return false;
		if (orderCode == null) {
			if (other.orderCode != null)
				return false;
		} else if (!orderCode.equals(other.orderCode))
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (orderDetailAddress == null) {
			if (other.orderDetailAddress != null)
				return false;
		} else if (!orderDetailAddress.equals(other.orderDetailAddress))
			return false;
		if (payCode != other.payCode)
			return false;
		if (payType == null) {
			if (other.payType != null)
				return false;
		} else if (!payType.equals(other.payType))
			return false;
		if (pointCode != other.pointCode)
			return false;
		if (price != other.price)
			return false;
		if (receiverCP == null) {
			if (other.receiverCP != null)
				return false;
		} else if (!receiverCP.equals(other.receiverCP))
			return false;
		if (receiverEmail == null) {
			if (other.receiverEmail != null)
				return false;
		} else if (!receiverEmail.equals(other.receiverEmail))
			return false;
		if (receiverName == null) {
			if (other.receiverName != null)
				return false;
		} else if (!receiverName.equals(other.receiverName))
			return false;
		if (receiverPhone == null) {
			if (other.receiverPhone != null)
				return false;
		} else if (!receiverPhone.equals(other.receiverPhone))
			return false;
		if (sameTimeCount == null) {
			if (other.sameTimeCount != null)
				return false;
		} else if (!sameTimeCount.equals(other.sameTimeCount))
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
		if (sizeCode == null) {
			if (other.sizeCode != null)
				return false;
		} else if (!sizeCode.equals(other.sizeCode))
			return false;
		if (stockAmount != other.stockAmount)
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
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
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
		return "Orders [orderCode=" + orderCode + ", orderDate=" + orderDate
				+ ", sameTimeCount=" + sameTimeCount + ", payCode=" + payCode
				+ ", payType=" + payType + ", optionCode=" + optionCode
				+ ", optionType=" + optionType + ", optionPrice=" + optionPrice
				+ ", dlvChargeCode=" + dlvChargeCode + ", dlvCharge="
				+ dlvCharge + ", noticeCode=" + noticeCode + ", orderAmount="
				+ orderAmount + ", pointCode=" + pointCode + ", zipCode="
				+ zipCode + ", zipNumber=" + zipNumber + ", sido=" + sido
				+ ", sigungu=" + sigungu + ", dongubmyon=" + dongubmyon
				+ ", doromyong=" + doromyong + ", buildingNum1=" + buildingNum1
				+ ", buildingNum2=" + buildingNum2 + ", sigunguBuildingName="
				+ sigunguBuildingName + ", dong=" + dong + ", li=" + li
				+ ", jibunNum1=" + jibunNum1 + ", jibunNum2=" + jibunNum2
				+ ", orderDetailAddress=" + orderDetailAddress
				+ ", receiverName=" + receiverName + ", receiverCP="
				+ receiverCP + ", receiverEmail=" + receiverEmail
				+ ", stockAmount=" + stockAmount + ", receiverPhone="
				+ receiverPhone + ", dlvEndDate=" + dlvEndDate + ", sizeCode="
				+ sizeCode + ", cstCode=" + cstCode + ", noticeComment="
				+ noticeComment + ", noticeImg=" + noticeImg + ", itemId="
				+ itemId + ", cstId=" + cstId + ", levelCode=" + levelCode
				+ ", itemName=" + itemName + ", price=" + price + ", itemCnt="
				+ itemCnt + ", cstName=" + cstName + ", cstCP=" + cstCP
				+ ", cstEmail=" + cstEmail + ", noticeType=" + noticeType
				+ ", cardMessage=" + cardMessage + ", dlvwarn=" + dlvwarn
				+ ", cardCode=" + cardCode + ", cardName=" + cardName
				+ ", cardSectionCode=" + cardSectionCode + ", cardSectionType="
				+ cardSectionType + ", saveCode=" + saveCode + ", saveType="
				+ saveType + ", telecomCode=" + telecomCode + ", telecomName="
				+ telecomName + ", termCode=" + termCode + ", installmentTerm="
				+ installmentTerm + ", deductionCode=" + deductionCode
				+ ", deductionName=" + deductionName + ", wayCode=" + wayCode
				+ ", wayType=" + wayType + "]";
	}
	
	
}