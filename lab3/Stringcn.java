import java.util.*;

public class  Stringcn
{
		public static void main(String args[])
		{
				Scanner s=new Scanner(System.in);

			System.out.println("Enter string 1 = ");
				String a=s.nextLine();
			System.out.println("Enter string 2 = ");
				String b=s.nextLine();
			int l=a.length();
			System.out.println("Length of string = "+l);
//1
			String s1=new String();
				System.out.println("String() "+s1);

			char ch[]= new char[l];

				for(int i=0;i<l;i++)
					ch[i]=a.charAt(i);
//2
				String s3=new String(ch);
					System.out.println("String(ch) ="+s3);
//3
		String s4=new String(ch,1,3);
					System.out.println("String(ch,int,int) ="+s4);
//4
					String s5=new String(a);
				System.out.println("toUppercase() = "+a.toUpperCase());
				System.out.println("toLowercase() = "+a.toLowerCase());
				System.out.println("indexOf(int ch) = "+s5.indexOf('e'));
				System.out.println("indexOf(int ch,int) = "+s5.indexOf('e',2));
				System.out.println("lastIndexOf(int ch) = "+s5.lastIndexOf('i'));
				System.out.println("lastIndexOf(int ch,int) = "+s5.lastIndexOf('i',3));
				System.out.println("replace(ch,ch) = "+s5.replace('i','w'));
				System.out.println("concat(string) = "+s5.concat("RDH"));
				System.out.println("compareTo(string) = "+s5.compareTo(b));
		}
}