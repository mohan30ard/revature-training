package stringbuilder_task;

public class LastUpper {
	public static void main(String[] args) {
		
	String s="hello my name is mohan kumar how are you";
	StringBuilder sb = new StringBuilder();
	String ar[]=s.split(" ");
	
	for(int i =0;i<ar.length;i++)	
	{
		sb.append(ar[i].substring(0,ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
	}
	System.out.println(sb.toString().trim());

}
}
