import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.EmptyStackException;
public class main {
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los caracteres 'a' y 'b' que seran evaluados en el autómata de pila");
        String texto = sc.nextLine();
        ArrayList<Character> lista = new ArrayList<>();
        for (int i = 0; i < texto.length(); i++) 
        {
            char caracter = texto.charAt(i);
            lista.add(caracter);
        }
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        for (char caracter : lista) 
        {
            System.out.println("Caracter: " + caracter);       
            if(Character.toLowerCase(caracter)=='a')  
            {
                stack.push(1);
            }   
            else if(Character.toLowerCase(caracter)=='b')  
            {
                try 
                {
                    stack.pop();
                } 
                catch (EmptyStackException e) 
                {
                    System.out.println("Intrucciones mal aplicadas");
                }
            }
        }
        try 
        {
            System.out.println(stack.peek());
        } 
        catch (EmptyStackException e) 
        {
            System.out.println("Intrucciones mal aplicadas");
        }
	}
}