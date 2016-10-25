package core.entities;

import java.sql.Date;

public class Advert {
	
	private String advertCode;
	private String advertTitle;
	private String advertContent;
	private Date postedTime;
	private Date scheduledTime;
	private Double amountCharged;
	
	public Advert(String advertCode, String advertTitle, String advertContent, Date postedTime, Date scheduledTime,
			Double amountCharged) {
		this.advertCode = advertCode;
		this.advertTitle = advertTitle;
		this.advertContent = advertContent;
		this.postedTime = postedTime;
		this.scheduledTime = scheduledTime;
		this.amountCharged = amountCharged;
	}

	public String getAdvertCode() {
		return advertCode;
	}

	public void setAdvertCode(String advertCode) {
		this.advertCode = advertCode;
	}

	public String getAdvertTitle() {
		return advertTitle;
	}

	public void setAdvertTitle(String advertTitle) {
		this.advertTitle = advertTitle;
	}

	public String getAdvertContent() {
		return advertContent;
	}

	public void setAdvertContent(String advertContent) {
		this.advertContent = advertContent;
	}

	public Date getPostedTime() {
		return postedTime;
	}

	public void setPostedTime(Date postedTime) {
		this.postedTime = postedTime;
	}

	public Date getScheduledTime() {
		return scheduledTime;
	}

	public void setScheduledTime(Date scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public Double getAmountCharged() {
		return amountCharged;
	}

	public void setAmountCharged(Double amountCharged) {
		this.amountCharged = amountCharged;
	}
	
	
	
	
	
	

}
