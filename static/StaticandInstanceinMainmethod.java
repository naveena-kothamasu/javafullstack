public class StaticandInstanceinMainmethod {
static void staticmethod() {
System.out.println("Static method");
}
void instancemethod() {
System.out.println("Instance method");
}
public static void main(String[] args) {
staticmethod();
StaticandInstanceinMainmethod obj = new  StaticandInstanceinMainmethod();
obj.instancemethod();
}
}