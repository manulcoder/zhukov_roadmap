public class Pair {
    private final Character symbol;
    private boolean isGuested;

    public Pair(Character symbol) {
        this.symbol = symbol;
        isGuested = false;
    }

    public void setGuested() {
        this.isGuested = true;
    }

    public boolean isGuested() {
        return isGuested;
    }

    public Character getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return this.isGuested ? this.symbol.toString() : "*";
    }
}
