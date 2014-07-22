package net.may5.service;

import java.util.List;
import java.util.Map;

import net.may5.dao.CustomerMapper;
import net.may5.dto.Customer;
import net.may5.dto.Zip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public int getAllCustomerCount() {
		return customerMapper.getAllCustomerCount();
	}

	@Override
	public void insertJoinCst(Customer customer) {
		customerMapper.insertJoinCst(customer);
	}

	@Override
	public List<Customer> selectAllCstInfo() {
		return customerMapper.selectAllCstInfo();
	}

	@Override
	public List<Customer> selectBlackCstInfo() {
		return customerMapper.selectBlackCstInfo();
	}

	@Override
	public List<Customer> selectVIPCstInfo() {
		return customerMapper.selectVIPCstInfo();
	}

	@Override
	public Customer loginCst(Customer customer) {
		return customerMapper.loginCst(customer);
	}

	@Override
	public Customer redundancyCheckId(String cstId) {
		return customerMapper.redundancyCheckId(cstId);
	}

	/* JSON Test */
	@Override
	public List getAllCstInfo(Map<String, Object> paramMap) {
		return customerMapper.getAllCstInfo(paramMap);
	}

	/* 주소 검색 - JSON 적용 */
	@Override
	public List searchZipInfo(Map<String, Object> paramMap) {
		return customerMapper.searchZipInfo(paramMap);
	}

	@Override
	public List<Zip> searchZipInfo2(String zipKeyword) {
		return customerMapper.searchZipInfo2(zipKeyword);
	}

	@Override
	public Zip searchCstZip(String zipCode) {
		return customerMapper.searchCstZip(zipCode);
	}

	@Override
	public void modifyCstInfo(Customer customer) {
		customerMapper.modifyCstInfo(customer);
	}

	@Override
	public Customer loginCstInfo(int cstCode) {
		return customerMapper.loginCstInfo(cstCode);
	}

}
