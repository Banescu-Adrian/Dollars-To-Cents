import java.math.BigDecimal;

enum Coin {
    QUARTER(0.25),
    DIME(0.10),
    NICKEL(0.05),
    PENNY(0.01);

    private final BigDecimal coin;
    Coin(double v) {
        this.coin = BigDecimal.valueOf(v);
    }

    public BigDecimal getCoinValue() {
        return coin;
    }
}
