void setup() {
  fullScreen();
  background(33);
  frameRate(60);
}
// y = 5x
//
// x = 5t
// y = 3t + 3
float t;


void draw(){
  stroke(82, 185, 215, 15);
  strokeWeight(1);

  translate(width/2, height/2);

  noFill();
  smooth();
  beginShape(POLYGON);
  vertex(0,0);
  bezierVertex(x1(t), y1(t), x2(t), y2(t), x3(t), y3(t));
  vertex(0,0);
  endShape();
  t++;
}

float x1(float t) {
  return sin(t / 10) * 200;
}
float y1(float t) {
  return cos(t / 10) * 200;
}

float x2(float t) {
  return cos(t / 10) * 100;
}
float y2(float t) {
  return sin(t / 10) * 500;
}

float x3(float t) {
  return sin(t / 10) * 200;
}
float y3(float t) {
  return sin(t / 10) * 200;
}

float c1(float t) {
  return sin(t / 10) * 200;
}
float d1(float t) {
  return sin(t / 10) * 200;
}
