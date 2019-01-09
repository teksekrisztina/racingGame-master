package org.fasttrackit;
// inheritance or "is-a" relationship
public class Car extends AutoVehicle   {

  //instanc variables (declared as properties of a class)
  // they receive default values (null for objects, 0 for numbers ,
  // false for booleans)

  int doorCount;


  public Car(Engine engine) {
    super(engine);
  }
}
