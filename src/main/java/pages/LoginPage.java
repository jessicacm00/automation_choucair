package pages;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target USERNAME_FIELD = Target.the("username field")
            .locatedBy("#txtUsername");
    public static final Target PASSWORD_FIELD = Target.the("password field")
            .locatedBy("#txtPassword");
    public static final Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("#btnLogin");
}
