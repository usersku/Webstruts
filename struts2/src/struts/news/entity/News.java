package struts.news.entity;

import java.io.Serializable;

public class News implements Serializable{
	private int newsid;
	private String title;
	private String content;
	private String newstime;
	public int getNewsid() {
		return newsid;
	}
	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNewstime() {
		return newstime;
	}
	public void setNewstime(String newstime) {
		this.newstime = newstime;
	}
	public News(int newsid, String title, String content, String newstime) {
		super();
		this.newsid = newsid;
		this.title = title;
		this.content = content;
		this.newstime = newstime;
	}
	public News(String title, String content, String newstime) {
		super();
		this.title = title;
		this.content = content;
		this.newstime = newstime;
	}
	public News(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	
	public News(int newsid, String title, String content) {
		super();
		this.newsid = newsid;
		this.title = title;
		this.content = content;
	}
	public News() {
		super();
	}
	@Override
	public String toString() {
		return "News [newsid=" + newsid + ", title=" + title + ", content="
				+ content + ", newstime=" + newstime + "]";
	}
	
}
