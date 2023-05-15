public class Calculator {

    private int num1;
    private int num2;
    private String sign;
    private String answer;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setSign(String sign) {
        switch (sign) {
            case "+":
                this.sign = sign;
                break;
            case "-":
                this.sign = sign;
                break;
            case "*":
                this.sign = sign;
                break;
            case "/":
                this.sign = sign;
                break;
            case "^":
                this.sign = sign;
                break;
            case "%":
                this.sign = sign;
                break;
            default:
                this.sign = "";
                System.out.println("Введенная мат. операция не поддерживается");
        }
    }

    public String getSign() {
        return sign;
    }

    public void setAnswer(String answer) {
        switch (answer) {
            case "yes":
                this.answer = "yes";
                break;
            case "no":
                this.answer = "no";
                break;
            default:
                this.answer = "";
                break;
        }
    }

    public String getAnswer() {
        return answer;
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