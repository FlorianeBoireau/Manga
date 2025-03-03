public class TwoMainCharacter extends MainCharacter {
    
    private String twoMainCharacter;

    public TwoMainCharacter(Manga manga, String twoMainCharacter ){
        super(manga);
        this.twoMainCharacter = twoMainCharacter;
    }

    public String getDescription() {
        return manga.getDescription()+ " ainsi que " + twoMainCharacter;
    }
}
