
public class StringStudy {

	public static void main(String[] args)
	{
		
		//length string
		
		String A="World";
		String B=new String ("School");
		
		System.out.println(A.length());
		System.out.println(B.length());
		System.out.println("=====================");
		
		
		//to upper case
		
		String C="people";
		String K=new String("Members"); //new memory location
		String P=K.toUpperCase();   // memory store
		System.out.println(P);
		System.out.println(C.toUpperCase());
		System.out.println(K.toUpperCase());
		System.out.println("=====================");
		
		//to LowerCase
		
		String D="PEOPLE";
		System.out.println(D.toLowerCase());
		System.out.println("=====================");
		
		//equals
		
		String E="People";
		String E1="People";
		String E2="People";
		String E3= new String ("People");
		String E4= new String ("PEOPLE");
		
		
		System.out.println(E==E1);
		System.out.println(E1==E2);    // checks memory location  
		System.out.println(E1==E3);
		System.out.println(E3==E4);
		System.out.println("=====================");
		
		System.out.println(E.equals(E1));   // checks index & content
		System.out.println(E1.equals(E2));
		System.out.println(E1.equals(E3));
		System.out.println(E3.equals(E4));
		System.out.println("=====================");
		
		//Equals Ignore Case
		
		System.out.println(E3.equalsIgnoreCase(E4));
		System.out.println("=====================");
		
		//Contains
		
		String F="People";
		
		System.out.println(F.contains("ple"));
		System.out.println("=====================");
		
		//is Empty
		
		String g="People";
		String g1=" ";
		String g2="";
		String g3=null;
		
		System.out.println(g.isEmpty());
		System.out.println(g1.isEmpty());
		System.out.println(g2.isEmpty());
		//System.out.println(g3.isEmpty());
		System.out.println("=====================");
		
		//char At
		
		String H="People";
		
		System.out.println(H.charAt(3));
		System.out.println("=====================");
		
		//ends with
		
		String J="People";
		
		System.out.println(J.endsWith("l"));
		System.out.println(J.endsWith("ople"));
		System.out.println("=====================");
		
		//Starts With
		
		System.out.println(J.startsWith("e"));
		System.out.println(J.startsWith("Peop"));
		System.out.println("=====================");
		
		//Sub String
		
		String X="People ";
		
		System.out.println(X.substring(4));
		System.out.println(X.substring(0));
		System.out.println(X.substring(0,4));
		
		System.out.println("=====================");
		
		//Concate function
		
		String Y="member";
		String Y1=" Function";
		
		System.out.println(Y.concat(Y1));
		System.out.println(Y.concat("ship"+" "+"failed"));
		System.out.println("=====================");
		
		//index of
		
		String Z="people";
		String Z1=new String("Welcome to the world of knowledge");
		
		int index=Z.indexOf('l');
		System.out.println(index);
		
		System.out.println(Z1.indexOf('l'));
		System.out.println(Z1.indexOf('o'));
		System.out.println(Z1.indexOf('e',24));
		System.out.println();
		
		System.out.println("=====================");
		
		//last Integer of ()
		
		
		System.out.println(Z1.lastIndexOf('e'));
		System.out.println("=====================");
		
		//Assign Memory
		
		int Q = Z1.lastIndexOf('W');
		System.out.println(Q);
		System.out.println("=====================");
		
		//Replace
		
        String m4="testing";
        String AB="Physical";
        
        System.out.println(m4.replace('t', 'Z'));
		System.out.println(AB.replace('P', 'Z'));
		
		
		//for practice
		
		int QW=122364;
		System.out.println();
		
		String s1="java ,string ,split ,method ,by ,javatpoint";
		String[] words=s1.split("s");
		System.out.println("**************************");
		for(String w:words){  
			System.out.println(w);  
			}  
		
//		System.out.println(pow.split(pow, index));
		
//		System.out.println(pow.split(X));
	}

}
