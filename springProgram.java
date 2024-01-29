package mypack;

public class springProgram<T> {
	T a;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "springProgram [a=" + a + "]";
	}

	public springProgram(T a) {
		super();
		this.a = a;
	}

}
