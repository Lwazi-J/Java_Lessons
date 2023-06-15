enum Size {
    SMALL("S", 10),
    MEDIUM("M", 20),
    LARGE("L", 30);

    private final String abbreviation;
    private final int value;

    Size(String abbreviation, int value) {
        this.abbreviation = abbreviation;
        this.value = value;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getValue() {
        return value;
    }
}

// Usage
Size shirtSize = Size.MEDIUM;
System.out.println("Shirt size: " + shirtSize);
System.out.println("Abbreviation: " + shirtSize.getAbbreviation());
System.out.println("Value: " + shirtSize.getValue());

