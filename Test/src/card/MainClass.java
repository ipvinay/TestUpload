package card;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<DBData>dbDataList= new ArrayList<DBData>();
		
		DBData dbData = new DBData();
		dbData.setStr1("123");
		dbData.setStr2("1");
		dbData.setStr3("2");
		dbData.setStr4("3");
		dbData.setStr5("A");
		
		dbDataList.add(dbData);
		
		DBData dbData2 = new DBData();
		dbData2.setStr1("456");
		dbData2.setStr2("4");
		dbData2.setStr3("5");
		dbData2.setStr4("6");
		dbData2.setStr5("A");
		dbDataList.add(dbData2);
		
		DBData dbData3 = new DBData();
		dbData3.setStr1("789");
		dbData3.setStr2("7");
		dbData3.setStr3("8");
		dbData3.setStr4("9");
		dbData3.setStr5("A");
		dbDataList.add(dbData3);
		
		DBData dbData4 = new DBData();
		dbData4.setStr1("369");
		dbData4.setStr2("3");
		dbData4.setStr3("6");
		dbData4.setStr4("9");
		dbData4.setStr5("R");
		dbDataList.add(dbData4);
		
		Map<String , List<ATMDTO>> map= new HashMap<String , List<ATMDTO>>();
		 List<ATMDTO>dbList=new ArrayList<ATMDTO>();
		
		for (int i = 0; i < dbDataList.size(); i++) {
			
			ATMDTO atmDto= new ATMDTO();
			atmDto.setStr1(dbDataList.get(i).getStr3());
			atmDto.setStr2(dbDataList.get(i).getStr4());
			
			dbList.add(atmDto);
			
			map.put(dbDataList.get(i).getStr1().concat(dbDataList.get(i).getStr5()), dbList);
			
			
		}
		
		System.out.println(map);
		

	}

}
