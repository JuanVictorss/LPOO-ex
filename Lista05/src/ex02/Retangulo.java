package ex02;

public class Retangulo {
	private float base, altura;

	public Retangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void area() {
		System.out.println(this.base * this.altura);
	}
	public void perimetro() {
		System.out.println(2*this.base + 2*this.altura);
	}
	
	public float getBase() {
		return this.base;
	}
	public float getAltura() {
		return this.altura;
	}
}
