/*QueueSimulation.java 
*project domwn dedomenwn
*NTOULOS PANAGIWTHS
*ARGURHS ROYSTEMHS

/**
@author
*/
import java.util.Scanner;
import java.util.StringTokenizer;


public class QueueSimulation {
	public final static int M=3;
	public static void main(String[] args) {
		String numbers;
		int maximumTime=-1;
		
		double m=0;
IntQueueImpl [] fifos=new IntQueueImpl[M];
		for(int i=0;i<M;i++){
			fifos[i]=new IntQueueImpl();
		}
		fifos[0].name="cash 1";
		fifos[1].name="cash 2";
		fifos[2].name="cash3";
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("give me time instants : ");
		 numbers=scanner.nextLine();
		 int arraysize=0;
		 StringTokenizer tokenizer = new StringTokenizer(numbers," ");
		/*
		 * **********************************
		 * elegxos an no>n1...n-1>n mporei na arxisoume to for kai apo to i=i kai na valoume i<=arraysize-1
		 *************************/
		 
		 StringTokenizer tokenizer1 = new StringTokenizer(numbers," ");
		 StringTokenizer tokenizer2 = new StringTokenizer(numbers," ");
		 while (tokenizer1.hasMoreTokens()){
			 arraysize++;
			 tokenizer1.nextToken();
		 }
		 int[] num=new int[arraysize];
		 while (tokenizer2.hasMoreTokens()){
			 for(int f=0;f<arraysize;f++){
				 num[f]=Integer.parseInt(tokenizer2.nextToken());
			 }
		 }
		
		 int firstnum=num[0];
		 for(int o=0;o<arraysize-1;o++){
			 if (firstnum>num[o+1])
				 System.exit(0);
			 firstnum=num[o+1];
				 
		 }
		 /*************************/
		
		 
			 
		 
		 int i=0;
		//time//
		 while (tokenizer.hasMoreTokens()){
			 int time=Integer.parseInt(tokenizer.nextToken());
			 for(int m2=0;m2<M;m2++){
				 if(!fifos[m2].isEmpty()){//an den einai adeia/
					if(fifos[m2].peek()<=time){//kai an h xronikh stimgh einai megaluterh//
						fifos[m2].get();//apo to xrono exuphretisis tote dioxe//
					}
			 }}
			 
			 
			 int min1=min(fifos);//to tameio me to mikrotero size//
			
	//fifos[min1].size()+1)*//
			 fifos[min1].put((fifos[min1].size()+1)*4+time);//size tameiou +1(arxizei apo 0)*ton xrono pou 8elei na e3uphreti8ei +ton xrono pou mphke//
			
			m+=fifos[min1].lastNode.data-(time-1);//opws leei h ekfwnish//
			i++;
			maximumTime=fifos[0].lastNode.data;
			for(int q=0;q<M;q++){		//euresh maximum tou teleutaiou
				if(!fifos[q].isEmpty()){//mas dinei pote 8a fugei o teleutaios pelaths.
				if(fifos[q].lastNode.data>maximumTime){
					maximumTime=fifos[q].lastNode.data;
			}
				}
			}
		 }
		 if(i==1){
			 m=0;
		 }else{
		 
		 m=(m)/i-1;}
		 System.out.println("average waithing time : "+m);
		
		 
		 System.out.println("finished all clients at : "+maximumTime);
		 
		 for(int k=0;k<M;k++){
				fifos[k].printQueue(System.out);
			}
		 
		 
	}
/**
 * Min{i} method 
 * @return minimum i 
 * helps to find the minimum size of a cashier
 * 
 */
	public static int min(IntQueueImpl [] array){
		int minimum=array[0].size();
		int minimumi=0;
		for(int i2=0;i2<M;i2++){
			if(array[i2].size()<minimum){
				minimum=array[i2].size();
			minimumi=i2;
		}
		
		}
		return minimumi;}
	/**
	 * Max{i} method 
	 * @return MaxSize 
	 * helps to find the total time needed
	 * 
	 */
	public static int max(IntQueueImpl [] array){
		int max=array[0].size();
		
		for(int i2=0;i2<M;i2++){
			if(array[i2].size()>max){
				max=array[i2].size();
			
		}
		
		}
		return max;
		
	
	}
	/**
	 * Max{time} 
	 * @param array1
	 * @return
	 */
	public static int maxtime(int[] array1){
		int max=array1[0];
		for(int i=0;i<array1.length;i++){
			if(array1[i]>max)
				max=array1[i];}
		
				
		return max;
	}
	/**
	 * elegxos an oles oi oures einai adeies
	 * @param array
	 * @return
	 */
	public static boolean allempty(IntQueueImpl [] array){
		boolean empty=true;//estw oti einai adeies//
		for(int i=0;i<M;i++){
			if(!(array[i].isEmpty()))//an mia den einai adeia tote den einai adeies//
			empty=false;
		}
		
		return empty;
	}
	public static boolean allempty1(IntQueueImpl [] array){
		boolean empty=true;//estw oti ektos ths prwths einai adeies//
		for(int i=1;i<M;i++){
			if(!(array[i].isEmpty()))//an mia den einai adeia tote den einai adeies//
			empty=false;
		}
		
		return empty;
	}
	
}
