package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import static pages.RecruitmentSteps.*;

public class AddCandidate implements Task {
    private String firstName;
    private String lastName;
    private String email;

    public AddCandidate(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public static AddCandidate withDetails(String firstName, String lastName, String email) {
        return new AddCandidate(firstName, lastName, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RECRUITMENT_TAB),
                Click.on(ADD_BUTTON),
                Enter.theValue(firstName).into(FIRST_NAME_FIELD),
                Enter.theValue(lastName).into(LAST_NAME_FIELD),
                Enter.theValue(email).into(EMAIL_FIELD),
                Click.on(SAVE_BUTTON)
        );
    }
}