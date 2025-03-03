// Contient la logique pour créer des objets Manga en fonction du type spécifié.

public class MangaFactory {
    
    public Manga createManga(TypeManga type, String title, String author, String mainCharacter) {
        switch (type) {
            case SHONEN:
                return new ShonenManga(title, author, mainCharacter);
            case SHOJO:
                return new ShojoManga(title, author, mainCharacter);
            default:
                throw new IllegalArgumentException("Unknown manga type");
        }
    }
}
