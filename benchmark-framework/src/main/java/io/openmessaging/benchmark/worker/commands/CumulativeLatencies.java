/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.openmessaging.benchmark.worker.commands;

import java.util.concurrent.TimeUnit;

import org.HdrHistogram.Histogram;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CumulativeLatencies {

    @JsonIgnore
    public Histogram publishLatency = HistogramFactory.create(TimeUnit.SECONDS.toMicros(60));
    public byte[] publishLatencyBytes;

    @JsonIgnore
    public Histogram publishDelayLatency = HistogramFactory.create(TimeUnit.SECONDS.toMicros(60));
    public byte[] publishDelayLatencyBytes;

    @JsonIgnore
    public Histogram endToEndLatency = HistogramFactory.create(TimeUnit.HOURS.toMicros(12));
    public byte[] endToEndLatencyBytes;

}
