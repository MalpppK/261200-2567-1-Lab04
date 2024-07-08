public class Main {
    public static void main(String[] args) {
        HealthRecord healthRecord = new HealthRecord(1.7, 68.0);
        System.out.println("Patiant 1 : " + "height is " + healthRecord.getHeight() + " and weight is " + healthRecord.getWeight());

        healthRecord.setHeight(1.8);
        healthRecord.setWeight(70.0);
        System.out.println("Patiant 1 updated : " + "height is " + healthRecord.getHeight() + " and weight is " + healthRecord.getWeight());

        System.out.println("The summary of height and weight of the patients is");

        System.out.println("Max Height of the patients: " + HealthRecord.getMaxHeight());
        System.out.println("Min Height of the patients: " + HealthRecord.getMinHeight());
        System.out.println("Max Weight of the patients: " + HealthRecord.getMaxWeight());
        System.out.println("Min Weight of the patients: " + HealthRecord.getMinWeight());
    }
}