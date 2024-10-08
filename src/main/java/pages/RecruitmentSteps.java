package pages;

import net.serenitybdd.screenplay.targets.Target;

public class RecruitmentSteps {
    public static final Target RECRUITMENT_TAB = Target.the("Recruitment tab")
            .locatedBy("#menu_recruitment_viewRecruitmentModule");
    public static final Target ADD_BUTTON = Target.the("Add button")
            .locatedBy("#btnAdd");
    public static final Target FIRST_NAME_FIELD = Target.the("First name field")
            .locatedBy("#addCandidate_firstName");
    public static final Target LAST_NAME_FIELD = Target.the("Last name field")
            .locatedBy("#addCandidate_lastName");
    public static final Target EMAIL_FIELD = Target.the("Email field")
            .locatedBy("#addCandidate_email");
    public static final Target SAVE_BUTTON = Target.the("Save button")
            .locatedBy("#btnSave");
}

