
    public class NanaManga implements Manga {
        private String author;
        private String mainCharacter;
    
        public NanaManga(String author, String mainCharacter) {
            this.author = author;
            this.mainCharacter = mainCharacter;
        }
    
        @Override
        public String getDescription() {
            return "Manga: Nana by " + author + ", starring " + mainCharacter;
        }
    }

