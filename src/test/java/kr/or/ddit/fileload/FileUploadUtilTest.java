package kr.or.ddit.fileload;

import static org.junit.Assert.*;

import org.junit.Test;

import kr.or.ddit.fileUpload.FileUploadUtil;

public class FileUploadUtilTest {

	/***Given***/
	String contentDisposition = "form-data; name=\"img\"; filename=\"images (1).jpg\"";
	
	/***When***/
	String fileName = FileUploadUtil.getFilename(contentDisposition);
	/***Then***/
//	assertEquals("images (1).jpg",fileName);
}
