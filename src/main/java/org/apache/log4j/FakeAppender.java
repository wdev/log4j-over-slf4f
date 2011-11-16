/*
 * Copyright 2011 QOS.ch.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.log4j;

import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.Layout;
import org.apache.log4j.spi.LoggingEvent;

/**
 *
 * @author guerra
 */
public class FakeAppender implements Appender {

    public void addFilter(Filter newFilter) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Filter getFilter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void clearFilters() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void doAppend(LoggingEvent event) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ErrorHandler getErrorHandler() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setLayout(Layout layout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Layout getLayout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean requiresLayout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
