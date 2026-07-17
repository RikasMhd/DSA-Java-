import java.util.ArrayList;
public class findIntersection{
	public static void main (String [] args){
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		
		list1.add(3);
		list1.add(7);
		list1.add(2);
		list1.add(4);
		
		list2.add(0);
		list2.add(5);
		list2.add(2);
		list2.add(3);
		
		
		System.out.println("ArrayList 1");
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i)+" ");
		}
		System.out.println("");		 
		     
		System.out.println("ArrayList 2");
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i)+" ");
		}
		System.out.println("");
		System.out.println("Intersection Array");                                                                         
		for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    System.out.println(list1.get(i));
                }
            }
        }                                                                  
	}
}
