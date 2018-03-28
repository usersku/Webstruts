package struts.news.dao;

import java.util.List;

import struts.news.entity.News;

public interface NewsDao {
	//查全部listNews
	public List<News> listNews() throws Exception;
	
	//添加isnert
	public boolean insert(News ne) throws Exception;
	
	//删除del
	public boolean del(int newsid) throws Exception;
	
	//修改update
	public boolean update(News ne) throws Exception;
	
	//根据idProd查
	public News idProd(int newsid) throws Exception;
	
}
