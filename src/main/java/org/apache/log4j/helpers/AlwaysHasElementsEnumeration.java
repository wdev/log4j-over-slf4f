/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.log4j.helpers;

import java.util.Enumeration;
import org.apache.log4j.ConsoleAppender;

/**
 * Classe implementada para atender problema de utilização do Log4j pelo Filenet 
 * P8
 */
public class AlwaysHasElementsEnumeration implements Enumeration {
  private static final AlwaysHasElementsEnumeration instance = new AlwaysHasElementsEnumeration();
  
  private boolean hasMore;
  
  private AlwaysHasElementsEnumeration() {
      hasMore = true;
  }
  
  public static AlwaysHasElementsEnumeration getInstance() {
      return instance;
  }

  public boolean hasMoreElements() {
      return hasMore;
  }

  public Object nextElement() {
      hasMore = false;
      return new ConsoleAppender();
  }
}