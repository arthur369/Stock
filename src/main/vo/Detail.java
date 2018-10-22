package main.vo;

public class Detail {
	private String Id;
	//PER=本益比
	private String PER;
	private String YearProfit;
	private String YearProfitPercent;
	//ROE=股東權益報酬率
	private String YearROE;
	private String YearROEadd;
	//EPS=每股盈餘
	private String YearEPS;
	private String YearEPSadd;
	private String YearEPSpercent;
	private String Asset;
	private String Debt;
	private String CapitalStock;
	private String BossHave;
	private String Dividend;
	private String Price;
	//GPM=毛利率
	private String GPMadd;
	private String GPM;
	
	
	private String Name;
	
	//殖利率
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
		System.out.println("已實現損益= "+result*1000+"元");
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
//						System.out.println(ID+" 本益成長比= "+(PER/YearEPSpercent)+" 低於0.75");
						
						
						
						result.setFirst("V");
						count++;
					}else{
						result.setFirst("X");
					}
					
					//------
				if(Price/YearEPS<14 && Price/YearEPS>0){
//					System.out.println(ID+" 預估本益比= "+(Price/YearEPS)+" 低於15倍");
					result.setSecond("V");
					count++;
				}else{
					result.setSecond("X");
				}
				if(YearProfitPercent>0){
//					System.out.println(ID+" 平均稅後淨利= "+(YearProfitPercent)+" 正成長");
					result.setThird("V");
					count++;
				}else{
					result.setThird("X");
				}
				if(YearROE>15){
//					System.out.println(ID+" 股東權益報酬率= "+(YearROE)+" 15%以上");
					result.setFour("V");
					count++;
				}else{
					result.setFour("X");
				}
				
				if(((debt*100)/asset)<50 && ((debt*100)/asset)>0 ){
//					System.out.println(ID+" 負債比率= "+((debt*100)/asset)+" 低於50%");
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
//					System.out.println(ID+" 毛利率= "+(GPM)+" 15%以上, "+" 毛利率增減= "+(GPMadd)+" 持續向上 ");
					result.setFive("V");
					count++;
				}else{
					result.setFive("X");
				}
				
				if(CapitalStock<=30 && CapitalStock>0){
//					System.out.println(ID+" 股本= "+(CapitalStock)+" 低於30億");
					
					result.setSeven("V");
					count++;
				}else{
					result.setSeven("X");
				}
				if(BossHave>=20){
//					System.out.println(ID+" 董監持股= "+(BossHave)+" 持股多(大於20%)");
					result.setEight("V");
					count++;
				}else{
					result.setEight("X");
				}
				
				//殖利率大於九趴
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
		System.out.println("股名= "+Name);
		System.out.println("1."+" 本益成長比= "+PER+"/"+YearEPSpercent+"="+PER/YearEPSpercent+" 低於0.75，0.66買股良機，超過1.2倍考慮賣出");
		System.out.println("2."+" 預估本益比= "+Price+"/"+YearEPS+"="+Price/YearEPS+" 低於15倍 ，10倍左右最為理想");
		System.out.println("3."+" 平均稅後淨利= "+(YearProfitPercent)+" 正成長");
		System.out.println("4."+" 股東權益報酬率= "+(YearROE)+" 15%以上");
		System.out.println("5."+" 毛利率= "+(GPM)+" 15%以上, "+" 毛利率增減= "+(GPMadd)+" 持續向上 ");
		System.out.println("6."+" 負債比率= "+"("+debt+"*100%"+")/"+asset+"="+((debt*100)/asset)+" 低於50%");
		System.out.println("7."+" 股本= "+(CapitalStock)+" 低於30億");
		System.out.println("8."+" 董監持股= "+(BossHave)+" 持股多(大於50%)");
		System.out.println("9."+" 殖利率= "+DividendYield+" 大於9%");
		System.out.println("股價= "+Price);
		
		
		System.out.println("-----------------/"+ID+"-----------------");
		
	}
	
}
