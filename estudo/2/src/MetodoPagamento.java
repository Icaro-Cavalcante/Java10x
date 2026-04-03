public enum MetodoPagamento {
    PIX(0),
    CREDITO(0.037),
    DINHEIRO(0),
    DEBITO(0.0010),
    BOLETO(0.0015);

    private double taxa;

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    MetodoPagamento(double taxa) {
        this.taxa = taxa;
    }
}
