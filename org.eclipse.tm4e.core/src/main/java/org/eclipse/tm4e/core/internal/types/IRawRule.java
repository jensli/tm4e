/**
 * Copyright (c) 2015-2017 Angelo ZERR.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Initial code from https://github.com/microsoft/vscode-textmate/
 * Initial copyright Copyright (C) Microsoft Corporation. All rights reserved.
 * Initial license: MIT
 *
 * Contributors:
 * - Microsoft Corporation: Initial code, written in TypeScript, licensed under MIT license
 * - Angelo Zerr <angelo.zerr@gmail.com> - translation and adaptation to Java
 */
package org.eclipse.tm4e.core.internal.types;

import java.util.Collection;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tm4e.core.internal.rule.RuleId;

/**
 * @see <a href=
 *      "https://github.com/microsoft/vscode-textmate/blob/88baacf1a6637c5ec08dce18cea518d935fcf0a0/src/rawGrammar.ts#L39">
 *      github.com/microsoft/vscode-textmate/blob/main/src/rawGrammar.ts</a>
 */
public interface IRawRule {

	/** This is not part of the spec only used internally */
	@Nullable
	RuleId getId();

	void setId(RuleId id);

	@Nullable
	String getInclude();

	@Nullable
	String getName();

	@Nullable
	String getContentName();

	@Nullable
	String getMatch();

	@Nullable
	IRawCaptures getCaptures();

	@Nullable
	String getBegin();

	@Nullable
	IRawCaptures getBeginCaptures();

	@Nullable
	String getEnd();

	@Nullable
	String getWhile();

	@Nullable
	IRawCaptures getEndCaptures();

	@Nullable
	IRawCaptures getWhileCaptures();

	@Nullable
	Collection<IRawRule> getPatterns();

	@Nullable
	IRawRepository getRepository();

	boolean isApplyEndPatternLast();
}
