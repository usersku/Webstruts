package struts.news.action;

import java.util.List;

import struts.news.dao.NewsDao;
import struts.news.dao.impl.NewsDaoImpl;
import struts.news.entity.News;
import struts.news.util.BaseAction;

public class NewsAction extends BaseAction {
	NewsDao newdao=new NewsDaoImpl();
	News news;
	
	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	//��ȫ��newslist
	public String newslist(){
		try {
			List<News> newslist=newdao.listNews();
			getRequest().setAttribute("news", newslist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "newslist";
	}
	
	//���newsinsert
	public String newsinsert(){
		try {
			newdao.insert(news);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newslist();
	}
	
	//ɾ��newsdel
	public String newsdel(){
		try {
			newdao.del(news.getNewsid());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  newslist();
	}
	
	//�޸�newsupdate
	public String newsupdate(){
		try {
			newdao.update(news);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  newslist();
	}
	
	//��idnewsid
	public String idnewsid(){
		try {
			News ne=newdao.idProd(news.getNewsid());
			getRequest().setAttribute("nen", ne);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "update";
	}
}
