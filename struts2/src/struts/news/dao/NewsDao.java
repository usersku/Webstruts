package struts.news.dao;

import java.util.List;

import struts.news.entity.News;

public interface NewsDao {
	//��ȫ��listNews
	public List<News> listNews() throws Exception;
	
	//���isnert
	public boolean insert(News ne) throws Exception;
	
	//ɾ��del
	public boolean del(int newsid) throws Exception;
	
	//�޸�update
	public boolean update(News ne) throws Exception;
	
	//����idProd��
	public News idProd(int newsid) throws Exception;
	
}
