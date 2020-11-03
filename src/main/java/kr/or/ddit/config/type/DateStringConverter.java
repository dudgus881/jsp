package kr.or.ddit.config.type;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateStringConverter implements Converter<String, Date>{

	//2020-11-03
	@Override
	public Date convert(String source) {
//		String from="2020-11-03";
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			Date to = fm.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	
}
