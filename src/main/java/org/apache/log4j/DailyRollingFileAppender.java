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
* Classe implementada para atender problema de utilização do Log4j pelo Filenet 
 * P8
 */
public class DailyRollingFileAppender implements Appender {
    
    private String name;
    private Layout layout;
    private String filename;
    private String datePattern;

    public String getDatePattern() {
        return datePattern;
    }

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public DailyRollingFileAppender(Layout layout, String filename, String datePattern) {
        
    }
    public void activateOptions() {
        
    }
    public void addFilter(Filter newFilter) {
    }

    public Filter getFilter() {
        return null;
    }

    public void clearFilters() {
     }

    public void close() {
    }

    public void doAppend(LoggingEvent event) {
    }

    public String getName() {
        return name;
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
    }

    public ErrorHandler getErrorHandler() {
        return null;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public Layout getLayout() {
        return layout;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean requiresLayout() {
        return false;
    }
    
    protected void subAppend(LoggingEvent event) {
        
    }
    
}
