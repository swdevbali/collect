/**
 * This class is generated by jOOQ
 */
package org.openforis.collect.persistence.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.1"},
                            comments = "This class is generated by jOOQ")
public class OfcTaxonomy extends org.jooq.impl.UpdatableTableImpl<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonomyRecord> {

	private static final long serialVersionUID = -528902366;

	/**
	 * The singleton instance of ofc_taxonomy
	 */
	public static final org.openforis.collect.persistence.jooq.tables.OfcTaxonomy OFC_TAXONOMY = new org.openforis.collect.persistence.jooq.tables.OfcTaxonomy();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonomyRecord> __RECORD_TYPE = org.openforis.collect.persistence.jooq.tables.records.OfcTaxonomyRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonomyRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonomyRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonomyRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonomyRecord, java.lang.String> METADATA = createField("metadata", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * No further instances allowed
	 */
	private OfcTaxonomy() {
		super("ofc_taxonomy", org.openforis.collect.persistence.jooq.Collect.COLLECT);
	}

	/**
	 * No further instances allowed
	 */
	private OfcTaxonomy(java.lang.String alias) {
		super(alias, org.openforis.collect.persistence.jooq.Collect.COLLECT, org.openforis.collect.persistence.jooq.tables.OfcTaxonomy.OFC_TAXONOMY);
	}

	@Override
	public org.jooq.UniqueKey<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonomyRecord> getMainKey() {
		return org.openforis.collect.persistence.jooq.Keys.ofc_taxonomy_pkey;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonomyRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonomyRecord>>asList(org.openforis.collect.persistence.jooq.Keys.ofc_taxonomy_pkey, org.openforis.collect.persistence.jooq.Keys.ofc_taxonomy_name_key);
	}

	@Override
	public org.openforis.collect.persistence.jooq.tables.OfcTaxonomy as(java.lang.String alias) {
		return new org.openforis.collect.persistence.jooq.tables.OfcTaxonomy(alias);
	}
}
