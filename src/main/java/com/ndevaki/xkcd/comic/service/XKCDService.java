package com.ndevaki.xkcd.comic.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ndevaki.xkcd.comic.model.CurrentCommic;
import com.ndevaki.xkcd.comic.model.SearchComic;

@Service
public class XKCDService {
	private static final String latestComicUrl="https://xkcd.com/info.0.json";
	private static  String searchComicUrl="https://xkcd.com/id/info.0.json";
	
	protected CurrentCommic getLatestComic() {
		RestTemplate restTemplate = new RestTemplate();
		CurrentCommic responseComic = restTemplate.getForObject(latestComicUrl, CurrentCommic.class);
		return responseComic;
	}

	public SearchComic searchComic(String comicNum) {
		RestTemplate restTemplate = new RestTemplate();
		SearchComic responseComic = restTemplate.getForObject(latestComicUrl.replace("id", comicNum),
				 SearchComic.class);
		return responseComic;
	}
	
}
