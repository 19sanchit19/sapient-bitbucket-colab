package com.assignment1;

import java.util.*;

public class ManualTests2 {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		String query=scan.nextLine();

		SqlQuery sql=new SqlQuery(query);
		
		String[] tables=sql.getTables();
		Map<List<String>,List<String>> cols=sql.getColumns();
		String[] condn=sql.getConditions();
		
		System.out.println("success");
	}

}
