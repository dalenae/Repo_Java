package Classcode;

public class Homework3 {
    public static void main(String[] args) {
        	//	C -> F  fT = cT × 9/5 + 32
        double cTemp = 16;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println(cTemp + "˚C is equal to " + fTemp + "˚F");


	        //C -> K  kT = cT + 273.15
        cTemp = 16;
        double kTemp = cTemp + 273.15;
        System.out.println(cTemp + "˚C is equal to " + kTemp + "˚K");

                //	F -> C cT = (fT - 32) x 5/9
        fTemp=  60;
        cTemp= (fTemp - 32) * 5/9;
        System.out.println(fTemp + "˚F is equal to " + cTemp + "˚C");



                //	F -> K  kT = (fT + 459.67) x 5/9
        fTemp= 60;
        kTemp= (fTemp + 459.67) * 5/9;
        System.out.println(fTemp + "˚F is equal to " + kTemp + "˚K");

                //	K -> C  cT = kT - 273.15
        kTemp= 288.7;
       cTemp= kTemp - 273.15;
        System.out.println(kTemp + "˚K is equal to " + cTemp + "˚C");


	        //	K -> F  fT = kT x 9/5 - 459.67
       kTemp= 288.7;
       fTemp= kTemp * 9/5 - 459.67;
        System.out.println(kTemp + "˚K is equal to " + fTemp + "˚F");

    }
}
