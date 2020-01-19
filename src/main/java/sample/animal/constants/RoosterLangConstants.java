package sample.animal.constants;


public enum RoosterLangConstants {
    DANISH("Danish", "kykyliky"),
    DUTCH("Dutch" , "kukeleku"),
    ENGLISH("English", "kukuruku"),
    FILIPINO("Filipino", "Kokorokok"),
    FRENCH("French", "Cocorico"),
    GERMAN("German", "Kikiriki");

    private final String language;
    private final String sound;

    RoosterLangConstants(String language, String sound) {
        this.language = language;
        this.sound = sound;
    }

    public String getLanguage() {
        return language;
    }

    public String getSound() {
        return sound;
    }


   public static String getRooseterSoundPerLang (String lang) {
        RoosterLangConstants[] all = RoosterLangConstants.values();
        String sound = null;
        for (RoosterLangConstants constants : all) {
            String language = constants.getLanguage();
            if ((language).equalsIgnoreCase(lang)) {
                return constants.getSound();
            }
        }

        return sound;
   }

}
