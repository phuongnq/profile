/*
 * Copyright (C) 2007-2020 Crafter Software Corporation. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.craftercms.profile.exceptions;

import org.craftercms.profile.api.exceptions.I10nProfileException;

/**
 * Thrown when a create access token operation fails because an access token with the same properties already exists.
 *
 * @author avasquez
 */
public class AccessTokenExistsException extends I10nProfileException {

    public static final String KEY = "profile.accessToken.accessTokenExists";

    public AccessTokenExistsException(String tokenId) {
        super(KEY, tokenId);
    }


}
