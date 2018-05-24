package com.zandero.rest.annotation;

import javax.ws.rs.HttpMethod;
import java.lang.annotation.*;

/**
 *
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@HttpMethod("HEAD")
@Documented
public @interface Head {

	String value() default ""; // @Path to trace if not given in @Path

	String[] produces() default "*/*";

	String[] consumes() default "*/*";
}