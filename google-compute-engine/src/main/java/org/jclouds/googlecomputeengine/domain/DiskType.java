/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.googlecomputeengine.domain;

import java.net.URI;

import org.jclouds.javax.annotation.Nullable;
import org.jclouds.json.SerializedNames;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class DiskType {

   public abstract String name();

   @Nullable public abstract String description();

   /** Textual description of the valid disk size. For example, "10GB-10TB." */
   @Nullable public abstract String validDiskSize();

   @Nullable public abstract Deprecated deprecated();

   public abstract URI zone();

   public abstract URI selfLink();

   /** Server defined default disk size in GB. */
   public abstract long defaultDiskSizeGb();

   @SerializedNames({ "name", "description", "validDiskSize", "deprecated", "zone", "selfLink", "defaultDiskSizeGb" })
   public static DiskType create(String name, String description, String validDiskSize, Deprecated deprecated, URI zone,
         URI selfLink, long defaultDiskSizeGb) {
      return new AutoValue_DiskType(name, description, validDiskSize, deprecated, zone, selfLink, defaultDiskSizeGb);
   }

   DiskType() {
   }
}