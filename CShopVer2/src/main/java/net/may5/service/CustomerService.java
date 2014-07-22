package net.may5.service;

import java.util.List;
import java.util.Map;

import net.may5.dto.Customer;
import net.may5.dto.Zip;


public interface CustomerService {

	/** 고객페이지 */
	public int getAllCustomerCount();					// 가입자 수 -테스트용
	public Customer redundancyCheckId(String cstId);	// ID 중복검사
	
	public List searchZipInfo(Map<String, Object> paramMap); // 주소 검색 - JSON 적용
	public List<Zip> searchZipInfo2(String zipKeyword);	  // 주소 검색 - JSON 적용2
	public Zip searchCstZip(String zipCode);			  // 주소 검색 - 회원정보수정
	public void modifyCstInfo(Customer customer);			// 회원정보수정
	public void insertJoinCst(Customer customer);		// 회원가입

	public Customer loginCst(Customer customer);		// 로그인
	public Customer loginCstInfo(int cstCode);	// 로그인 세션 정보 조회
	
	/** 관리자페이지 */
	public List<Customer> selectAllCstInfo();			// 전체고객 정보 조회
	public List getAllCstInfo(Map<String, Object> paramMap); // JSON Test
	public List<Customer> selectBlackCstInfo();			// 관심고객 정보 조회
	public List<Customer> selectVIPCstInfo();			// VIP고객 정보 조회
	
}
