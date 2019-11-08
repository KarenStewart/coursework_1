class Dec2Hex {

    private static int arg1;

    public static void main(String... args) {
        Dec2Hex dec2Hex = new Dec2Hex();
        System.out.println("Hexadecimal representation is : " + dec2Hex.convert(args));
    }

    // default private-package access for testing.
    String convert(String... args) {

        if (args.length <= 0) {
            System.err.println("Error! Cannot be empty please enter a value.");
            System.exit(1);
        } else {
                System.exit(1);
            }

        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        int num = arg1;
        String hexadecimal = "";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (true) {
            if (num == 0) break;
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        return hexadecimal;

    }
}