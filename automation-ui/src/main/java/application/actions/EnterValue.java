package application.actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.targets.Target;

import java.nio.file.Paths;

/**
 * @autor: Boris Perez
 **/
public class EnterValue {

    /**
     * Is the action to enter a value in a field
     */
    public static Performable text(String value, Target target) {
        return Enter.theValue(value).into(target);
    }

    /**
     * Is the action to enter a file in a field
     *
     * @param target
     * @param value
     */
    public static Performable file(String value, Target target) {
        return Upload.theFile(Paths.get(value)).to(target);
    }
}
