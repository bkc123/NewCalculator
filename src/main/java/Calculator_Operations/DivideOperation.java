package Calculator_Operations;

final public class DivideOperation {

	private int a =0;
	private int b=0;
	
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
		double r =  (int) this.a / (int )this.b;
		int result = (int)r;
		return result;
	}
}
