/*
 * Copyright 2018 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.runtime.api.conf.impl;

import java.util.Collections;
import java.util.List;

import org.activiti.runtime.api.conf.TaskRuntimeConfiguration;
import org.activiti.runtime.api.event.VariableEventListener;
import org.activiti.runtime.api.event.listener.TaskRuntimeEventListener;

public class TaskRuntimeConfigurationImpl implements TaskRuntimeConfiguration {

    private List<TaskRuntimeEventListener<?>> taskRuntimeEventListeners;
    private final List<VariableEventListener<?>> variableEventListeners;

    public TaskRuntimeConfigurationImpl(List<TaskRuntimeEventListener<?>> taskRuntimeEventListeners,
                                        List<VariableEventListener<?>> variableEventListeners) {
        this.taskRuntimeEventListeners = taskRuntimeEventListeners;
        this.variableEventListeners = variableEventListeners;
    }

    @Override
    public List<TaskRuntimeEventListener<?>> taskRuntimeEventListeners() {
        return Collections.unmodifiableList(taskRuntimeEventListeners);
    }

    @Override
    public List<VariableEventListener<?>> variableEventListeners() {
        return Collections.unmodifiableList(variableEventListeners);
    }

}
