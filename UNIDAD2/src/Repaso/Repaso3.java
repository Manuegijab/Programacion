package Repaso;

public class Repaso3 {
public static void main(String[] args) {
	Repaso3 r = new Repaso3();

	int[]tabla1= {1,4,2,7};
	int[]tabla2= {1,4,3,7};
	r.comparatablas(tabla1,tabla2);
	System.out.println(r.comparatablas(tabla1, tabla2));

}

 boolean comparatablas(int[]tabla1, int[]tabla2) {
	boolean es=true;
	
	if(tabla1.length!=tabla2.length) {
		es=true;}
		else {
			for(int i = 0;i<tabla1.length;i++) {
				if(es==true &&tabla1[i]==tabla2[i]) {
					es=true;}
					else {
						es=false;
					}
				}
			}
		
	
	
	return es;
	}

}