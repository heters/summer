/*
 * Copyright 2017-2025 msun.com All right reserved. This software is the confidential and proprietary information of
 * msun.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with msun.com.
 */
package com.ms.commons.test.runner.filter.expression.internal.builder;

import com.ms.commons.test.runner.filter.expression.internal.AbstractSimpleExpression;

/**
 * @author zxc Apr 14, 2013 12:21:21 AM
 */
public interface SimpleExpressionBuiler {

    AbstractSimpleExpression build(String value);
}
