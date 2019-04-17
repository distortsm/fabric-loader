/*
 * Copyright 2016 FabricMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.fabricmc.loader.launch.common;

import net.fabricmc.api.EnvType;
import net.fabricmc.mappings.Mappings;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;

public interface FabricLauncher {
	MappingConfiguration getMappingConfiguration();

	void propose(URL url);

	void proposeJarClasspaths(File jarFile);

	Collection<URL> getClasspathURLs();

	EnvType getEnvironmentType();

	boolean isClassLoaded(String name);

	InputStream getResourceAsStream(String name);

	ClassLoader getTargetClassLoader();

	byte[] getClassByteArray(String name) throws IOException;

	boolean isDevelopment();

	String getEntrypoint();

	String getTargetNamespace();
}
