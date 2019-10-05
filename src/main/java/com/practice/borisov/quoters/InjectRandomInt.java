package com.practice.borisov.quoters;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) //by default - class (source - for compiler(like override)
public @interface InjectRandomInt {
int min();
int max();

}
