package com.ndevaki.xkcd.comic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ndevaki.xkcd.comic.model.CurrentCommic;
import com.ndevaki.xkcd.comic.model.SearchComic;
import com.ndevaki.xkcd.comic.service.ComicService;

@RestController
@RequestMapping("/comics/")
public class ComicController {

	@Autowired
	ComicService comicService;
	
	@GetMapping("current")
	public CurrentCommic current() {
		return comicService.getLatestComic();
	}
	
	@GetMapping("{comic_number}")
	public SearchComic search(@PathVariable("comic_number")final String comicNum) {
		return comicService.searchComic(comicNum);
	}
}
