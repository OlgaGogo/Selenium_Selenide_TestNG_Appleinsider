import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class ResultPage {

    private final ElementsCollection articlesTitles =  $$x("//h2//a");

    /**
     * Returns href from the first article
     */
    public String getHrefFromFirstArticle(){
        return  articlesTitles.first().getAttribute("href");
    }
}
