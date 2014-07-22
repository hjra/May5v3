package net.may5.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import net.may5.dto.QnA;

public interface QnAMapper {

	public List<QnA> qnaGetList();
	public List<QnA> qnaGetList2();//DB에서 게시글 정보를가지고와서 board.jsp 뿌려주는데의 메서드명
	//public List<QnA> qnaReplyList(int boardCode);
	public QnA qnaGetContents(int boardCode);//게시글 수정할때 수정폼에 게시글정보를 가지고오는 메소드명
	public void writeProc(@Param("boardTitle") String  boardTitle,
			@Param("postContents") String  postContents, @Param("postPassword") String postPassword  ,
			@Param("cstCode")  int cstCode );
	void deleteBoard(int boardCode);//게시글삭제
	void updateBoard(QnA qna); 
	QnA getBoard(int boardCode);
	public void setReply(QnA qna);
	public void mngReply(QnA qna);
	public QnA getQnAContent(int boardCode);
	public List<QnA> getQnAContentReplies(int boardCode);
}