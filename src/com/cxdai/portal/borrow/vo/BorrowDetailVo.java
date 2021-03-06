package com.cxdai.portal.borrow.vo;

import java.io.Serializable;
import java.util.Date;

import com.cxdai.base.entity.Borrow;
import com.cxdai.common.Dictionary;
import com.cxdai.utils.DateUtils;
import com.cxdai.utils.StrinUtils;

/**
 * <p>
 * Description:借款详情VO<br />
 * </p>
 * 
 * @title BorrowForInvestVo.java
 * @package com.cxdai.portal.borrow.vo
 * @author justin.xu
 * @version 0.1 2014年9月12日
 */
public class BorrowDetailVo extends Borrow implements Serializable {

	private static final long serialVersionUID = 8151875417287128480L;
	/** 借款人用户名 */
	private String username;
	/** 定时发布时间 */
	private Date timingBorrowTimeDate;
	private Date cancelTimeDate;
	private Date publishTimeDate;
	
	private String userNameSecret;  //隐藏用户名
	private String userNameEncrypt;  //加密用户名

	public Date getTimingBorrowTimeDate() {
		if (null != super.getTimingBorrowTime() && !"".equals(super.getTimingBorrowTime())) {
			return DateUtils.timeStampToDate(super.getTimingBorrowTime());
		}
		return timingBorrowTimeDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getCancelTimeDate() {
		if (super.getCancelTime() != null && !super.getCancelTime().equals("")) {
			return DateUtils.parse(DateUtils.timeStampToDate(super.getCancelTime(), DateUtils.YMD_HMS), DateUtils.YMD_HMS);
		}
		return cancelTimeDate;
	}

	public void setCancelTimeDate(Date cancelTimeDate) {
		this.cancelTimeDate = cancelTimeDate;
	}

	private String styleStr;

	public String getStyleStr() {
		if (null != getStyle()) {
			return Dictionary.getValue(400, getStyle() + "");
		}
		return styleStr;
	}

	public void setStyleStr(String styleStr) {
		this.styleStr = styleStr;
	}

	private String statusStr;

	public String getStatusStr() {
		if (getStatus() != null)
			return Dictionary.getValue(100, getStatus() + "");
		return statusStr;
	}

	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}

	public Date getPublishTimeDate() {
		if (super.getPublishTime() != null && !super.getPublishTime().equals("")) {
			return DateUtils.parse(DateUtils.timeStampToDate(super.getPublishTime(), DateUtils.YMD_HMS), DateUtils.YMD_HMS);
		}
		return publishTimeDate;
	}

	public void setPublishTimeDate(Date publishTimeDate) {
		this.publishTimeDate = publishTimeDate;
	}
	
	public String getUserNameSecret() {
		userNameSecret = this.getUsername();
			userNameSecret = StrinUtils.stringSecretTo(userNameSecret);
		return userNameSecret;
	}
	public String getUserNameEncrypt() {
		userNameEncrypt = this.getUsername();
		userNameEncrypt = StrinUtils.stringEncryptEn(userNameEncrypt);
		return userNameEncrypt;
	}
	
}