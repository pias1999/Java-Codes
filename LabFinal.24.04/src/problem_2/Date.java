package problem_2;


public class Date {
	int date;
	int month;
	int year;
	
	public Date(int date, int month, int year){
		this.date = date;
		this.month = month;
		this.year = year;
		
	}	
	
	public String toString(){
		return date + "/" + month + "/" + year;
	}

	public static void main(String[] args) {
		Date date = new Date(04, 24, 2019);
		
		System.out.println(date);

	}

}
