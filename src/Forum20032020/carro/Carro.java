package Forum20032020.carro;

public class Carro {
	private final static double CONSUMO = 0.250;
	private final static double TANQUEVAZIO = 0.00;
	private double combustivelNoTanqueEmLitros;
	private boolean ligado;

	public Carro(double volumeEmLitros) {
		combustivelNoTanqueEmLitros = volumeEmLitros;
		ligado = false;
	}

	public void abastecer(double volumeEmLitros) {
		this.combustivelNoTanqueEmLitros = this.combustivelNoTanqueEmLitros + volumeEmLitros;
	}

	public void ligar() {
		if(isLigado()) {
			throw new RuntimeException("O carro ja esta ligado!!");
		}
		if (combustivelNoTanqueEmLitros - CONSUMO > TANQUEVAZIO) {
			this.ligado = true;
			combustivelNoTanqueEmLitros -= CONSUMO;
		}
	}

	public void desligar() {
		this.ligado = false;
	}

	public void acelerar() {
		if (combustivelNoTanqueEmLitros - CONSUMO >= TANQUEVAZIO) {
			combustivelNoTanqueEmLitros -= CONSUMO;
		}
		if (combustivelNoTanqueEmLitros == TANQUEVAZIO)
			this.desligar();
		
	}
	
	public boolean isLigado() {
		return ligado;
	}

	public boolean isDesligado() {
		return !isLigado();
	}

	public double getCombustivelNoTanqueEmLitros() {
		return combustivelNoTanqueEmLitros;
	}
	// Metodo Modificacao
	public void esvaziarTanque() {
		if (combustivelNoTanqueEmLitros == 0.00) {
			throw new RuntimeException("O carro ja esta Sem gazolina!!");
		}
		if(combustivelNoTanqueEmLitros > TANQUEVAZIO) {
			combustivelNoTanqueEmLitros = TANQUEVAZIO;
		}
	}


}
