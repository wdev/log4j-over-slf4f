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

import java.io.OutputStream;
import java.io.Writer;
import org.apache.log4j.spi.LoggingEvent;

/**
 * Classe implementada para atender problema de utilização do Log4j pelo Filenet 
 * P8
 */
public class WriterAppender extends AppenderSkeleton {

    protected String encoding;
    protected boolean immediateFlush;
//    protected QuietWriter qt;
    
    public WriterAppender() {
        
    }
    
    public WriterAppender(Layout layout, OutputStream os) {
        
    }
    
    public WriterAppender(Layout layout, Writer writer) {
    }
    protected void append(LoggingEvent event) {
    }
    
    protected void checkEntryConditions() {
        
    }
    
    protected void closeWriter() {
        
    }
    
    protected void createWriter(OutputStream os) {
        
    }
    
    public boolean getImmediateFlush() {
        return immediateFlush;
    }
    
    protected void reset() {  
    }
    
    public void setImmediateFlush(boolean immediateFlush) {
        this.immediateFlush = immediateFlush;
    }
    
    public void setWriter(Writer writer) { 
    }
    
    protected boolean shouldFlush() {
        return false;
    }
    
    protected void subAppend(LoggingEvent event) {
    }
    
    protected void writeFooter() {
    }
    
    protected void writeHeader() {

    }
    
}
