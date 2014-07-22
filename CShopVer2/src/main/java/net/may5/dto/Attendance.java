package net.may5.dto;

import java.sql.Date;

public class Attendance {

	private int attendanceCode;		// 출석코드
	private String cstCode;			// 고객정보.회원코드
	private Date attendanceDate;	// 출석날짜
	
	public int getAttendanceCode() {
		return attendanceCode;
	}
	public void setAttendanceCode(int attendanceCode) {
		this.attendanceCode = attendanceCode;
	}
	public String getCstCode() {
		return cstCode;
	}
	public void setCstCode(String cstCode) {
		this.cstCode = cstCode;
	}
	public Date getAttendanceDate() {
		return attendanceDate;
	}
	public void setAttendanceDate(Date attendanceDate) {
		this.attendanceDate = attendanceDate;
	}
	@Override
	public String toString() {
		return "Attendance [attendanceCode=" + attendanceCode + ", cstCode="
				+ cstCode + ", attendanceDate=" + attendanceDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attendanceCode;
		result = prime * result
				+ ((attendanceDate == null) ? 0 : attendanceDate.hashCode());
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
		Attendance other = (Attendance) obj;
		if (attendanceCode != other.attendanceCode)
			return false;
		if (attendanceDate == null) {
			if (other.attendanceDate != null)
				return false;
		} else if (!attendanceDate.equals(other.attendanceDate))
			return false;
		if (cstCode == null) {
			if (other.cstCode != null)
				return false;
		} else if (!cstCode.equals(other.cstCode))
			return false;
		return true;
	}
}
