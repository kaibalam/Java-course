package org.rvalenzuela.anotaciones.ejemplo;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface JsonAtributo {

}
