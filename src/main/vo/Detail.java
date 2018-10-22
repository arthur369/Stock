package main.vo;

public class Detail {
	private String Id;
	//PER=���q��
	private String PER;
	private String YearProfit;
	private String YearProfitPercent;
	//ROE=�ѪF�v�q���S�v
	private String YearROE;
	private String YearROEadd;
	//EPS=�C�Ѭվl
	private String YearEPS;
	private String YearEPSadd;
	private String YearEPSpercent;
	private String Asset;
	private String Debt;
	private String CapitalStock;
	private String BossHave;
	private String Dividend;
	private String Price;
	//GPM=��Q�v
	private String GPMadd;
	private String GPM;
	
	
	private String Name;
	
	//�ާQ�v
	private String DividendYield;
	
	private Result result=new Result();
	private Buyed buyed=new Buyed();
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGPMadd() {
		return GPMadd;
	}
	public void setGPMadd(String gPMadd) {
		GPMadd = gPMadd;
	}
	public String getGPM() {
		return GPM;
	}
	public void setGPM(String gPM) {
		GPM = gPM;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPER() {
		return PER;
	}
	public void setPER(String pER) {
		PER = pER;
	}
	public String getYearProfit() {
		return YearProfit;
	}
	public void setYearProfit(String yearProfit) {
		YearProfit = yearProfit;
	}
	public String getYearProfitPercent() {
		return YearProfitPercent;
	}
	public void setYearProfitPercent(String yearProfitPercent) {
		YearProfitPercent = yearProfitPercent;
	}
	public String getYearROE() {
		return YearROE;
	}
	public void setYearROE(String yearROE) {
		YearROE = yearROE;
	}
	public String getYearROEadd() {
		return YearROEadd;
	}
	public void setYearROEadd(String yearROEadd) {
		YearROEadd = yearROEadd;
	}
	public String getYearEPS() {
		return YearEPS;
	}
	public void setYearEPS(String yearEPS) {
		YearEPS = yearEPS;
	}
	public String getYearEPSadd() {
		return YearEPSadd;
	}
	public void setYearEPSadd(String yearEPSadd) {
		YearEPSadd = yearEPSadd;
	}
	public String getYearEPSpercent() {
		return YearEPSpercent;
	}
	public void setYearEPSpercent(String yearEPSpercent) {
		YearEPSpercent = yearEPSpercent;
	}
	public String getAsset() {
		return Asset;
	}
	public void setAsset(String asset) {
		Asset = asset;
	}
	public String getDebt() {
		return Debt;
	}
	public void setDebt(String debt) {
		Debt = debt;
	}
	public String getCapitalStock() {
		return CapitalStock;
	}
	public void setCapitalStock(String capitalStock) {
		CapitalStock = capitalStock;
	}
	public String getBossHave() {
		return BossHave;
	}
	public void setBossHave(String bossHave) {
		BossHave = bossHave;
	}
	public String getDividend() {
		return Dividend;
	}
	public void setDividend(String dividend) {
		Dividend = dividend;
	}
	
	
	
	
	
	public String getDividendYield() {
		return DividendYield;
	}
	public void setDividendYield(String dividendYield) {
		DividendYield = dividendYield;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	
	
	public Buyed getBuyed() {
		return buyed;
	}
	public void setBuyed(Buyed buyed) {
		this.buyed = buyed;
	}
	public void showBuyed() {
		Double Price=Double.parseDouble(getPrice().trim());
		Double result=(Price-buyed.getPrice())*buyed.getCount();
		System.out.println("�w��{�l�q= "+result*1000+"��");
	}
	
	
	@Override
	public String toString() {
		return "Detail [Id=" + Id + ", PER=" + PER + ", YearProfit=" + YearProfit + ", YearProfitPercent="
				+ YearProfitPercent + ", YearROE=" + YearROE + ", YearROEadd=" + YearROEadd + ", YearEPS=" + YearEPS
				+ ", YearEPSadd=" + YearEPSadd + ", YearEPSpercent=" + YearEPSpercent + ", Asset=" + Asset + ", Debt="
				+ Debt + ", CapitalStock=" + CapitalStock + ", BossHave=" + BossHave + ", Dividend=" + Dividend
				+ ", Price=" + Price + ", GPMadd=" + GPMadd + ", GPM=" + GPM + ", Name=" + Name + "]";
	}
	
	
	
	public void mappintResult() {
		String Name=getName();
		String ID=getId().trim();
		Double Price=Double.parseDouble(getPrice().trim());
		Double YearEPS=Double.parseDouble(getYearEPS().trim());
		Double PER;
		Double YearROE=Double.parseDouble(getYearROE());
		Double YearProfitPercent=Double.parseDouble(getYearProfitPercent());
		Double GPM=Double.parseDouble(getGPM());
		Double GPMadd=Double.parseDouble(getGPMadd());
		Double asset=Double.parseDouble(getAsset());
		Double debt=Double.parseDouble(getDebt());
		Double BossHave=Double.parseDouble(getBossHave());
		Double CapitalStock=0.0;
		Double YearEPSpercent=Double.parseDouble(getYearEPSpercent());
		if(!getCapitalStock().trim().equals("")){
			 CapitalStock=Double.parseDouble(getCapitalStock().trim());
			}
		if(!getPER().trim().equals("")){
			 PER=Double.parseDouble(getPER().trim());
			}else{
				PER=0.0;
			}
		int count=0;
		result.setID(ID);

		result.setName(Name);
					
					
					if((PER/YearEPSpercent)<0.75 && (PER/YearEPSpercent)>0 ){
//						System.out.println(ID+" ���q������= "+(PER/YearEPSpercent)+" �C��0.75");
						
						
						
						result.setFirst("V");
						count++;
					}else{
						result.setFirst("X");
					}
					
					//------
				if(Price/YearEPS<14 && Price/YearEPS>0){
//					System.out.println(ID+" �w�����q��= "+(Price/YearEPS)+" �C��15��");
					result.setSecond("V");
					count++;
				}else{
					result.setSecond("X");
				}
				if(YearProfitPercent>0){
//					System.out.println(ID+" �����|��b�Q= "+(YearProfitPercent)+" ������");
					result.setThird("V");
					count++;
				}else{
					result.setThird("X");
				}
				if(YearROE>15){
//					System.out.println(ID+" �ѪF�v�q���S�v= "+(YearROE)+" 15%�H�W");
					result.setFour("V");
					count++;
				}else{
					result.setFour("X");
				}
				
				if(((debt*100)/asset)<50 && ((debt*100)/asset)>0 ){
//					System.out.println(ID+" �t�Ť�v= "+((debt*100)/asset)+" �C��50%");
					result.setSix("V");
					count++;
				}else{
					result.setSix("X");
				}
				
				if(result.getFour().equals("V") && result.getSix().equals("V")){
					result.setFour("O");
					result.setSix("O");
				}
				
				
				if(GPM>15 && GPMadd>0){
//					System.out.println(ID+" ��Q�v= "+(GPM)+" 15%�H�W, "+" ��Q�v�W��= "+(GPMadd)+" ����V�W ");
					result.setFive("V");
					count++;
				}else{
					result.setFive("X");
				}
				
				if(CapitalStock<=30 && CapitalStock>0){
//					System.out.println(ID+" �ѥ�= "+(CapitalStock)+" �C��30��");
					
					result.setSeven("V");
					count++;
				}else{
					result.setSeven("X");
				}
				if(BossHave>=20){
//					System.out.println(ID+" ���ʫ���= "+(BossHave)+" ���Ѧh(�j��20%)");
					result.setEight("V");
					count++;
				}else{
					result.setEight("X");
				}
				
				//�ާQ�v�j��E�w
				if(Double.parseDouble(DividendYield)>=8){
					result.setNine("V");
					count++;
				}else{
					result.setNine("X");
				}
				
				
				result.setTotal(count);
//				resultList.add(result);
				}
		
		
		
	
	
	
	
	public void showDetail() {
		
		String Name=getName();
		String ID=getId().trim();
		Double Price=Double.parseDouble(getPrice().trim());
		Double YearEPS=Double.parseDouble(getYearEPS().trim());
		Double PER;
		Double YearROE=Double.parseDouble(getYearROE());
		Double YearProfitPercent=Double.parseDouble(getYearProfitPercent());
		Double GPM=Double.parseDouble(getGPM());
		Double GPMadd=Double.parseDouble(getGPMadd());
		Double asset=Double.parseDouble(getAsset());
		Double debt=Double.parseDouble(getDebt());
		Double BossHave=Double.parseDouble(getBossHave());
		Double CapitalStock=0.0;
		Double YearEPSpercent=Double.parseDouble(getYearEPSpercent());
		if(!getCapitalStock().trim().equals("")){
			 CapitalStock=Double.parseDouble(getCapitalStock().trim());
			}
		if(!getPER().trim().equals("")){
			 PER=Double.parseDouble(getPER().trim());
			}else{
				PER=0.0;
			}
		
		System.out.println("-----------------"+ID+"-----------------");
		
		
		System.out.println(toString());
		System.out.println("�ѦW= "+Name);
		System.out.println("1."+" ���q������= "+PER+"/"+YearEPSpercent+"="+PER/YearEPSpercent+" �C��0.75�A0.66�R�Ѩ}���A�W�L1.2���Ҽ{��X");
		System.out.println("2."+" �w�����q��= "+Price+"/"+YearEPS+"="+Price/YearEPS+" �C��15�� �A10�����k�̬��z�Q");
		System.out.println("3."+" �����|��b�Q= "+(YearProfitPercent)+" ������");
		System.out.println("4."+" �ѪF�v�q���S�v= "+(YearROE)+" 15%�H�W");
		System.out.println("5."+" ��Q�v= "+(GPM)+" 15%�H�W, "+" ��Q�v�W��= "+(GPMadd)+" ����V�W ");
		System.out.println("6."+" �t�Ť�v= "+"("+debt+"*100%"+")/"+asset+"="+((debt*100)/asset)+" �C��50%");
		System.out.println("7."+" �ѥ�= "+(CapitalStock)+" �C��30��");
		System.out.println("8."+" ���ʫ���= "+(BossHave)+" ���Ѧh(�j��50%)");
		System.out.println("9."+" �ާQ�v= "+DividendYield+" �j��9%");
		System.out.println("�ѻ�= "+Price);
		
		
		System.out.println("-----------------/"+ID+"-----------------");
		
	}
	
}
