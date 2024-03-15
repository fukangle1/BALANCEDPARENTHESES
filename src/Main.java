    import java.util.Scanner;

    public class Main {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an expression with only {, }, (, ), [, ]: ");
            String expression = scanner.nextLine();
    
            Balancedparentheses balancedParentheses = new Balancedparentheses();
            if (balancedParentheses.checkBalancedParentheses(expression)) {
                System.out.println("The expression has balanced parentheses.");
            } else {
                System.out.println("The expression does not have balanced parentheses.");
            }
        }
    }
