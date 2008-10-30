/*
 * Copyright 2007 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.maps.client.geocode;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.impl.DistanceImpl;

/**
 * 
 */
public final class Distance {

  static Distance createPeer(JavaScriptObject jsoPeer) {
    return new Distance(jsoPeer);
  }

  private final JavaScriptObject jsoPeer;

  private Distance(JavaScriptObject jsoPeer) {
    this.jsoPeer = jsoPeer;
  }

  // TODO: better method names?

  public String inLocalizedUnits() {
    return DistanceImpl.impl.getHtml(jsoPeer);
  }

  public int inMeters() {
    return DistanceImpl.impl.getMeters(jsoPeer);
  }
}