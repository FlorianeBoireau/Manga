// Créer des classes concrètes pour chaque type de manga
public class ShojoManga implements Manga{

    private String title;
    private String author;
    private String mainCharacter; 

    public ShojoManga(String title, String author, String mainCharacter) {
        this.title = title;
        this.author = author;
        this.mainCharacter = mainCharacter;
    }

    @Override
    public String getDescription() {
        return "Ce " + title + " s'appel " + author + " et son personnage principal est " + mainCharacter;
    }
}
