package extendedEuclideanAlgorithm;

import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Line> Lines;
	
	public static  Line computeLine(Line l)
	{
		int c = l.getA()/l.getB();
		int d=c;
		l.setQ(d);
		c=l.getA()%l.getB();
		l.setR(c);
		System.out.println("line: A="+l.getA()+" B="+l.getB());
		System.out.println("Q="+l.getQ()+" R="+l.getR());
		return l;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		
		System.out.println("Hello World!");
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		a = reader.nextInt(); // Scans the next token of the input as an int.
		b = reader.nextInt(); 
		//once finished
		reader.close();
		System.out.println("a:"+a+" b:"+b);
		if (a<b)
		{	
			int c =  b;
			b=a;
			a=c;
			System.out.println("getaischt: a:"+a+" b:"+b);
		}
		Line l = new Line();
		l.setA(a);
		l.setB(b);
		l=computeLine(l);
		Lines.add(l);
	}

}
