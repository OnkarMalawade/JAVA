package myPack;

public class Gen<T>{
	T data;

	public Gen() {
		super();
	}

	public Gen(T data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "Gen [data=" + data + "]";
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
