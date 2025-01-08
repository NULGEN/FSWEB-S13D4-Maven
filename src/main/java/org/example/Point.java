package org.example;

public class Point {
  private  int x;
  private   int y;

  public Point(int x, int y){
      this.x =x;
      this.y = y;
  }
  // Getter
  public  int getX(){
      return  this.x;
  }
  public  int getY(){
        return  this.y;
  }
// Setter
  public void  setX(int x){
      this.x = x;
  }
  public  void  setY(int y){
      this.y = y;
  }
// (0,0) noktası icin
  public  double distance(){

      return  Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

  }
  // √ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
  public  double distance(Point p){
      if(p== null) {
          System.out.println("point objesi null geldi");
       return 0; };

      //double calc = Math.pow((this.x-p.x),2) + Math.pow((this.y-p.y),2);
     // return  Math.sqrt(calc);
      return  distance(p.x, p.y);

  }
  public  double distance(int a, int b){
      double calc = Math.pow((this.x-a),2) + Math.pow((this.y-b),2);
        return  Math.sqrt(calc);

  }
}
