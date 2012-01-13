/**
 * This class is generated by jOOQ
 */
package org.openforis.collect.persistence.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.1"},
                            comments = "This class is generated by jOOQ")
public class Taxon extends org.jooq.impl.UpdatableTableImpl<org.openforis.collect.persistence.jooq.tables.records.TaxonRecord> {

	private static final long serialVersionUID = 1935990006;

	/**
	 * The singleton instance of taxon
	 */
	public static final org.openforis.collect.persistence.jooq.tables.Taxon TAXON = new org.openforis.collect.persistence.jooq.tables.Taxon();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.openforis.collect.persistence.jooq.tables.records.TaxonRecord> __RECORD_TYPE = org.openforis.collect.persistence.jooq.tables.records.TaxonRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.collect.persistence.jooq.tables.records.TaxonRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.TaxonRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.TaxonRecord, java.lang.String> SCIENTIFIC_NAME = createField("scientific_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.TaxonRecord, java.lang.Integer> LEVEL = createField("level", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [collect.taxon.taxonomy_id]
	 * REFERENCES taxonomy [collect.taxonomy.id]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.TaxonRecord, java.lang.Integer> TAXONOMY_ID = createField("taxonomy_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.openforis.collect.persistence.jooq.tables.records.TaxonRecord, java.lang.Integer> STEP = createField("step", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private Taxon() {
		super("taxon", org.openforis.collect.persistence.jooq.Collect.COLLECT);
	}

	/**
	 * No further instances allowed
	 */
	private Taxon(java.lang.String alias) {
		super(alias, org.openforis.collect.persistence.jooq.Collect.COLLECT, org.openforis.collect.persistence.jooq.tables.Taxon.TAXON);
	}

	@Override
	public org.jooq.UniqueKey<org.openforis.collect.persistence.jooq.tables.records.TaxonRecord> getMainKey() {
		return org.openforis.collect.persistence.jooq.Keys.taxon_pkey;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.openforis.collect.persistence.jooq.tables.records.TaxonRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.collect.persistence.jooq.tables.records.TaxonRecord>>asList(org.openforis.collect.persistence.jooq.Keys.taxon_pkey);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.openforis.collect.persistence.jooq.tables.records.TaxonRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.openforis.collect.persistence.jooq.tables.records.TaxonRecord, ?>>asList(org.openforis.collect.persistence.jooq.Keys.taxon__FK_taxon_taxonomy);
	}

	@Override
	public org.openforis.collect.persistence.jooq.tables.Taxon as(java.lang.String alias) {
		return new org.openforis.collect.persistence.jooq.tables.Taxon(alias);
	}
}
