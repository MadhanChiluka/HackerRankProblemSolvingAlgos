import java.util.ArrayList;

public class StringRepeatCount {

public static void main(String[]  args) {
	String s1="I have a pen. You have a pencil";
	String[] s2;
	ArrayList list = new ArrayList();
	int count=0;
	for(int i=0; i<list.size(); i++) {
		s2=s1.split(" ");
		list.add(s2);
		System.out.println(s2[i]);
	}
	for(int i=0; i<list.size(); i++) {
		for(int j=i+1; j<list.size(); j++) {
			list.get(i);
			System.out.println();
			if(list.get(i)==list.get(j)) {
				count++;
				System.out.println(list.get(i)+" "+count);
			}
		}
		System.out.println(list.get(i));
		count=0;
	}
}
}

