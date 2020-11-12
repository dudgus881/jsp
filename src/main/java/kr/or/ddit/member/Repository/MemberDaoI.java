package kr.or.ddit.member.Repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.common.model.PageVo;
import kr.or.ddit.member.model.MemberVo;

public interface MemberDaoI {
	
	MemberVo getMember(String userId);
	
	List<MemberVo> selectAllMember();

//	List<MemberVo> selectMemberPageList();
	List<MemberVo> selectMemberPageList(PageVo pageVo);
	
	int selectMemberTotalCnt();
	
	int insertMember(MemberVo memberVo);
	
	int deleteMember(String userid);

	int updateMember(MemberVo memberVo);

}
