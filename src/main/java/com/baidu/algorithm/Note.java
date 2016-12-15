/**
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.algorithm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.sun.istack.internal.Nullable;

/**
 * Note
 *
 * @author xuhaoran01
 */
@Repeatable(value = Notes.class)
public @interface Note {

    String desc() default "";
}
