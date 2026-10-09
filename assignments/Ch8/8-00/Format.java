public class Format {
    public static void main(String[] args){
        System.out.printf("%-11s%-10s%-14s%s%n", "Height", "Width", "Perimeter", "Area");
        for (int height = 1; height <= 10; height++)
            for (int width = 1; width <= 10; width++)
                System.out.printf("%-11s%-10s%-14s%s%n", height, width, 2 * (height + width), height * width);
    }
}
