package com.assignment1;

import java.util.*;

public class SqlQuery {
	
	private String query;
	private String[] tables;
	private String[] conditions;
	private String[] columns;

	SqlQuery(String query) {
		super();
		this.query = query;
	}
	
	
	public String[] getTables() { //String[]
		
//			String tables;
			this.tables = query.split(" from ")[1].split(" where")[0].split(",");
		
		
		return this.tables;
	}
	
	public String[] getConditions() { //String[]
		
		
//			String conditions;
			this.conditions = query.split("where ")[1].split(",");
		
		return this.conditions;
		
		
	}
	
	public Map<List<String>,List<String>> getColumns(){ //Map<String, List>
		
		
			
			this.columns = query.split(" from ")[0].split("select ")[1].split(",");
			Map<List<String>,List<String>> mp=new HashMap<List<String>,List<String>>();
			List<String> cols=Arrays.asList(this.columns);
			List<String> tableList=Arrays.asList(this.tables);
			mp.put(tableList,cols);
			return mp;
		
	}
	
	
}

