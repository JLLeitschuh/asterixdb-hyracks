/*
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
package org.apache.hyracks.storage.am.lsm.common.api;

import java.util.List;

import org.apache.hyracks.storage.am.common.api.IIndexOperationContext;
import org.apache.hyracks.storage.am.common.api.IModificationOperationCallback;
import org.apache.hyracks.storage.am.common.api.ISearchOperationCallback;
import org.apache.hyracks.storage.am.common.api.ISearchPredicate;

public interface ILSMIndexOperationContext extends IIndexOperationContext {
    public List<ILSMComponent> getComponentHolder();

    public List<ILSMComponent> getComponentsToBeMerged();

    public ISearchOperationCallback getSearchOperationCallback();

    public IModificationOperationCallback getModificationCallback();

    public void setCurrentMutableComponentId(int currentMutableComponentId);

    public void setSearchPredicate(ISearchPredicate searchPredicate);

    public ISearchPredicate getSearchPredicate();

    public List<ILSMComponent> getComponentsToBeReplicated();

    /**
     * @return true if this operation entered the components. Otherwise false.
     */
    public boolean isAccessingComponents();

    public void setAccessingComponents(boolean accessingComponents);
}
