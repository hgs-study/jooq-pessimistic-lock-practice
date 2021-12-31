/*
 * This file is generated by jOOQ.
 */
package jooq.dsl.tables;


import java.util.Arrays;
import java.util.List;

import jooq.dsl.JooqTest;
import jooq.dsl.Keys;
import jooq.dsl.tables.records.SubscribeRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Subscribe extends TableImpl<SubscribeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>jooq_test.subscribe</code>
     */
    public static final Subscribe SUBSCRIBE = new Subscribe();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SubscribeRecord> getRecordType() {
        return SubscribeRecord.class;
    }

    /**
     * The column <code>jooq_test.subscribe.idx</code>.
     */
    public final TableField<SubscribeRecord, Long> IDX = createField(DSL.name("idx"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>jooq_test.subscribe.register</code>.
     */
    public final TableField<SubscribeRecord, String> REGISTER = createField(DSL.name("register"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>jooq_test.subscribe.service</code>.
     */
    public final TableField<SubscribeRecord, String> SERVICE = createField(DSL.name("service"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>jooq_test.subscribe.content_type</code>.
     */
    public final TableField<SubscribeRecord, String> CONTENT_TYPE = createField(DSL.name("content_type"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>jooq_test.subscribe.content_idx</code>.
     */
    public final TableField<SubscribeRecord, Long> CONTENT_IDX = createField(DSL.name("content_idx"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>jooq_test.subscribe.hit</code>.
     */
    public final TableField<SubscribeRecord, Long> HIT = createField(DSL.name("hit"), SQLDataType.BIGINT.defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    private Subscribe(Name alias, Table<SubscribeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Subscribe(Name alias, Table<SubscribeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>jooq_test.subscribe</code> table reference
     */
    public Subscribe(String alias) {
        this(DSL.name(alias), SUBSCRIBE);
    }

    /**
     * Create an aliased <code>jooq_test.subscribe</code> table reference
     */
    public Subscribe(Name alias) {
        this(alias, SUBSCRIBE);
    }

    /**
     * Create a <code>jooq_test.subscribe</code> table reference
     */
    public Subscribe() {
        this(DSL.name("subscribe"), null);
    }

    public <O extends Record> Subscribe(Table<O> child, ForeignKey<O, SubscribeRecord> key) {
        super(child, key, SUBSCRIBE);
    }

    @Override
    public Schema getSchema() {
        return JooqTest.JOOQ_TEST;
    }

    @Override
    public Identity<SubscribeRecord, Long> getIdentity() {
        return (Identity<SubscribeRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<SubscribeRecord> getPrimaryKey() {
        return Keys.KEY_SUBSCRIBE_PRIMARY;
    }

    @Override
    public List<UniqueKey<SubscribeRecord>> getKeys() {
        return Arrays.<UniqueKey<SubscribeRecord>>asList(Keys.KEY_SUBSCRIBE_PRIMARY);
    }

    @Override
    public Subscribe as(String alias) {
        return new Subscribe(DSL.name(alias), this);
    }

    @Override
    public Subscribe as(Name alias) {
        return new Subscribe(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Subscribe rename(String name) {
        return new Subscribe(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Subscribe rename(Name name) {
        return new Subscribe(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, String, Long, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
