
public class test {

    public static void main(String[] args) {

        String sample="school dreeed";
        char[] cararray=sample.toCharArray();
        for(int i=0;i<sample.length();i++){
        	for(int j=i+1;j<sample.length();j++){
        		
        		if(cararray[i]==cararray[j]){
        			System.out.println(cararray[j]);
        			break;
        		}
        	}
        	
        }
        	
        		
        	
        
    }
}