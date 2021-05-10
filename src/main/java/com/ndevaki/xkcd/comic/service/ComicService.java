package com.ndevaki.xkcd.comic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndevaki.xkcd.comic.model.CurrentCommic;
import com.ndevaki.xkcd.comic.model.SearchComic;

@Service
public class ComicService {

	@Autowired
	XKCDService xkcdService;
	
	public CurrentCommic getLatestComic() {
		CurrentCommic currComic=xkcdService.getLatestComic();
		return currComic;
	}

//	HTTPClient 
//10>
//1000K >	n
//	5 core
	//transaction
	
	emp{
		id,
		dept_id foriegn key,
		boss_id 
		mobile_number
		composite_index(dept_id,mobile)
		                  many-one
	}
	
	
	1 > m > n
	    dt   mobile
	    10   100
	     
	    1000   10
	    
	m*n
	
	
	1        dept_id|cluster       cluster1
	            1   | 1				mobil1
	            					mobile2

	            
	2          dept_id|clusterm    cluster2
	              2   | 4
	3
	4
	5
	
	
	
	id dept_id
	1   121
    2   124	
	
	id
	121
	

	dept{
		id
	}
    
	slect e.*,dept.id from empl right join dept on dept.id=emp.dept_id;
	
	1,121,121
			
			
	public SearchComic searchComic(String comicNum) {
		SearchComic searchComic=xkcdService.searchComic(comicNum);
		return searchComic;
	}

	
}
