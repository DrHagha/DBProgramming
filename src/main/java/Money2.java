import java.util.Objects;

public class Money2 {
    private final int value;

    public Money2(int value) {
        this.value = value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money2)) return false;
        Money2 money2 = (Money2) o;
        return value == money2.value;
    }
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
