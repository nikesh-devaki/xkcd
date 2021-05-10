package com.ndevaki.xkcd.comic.model;

import java.io.Serializable;

public class CurrentCommic{
    private String img;
    private String safe_title;
    
	public CurrentCommic(String img, String safe_title) {
		super();
		this.img = img;
		this.safe_title = safe_title;
	}
	public CurrentCommic() {
		
	}
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getSafe_title() {
		return safe_title;
	}
	public void setSafe_title(String safe_title) {
		this.safe_title = safe_title;
	}
}
