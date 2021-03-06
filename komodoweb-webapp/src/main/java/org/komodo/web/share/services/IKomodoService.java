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
package org.komodo.web.share.services;

import java.util.List;

import org.jboss.errai.bus.server.annotations.Remote;
import org.komodo.web.share.beans.KomodoObjectBean;
import org.komodo.web.share.exceptions.KomodoUiException;

/**
 * Provides interface for the Komodo remote services
 *
 * @author mdrillin@redhat.com
 */
@Remote
public interface IKomodoService {
    
    public void startKEngine( ) throws KomodoUiException;

    public void shutdownKEngine( ) throws KomodoUiException;
    
    public List<KomodoObjectBean> getKomodoNodes(final String path) throws KomodoUiException;

}
