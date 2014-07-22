package net.may5.dto;

import java.sql.Date;

public class QnA {

	private int boardCode;				// 번호
	private int groupNumber;			// 그룹번호	
	private Date boardDate;				// 등록일자
	private int cstCode;				// 고객정보.회원코드
	private String boardTitle;			// 제목
	private String postPassword;		// 게시글 암호
	private String postContents;		// 게시판 본문
	private String fileName;			// 파일첨부될 이름
	private String fileAddress;			// 파일첨부경로
	private String replyOrder;			// 답변글의순서
	private String saveFolder;			// 저장폴더명
	private String systemFileName;		// 시스템파일명
	private String originalFileName;	// 원래파일명
	private String sequenceNumber;		// 시퀀스넘버	
	
	private String cstId;				
	private int replyCode;				//댓글의 pk  qnacomment에 있다
	private int replyCount;				//게시글의 댓글 순서  qnacomment에 있다
	private String qnaReply;			//게시글의 댓글   qnacomment에 있다
	private Date replyDate;				//게시글 댓글의 날자 qnacomment에 있다
	public int getBoardCode() {
		return boardCode;
	}
	public void setBoardCode(int boardCode) {
		this.boardCode = boardCode;
	}
	public int getGroupNumber() {
		return groupNumber;
	}
	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	public int getCstCode() {
		return cstCode;
	}
	public void setCstCode(int cstCode) {
		this.cstCode = cstCode;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getPostPassword() {
		return postPassword;
	}
	public void setPostPassword(String postPassword) {
		this.postPassword = postPassword;
	}
	public String getPostContents() {
		return postContents;
	}
	public void setPostContents(String postContents) {
		this.postContents = postContents;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileAddress() {
		return fileAddress;
	}
	public void setFileAddress(String fileAddress) {
		this.fileAddress = fileAddress;
	}
	public String getReplyOrder() {
		return replyOrder;
	}
	public void setReplyOrder(String replyOrder) {
		this.replyOrder = replyOrder;
	}
	public String getSaveFolder() {
		return saveFolder;
	}
	public void setSaveFolder(String saveFolder) {
		this.saveFolder = saveFolder;
	}
	public String getSystemFileName() {
		return systemFileName;
	}
	public void setSystemFileName(String systemFileName) {
		this.systemFileName = systemFileName;
	}
	public String getOriginalFileName() {
		return originalFileName;
	}
	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}
	public String getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public String getCstId() {
		return cstId;
	}
	public void setCstId(String cstId) {
		this.cstId = cstId;
	}
	public int getReplyCode() {
		return replyCode;
	}
	public void setReplyCode(int replyCode) {
		this.replyCode = replyCode;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	public String getQnaReply() {
		return qnaReply;
	}
	public void setQnaReply(String qnaReply) {
		this.qnaReply = qnaReply;
	}
	public Date getReplyDate() {
		return replyDate;
	}
	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}
	@Override
	public String toString() {
		return "QnA [boardCode=" + boardCode + ", groupNumber=" + groupNumber
				+ ", boardDate=" + boardDate + ", cstCode=" + cstCode
				+ ", boardTitle=" + boardTitle + ", postPassword="
				+ postPassword + ", postContents=" + postContents
				+ ", fileName=" + fileName + ", fileAddress=" + fileAddress
				+ ", replyOrder=" + replyOrder + ", saveFolder=" + saveFolder
				+ ", systemFileName=" + systemFileName + ", originalFileName="
				+ originalFileName + ", sequenceNumber=" + sequenceNumber
				+ ", cstId=" + cstId + ", replyCode=" + replyCode
				+ ", replyCount=" + replyCount + ", qnaReply=" + qnaReply
				+ ", replyDate=" + replyDate + "]";
	}

	
}
