class Staticandinstancevariables
 {
static int a = 10;
int b = 20;
public static void main(String[] args) {
System.out.println("Static variable: " +  Staticandinstancevariables.a);
Staticandinstancevariables obj = new Staticandinstancevariables();
System.out.println("Instance variable: " + obj.b);
}
}