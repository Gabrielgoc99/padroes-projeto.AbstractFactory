

public class FabricaMatriz implements FabricaAbstrata {

    @Override
    public NotaVenda createNotaVenda() {
        return new NotaVendaCarroMatriz();
    }

    @Override
    public NotaManutencao createNotaManutencao() {
        return new NotaManutencaoMatriz();
    }
}