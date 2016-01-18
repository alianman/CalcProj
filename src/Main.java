public class Main {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Invalid number of arguments!");
            return;
        }

        String arg1 = args[0];
        String arg2 = args[2];

        String operation = args[1];

        String result = null;
        double arg1Value;
        double arg2Value;

        try {
            arg1Value = Double.parseDouble(arg1);
            arg2Value = Double.parseDouble(arg2);
        }
        catch (NumberFormatException ex) {
            System.out.println("Invalid operation arguments!");
            return;
        }

        try {
            if (operation.equalsIgnoreCase("plus")) {
                result = String.valueOf(arg1Value + arg2Value);
            }
            else if (operation.equalsIgnoreCase("minus")) {
                result = String.valueOf(arg1Value - arg2Value);
            }
            else if (operation.equalsIgnoreCase("div")) {
                if (arg2Value == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
                result = String.valueOf(arg1Value / arg2Value);
            }
            else if (operation.equalsIgnoreCase("mult")) {
                result = String.valueOf(arg1Value * arg2Value);
            }
            else {
                System.out.println("Invalid operation!");
                return;
            }
        }
        catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
            return;
        }

        System.out.println(arg1 + " " + operation + " " + arg2 + " = " + result);
    }
}
