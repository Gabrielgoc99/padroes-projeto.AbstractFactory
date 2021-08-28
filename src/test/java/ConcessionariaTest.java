
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcessionariaTest {

    @Test
    void deveEmitirNotaManutencaoMatriz() {
        FabricaAbstrata fabrica = new FabricaMatriz();
        Concessionaria concessionaria = new Concessionaria(fabrica);
        assertEquals("Nota Fiscal para manutenção de veículos na Concessionária Matriz.", concessionaria.emitirNotaManutencao());
    }

    @Test
    void deveEmitirNotaManutencaoFilial() {
        FabricaAbstrata fabrica = new FabricaFilial();
        Concessionaria concessionaria = new Concessionaria(fabrica);
        assertEquals("Nota Fiscal para manutenção de veículos em uma filial da rede.", concessionaria.emitirNotaManutencao());
    }

    @Test
    void deveEmitirNotaVendaMatriz() {
        FabricaAbstrata fabrica = new FabricaMatriz();
        Concessionaria concessionaria = new Concessionaria(fabrica);
        assertEquals("Nota Fiscal para Venda de Carro na concessionária Matriz.", concessionaria.emitirNotaVenda());
    }

    @Test
    void deveEmitirNotaVendaFilial() {
        FabricaAbstrata fabrica = new FabricaFilial();
        Concessionaria concessionaria = new Concessionaria(fabrica);
        assertEquals("Nota Fiscal para venda de Carro 0km em concessionária Filial", concessionaria.emitirNotaVenda());
    }

}