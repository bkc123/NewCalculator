package Calculator_Operations;

final public class SubstractOperation {
	
	private int a = 0;
	private int b = 0;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int getResult() {
		return this.a - this.b;
	}

}
