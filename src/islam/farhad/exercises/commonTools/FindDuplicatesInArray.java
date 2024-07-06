package islam.farhad.exercises.commonTools;

public class FindDuplicatesInArray {
    public static void main(String[] args) {

        final String [] strArray = {"a", "b", "c", "a", "e"};
        String [] strArrayUniques = new String[strArray.length-1];
        for ( int i=0; i < (strArray.length-1) ; i++){
            for(int j = i +1; j<strArray.length; j++){
                if( strArray[i].equals(strArray[j])) {
                    System.out.println("Duplicates found : " + strArray[j]);
                }else
                    strArrayUniques[i] = strArray[i+1];
            }
        }

    }
}
