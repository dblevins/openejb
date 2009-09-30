/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.openejb.resource.jdbc;

/**
 * This {@link PlainTextPasswordCodec} is an {@link PasswordCodec}
 * implementation that does not use any encryption/decryption algorithm at all.
 */
public class PlainTextPasswordCodec implements PasswordCodec {

    /**
     * Returns the <code>encodedPassword</code> as plain text string.
     * 
     * @param encodedPassword
     *            the encoded password
     * @return String the decoded password
     * 
     * @see PasswordCodec#decode(char[])
     */
    public String decode(char[] encodedPassword) {
        if (null == encodedPassword) {
            throw new IllegalArgumentException("encodedPassword cannot be null.");
        }
        return new String(encodedPassword);
    }

    /**
     * Returns the <code>plainPassword</code> as plain text character array.
     * 
     * @param plainPassword
     *            the plain-text password
     * @return the plain-text password as character array
     * 
     * @see PasswordCodec#encode(java.lang.String)
     */
    public char[] encode(String plainPassword) {
        if (null == plainPassword) {
            throw new IllegalArgumentException("plainPassword cannot be null.");
        }
        return plainPassword.toCharArray();
    }

}