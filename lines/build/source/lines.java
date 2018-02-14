import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class lines extends PApplet {

public void setup() {
  
  background(33);
  frameRate(60);
}


// y = 5x
//
// x = 5t
// y = 3t + 3
float t;



public void draw(){
  stroke(82, 185, random(255), 15);
  strokeWeight(1);

  translate(width/2, height/2);

  noFill();

  beginShape(POLYGON);
  vertex(0,0);
  bezierVertex(x1(t), y1(t), x2(t), y2(t), x3(t), y3(t));
  vertex(0,0);
  endShape();
  t++;
}

public float x1(float t) {
  return sin(t / 10) * 200;
}
public float y1(float t) {
  return cos(t / 10) * 200;
}

public float x2(float t) {
  return cos(t / 10) * 500;
}
public float y2(float t) {
  return sin(t / 10) * 500;
}

public float x3(float t) {
  return sin(t / 4) * 200;
}
public float y3(float t) {
  return cos(t / 4) * 200;
}

public float c1(float t) {
  return sin(t / 10) * 200;
}
public float d1(float t) {
  return sin(t / 10) * 200;
}
  public void settings() {  fullScreen(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "lines" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
