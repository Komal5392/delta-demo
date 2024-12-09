package ab46;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Selenium";
        
        // Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();
        
        // Move the first character of the reversed string to the end
        //String output = reversed.substring(1) + reversed.charAt(0);
        
        // Print the result
        System.out.println(reversed);  // Output: muineleS
    }
}