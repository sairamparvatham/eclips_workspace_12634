package java8features;
@FunctionalInterface
interface Greet{
	void wish();
}
public class MethodReferenceDemo {
public static void sayHello() {
	System.out.println("hello every body");
	
}
public void sayhi(){
	System.out.println("hi every one");
}
public static void main(String[] args) {
	Greet g= ()-> MethodReferenceDemo.sayHello();
	g.wish();
	
	//static Method references
	Greet g2 =MethodReferenceDemo::sayHello;
	g2.wish();
	MethodReferenceDemo d= new MethodReferenceDemo();
	Greet g3 = ()-> d.sayhi();
	g3.wish();
	//Instance method Referenses
	Greet g4= d::sayhi;
	g4.wish();
	
	
}
}
