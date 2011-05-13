/**
 * Copyright 2010 Molindo GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.social.security;

import java.io.Serializable;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


/**
 * similar to {@link UserDetailsService} but loads details by account id, not username
 *
 * @author stf@molindo.at
 */
public interface SocialUserDetailsService {
	
	/**
	 * @see UserDetailsService#loadUserByUsername(String)
	 */
	UserDetails loadUserByAccountId(Serializable accountId) throws UsernameNotFoundException, DataAccessException;
}
