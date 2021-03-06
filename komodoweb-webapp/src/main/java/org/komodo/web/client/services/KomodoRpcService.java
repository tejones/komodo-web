/*
 * Copyright 2014 JBoss Inc
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
package org.komodo.web.client.services;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.api.ErrorCallback;
import org.jboss.errai.common.client.api.RemoteCallback;
import org.komodo.web.client.services.rpc.DelegatingErrorCallback;
import org.komodo.web.client.services.rpc.DelegatingRemoteCallback;
import org.komodo.web.client.services.rpc.IRpcServiceInvocationHandler;
import org.komodo.web.share.beans.KomodoObjectBean;
import org.komodo.web.share.exceptions.KomodoUiException;
import org.komodo.web.share.services.IKomodoService;

/**
 * Client-side service for making RPC calls to the remote Komodo service.
 *
 * @author mdrillin@redhat.com
 */
@ApplicationScoped
public class KomodoRpcService {

    @Inject
    private Caller<IKomodoService> remoteKomodoService;

    /**
     * Constructor.
     */
    public KomodoRpcService() {
    }

    public void startKEngine(final IRpcServiceInvocationHandler<Void> handler) {
        RemoteCallback<Void> successCallback = new DelegatingRemoteCallback<Void>(handler);
        ErrorCallback<?> errorCallback = new DelegatingErrorCallback(handler);
        try {
        	remoteKomodoService.call(successCallback, errorCallback).startKEngine();
        } catch (KomodoUiException e) {
            errorCallback.error(null, e);
        }
    }
    
    public void shutdownKEngine(final IRpcServiceInvocationHandler<Void> handler) {
        RemoteCallback<Void> successCallback = new DelegatingRemoteCallback<Void>(handler);
        ErrorCallback<?> errorCallback = new DelegatingErrorCallback(handler);
        try {
        	remoteKomodoService.call(successCallback, errorCallback).shutdownKEngine();
        } catch (KomodoUiException e) {
            errorCallback.error(null, e);
        }
    }
    
    public void getKomodoNodes(final String kObjectPath, final IRpcServiceInvocationHandler<List<KomodoObjectBean>> handler) {
        RemoteCallback<List<KomodoObjectBean>> successCallback = new DelegatingRemoteCallback<List<KomodoObjectBean>>(handler);
        ErrorCallback<?> errorCallback = new DelegatingErrorCallback(handler);
        try {
        	remoteKomodoService.call(successCallback, errorCallback).getKomodoNodes(kObjectPath);
        } catch (KomodoUiException e) {
            errorCallback.error(null, e);
        }
    }
    
}
