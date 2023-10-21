package week_01.exercise_10;
import java.util.ArrayList;
import java.util.List;

public class LanguageList {

private final List<String> languages = new ArrayList<>();

public boolean isEmpty () {

   if (languages.isEmpty()) {
      return true;

   }
   return false;

}

public void addLanguage (String language) {

   this.languages.add(language);
}

public void removeLanguage (String language) {

   this.languages.remove(language);
}

public String firstLanguage () {

   String languageAt0 = languages.get(0);
   return languageAt0;

}

public int count () {

   int counter = 0;

   for (String langs : languages) {
      counter++;
   }
   return counter;
}

public boolean containsLanguage (String language) {

   return languages.contains(language);
}

public boolean isExciting () {

   boolean hasJavaOrKotlin = ((languages.contains("Java") || languages.contains("Kotlin"))
           ? true
           : false);

   return hasJavaOrKotlin;
}

}
