package myPack;

public class ConcatDemo {

	public static void main(String[] args) {
		Concat ct2 = (a,b)->{
			System.out.println(a +" "+ b);
		};	
		ct2.stringData("Onkar", "Malawade");
		
		// Celcius to Farenheit
		Celtofaraen ctf = (a)->{
			System.out.println(((a * 9) / 5) + 32);
		};
		ctf.cel2fan(100);
		
		// Farenheit to Celcius
		Celtofaraen ftc = (a)->{
			System.out.println(((a - 32)*5) /9);
		};
		ftc.cel2fan(320);
	}
}
