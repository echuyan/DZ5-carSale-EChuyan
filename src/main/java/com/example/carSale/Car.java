package com.example.carSale;

public class Car {
  //  private ClassicConfiguration classicConfiguration;
 //   private SportConfiguration sportConfiguration;
  //private VanConfiguration vanConfiguration;

   // public String readyForSale () {
       // classicConfiguration = new ClassicConfiguration();
  //      sportConfiguration = new SportConfiguration();
    //      vanConfiguration = new VanConfiguration();
 //       return "Car ready in: " + vanConfiguration.makeConfiguration();

  //  }

   // private Configurable configuration;

 //   public String readyForSale () {
      //  configuration = new ClassicConfiguration();
     //   configuration = new SportConfiguration();
    //   configuration = new VanConfiguration();
   //     return "Car ready in: " + configuration.makeConfiguration();
   // }



    private Configurable configuration;


    public Car(Configurable configuration) {
        this.configuration = configuration;
    }


    public String readyForSale () {
        return "Car ready in: " + configuration.makeConfiguration();
    }

}
