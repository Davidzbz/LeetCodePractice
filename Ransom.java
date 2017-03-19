/**
 * Created by baizhongzhang on 2016-10-02.
 */
import java.util.*;



public class Ransom {
        public static Map<String, Integer> magazineMap;
        public static Map<String, Integer> noteMap;

        public Ransom(String magazine, String note) {
            magazineMap = new HashMap<String, Integer>();
            noteMap = new HashMap<String, Integer>();
            int i=0;
            int begin = 0;
            String word = "";
            while(i<magazine.length()){
                String temp = String.valueOf(magazine.charAt(i));
                if(temp.equalsIgnoreCase(" ") || i==magazine.length()-1){
                    word = magazine.substring(begin, i);
                    if(magazineMap.containsKey(word)){
                        int count = magazineMap.get(word);
                        count = count +1;
                        magazineMap.put(word, count);
                    }
                    else{
                        magazineMap.put(word, 1);
                    }
                    begin = i+1;
                }
                i++;
            }
            int j=0;
            int begin1 = 0;
            String word1 = "";
            while(j<note.length()){
                String temp = String.valueOf(note.charAt(j));
                if(temp.equalsIgnoreCase(" ") || j==note.length()-1){
                    word1 = note.substring(begin1, j);
                    if(noteMap.containsKey(word1)){
                        int count = noteMap.get(word1);
                        count = count +1;
                        noteMap.put(word1, count);
                    }
                    else{
                        noteMap.put(word1, 1);
                    }
                    begin1 = j+1;
                }
                j++;
            }

        }
        public boolean solve() {
            boolean valid = false;
            int length = noteMap.size();
            int x = 0;
            int count = 0;
            for (Map.Entry<String, Integer> entry : noteMap.entrySet()){
                int tem = entry.getValue();
                count = count + tem;
                if(magazineMap.containsKey(entry.getKey()) ){
                    x++;
                    if(magazineMap.get(entry.getKey()) >= noteMap.get(entry.getKey())){
                        int temp1 = magazineMap.get(entry.getKey());
                        int temp2 = noteMap.get(entry.getKey());
                        if(temp1 == 1){
                            magazineMap.remove(entry.getKey());
                        }
                        else if(temp1 > 1){
                            temp1 = temp1 -1;
                            magazineMap.put(entry.getKey(), temp1);
                        }

                        if(temp2 == 1){
                            magazineMap.remove(entry.getKey());
                        }
                        else if(temp2 > 1){
                            temp2 = temp2 -1;
                            magazineMap.put(entry.getKey(), temp2);
                        }
                    }

                }
            }
            if(x == count){
                valid = true;
            }
            else{
                valid = false;
            }
            return valid;
        }

}


