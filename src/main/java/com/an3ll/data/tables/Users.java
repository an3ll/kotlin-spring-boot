/*
 * This file is generated by jOOQ.
*/
package com.an3ll.data.tables;


import com.an3ll.data.Fleet;
import com.an3ll.data.Keys;
import com.an3ll.data.tables.records.UsersRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users extends TableImpl<UsersRecord> {

    private static final long serialVersionUID = 2091793533;

    /**
     * The reference instance of <code>fleet.users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType() {
        return UsersRecord.class;
    }

    /**
     * The column <code>fleet.users.id</code>.
     */
    public final TableField<UsersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>fleet.users.first_name</code>.
     */
    public final TableField<UsersRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>fleet.users.last_name</code>.
     */
    public final TableField<UsersRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>fleet.users.email</code>.
     */
    public final TableField<UsersRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>fleet.users</code> table reference
     */
    public Users() {
        this("users", null);
    }

    /**
     * Create an aliased <code>fleet.users</code> table reference
     */
    public Users(String alias) {
        this(alias, USERS);
    }

    private Users(String alias, Table<UsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Users(String alias, Table<UsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Fleet.FLEET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UsersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UsersRecord> getPrimaryKey() {
        return Keys.KEY_USERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UsersRecord>> getKeys() {
        return Arrays.<UniqueKey<UsersRecord>>asList(Keys.KEY_USERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Users as(String alias) {
        return new Users(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(String name) {
        return new Users(name, null);
    }
}
