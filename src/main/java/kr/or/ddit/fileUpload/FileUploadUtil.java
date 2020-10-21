package kr.or.ddit.fileUpload;

public class FileUploadUtil {

	//form-data; name="img"; filename="images (1).jpg"
	//==> images (1).jpg
	
	//FileUploadUtilTest
	public static String getFilename(String contentDisposition) {
		String[] attrs = contentDisposition.split("; ");
		for(String attr : attrs) {
			String[] attrArry = attr.split("=");
			if(attrArry[0].equals("filename")) {
				return attrArry[1].replace("\"",""); //더블 퀘테이션 제거
			}
		}
		return "";
	}
}
