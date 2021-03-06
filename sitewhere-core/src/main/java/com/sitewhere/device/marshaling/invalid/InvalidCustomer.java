/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.device.marshaling.invalid;

import com.sitewhere.rest.model.customer.Customer;

/**
 * Used to show broken link if referenced customer is deleted.
 * 
 * @author Derek
 */
public class InvalidCustomer extends Customer {

    /** Serial version UID */
    private static final long serialVersionUID = 4008685314250546242L;

    public InvalidCustomer() {
	setName("Missing Customer");
	setImageUrl("https://s3.amazonaws.com/sitewhere-demo/broken-link.png");
    }
}
