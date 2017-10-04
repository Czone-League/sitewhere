package com.sitewhere.microservice.spi.groovy;

import java.io.File;

import com.sitewhere.spi.SiteWhereException;

/**
 * Common interface for synchronizing scripts from Zookeeper to the local
 * filesystem for a microservice.
 * 
 * @author Derek
 */
public interface IScriptSynchronizer {

    /**
     * Get root folder on filesystem where scripts will be stored.
     * 
     * @return
     * @throws SiteWhereException
     */
    public File getFileSystemRoot() throws SiteWhereException;

    /**
     * Get root path for matching Zookeeper updates.
     * 
     * @return
     * @throws SiteWhereException
     */
    public String getZkScriptRootPath() throws SiteWhereException;

    /**
     * Add script from the given Zookeeper path.
     * 
     * @param zkPath
     * @throws SiteWhereException
     */
    public void add(String zkPath) throws SiteWhereException;

    /**
     * Update script from the given Zookeeper path.
     * 
     * @param zkPath
     * @throws SiteWhereException
     */
    public void update(String zkPath) throws SiteWhereException;

    /**
     * Delete script corresponding to the given Zookeeper path.
     * 
     * @param zkPath
     * @throws SiteWhereException
     */
    public void delete(String zkPath) throws SiteWhereException;
}