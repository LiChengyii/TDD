package testing;
public class Colour {
    public final static String DEFAULT_MODEL = "RGB";
    //Color model
    private String model;
    //Color value
    private int value;

    public Colour(String model, int red, int green, int blue){
        if(model == null || DEFAULT_MODEL.equals(model)){
            value = 0xff000000 | ((red & 0xFF) << 16) | ((green & 0xFF) << 8) | blue & 0xFF;
        }else{
            value = 0;
        }
    }
}