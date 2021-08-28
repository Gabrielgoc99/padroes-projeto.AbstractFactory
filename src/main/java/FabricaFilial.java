

public class FabricaFilial implements FabricaAbstrata {

    @Override
    public NotaVenda createNotaVenda() {
        return new NotaVendaCarroFilial();
    }

    @Override
    public NotaManutencao createNotaManutencao() {
        return new NotaManutencaoFilial();
    }
}