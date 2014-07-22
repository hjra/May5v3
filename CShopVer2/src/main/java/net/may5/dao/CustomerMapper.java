package net.may5.dao;

import java.util.List;
import java.util.Map;

import net.may5.dto.Customer;
import net.may5.dto.Zip;

public interface CustomerMapper {

	/** 고객페이지 */
	
	Integer getAllCustomerCount();			// 가입자 수 - 테스트용
	Customer redundancyCheckId(String cstId); // ID 중복검사

	
	/* 회원가입 */
	List searchZipInfo(Map<String, Object> paramMap); // 주소 검색 - JSON 적용
	List<Zip> searchZipInfo2(String zipKeyword);	  // 주소 검색 - JSON 적용2
	void insertJoinCst(Customer customer);	// 회원가입
	
	
	/* 로그인 */
	Customer loginCst(Customer customer);	// 로그인
	Customer loginCstInfo(int cstCode);		  // 로그인 세션 정보 조회
	
	/* 회원정보수정 */
	Zip searchCstZip(String zipCode);				  // 주소 검색
	void modifyCstInfo(Customer customer);			  // 회원정보수정
	
	
	/** 관리자페이지 */
	List<Customer> selectAllCstInfo();		// 전체고객 정보 조회
	List getAllCstInfo(Map<String, Object> paramMap); // JSON Test
	List<Customer> selectBlackCstInfo();	// 관심고객 정보 조회
	List<Customer> selectVIPCstInfo();		// VIP고객 정보 조회
}
