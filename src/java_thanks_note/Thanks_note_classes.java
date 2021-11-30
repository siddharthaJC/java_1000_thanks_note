package java_thanks_note;

import java.util.*;

class Article {
	String article_written_date;
	List<Thanks_of_day> list = new ArrayList<Thanks_of_day>();
	
	public Article(String article_written_date, List<Thanks_of_day> list) {
		super();
		this.article_written_date = article_written_date;
		this.list = list;
	}
}

class Thanks_of_day {
	int thank_id;
	String one_thank;
	
	public Thanks_of_day(int thank_id, String one_thank) {
		super();
		this.thank_id = thank_id;
		this.one_thank = one_thank;
	}
}
