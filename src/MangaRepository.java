public class MangaRepository {

    private String title;
    private String author;
    private String mainCharacter;

    public MangaRepository(String title, String author, String mainCharacter) {
        this.title = title;
        this.author = author;
        this.mainCharacter = mainCharacter;
    }

    public String getDescription() {
        return "Ce " + title + " s'appel " + author + " et son personnage principal est " + mainCharacter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getauthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(String mainCharacter){
        this.mainCharacter = mainCharacter;
    }
}