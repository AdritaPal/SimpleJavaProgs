import java.io.*;
import java.util.*;

public class Test {

		
		public static void main(String[] args) throws IOException {
			List<String> list = new LinkedList<>();
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("No. of Names: ");
			int c=Integer.parseInt(br.readLine());
			for (int i=0;i<c;i++) {
				list.add(br.readLine());
			}
			System.out.println("elemnets: "+list);
			list = Collections.unmodifiableList(list);
			try {
				list.add(br.readLine());
			}
			catch
				(UnsupportedOperationException unsupportedOperationException){
				System.out.println("not possible");
				}
			
		}
}
