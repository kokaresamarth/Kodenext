package ArrayString;
import java.util.StringTokenizer;
public class Tokenizer {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("Kodenest Technologiesw pvt ltd"," ");
		while(st.hasMoreTokens()==true) 
		{
			System.out.println(st.nextToken());
		}
	}

}
