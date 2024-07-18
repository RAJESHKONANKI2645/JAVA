class R192211900 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 10; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
