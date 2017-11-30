import java.util.NoSuchElementException;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntQueueImpl tester=new IntQueueImpl("LFC");
		System.out.println(tester.size());
		int x=tester.size();
		tester.put((x+1)*4);
		System.out.println(tester.size());
		System.out.println(tester.peek());
		
		
		
		
		
}
}

/*
 * int firstnumbers = 0;
 for (int u=0; u<M;u++){
	 firstnumbers=Integer.parseInt(tokenizer.nextToken());
	 fifos[u].put(4+firstnumbers);//prwtes 3 eisodoi//
}
 */
