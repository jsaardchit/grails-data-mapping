/* Copyright (C) 2010 SpringSource
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.grails.datastore.gorm.cassandra


import org.grails.datastore.gorm.bean.factory.AbstractMappingContextFactoryBean
import org.grails.datastore.mapping.cassandra.CassandraMappingContext
import org.grails.datastore.mapping.model.MappingContext

/**
 * Factory bean for construction the Cassandra MappingContext.
 *
 * Forked from Mongo version
 */
class CassandraMappingContextFactoryBean extends AbstractMappingContextFactoryBean {
	ConfigObject config = [:]

	@Override
	protected MappingContext createMappingContext() {
		return new CassandraMappingContext(config.get("keyspace"));
	}
}

//@Canonical
//class DefaultMappingHolder {
//	Closure defaultMapping
//}
