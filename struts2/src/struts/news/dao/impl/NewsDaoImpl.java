package struts.news.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import struts.news.dao.NewsDao;
import struts.news.entity.News;
import struts.news.util.BaseDao;


public class NewsDaoImpl extends BaseDao implements NewsDao {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	@Override
	public List<News> listNews() throws Exception {
		this.con=super.getCon();
		String sql="select * from news";
		this.ps=this.con.prepareStatement(sql);
		this.rs=this.ps.executeQuery();
		List<News> list=new ArrayList<News>();
		while(this.rs.next()){
			News pro=new News(this.rs.getInt("newsid"),this.rs.getString("title"),this.rs.getString("content"),this.rs.getString("newstime"));
			list.add(pro);
		}
		super.close(rs, ps, con);
		return list;
	}

	@Override
	public boolean insert(News ne) throws Exception {
		this.con=super.getCon();
		String sql="insert into news(title,content,newstime) values(?,?,null)";
		this.ps=this.con.prepareStatement(sql);
		this.ps.setString(1, ne.getTitle());
		this.ps.setString(2, ne.getContent());
		boolean bo=this.ps.executeUpdate()!=0?true:false;
		super.close(rs, ps, con);
		return bo;
	}

	@Override
	public boolean del(int newsid) throws Exception {
		this.con=super.getCon();
		String sql="delete from news where newsid=?";
		this.ps=this.con.prepareStatement(sql);
		this.ps.setInt(1, newsid);
		boolean bo=this.ps.executeUpdate()!=0?true:false;
		super.close(rs, ps, con);
		return bo;
	}

	@Override
	public boolean update(News ne) throws Exception {
		this.con=super.getCon();
		String sql="update news set title=?,content=? where newsid=?";
		this.ps=this.con.prepareStatement(sql);
		this.ps.setString(1, ne.getTitle());
		this.ps.setString(2, ne.getContent());
		this.ps.setInt(3, ne.getNewsid());
		boolean bo=this.ps.executeUpdate()!=0?true:false;
		super.close(rs, ps, con);
		return bo;
	}

	@Override
	public News idProd(int newsid) throws Exception {
		this.con=super.getCon();
		String sql="select * from news where newsid=?";
		this.ps=this.con.prepareStatement(sql);
		this.ps.setInt(1, newsid);
		this.rs=this.ps.executeQuery();
		News pro=null;
		if(this.rs.next()){
			pro=new News(this.rs.getInt("newsid"),this.rs.getString("title"),this.rs.getString("content"),this.rs.getString("newstime"));
			
		}
		super.close(rs, ps, con);
		return pro;
	}

}
