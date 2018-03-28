package struts.news.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BaseDao {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URl = "jdbc:mysql://localhost:3306/ymw?useUnicode=true&characterEncoding=UTF-8";

	public Connection getCon() throws Exception {
		Class.forName(DRIVER);
		return DriverManager.getConnection(URl, "root", "123");
	}

	public void close(ResultSet rs, PreparedStatement ps, Connection con)
			throws Exception {
		if (rs != null) {
			rs.close();
		}
		if (ps != null) {
			ps.close();
		}
		if (con != null) {
			con.close();
		}
		rs=null;
		ps=null;
		con=null;
	}

}
