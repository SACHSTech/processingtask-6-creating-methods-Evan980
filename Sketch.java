import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	  // draw flowers
    flower(200, 200, 50, 16);
    flower(200, 600, 100, 8);
    flower(600, 200, 30, 32);

    // draw house
    house(1, 1, 247);
    
  }

  /**
  * draws a house
  *
  * @param intHouseX the X position of the house
  * @param intHouseY the y position of the house
  * @param intScale the scale of the house
  * @return none
  */
  public void house(int intHouseX, int intHouseY, int intScale)
  {
    // body of house
    fill(0, 0, 0);
    rect(intHouseX, intHouseY+(intScale/8), (intScale/2), (intScale/2));

    // roof
    fill(0, 255, 0);
    triangle(intHouseX, intHouseY+(intScale/8), intHouseX+(intScale/4), intHouseY, intHouseX+(intScale/2), intHouseY+(intScale/8));

    // door
    fill(170, 80, 0);
    rect(intHouseX+(intScale/4), intHouseY+((intScale/4)+(intScale/8)), (intScale/8), (intScale/4));
  }

  /** 
  * Draws a flower
  *
  * @param fltFlowerX the X position of the flowers
  * @param fltFlowerY the Y position of the flowers
  * @param intFlowerSize the size of the flowers
  * @param intPetalNum the number of petals on the flower
  * @return none
  */

  public void flower(float fltFlowerX, float fltFlowerY, int intFlowerSize, int intPetalNum){

    // save original position
    pushMatrix();

    fill(0,0,204);
    stroke(0);
    strokeWeight(2);
    translate(fltFlowerX, fltFlowerY);

    // Petals
    for(int i = 1; i <= intPetalNum; i++){
      rotate(TWO_PI / intPetalNum);
      ellipse(0, 0, 3 * intFlowerSize, intFlowerSize / 2);
    }

    // middle
    fill(255, 255, 200);
    ellipse(0, 0, intFlowerSize, intFlowerSize);

    // reset to original position
    popMatrix();
    }
  
}