import processing.core.PApplet;

public class Processing_ extends PApplet
{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    float x = 0f,y=0f,z=0f,w=0f;

    public static void main(String[] args)
    {
        PApplet.main("Processing_",args);
    }

    @Override
    public void settings()
    {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void setup() {
        super.setup();
        System.out.println("Printed From Setup");;

    }

    @Override
    public void draw() {
        //WhiteBackground();
        DrawCircle(x,HEIGHT/5);

        DrawCircle(y,2*HEIGHT/5);

        DrawCircle(z,3*HEIGHT/5);

        DrawCircle(w,4*HEIGHT/5);

      /*  int h = HEIGHT/5;
        for(int i =1;i<5;i++)
        {
            x = 0;
            for(float j =0;j<=WIDTH;j+=(i*2)) {

                ellipse(j, h * i, DIAMETER, DIAMETER);
                //for(int k =0;k<=100000;k++);
            }
            //for(long k =0;k<=1000000000;k++);

        }
*/


    }

    private void DrawCircle(float x_axis, int y_axis) {
        ellipse(x_axis,y_axis, DIAMETER, DIAMETER);
        x+=0.2;
        y+=0.4;
        z+=0.6;
        w+=0.8;
    }


    private void WhiteBackground() {
        background(225);
    }
}
