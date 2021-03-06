/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.harmony.xnet.tests.javax.net.ssl;

import javax.net.ssl.SSLProtocolException;

import junit.framework.TestCase;


/**
 * Tests for <code>SSLProtocolException</code> class constructors and methods.
 * 
 */
public class SSLProtocolExceptionTest extends TestCase {

    public static void main(String[] args) {
    }

    /**
     * Constructor for SSLProtocolExceptionTests.
     * 
     * @param arg0
     */
    public SSLProtocolExceptionTest(String arg0) {
        super(arg0);
    }

    static String[] msgs = {
            "",
            "Check new message",
            "Check new message Check new message Check new message Check new message Check new message" };

    static Throwable tCause = new Throwable("Throwable for exception");

    /**
     * Test for <code>SSLProtocolException(String)</code> constructor
     * Assertion: constructs SSLProtocolException with detail message msg.
     * Parameter <code>msg</code> is not null.
     */
    public void testSSLProtocolException01() {
        SSLProtocolException tE;
        for (int i = 0; i < msgs.length; i++) {
            tE = new SSLProtocolException(msgs[i]);
            assertEquals("getMessage() must return: ".concat(msgs[i]), tE
                    .getMessage(), msgs[i]);
            assertNull("getCause() must return null", tE.getCause());
        }
    }

    /**
     * Test for <code>SSLProtocolException(String)</code> constructor
     * Assertion: constructs SSLProtocolException when <code>msg</code> is
     * null
     */
    public void testSSLProtocolException02() {
        String msg = null;
        SSLProtocolException tE = new SSLProtocolException(msg);
        assertNull("getMessage() must return null.", tE.getMessage());
        assertNull("getCause() must return null", tE.getCause());
    }
}
