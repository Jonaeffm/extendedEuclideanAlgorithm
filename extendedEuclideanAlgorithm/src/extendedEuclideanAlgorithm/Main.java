package extendedEuclideanAlgorithm;

import java.util.ArrayList;
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
	public static Line createLine(Line l, Line m)
	{
		
		m.setA(l.getB());
		m.setB(l.getR());
		return m;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Lines = new ArrayList<>();
		System.out.println("first int:");
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		a = reader.nextInt(); // Scans the next token of the input as an int.
		System.out.println("second int:");
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
		Line m;
		while(true)
		{
			if(l.getB()==0)
				break;
			
			l=computeLine(l);
		
		Lines.add(l);
		m = new Line();
		m=createLine(l,m);
		
		l=m;
		
		}
		
		Line n = Lines.get(Lines.size()-1);
		
		n.setX(0);
		n.setY(1);
		Lines.remove(Lines.size()-1);
		Lines.add(n);
		
		for(int i=Lines.size()-2;i>(-1);i--)
		{
			Line o = Lines.get(i);
			Line p = Lines.get(i+1);
			o.setX(p.getY());
			o.setY(p.getX()-o.getQ()*o.getX());
			System.out.println("Line "+i);
			System.out.println("X= "+o.getX()+" Y="+o.getY());
			System.out.println();
		}
		
	}

}
