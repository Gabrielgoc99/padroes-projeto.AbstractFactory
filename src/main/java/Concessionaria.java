

public class Concessionaria {

        private NotaVenda notaVenda;
        private NotaManutencao notaManutencao;

        public Concessionaria (FabricaAbstrata fabrica) {
            this.notaVenda = fabrica.createNotaVenda();
            this.notaManutencao = fabrica.createNotaManutencao();
        }

        public String emitirNotaVenda() {return this.notaVenda.emitir();
        }

        public String emitirNotaManutencao() {return this.notaManutencao.emitir();
        }
    }


