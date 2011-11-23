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

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.Layout;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.OptionHandler;

/**
 * Classe implementada para atender problema de utilização do Log4j pelo Filenet 
 * P8
 * @author guerra
 */
public abstract class AppenderSkeleton implements Appender, OptionHandler {

    private Filter firstFilter;
    private List filters = new ArrayList();
    private String name;
    private ErrorHandler errorHandler;
    private Layout layout;
    private Priority priority;
    
    public void addFilter(Filter newFilter) {
        if (firstFilter == null) {
            this.firstFilter = newFilter;
        } else {
            filters.add(newFilter);
        }
    }

    public Filter getFilter() {
        Filter ft = (Filter)filters.get(0);
        filters.remove(0);
        return ft;
    }

    public void clearFilters() {
        filters.clear();
    }

    public void close() {
    }

    public void doAppend(LoggingEvent event) {
    }

    public String getName() {
        return name;
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    public ErrorHandler getErrorHandler() {
        return errorHandler;
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

    public void activateOptions() {
    }
       
    protected abstract void append(LoggingEvent event);
    
    public void finalize() throws Throwable {
        super.finalize();
    }
    
    public Priority getThreshold() {
        return priority;
    }
    
    public Filter getFirstFilter() {
        return firstFilter;
    }
  
    public boolean isAsSevereAsThreshold(Priority priority) {
        return false;
    }
    
    public void setThreshold(Priority priority) {
        this.priority = priority;
    }
 }
