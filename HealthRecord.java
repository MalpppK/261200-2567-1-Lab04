public class HealthRecord {
    private double height;
    private double weight;

    private static double maxHeight = Double.MIN_VALUE;
    private static double minHeight = Double.MAX_VALUE;
    private static double maxWeight = Double.MIN_VALUE;
    private static double minWeight = Double.MAX_VALUE;

    public HealthRecord(double height, double weight) {
        setHeight(height);
        setWeight(weight);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        if (height <= 0) {
            throw new IllegalArgumentException("Your height must not be less than or equal to zero.");
        }
        this.height = height;
        updateMaxMinHeight(height);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Your weight must not be less than or equal to zero.");
        }
        this.weight = weight;
        updateMaxMinWeight(weight);
    }

    public static double getMaxHeight() {
        return maxHeight;
    }

    public static double getMinHeight() {
        return minHeight;
    }

    public static double getMaxWeight() {
        return maxWeight;
    }

    public static double getMinWeight() {
        return minWeight;
    }

    //this part for update max and min height
    private static void updateMaxMinHeight(double Height) {
        if (Height > maxHeight) {
            maxHeight = Height;
        }
        if (Height < minHeight) {
            minHeight = Height;
        }
    }

    private static void updateMaxMinWeight(double Weight) {
        if (Weight > maxWeight) {
            maxWeight = Weight;
        }
        if (Weight < minWeight) {
            minWeight = Weight;
        }
    }
}