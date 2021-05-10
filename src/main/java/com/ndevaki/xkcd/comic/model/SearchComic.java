package com.ndevaki.xkcd.comic.model;

import java.io.Serializable;

public class SearchComic implements Serializable {
	private String img;
    private String safe_title;
    private String transcript;
    
	public SearchComic(String img, String safe_title, String transcript) {
		super();
		this.img = img;
		this.safe_title = safe_title;
		this.transcript = transcript;
	}
	public SearchComic() {
		
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
	public String getTranscript() {
		return transcript;
	}
	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}
    
    
}
