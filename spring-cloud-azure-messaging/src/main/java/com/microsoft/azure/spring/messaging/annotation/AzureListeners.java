/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.spring.messaging.annotation;

import java.lang.annotation.*;

/**
 * Container annotation that aggregates several {@link AzureListener} annotations.
 *
 * <p>Can be used natively, declaring several nested {@link AzureListener} annotations.
 * Can also be used in conjunction with Java 8's support for repeatable annotations,
 * where {@link AzureListener} can simply be declared several times on the same method,
 * implicitly generating this container annotation.
 *
 * <p>This annotation may be used as a <em>meta-annotation</em> to create custom
 * <em>composed annotations</em>.
 *
 * @author Warren Zhu
 * @see AzureListener
 */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AzureListeners {

    AzureListener[] value();

}
