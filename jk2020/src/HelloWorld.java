
public class HelloWorld {
public static void main(String[] args){
	System.out.println("Œ‰∫∫º””Õ");
	System.out.println("Œ‰∫∫º””Õ1");
	System.out.println("Œ‰∫∫º””Õ2");
	System.out.println("Œ‰∫∫º””Õ3");
  System.out.println(Math.abs(-7));
  System.out.println(Math.random());
  
  int x;
  int y;
  for (x = 1, y = 1; x <= 100; x++) {
   if (y >= 20) {
    break;
   }
   if (y % 3 == 1) {
    y += 3;
    continue;
   }
   y -= 5;
  }
 System.out.println("x=" + x + ",y=" + y);
}
}

