package com.travelocity.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import java.util.List;

import static com.travelocity.userintarfaces.RoomListPage.XPATH_ROOM_LIST_RESERVE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectFirstRoom implements Interaction {
    public static SelectFirstRoom onList() {
        return instrumented(SelectFirstRoom.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> roomList = BrowseTheWeb.as(actor).findAll(XPATH_ROOM_LIST_RESERVE);
        BrowseTheWeb.as(actor).waitFor(roomList.get(1)).isClickable();
        actor.attemptsTo(JavaScriptClick.on(roomList.get(1)));
    }
}
