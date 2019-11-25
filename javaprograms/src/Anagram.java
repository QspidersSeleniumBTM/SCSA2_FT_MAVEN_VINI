import java.util.Arrays;
class  Anagram
{
	static void isAnagram(String str1,String str2)
	{
         String s1=str1.replaceAll("\\s","");
         String s2=str2.replaceAll("\\s","");
		 boolean status = true;
		 if (s1.length()!=s2.length())
		 {
			 status=false;
		 }
		 else
		{
			 char arrays1[]=s1.toLowerCase().toCharArray();
			 char arrays2[]=s2.toLowerCase().toCharArray();
			 Arrays.sort(arrays1);
			 Arrays.sort(arrays2);
			 status = Arrays.equals(arrays1,arrays2);
		}
	}
	public static void main(String[] args) 
	{
		isAnagram("keep","peek");
		isAnagram("Mother in low","Hitler women");
	}
}
