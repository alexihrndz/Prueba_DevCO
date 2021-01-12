package com.travelocity.questions;

import com.travelocity.exceptions.CaptchaException;
import com.travelocity.userintarfaces.HomeTravelocityPage;
import cucumber.api.DataTable;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.List;

import static com.travelocity.utils.ConstantsStrings.CAPTCHA_MESSAGE;

public class UserLogged implements Question<Boolean> {

    private final DataTable nameUser;

    public UserLogged(DataTable nameUser) {
        this.nameUser = nameUser;
    }


    public static UserLogged withName(DataTable nameUser) {
        return new UserLogged(nameUser);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<List<String>> data = nameUser.raw();
        boolean result = false;

        List<WebElementFacade> labelsHeader = BrowseTheWeb.as(actor).findAll(HomeTravelocityPage.XPATH_LABEL_HEADER);
        for (WebElementFacade webElementFacade : labelsHeader) {
            String a = webElementFacade.getText();
            if (a.equals(data.get(1).toString())) {
                result = true;
                break;
            }
        }

        if (HomeTravelocityPage.RECAPTCHA.resolveFor(actor).isCurrentlyVisible()) {
            throw new CaptchaException(CAPTCHA_MESSAGE);

        }
        return result;
    }
}
