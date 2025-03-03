public class Main {
    public static void main(String[] args) throws Exception {
        MangaFactory mangaFactory = new MangaFactory();

        Manga jujustsuKaisen = mangaFactory.createManga(TypeManga.SHONEN, "Jujutsu Kaisen", "Gege Akutami", "Yūji Itadori");
        Manga cardcaptorSakura = mangaFactory.createManga(TypeManga.SHOJO, "Cardcaptor Sakura", "CLAMP", "Sakura Kinomoto");

        System.out.println(jujustsuKaisen.getDescription());
        System.out.println(cardcaptorSakura.getDescription());

        
        Manga nana = mangaFactory.createManga(TypeManga.SHOJO, "Nana", "Ai Yazawa", "Nana Ōsaki");
        MainCharacter mainCharacter = new TwoMainCharacter(nana, "Nana Komatsu");
        System.out.println(mainCharacter.getDescription());
    }
}
