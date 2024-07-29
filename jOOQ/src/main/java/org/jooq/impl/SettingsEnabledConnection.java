/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * Apache-2.0 license and offer limited warranties, support, maintenance, and
 * commercial database integrations.
 *
 * For more information, please visit: https://www.jooq.org/legal/licensing
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import static java.lang.Boolean.TRUE;
import static org.jooq.conf.SettingsTools.executePreparedStatements;
import static org.jooq.impl.Tools.BooleanDataKey.DATA_FORCE_STATIC_STATEMENT;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.jooq.ExecuteContext;
import org.jooq.conf.Settings;
import org.jooq.conf.StatementType;
import org.jooq.tools.jdbc.DefaultConnection;

/**
 * A proxy for a JDBC {@link Connection} that handles creation of prepared
 * statements according to the settings' {@link StatementType}
 *
 * @author Lukas Eder
 */
final class SettingsEnabledConnection extends DefaultConnection {

    private final Settings       settings;
    private final ExecuteContext ctx;
    private final boolean        forceStaticStatements;

    SettingsEnabledConnection(Connection delegate, Settings settings, ExecuteContext ctx) {
        this(delegate, settings, ctx, false);
    }

    SettingsEnabledConnection(Connection delegate, Settings settings, ExecuteContext ctx, boolean forceStaticStatements) {
        super(delegate);

        this.settings = settings;
        this.ctx = ctx;
        this.forceStaticStatements = forceStaticStatements;
    }

    // ------------------------------------------------------------------------
    // XXX Creation of PreparedStatements
    // ------------------------------------------------------------------------

    private final boolean executePreparedStatements0() {
        return !forceStaticStatements
            && (ctx == null || !TRUE.equals(ctx.data(DATA_FORCE_STATIC_STATEMENT)))
            && executePreparedStatements(settings)
        ;
    }

    @Override
    public final PreparedStatement prepareStatement(String sql) throws SQLException {
        if (executePreparedStatements0())
            return getDelegate().prepareStatement(sql);
        else
            return new SettingsEnabledPreparedStatement(getDelegate(), sql);
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        if (executePreparedStatements0())
            return getDelegate().prepareStatement(sql, resultSetType, resultSetConcurrency);
        else
            return new SettingsEnabledPreparedStatement(getDelegate(), sql, resultSetType, resultSetConcurrency);
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        if (executePreparedStatements0())
            return getDelegate().prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
        else
            return new SettingsEnabledPreparedStatement(getDelegate(), sql, resultSetType, resultSetConcurrency, resultSetHoldability);
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        if (executePreparedStatements0())
            return getDelegate().prepareStatement(sql, autoGeneratedKeys);
        else
            return new SettingsEnabledPreparedStatement(getDelegate(), sql, autoGeneratedKeys);
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        if (executePreparedStatements0())
            return getDelegate().prepareStatement(sql, columnIndexes);
        else
            return new SettingsEnabledPreparedStatement(getDelegate(), sql, columnIndexes);
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        if (executePreparedStatements0())
            return getDelegate().prepareStatement(sql, columnNames);
        else
            return new SettingsEnabledPreparedStatement(getDelegate(), sql, columnNames);
    }
}
