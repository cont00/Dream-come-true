package com.munggu.org;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class Nanum {
	private String addr;

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getNumber(String lottoNumber) {
		try {
			URL url = new URL("http://www.nlotto.co.kr/common.do?method=getLottoNumber&drwNo=" + lottoNumber);
			URLConnection uc = url.openConnection();
			InputStreamReader isr = new InputStreamReader(uc.getInputStream(), "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String str = "";
			str = br.readLine();
			
//			JSONObject result = new JSONObject(str);
//			System.out.println("보너스번호 = " + result.get("bnusNo"));
//			System.out.println("테스트 = " + result.get("firstAccumamnt"));
//			System.out.println("숫자1 = " + result.get("drwtNo1"));
//			System.out.println("숫자2 = " + result.get("drwtNo6"));
			
			
			return str;
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return "";
//		System.out.println("doA");
	}

	public void doB() {
//		System.out.println("doB");
	}
}
