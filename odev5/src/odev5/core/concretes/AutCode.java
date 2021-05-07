package odev5.core.concretes;

import java.util.Random;

public class AutCode {
 public int randomSayi() 
 { Random r=new Random(); //random sýnýfý
    int a=r.nextInt(100);
	 return a;
 }
}
