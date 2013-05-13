/*
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package javassist.util.proxy;

/**
 * Allows generation of a class name
 * 
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 * 
 */
public interface ProxyNameGenerator
{
   /**
    * Used internally in {@link ProxyFactory#createClass()}
    * 
    * @param classname
    * @return
    */
   public String makeProxyName(String classname);
}
