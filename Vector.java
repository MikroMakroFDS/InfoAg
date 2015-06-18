/**
 * Created by Genkinger Lukas on 5/30/2015.
 * Simple 3Dim. Vector Class.
 */

public class Vector {
    public float x = 0;
    public float y = 0;
    public float z = 0;

    //standard constructor (non-declaring)
    public Vector(){

    }

    //standard constructor (declaring)
    public Vector(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //get the length of the Vector (static)
    public static float getLength(Vector vec){
       float res = (float)Math.sqrt((Math.pow(vec.x,2)+ Math.pow(vec.y,2) + Math.pow(vec.z,2)));
        return res;
    }

    //get the length of the Vector (non-static)
    public  float getLength(){
        float res = (float)Math.sqrt((Math.pow(this.x,2)+ Math.pow(this.y,2) + Math.pow(this.z,2)));
        return res;
    }

    //get the Angle between two Vectors in Radians (static)
    public static float getAngleRad(Vector vec1, Vector vec2){
        float res = (float)Math.acos(((vec1.x * vec2.x) + (vec1.y * vec2.y) + (vec1.z * vec2.z)) / (vec1.getLength() * vec2.getLength()));
        return res;
    }

    //get the Angle between two Vector in Degrees (non-static)
    public static float getAngleDeg(Vector vec1,Vector vec2){
        float res = getAngleRad(vec1,vec2);
        res = res/(float)Math.PI * 180;
        return res;
    }

    public static void puts(Vector vec){
        System.out.printf("(%f|%f|%f)",vec.x,vec.y,vec.z);
    }

    public void selfPrint(){
        System.out.printf("(%f|%f|%f)",this.x,this.y,this.z);
		
    }
}
