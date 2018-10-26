public class Ex04
{
	public static void main(String[] args)
	{
		String cde = "cde";
		String c = "abc".substring(2,3);
		String d = cde.substring(1,2);
		
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		char[] a = {'A', 'B', 'C', 'D'};
		
		String abcd = new String(a);
		System.out.println("abcd = " + abcd);
		
		for (int i = 0; i < abcd.length(); i++)
		{
			System.out.println("abcd.CharAt(" + i + ") = " + abcd.charAt(i));
		}
		
		String chage_abcd = abcd.replaceAll("A", "E");
		System.out.println("chage_abcd = " + chage_abcd);
		System.out.println("abcd = " + abcd);
		
		String str = "국어:90:영어:80:수학:70";
		String str_ary[] = str.split(":");
		
		for (int i = 0; i < str_ary.length; i++)
		{
			System.out.println("str_ary[" + i + "] = " + str_ary[i]);
		}
		
		String str1 = abcd.toLowerCase();
		System.out.println("str1 = " + str1);
		System.out.println("abcd = " + abcd);
		
		double ddd = 3.14d;
		String str2 = String.valueOf(ddd);
		System.out.println(str2.split("\\.")[0]);
		System.out.println(str2.split("\\.")[1]);
	}
}