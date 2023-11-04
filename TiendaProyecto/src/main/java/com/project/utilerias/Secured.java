package com.project.utilerias;

import jakarta.ws.rs.NameBinding;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

@NameBinding
@Retention(RUNTIME)
@Target({TYPE,METHOD})
public @interface Secured {
     //Role[] value() default {};
}