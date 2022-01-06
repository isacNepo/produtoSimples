package entities;

public class Produto {
	
	private int prodA;
	private int prodB;
	
	public Produto(int prodA, int prodB) {
		this.prodA = prodA;
		this.prodB = prodB;
	}

	public int getProdA() {
		return prodA;
	}

	public void setProdA(int prodA) {
		this.prodA = prodA;
	}

	public int getProdB() {
		return prodB;
	}

	public void setProdB(int prodB) {
		this.prodB = prodB;
	}

	public int totalProd() {
		return prodA * prodB;
	}
}
