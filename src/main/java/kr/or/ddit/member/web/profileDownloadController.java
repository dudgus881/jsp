package kr.or.ddit.member.web;

import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.ddit.member.model.MemberVo;
import kr.or.ddit.member.service.MemberServiceI;


@RequestMapping("/profileDownload")
@Controller
public class profileDownloadController{
	private static final long serialVersionUID = 1L;

	@Resource(name = "memberService")
	private MemberServiceI memService;

	
	@RequestMapping("/down")
	public String profileDown(String userid, Model model) throws IOException {
		MemberVo member = memService.getMember(userid);
		model.addAttribute("member", member);
		return "profileImgDownload";
	}
}