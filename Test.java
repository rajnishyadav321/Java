import java.util.*;
class Test{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.next();
		int n=input.nextInt();
		List<String> list=new ArrayList<String>();
		for(int i=0;i<=s.length()-n;i++){
			list.add(s.substring(i,i+n));
		}
		Collections.sort(list);
		//System.out.println(list.get(0));
		//System.out.println(list.get(list.length-1));
		System.out.println(list);
	}
}