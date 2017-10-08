/*
 * This file is generated by jOOQ.
*/
package ru.hixon.gen.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hixon.gen.Keys;
import ru.hixon.gen.Public;
import ru.hixon.gen.tables.records.BlogRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Blog extends TableImpl<BlogRecord> {

    private static final long serialVersionUID = -2114500639;

    /**
     * The reference instance of <code>public.blog</code>
     */
    public static final Blog BLOG = new Blog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BlogRecord> getRecordType() {
        return BlogRecord.class;
    }

    /**
     * The column <code>public.blog.title</code>.
     */
    public final TableField<BlogRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(250).nullable(false), this, "");

    /**
     * The column <code>public.blog.body</code>.
     */
    public final TableField<BlogRecord, String> BODY = createField("body", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>public.blog</code> table reference
     */
    public Blog() {
        this("blog", null);
    }

    /**
     * Create an aliased <code>public.blog</code> table reference
     */
    public Blog(String alias) {
        this(alias, BLOG);
    }

    private Blog(String alias, Table<BlogRecord> aliased) {
        this(alias, aliased, null);
    }

    private Blog(String alias, Table<BlogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BlogRecord> getPrimaryKey() {
        return Keys.USERS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BlogRecord>> getKeys() {
        return Arrays.<UniqueKey<BlogRecord>>asList(Keys.USERS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Blog as(String alias) {
        return new Blog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Blog rename(String name) {
        return new Blog(name, null);
    }
}