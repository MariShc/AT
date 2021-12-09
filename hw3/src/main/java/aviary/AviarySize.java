package aviary;

public enum AviarySize {
    SMALL(1),
    MEDIUM(2),
    LARGE(3),
    EXTRA_LARGE(4);

    private int size;

    AviarySize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
