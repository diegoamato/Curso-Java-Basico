package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("O idioma do Sistema está em ");
        System.out.println(loc.getDisplayLanguage()+".");
    }
    
}
