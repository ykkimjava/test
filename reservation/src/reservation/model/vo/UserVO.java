package reservation.model.vo;

import java.util.Date;

public class UserVO {
	
	static String customer_id;
	static Date check_in;
	static String site_no;
	static String stayDays;
	
	public UserVO() {
		
	}

	public static String getCustomer_id() {
		return customer_id;
	}

	public static void setCustomer_id(String customer_id) {
		UserVO.customer_id = customer_id;
	}
	
	public static Date getCheck_in() {
		return check_in;
	}

	public static void setCheck_in(Date check_in) {
		UserVO.check_in = check_in;
	}

	public static String getSite_no() {
		return site_no;
	}

	public static void setSite_no(String site_no) {
		UserVO.site_no = site_no;
	}

	public static String getStayDays() {
		return stayDays;
	}

	public static void setStayDays(String stayDays) {
		UserVO.stayDays = stayDays;
	}
	
}
