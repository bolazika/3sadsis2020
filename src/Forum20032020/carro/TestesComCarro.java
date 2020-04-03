package Forum20032020.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesComCarro {

	@Test
	void testarConsumo() {
		Carro pegeot = new Carro(10.00);
		Carro monza = new Carro(5.00);
		
		assertTrue(pegeot.isDesligado());

		assertTrue(monza.isDesligado());
		
		pegeot.abastecer(10.00);
		monza.abastecer(5.00);
		
		pegeot.ligar();
		assertEquals(19.75, pegeot.getCombustivelNoTanqueEmLitros());
		
		monza.ligar();
		assertEquals(9.75, monza.getCombustivelNoTanqueEmLitros());
		
		pegeot.acelerar();
		pegeot.acelerar();
		pegeot.acelerar();
		assertEquals(19.0, pegeot.getCombustivelNoTanqueEmLitros());
		
		monza.acelerar();
		assertEquals(9.5, monza.getCombustivelNoTanqueEmLitros());
		
		
	}
	
	@Test
	void CarroDesligaQuandoAcabaOCombustivel() {
		Carro corsinha = new Carro(2.00);
		Carro celta = new Carro (0.255);
		
		assertTrue(corsinha.isDesligado());
		assertTrue(celta.isDesligado());
		
		corsinha.ligar();
		
		corsinha.acelerar();
		corsinha.acelerar();
		corsinha.acelerar();
		corsinha.acelerar();
		corsinha.acelerar();
		corsinha.acelerar();
		assertTrue(corsinha.isLigado());
		
		corsinha.acelerar();
		assertTrue(corsinha.isDesligado());
		
		assertEquals(0.00, corsinha.getCombustivelNoTanqueEmLitros());
		
		corsinha.ligar();
		celta.ligar();
		
		assertTrue(celta.isLigado());
		assertTrue(corsinha.isDesligado());
		
	}
	
	@Test 
	void CarroPossaSerReabastecido() {
		Carro vectra = new Carro(0.245);
		
		assertTrue(vectra.isDesligado());
		
		vectra.ligar();
		assertTrue(vectra.isDesligado());
		
		
		vectra.abastecer(1.0);
		assertEquals(1.245, vectra.getCombustivelNoTanqueEmLitros());
		
		vectra.ligar();
		
		assertTrue(vectra.isLigado());
	}
	
	@Test
	void testerCarroLigado() {
		Carro carro = new Carro(0.0);
		
		
		carro.ligar();
		carro.ligar();
		carro.ligar();
		carro.ligar();
		carro.ligar();
		
		
		
		
	}
	
	@Test
	void TesteEsvaziarTanque() {
		Carro corcel2 = new Carro (0.00);
		
		corcel2.abastecer(5.00);
		corcel2.ligar();
		assertTrue(corcel2.isLigado());
		assertEquals(4.75, corcel2.getCombustivelNoTanqueEmLitros());
		corcel2.esvaziarTanque();
		assertEquals(0.00, corcel2.getCombustivelNoTanqueEmLitros());
		corcel2.esvaziarTanque();
	}

}
