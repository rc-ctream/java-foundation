package com.schoolar.java.grundkurs.ch11.annotations;

import java.lang.annotation.*;

@Documented
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.PARAMETER )
public @interface Notnull {
}
