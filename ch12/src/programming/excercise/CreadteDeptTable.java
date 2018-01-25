package programming.excercise;

public class CreadteDeptTable {

	public static void main(String[] args) {

		String driverName = "org.gjt.mm.mysql.Driver";
		String dbName = "univ";
		String dbURL = "jdbc:mysql://localhost:3306/" + dbName;

		String sqlCT = "CREATE TABLE department (" +
				"id int, " +
				"name VARCHAR(30), " +
				"numstudent INT, " +
				"PRIMARY KEY ( id ) " +
				");";
		
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
