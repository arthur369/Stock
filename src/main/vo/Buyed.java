package main.vo;

public class Buyed {
	//�R�i��
	private Double price;
	//�R�i�ƶq
	private Double count;
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void setPrice(int price) {
		this.price=Double.parseDouble(price+"");
	}
	
	
	public Double getCount() {
		return count;
	}
	public void setCount(Double count) {
		this.count = count;
	}
	
	public void setCount(int count) {
		this.count=Double.parseDouble(count+"");
	}
}
