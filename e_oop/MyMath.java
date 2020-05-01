package e_oop;

import java.util.Arrays;

public class MyMath {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		int max = mm.max(new int[]{2,5,1,4,8});
		System.out.println(max);
		
		int min = mm.min(new int[]{2,5,1,4,8});
		System.out.println(min);
		
		double round = mm.round(3.15, 2);
		System.out.println(round);
		
		int[] sort = mm.sort(new int[]{2,5,1,4,8}, "DESC");
		System.out.println(Arrays.toString(sort));
		
		mm.printSampleClass(new SampleClass());
		
		SampleClass scr1 = new SampleClass();
		scr1.bool = true;
		scr1.field = 10;
		scr1.str = "abc";
		mm.printSampleClass(scr1);
		
		SampleClass scr2 = new SampleClass();
		scr2.bool = false;
		scr2.field = 20;
		scr2.str = "ABC";
		mm.printSampleClass(scr2);
	}
	
	int[] array(int num[], String select){
		switch (select){
		case "올림":
			for(int i = 1; i < num.length; i++){
				int temp = num[i];
				for(int j = i - 1; j >= 0 ;j--){
					if(temp < num[j]){
						num[j+1] = num[j];
						num[j] = temp;
					}
				}
			}
			return num;
		default:
			for(int i = 1; i < num.length; i++){
				int temp = num[i];
				for(int j = i - 1; j >= 0 ;j--){
					if(temp > num[j]){
						num[j+1] = num[j];
						num[j] = temp;
					}
				}
			}
			return num;
			
		}
	}
	
	
	
	double maximum(double num[]){
		double max = num[0];
		for(int i = 0; i < num.length; i++){
			if( max < num[i]){
				max = num[i];
			}
		}
		return max;
	}
	
	double minimum(double num[]){
		double min = num[0];
		for(int i = 0; i < num.length; i++){
			if( min > num[i]){
				min = num[i];
			}
		}
		return min;
	}
	
//	double round(double num, int count){
//		return Math.round(num * Math.pow(10, count - 1)) / Math.pow(10, count - 1);
//	}
	
	
	//선생님이 짜주신 코드
	int max(int[] a){
		int max = a[0];
		
		for( int i = 0; i < a.length; i++){
			if(max < a[i]){
				max = a[i];
			}
		}
		return max;
	}
	
	int min(int[] a){
		int min = a[0];
		
		for( int i = 0; i < a.length; i++){
			if(min > a[i]){
				min = a[i];
			}
		}
		return min;
	}
	
	double round(double a, int b){
		int temp = 1;
		for(int i = 1; i < b; i++){
			temp *= 10;
		}
		return Math.round(a * temp + 0.5) / (double)temp;
	}
	
	int[] sort(int[] arr, String orderBy){
		//원래 있던 배열을 보존하기 위해서 새로운 배열을 만든다                                                              
		int[] rtnArr = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			rtnArr[i] = arr[i];
		}
		
		for(int i = 0; i < rtnArr.length - 1; i++){
			for( int j = i;j < rtnArr.length; j++){
				if(orderBy.equals("ASC")){
					if(rtnArr[i] > rtnArr[j]){
						int temp = rtnArr[i];
						rtnArr[i] = rtnArr[j];
						rtnArr[j] = temp;
					}
				}else if(orderBy.equals("DESC")){
					if(rtnArr[i] < rtnArr[j]){
						int temp = rtnArr[i];
						rtnArr[i] = rtnArr[j];
						rtnArr[j] = temp;
					}
				}
				
			}
		}
		return rtnArr;
	}
	
	void printSampleClass(SampleClass sc){
		System.out.println("bool: " + sc.bool);
		System.out.println("field: " + sc.field);
		System.out.println("str: " + sc.str);
	}
	
	
}




























