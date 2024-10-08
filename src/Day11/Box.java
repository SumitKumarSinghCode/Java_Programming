package Day11;

public class Box {

    double width, height, depth;

    Box() // 1
    {
        width=height=depth=0;
    }

    Box(double w,double h,double d) // 2
    {
        width=w;
        height=h;
        depth=d;
    }

    Box(double len) // 3
    {
        width=height=depth=len;
    }

    double volume(){
        return(width*height*depth);
    }
}
