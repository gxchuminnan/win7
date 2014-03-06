package book2;

import java.util.Random;
//随机数 生成效率问题  Random   Math函数

public class RandomMath {
	public static void main(String[] args){
	Random r = new Random();
	long startTime = System.nanoTime() ;
	int i1 = r.nextInt( 1000000000);
	System.out.println(i1);
	long endTime = System.nanoTime();
	System.out.println("Random.nextInt(): "+(endTime - startTime));

	long startTime2 = System.nanoTime();
	int i2 = (int) (java.lang.Math.random() * 1000000000);
	System.out.println(i2);
	long endTime2 = System.nanoTime();
	System.out.println("Math.random():" + (endTime2 - startTime2));
	}
}
