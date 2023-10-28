package day19;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PARAMETER, TYPE,TYPE_PARAMETER,TYPE_USE})
public @interface MyAnnotations {

    MyAnnotation[] value();

}
