package com.AngButter.dialysisLounge;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;

@SpringBootTest
class DialysisLoungeApplicationTests {

	@Autowired
	private AddressRepository addressRepository;

	@Test
	void testJpa() {
		Address a1 = new Address();
		a1.setHospitalName("연세한마음내과의원");
		a1.setAddress("서울 강동구 양재대로");
		a1.setDAddress("1486 정남빌딩 4층");
		a1.setLatitude(37.538376);
		a1.setLongitude(127.140488);
		a1.setOpeningTime(LocalTime.of(9,0));
		a1.setClosingTime(LocalTime.of(17,30));
		this.addressRepository.save(a1);
	}

}
