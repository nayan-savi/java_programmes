import java.sql.*;
class MyDBDemo{
	public static void main(String a[])throws Exception{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection conn = DriverManager.getConnection("jdbc:odbc:data");
		System.out.println("DB connected");

		String qry  =  "create table Emp(id integer,name text)";
		Statement stmt = conn.createStatement();
		stmt.execute(qry);
		
		System.out.println("Table Created");

		String qry1  =  "insert into Emp values(101,"Rama")";
		stmt.execute(qry);
		System.out.println("!1 record inserted");

	
		String qry2  =  "insert into Emp values(102,"Sita")";
		stmt.execute(qry);
		System.out.println("!2 records inserted");

		String query =  "insert into Emp values(?,?)";
		PreparedStatement pstmt = conn.prepareStatemt(query);
		pstmt.setString(1,103);
		pstmt.setString(2,'Rama');
		psmt.executeUpdate();

		String qry3 = "select * from Emp";
		ResultSet rs = stmt.executeQuery(qry);
		while(rs.next()){
			int sno = rs.getInt(1);
			String name = rs.getString(2);

			System.out.println("Id: "+sno +" Name: "+name);
		}

		rs.close();
		stmt.close();
		conn.close();
	}
}