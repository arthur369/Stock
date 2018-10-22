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
		outputResult.append("ID,�ѦW,���q������C��0.75,�w�����q��C��15��,�����|��b�Q������,�ѪF�v�q���S�v15%�H�W,��Q�v15%�H�W�B��Q�v�W�����V�W,�t�Ť�v�C��50%,�ѥ��C��30��,���ʫ��ѫ��Ѧh(�j��20%),�ާQ�v(�j��9%),�ŦX���󵧼�");
//		System.out.println("---------------------------------------------------");
//		System.out.println("ID,�ѦW,���q������C��0.75,�w�����q��C��15��,�����|��b�Q������,�ѪF�v�q���S�v15%�H�W,��Q�v15%�H�W�B��Q�v�W�����V�W,�t�Ť�v�C��50%,�ѥ��C��30��,���ʫ��ѫ��Ѧh(�j��20%),�ŦX���󵧼�");
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
	
	//���Ѥ��yyyyMMdd�榡
	public static  String getDay() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		Date today=new Date();
		String day=sdf.format(today);
		return day;
	}
	
	//�s�X�ഫ
		public static String strEncode(String word,String sourceEncode,String targetEncode) throws UnsupportedEncodingException {
			byte[] str=	word.getBytes(sourceEncode);
				String result=new String(str,targetEncode);
				return result;
			}
	
}
