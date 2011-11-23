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

/**
 * Classe implementada para atender problema de utilização do Log4j pelo Filenet 
 * P8
 */
public class RollingFileAppender extends FileAppender {
    
    protected int maxBackupIndex;
    protected long maxFileSize;
    
    RollingFileAppender() {
        
    }
    RollingFileAppender(Layout layout, String filename) {
        this.filename = filename;
        setLayout(layout);
    }
    RollingFileAppender(Layout layout, String filename, boolean append) {
        this.filename = filename;
        setLayout(layout);
        this.append = append;
    }
    
    int getMaxBackupIndex() {
        return maxBackupIndex;
    }
    
    long getMaximumFileSize() {
        return maxFileSize;
    }
    void rollOver() {
        
    }
    void setMaxBackupIndex(int maxBackupIndex) {
        this.maxBackupIndex = maxBackupIndex;
    }
    void setMaximumFileSize(long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }
    
}
