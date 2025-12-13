package interviewPractice;

public class MajorityElement {
	static int majorityElement(int[] arr) {
		int count = 1;
		int maj = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==maj) {
				count++;
			}else {
				count--;	
			}
			if(count==0) {
				maj = arr[i];
				count =1;
			}
			
		}
		return maj;
	}
		
		

	public static void main(String[] args) {
		int[] arr = {2,2,1,1,1,2,2,1,1};
		System.out.println(majorityElement(arr));
	}

}
