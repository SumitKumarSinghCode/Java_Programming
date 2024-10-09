package Day12;

public class ThisKeyword {

    int x,y; //Class Variables / Instance Variable

    void setData(int x,int y) // a,b are local variables
    {
        this.x=x; //if we want to use same name as local variable, we use this keyword for class variable.
        this.y=y;
    }

    void display()
    {
        System.out.println(x+" "+y);
    }

    public static void main(String[] args){
        ThisKeyword th = new ThisKeyword();
        th.setData(10,20);
        th.display();
    }

}
