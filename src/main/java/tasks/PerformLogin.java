package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import static pages.LoginPage.*;

public class PerformLogin implements Task {
    private String username;
    private String password;

    public PerformLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static PerformLogin withCredentials(String username, String password) {
        return new PerformLogin(username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(USERNAME_FIELD),
                Enter.theValue(password).into(PASSWORD_FIELD),
                Click.on(LOGIN_BUTTON)
        );
    }
}
