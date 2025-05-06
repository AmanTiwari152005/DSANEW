public class FlipImage {

    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            // Reverse and invert the row
            for (int i = 0; i < (row.length + 1) / 2; i++) {
                // XOR with 1 to invert (0 -> 1, 1 -> 0)
                int temp = row[i] ^ 1;
                row[i] = row[row.length - 1 - i] ^ 1;
                row[row.length - 1 - i] = temp;
            }
        }
        return image;
    }

    // Helper method to print the image
    public static void printImage(int[][] image) {
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        FlipImage fi = new FlipImage();

        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        System.out.println("Original Image:");
        printImage(image);

        int[][] flippedImage = fi.flipAndInvertImage(image);

        System.out.println("\nFlipped and Inverted Image:");
        printImage(flippedImage);
    }
}
