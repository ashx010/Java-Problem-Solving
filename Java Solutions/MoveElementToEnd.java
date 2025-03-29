import java.util.*;

class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(
            List<Integer> array, int toMove
    ) {
        int x=0, y=array.size()-1;

        while(x<y){
            if(array.get(y) == toMove){
                y--;
                continue;
            }
            if(array.get(x) == toMove){
                int temp = array.get(x);
                array.set(x, array.get(y));
                array.set(y, temp);
                x++;
                y--;
            }else{
                x++;
            }
        }
        return array;
    }
}
