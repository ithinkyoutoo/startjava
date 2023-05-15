public class Calculator {

    private int num1;
    private int num2;
    private String sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public boolean setSign(String sign) {
        switch (sign) {
            case "+":
            case "-":
            case "*":
            case "/":
            case "^":
            case "%":
                this.sign = sign;
                return false;
            default:
                System.out.println("Введенная мат. операция не поддерживается");
                return true;
        }
    }

    public void calculate() {
        int result = 1;
        switch (sign) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "^":
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                break;
            case "%":
                result = num1 % num2;
                break;
        }
        System.out.println("Результат: " + result);
    }
}