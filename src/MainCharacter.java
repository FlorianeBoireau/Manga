// Classe abstraite Decorator
public abstract class MainCharacter implements Manga {
    
    protected Manga manga;

    public MainCharacter(Manga manga) {
        this.manga = manga;
    }

    public String getDescription() {
        return manga.getDescription();
    }
}
