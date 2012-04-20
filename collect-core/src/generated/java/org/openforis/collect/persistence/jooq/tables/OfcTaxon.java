/**
 * This class is generated by jOOQ
 */
package org.openforis.collect.persistence.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.1"},
                            comments = "This class is generated by jOOQ")
public class OfcTaxon extends org.jooq.impl.UpdatableTableImpl<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord> {

	private static final long serialVersionUID = 2145053347;

	/**
	 * The singleton instance of ofc_taxon
	 */
	public static final org.openforis.collect.persistence.jooq.tables.OfcTaxon OFC_TAXON = new org.openforis.collect.persistence.jooq.tables.OfcTaxon();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord> __RECORD_TYPE = org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord, java.lang.Integer> TAXON_ID = createField("taxon_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord, java.lang.String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord, java.lang.String> SCIENTIFIC_NAME = createField("scientific_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord, java.lang.String> TAXON_RANK = createField("taxon_rank", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [collect.ofc_taxon.taxonomy_id]
	 * REFERENCES ofc_taxonomy [collect.ofc_taxonomy.id]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord, java.lang.Integer> TAXONOMY_ID = createField("taxonomy_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord, java.lang.Integer> STEP = createField("step", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [collect.ofc_taxon.parent_id]
	 * REFERENCES ofc_taxon [collect.ofc_taxon.id]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord, java.lang.Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private OfcTaxon() {
		super("ofc_taxon", org.openforis.collect.persistence.jooq.Collect.COLLECT);
	}

	/**
	 * No further instances allowed
	 */
	private OfcTaxon(java.lang.String alias) {
		super(alias, org.openforis.collect.persistence.jooq.Collect.COLLECT, org.openforis.collect.persistence.jooq.tables.OfcTaxon.OFC_TAXON);
	}

	@Override
	public org.jooq.UniqueKey<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord> getMainKey() {
		return org.openforis.collect.persistence.jooq.Keys.ofc_taxon_pkey;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord>>asList(org.openforis.collect.persistence.jooq.Keys.ofc_taxon_pkey, org.openforis.collect.persistence.jooq.Keys.UNIQUE_ofc_taxon_id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.openforis.collect.persistence.jooq.tables.records.OfcTaxonRecord, ?>>asList(org.openforis.collect.persistence.jooq.Keys.ofc_taxon__ofc_taxon_taxonomy_fkey, org.openforis.collect.persistence.jooq.Keys.ofc_taxon__ofc_taxon_parent_fkey);
	}

	@Override
	public org.openforis.collect.persistence.jooq.tables.OfcTaxon as(java.lang.String alias) {
		return new org.openforis.collect.persistence.jooq.tables.OfcTaxon(alias);
	}
}
