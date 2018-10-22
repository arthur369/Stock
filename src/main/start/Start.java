package main.start;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import main.tool.LogWriter;
import main.tool.ReadFile;
import main.vo.Buyed;
import main.vo.Detail;
import main.vo.Result;

public class Start {

	public static void main(String[] args) throws UnsupportedEncodingException {
		ArrayList<Detail> result=ReadFile.readFile();
		
		
		
		for(int i=0;i<result.size();i++){
//			int count=0;
			
			Detail detail=result.get(i);
			
			
			detail.mappintResult();
			Result output=detail.getResult();
			
			if(output.getID().equals("6581")){
				detail.showDetail();
				
			}
			
			
			
			
			
			
		}
		
		StringBuffer outputResult=new StringBuffer();
		outputResult.append("ID,股名,本益成長比低於0.75,預估本益比低於15倍,平均稅後淨利正成長,股東權益報酬率15%以上,毛利率15%以上且毛利率增減持續向上,負債比率低於50%,股本低於30億,董監持股持股多(大於20%),殖利率(大於9%),符合條件筆數");
//		System.out.println("---------------------------------------------------");
//		System.out.println("ID,股名,本益成長比低於0.75,預估本益比低於15倍,平均稅後淨利正成長,股東權益報酬率15%以上,毛利率15%以上且毛利率增減持續向上,負債比率低於50%,股本低於30億,董監持股持股多(大於20%),符合條件筆數");
		outputResult.append("\r\n");
		for(int i=0;i<result.size();i++){
			Detail detail=result.get(i);
			Result output=detail.getResult();
			
			
			if( output.getFirst().equals("V") && output.getSecond().equals("V")&& output.getTotal()>=9 ){
			
			System.out.println(output.getID()+","+output.getName()+","+output.getFirst()+","+output.getSecond()+","+output.getThird()+","+output.getFour()+","+output.getFive()+","+output.getSix()+","+output.getSeven()+","+output.getEight()+","+output.getNine()+","+output.getTotal());
			detail.showDetail();
			outputResult.append(output.getID()+","+output.getName()+","+output.getFirst()+","+output.getSecond()+","+output.getThird()+","+output.getFour()+","+output.getFive()+","+output.getSix()+","+output.getSeven()+","+output.getEight()+","+output.getNine()+","+output.getTotal());
			outputResult.append("\r\n");
			}
			
			
			if(detail.getId().equals("6581")) {
				Buyed buyed=detail.getBuyed();
				buyed.setCount(0.1);
				buyed.setPrice(110);
				detail.showBuyed();
			}
			
			if(detail.getId().equals("6441")) {
				Buyed buyed=detail.getBuyed();
				buyed.setCount(1);
				buyed.setPrice(50);
				detail.showBuyed();
			}
		}
		
		LogWriter.writeAudit("D:\\Stock\\"+getDay()+"output.csv",outputResult.toString() , 0, "utf-8");
		
	}
	
	//今天日期yyyyMMdd格式
	public static  String getDay() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		Date today=new Date();
		String day=sdf.format(today);
		return day;
	}
	
	//編碼轉換
		public static String strEncode(String word,String sourceEncode,String targetEncode) throws UnsupportedEncodingException {
			byte[] str=	word.getBytes(sourceEncode);
				String result=new String(str,targetEncode);
				return result;
			}
	
}
