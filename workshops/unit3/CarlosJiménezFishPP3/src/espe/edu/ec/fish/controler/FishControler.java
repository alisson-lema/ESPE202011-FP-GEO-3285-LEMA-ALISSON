
package espe.edu.ec.fish.controler;

import espe.edu.ec.fish.view.FishView;

public class FishControler {
    

public void save(FishView fish)  {
String data = FishView.getFeedingType()+" ,"+fish.getColor()+ " ,"+fish.getNameOfFish()
        +" ,"+fish.getTypeOfBirth()+" ,"+fish.getNumberOfHatchlingsOrEggs();
FileManager.save(data,"fish");
    
}
}