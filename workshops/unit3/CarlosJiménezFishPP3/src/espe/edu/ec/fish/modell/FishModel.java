
package espe.edu.ec.fish.modell;

public class FishModel {
  
    private String FeedingType;
    private String Color;
    private String NameOfFish;
    private String TypeOfBirth;
    private int NumberOfHatchlingsOrEggs;
    private int Size;

    public FishModel(String FeedingType, String Color, String NameOfFish, String TypeOfBirth, int NumberOfHatchlingsOrEggs, int Size) {
        this.FeedingType = FeedingType;
        this.Color = Color;
        this.NameOfFish = NameOfFish;
        this.TypeOfBirth = TypeOfBirth;
        this.NumberOfHatchlingsOrEggs = NumberOfHatchlingsOrEggs;
        this.Size = Size;
    }

    /**
     * @return the FeedingType
     */
    public String getFeedingType() {
        return FeedingType;
    }

    /**
     * @param FeedingType the FeedingType to set
     */
    public void setFeedingType(String FeedingType) {
        this.FeedingType = FeedingType;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the NameOfFish
     */
    public String getNameOfFish() {
        return NameOfFish;
    }

    /**
     * @param NameOfFish the NameOfFish to set
     */
    public void setNameOfFish(String NameOfFish) {
        this.NameOfFish = NameOfFish;
    }

    /**
     * @return the TypeOfBirth
     */
    public String getTypeOfBirth() {
        return TypeOfBirth;
    }

    /**
     * @param TypeOfBirth the TypeOfBirth to set
     */
    public void setTypeOfBirth(String TypeOfBirth) {
        this.TypeOfBirth = TypeOfBirth;
    }

    /**
     * @return the NumberOfHatchlingsOrEggs
     */
    public int getNumberOfHatchlingsOrEggs() {
        return NumberOfHatchlingsOrEggs;
    }

    /**
     * @param NumberOfHatchlingsOrEggs the NumberOfHatchlingsOrEggs to set
     */
    public void setNumberOfHatchlingsOrEggs(int NumberOfHatchlingsOrEggs) {
        this.NumberOfHatchlingsOrEggs = NumberOfHatchlingsOrEggs;
    }

    /**
     * @return the Size
     */
    public int getSize() {
        return Size;
    }

    /**
     * @param Size the Size to set
     */
    public void setSize(int Size) {
        this.Size = Size;
    }
    
}
