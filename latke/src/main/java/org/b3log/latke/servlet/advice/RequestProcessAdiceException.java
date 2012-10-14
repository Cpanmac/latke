/*
 * Copyright (c) 2009, 2010, 2011, 2012, B3log Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.b3log.latke.servlet.advice;

/**
 * RequestProcessAdiceException for {@link RequestProcessAdvice}.
 * @author <a href="mailto:wmainlove@gmail.com">Love Yao</a>
 * @version 1.0.0.0, Oct 14, 2012
 */
public class RequestProcessAdiceException extends Exception {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 4070666571307478762L;

    /**
     * the default constructor.
     * @param message exception message
     */
    public RequestProcessAdiceException(final String message) {
        super(message);
    }

}
