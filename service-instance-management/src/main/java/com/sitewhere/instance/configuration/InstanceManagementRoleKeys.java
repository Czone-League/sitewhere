/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.instance.configuration;

import com.sitewhere.spi.microservice.configuration.model.IRoleKey;

public enum InstanceManagementRoleKeys implements IRoleKey {

    /** Instance management */
    InstanceManagement("instance_mgmt"),

    /** Datastore configuration */
    DatastoreConfiguration("ds_config"),

    /** MongoDB configuration */
    MongoDBConfiguration("mongo_cfg"),

    /** Default MongoDB configuration */
    DefaultMongoDBConfiguration("def_mongo_cfg"),

    /** Alternate MongoDB configuration */
    AlternateMongoDBConfiguration("alt_mongo_cfg");

    private String id;

    private InstanceManagementRoleKeys(String id) {
	this.id = id;
    }

    /*
     * @see com.sitewhere.spi.microservice.configuration.model.IRoleKey#getId()
     */
    @Override
    public String getId() {
	return id;
    }
}