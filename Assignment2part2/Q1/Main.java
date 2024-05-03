package Assignment2part2.Q1;

class Pair<k,v>{
    private k key;
    private v value;
    Pair(k key, v value){
        this.key=key;
        this.value=value;
    }
    public k getkey(){
        return this.key;
    }
    public v getvalue(){
        return this.value;
    }
    public void setkey(k key){
        this.key=key;
    }
    public void setvalue(v value){
        this.value=value;
    }

}

public class Main {
    public static void main(String[] args) {
        Pair<String,Integer> p1=new Pair<>("Apple",1);
        Pair<Character,Integer> p2=new Pair<>('B',2);

        System.out.println("Pair one contains key:"+p1.getkey()+" and value:"+p1.getvalue());
        System.out.println("Pair two contains key:"+p2.getkey()+" and value:"+p2.getvalue());
        
    }
    
}
