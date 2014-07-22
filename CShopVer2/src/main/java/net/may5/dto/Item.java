package net.may5.dto;

public class Item {
	
	private String itemId;			// 상품ID
	private String itemName;		// 상품명
	private int itemCalorie;		// 칼로리
	private String itemInfo;		// 상세정보
	private String itemImg1;		// 이미지1
	private String itemImg2;		// 이미지2
	private String itemImg3;		// 이미지3
	private String itemImg4;		// 이미지4
	private String sticker;			// 스티커
	private String price;      // 가격
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemCalorie() {
		return itemCalorie;
	}
	public void setItemCalorie(int itemCalorie) {
		this.itemCalorie = itemCalorie;
	}
	public String getItemInfo() {
		return itemInfo;
	}
	public void setItemInfo(String itemInfo) {
		this.itemInfo = itemInfo;
	}
	public String getItemImg1() {
		return itemImg1;
	}
	public void setItemImg1(String itemImg1) {
		this.itemImg1 = itemImg1;
	}
	public String getItemImg2() {
		return itemImg2;
	}
	public void setItemImg2(String itemImg2) {
		this.itemImg2 = itemImg2;
	}
	public String getItemImg3() {
		return itemImg3;
	}
	public void setItemImg3(String itemImg3) {
		this.itemImg3 = itemImg3;
	}
	public String getItemImg4() {
		return itemImg4;
	}
	public void setItemImg4(String itemImg4) {
		this.itemImg4 = itemImg4;
	}
	public String getSticker() {
		return sticker;
	}
	public void setSticker(String sticker) {
		this.sticker = sticker;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName
				+ ", itemCalorie=" + itemCalorie + ", itemInfo=" + itemInfo
				+ ", itemImg1=" + itemImg1 + ", itemImg2=" + itemImg2
				+ ", itemImg3=" + itemImg3 + ", itemImg4=" + itemImg4
				+ ", sticker=" + sticker + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemCalorie;
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result
				+ ((itemImg1 == null) ? 0 : itemImg1.hashCode());
		result = prime * result
				+ ((itemImg2 == null) ? 0 : itemImg2.hashCode());
		result = prime * result
				+ ((itemImg3 == null) ? 0 : itemImg3.hashCode());
		result = prime * result
				+ ((itemImg4 == null) ? 0 : itemImg4.hashCode());
		result = prime * result
				+ ((itemInfo == null) ? 0 : itemInfo.hashCode());
		result = prime * result
				+ ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((sticker == null) ? 0 : sticker.hashCode());
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
		Item other = (Item) obj;
		if (itemCalorie != other.itemCalorie)
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (itemImg1 == null) {
			if (other.itemImg1 != null)
				return false;
		} else if (!itemImg1.equals(other.itemImg1))
			return false;
		if (itemImg2 == null) {
			if (other.itemImg2 != null)
				return false;
		} else if (!itemImg2.equals(other.itemImg2))
			return false;
		if (itemImg3 == null) {
			if (other.itemImg3 != null)
				return false;
		} else if (!itemImg3.equals(other.itemImg3))
			return false;
		if (itemImg4 == null) {
			if (other.itemImg4 != null)
				return false;
		} else if (!itemImg4.equals(other.itemImg4))
			return false;
		if (itemInfo == null) {
			if (other.itemInfo != null)
				return false;
		} else if (!itemInfo.equals(other.itemInfo))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (sticker == null) {
			if (other.sticker != null)
				return false;
		} else if (!sticker.equals(other.sticker))
			return false;
		return true;
	}

}
