/**
 * This class is generated by jOOQ
 */
package org.openforis.collect.persistence.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.1"},
                            comments = "This class is generated by jOOQ")
public class Taxonomy extends org.jooq.impl.UpdatableTableImpl<org.openforis.collect.persistence.jooq.tables.records.TaxonomyRecord> {

	private static final long serialVersionUID = 1425085519;

	/**
	 * The singleton instance of taxonomy
	 */
	public static final org.openforis.collect.persistence.jooq.tables.Taxonomy TAXONOMY = new org.openforis.collect.persistence.jooq.tables.Taxonomy();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.openforis.collect.persistence.jooq.tables.records.TaxonomyRecord> __RECORD_TYPE = org.openforis.collect.persistence.jooq.tables.records.TaxonomyRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.collect.persistence.jooq.tables.records.TaxonomyRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.TaxonomyRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.TaxonomyRecord, java.lang.String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.TaxonomyRecord, java.lang.String> METADATA = createField("metadata", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * No further instances allowed
	 */
	private Taxonomy() {
		super("taxonomy", org.openforis.collect.persistence.jooq.Collect.COLLECT);
	}

	/**
	 * No further instances allowed
	 */
	private Taxonomy(java.lang.String alias) {
		super(alias, org.openforis.collect.persistence.jooq.Collect.COLLECT, org.openforis.collect.persistence.jooq.tables.Taxonomy.TAXONOMY);
	}

	@Override
	public org.jooq.UniqueKey<org.openforis.collect.persistence.jooq.tables.records.TaxonomyRecord> getMainKey() {
		return org.openforis.collect.persistence.jooq.Keys.taxonomy_pkey;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.openforis.collect.persistence.jooq.tables.records.TaxonomyRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.collect.persistence.jooq.tables.records.TaxonomyRecord>>asList(org.openforis.collect.persistence.jooq.Keys.taxonomy_pkey);
	}

	@Override
	public org.openforis.collect.persistence.jooq.tables.Taxonomy as(java.lang.String alias) {
		return new org.openforis.collect.persistence.jooq.tables.Taxonomy(alias);
	}
}
