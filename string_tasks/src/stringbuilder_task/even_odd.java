package stringbuilder_task;

public class even_odd {

	public static void main(String[] args) {
		String s = "hello my name is mohan kumar how are you";
		StringBuilder sb = new StringBuilder();
		String ar[] = s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].length() % 2==0)
			{
				sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
			}
		 else {
			 int m=ar[i].length()/2;
			 sb.append(ar[i].substring(0,m)).append(Character.toUpperCase(ar[i].charAt(m))).append(ar[i].substring(m+1)).append(" ");
			
		}
	}
		System.out.println(sb.toString().trim());

}
}
