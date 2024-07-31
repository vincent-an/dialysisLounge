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
		a1.setPage("https://place.map.kakao.com/1537702311");
		this.addressRepository.save(a1);

		Address a2 = new Address();
		a2.setHospitalName("이정익내과의원");
		a2.setAddress("서울특별시 송파구 석촌호수로");
		a2.setDAddress("61 트리지움상가 5층");
		a2.setLatitude(37.51144);
		a2.setLongitude(127.086096);
		a2.setOpeningTime(LocalTime.of(9,0));
		a2.setClosingTime(LocalTime.of(18,00));
		a2.setPage("https://place.map.kakao.com/8056333");
		this.addressRepository.save(a2);
	}

}
