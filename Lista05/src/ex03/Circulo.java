package ex03;

public class Circulo {
	private float raio;
	
	public Circulo(float raio) {
		this.raio = raio;
	}
	
	public void area() {
		System.out.println(3.14 * (this.raio*this.raio));
	}
	public void perimetro() {
		System.out.println(2 * 3.14 * this.raio);
	}
}
