package myPack;

public class GenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen <Integer> g1 = new Gen<>(101);;;
		System.out.println(g1);
		
		GenInt gi = ()->{
			System.out.println("Hello Dada");
		};
		gi.struct();
		GenInt gi2 = new GenInt() {
			
			@Override
			public void struct() {
				// TODO Auto-generated method stub
				System.out.println("Annomyous");
			}
		};
		gi2.struct();
	}
}
