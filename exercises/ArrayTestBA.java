package exercises;

public class ArrayTestBA {

   
    static public boolean[] coolArray(int size, int position)  {
        // if (position >= size) throw new  ArrayIndexOutOfBoundsException("error");
        // if (position < 0) throw new ArrayIndexOutOfBoundsException("Error: index cant be less than 0.");
        if (position >= size) throw new IllegalArgumentException("");
        boolean[] boolArray = new boolean[size]; 
        boolArray[position] = true; 
        return boolArray; 
    }

    public static void main(String[] args) {
        
       try{ boolean[] array1 = coolArray(3,5);

        for(boolean a : array1){
            System.out.println(a);
        }
    }catch (IllegalArgumentException a) {
        System.out.println(a.getMessage());

    }
    System.out.println("hej");
    

    }
    
}
