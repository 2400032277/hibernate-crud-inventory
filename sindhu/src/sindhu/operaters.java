package sindhu;

public class operaters {
	public static void main(String[] args) {
		int a = 10,b=3;
		System.out.println("Arithmetic Operators");
		System.out.println("a+b =" +(a+b));
		System.out.println("a-b =" +(a-b));
		System.out.println("a*b =" +(a*b));
		System.out.println("a/b =" +(a/b));
		System.out.println("a%b =" +(a%b));
		
		System.out.println("\nUnary Operators:");
        int c = +a;
        int d = -b;
        System.out.println("+a = " + c);
        System.out.println("-b = " + d);
        System.out.println("a++ = " + (a++));
        System.out.println("a after a++ = " + a);
        System.out.println("++b = " + (++b));
        
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        
        System.out.println("\nLogical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        
        System.out.println("\nAssignment Operators:");
        int g = 10;
        System.out.println("g = " + g);
        g += 5;
        System.out.println("g += 5: " + g);
        g -= 3;
        System.out.println("g -= 3: " + g);
        g *= 2;
        System.out.println("g *= 2: " + g);
        g /= 4;
        System.out.println("g /= 4: " + g);
        g %= 3;
        System.out.println("g %= 3: " + g);
        
	}
	

}
