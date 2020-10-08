package kr.or.ddit.cookie;

import static org.junit.Assert.*;

import org.junit.Test;

public class CookieSpliteTest {

	@Test
	public void getCookieValuesSuccessTest() {
		/***Given***/
		CookieSplit cookieSplit = new CookieSplit();
		/***When***/
		String cookieValue =  cookieSplit.getCookieValue("USERNM");
		/***Then***/
		assertEquals("brown", cookieValue);
	}
	@Test
	public void getCookieValuesFailTest() {
		/***Given***/
		CookieSplit cookieSplit = new CookieSplit();
		/***When***/
		String cookieValue =  cookieSplit.getCookieValue("");
		/***Then***/
		assertEquals("", cookieValue);
	}

}
