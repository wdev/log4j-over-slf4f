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

import java.io.Writer;

/**
* Classe implementada para atender problema de utilização do Log4j pelo Filenet 
 * P8
 */
public class FileAppender extends WriterAppender {
    
    boolean bufferedIO;
    int bufferSize;
    
    String filename;
    boolean append;
    
    public FileAppender() {
        
    }
    
    public FileAppender(Layout layout, String filename) {
        setLayout(layout);
        this.filename = filename;
    }
    
    public FileAppender(Layout layout, String filename, boolean append) {
        setLayout(layout);
        this.filename = filename;
        this.append = append;
    }
    
    public FileAppender(Layout layout, String filename, boolean append, boolean bufferedIO, int bufferSize) {
        setLayout(layout);
        this.filename = filename;
        this.append = append;
        this.bufferedIO = bufferedIO;
        this.bufferSize = bufferSize;
    }
  
    protected void closeFile() {
        
    } 
    
    boolean getAppend() {
        return append;
    }

    boolean getBufferedIO() {
        return bufferedIO;
    }
    
    int getBufferSize() {
        return bufferSize;
    }
    
    String getFile() {
        return filename;
    }
    
    void setAppend(boolean flag) {
        this.append = flag;
    }
    
    void setBufferedIO(boolean bufferedIO) {
        this.bufferedIO = bufferedIO;
    }
    
    void setBufferSize(int buf) {
        this.bufferSize = buf;
    }
    void setFile(String filename) {
        this.filename = filename;
    }
    void setFile(String fileName, boolean append, boolean bufferedIO, int bufferSize) {
        this.filename = fileName;
        this.append = append;
        this.bufferedIO = bufferedIO;
        this.bufferSize = bufferSize;       
    }
    void setQWForFile(Writer writer) {
        
    }
}
