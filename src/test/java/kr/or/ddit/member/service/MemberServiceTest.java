package kr.or.ddit.member.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import kr.or.ddit.common.model.PageVo;
import kr.or.ddit.member.dao.MemberDao;
import kr.or.ddit.member.model.MemberVo;

public class MemberServiceTest {

	@Test
	public void getMemberTest() {
		/***Given***/
		MemberServiceI memberService = new MemberService();
		String userId = "brown";
		
		MemberVo answerMemberVo = new MemberVo();
		answerMemberVo.setUserid("brown");
		answerMemberVo.setPass("brownPass");

		/***When***/
		MemberVo memberVo = memberService.getMember(userId);
		
		/***Then***/
		assertEquals("brown", memberVo.getUserid());
		assertEquals("passBrown", memberVo.getPass());
		
//		assertEquals(answerMemberVo, memberVo);
	}
	
	@Test
	public void selectMemberPageListTest() {
		/***Given***/
		MemberServiceI memberService = new MemberService();
		PageVo pageVo = new PageVo(1,7);
		
		/***When***/

		Map<String, Object> map = memberService.selectMemberPageList(pageVo);
		List<MemberVo> memberList = (List<MemberVo>)map.get("memberList");
		
		//member의 전체 수 확인
		int pages = (int)map.get("pages");
		
		/***Then***/
		assertEquals(7, memberList.size());
		assertEquals(3, pages);

	}

}
