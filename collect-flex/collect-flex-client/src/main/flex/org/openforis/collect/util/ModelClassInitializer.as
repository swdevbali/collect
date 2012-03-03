package org.openforis.collect.util {
	
	import org.granite.collections.BasicMap;
	import org.openforis.collect.metamodel.proxy.AttributeDefaultProxy;
	import org.openforis.collect.metamodel.proxy.AttributeDefinitionProxy;
	import org.openforis.collect.metamodel.proxy.BooleanAttributeDefinitionProxy;
	import org.openforis.collect.metamodel.proxy.CodeAttributeDefinitionProxy;
	import org.openforis.collect.metamodel.proxy.CodeListItemProxy;
	import org.openforis.collect.metamodel.proxy.CodeListLabelProxy;
	import org.openforis.collect.metamodel.proxy.CodeListLabelProxy$Type;
	import org.openforis.collect.metamodel.proxy.CodeListLevelProxy;
	import org.openforis.collect.metamodel.proxy.CodeListProxy;
	import org.openforis.collect.metamodel.proxy.CodeListProxy$CodeScope;
	import org.openforis.collect.metamodel.proxy.CodeListProxy$CodeType;
	import org.openforis.collect.metamodel.proxy.CoordinateAttributeDefinitionProxy;
	import org.openforis.collect.metamodel.proxy.DateAttributeDefinitionProxy;
	import org.openforis.collect.metamodel.proxy.EntityDefinitionProxy;
	import org.openforis.collect.metamodel.proxy.FileAttributeDefinitionProxy;
	import org.openforis.collect.metamodel.proxy.LanguageSpecificTextProxy;
	import org.openforis.collect.metamodel.proxy.ModelVersionProxy;
	import org.openforis.collect.metamodel.proxy.NodeLabelProxy;
	import org.openforis.collect.metamodel.proxy.NodeLabelProxy$Type;
	import org.openforis.collect.metamodel.proxy.PrecisionProxy;
	import org.openforis.collect.metamodel.proxy.PromptProxy;
	import org.openforis.collect.metamodel.proxy.PromptProxy$Type;
	import org.openforis.collect.metamodel.proxy.RangeAttributeDefinitionProxy;
	import org.openforis.collect.metamodel.proxy.SchemaProxy;
	import org.openforis.collect.metamodel.proxy.SpatialReferenceSystemProxy;
	import org.openforis.collect.metamodel.proxy.SurveyProxy;
	import org.openforis.collect.metamodel.proxy.TaxonAttributeDefinitionProxy;
	import org.openforis.collect.metamodel.proxy.TextAttributeDefinitionProxy;
	import org.openforis.collect.metamodel.proxy.TextAttributeDefinitionProxy$Type;
	import org.openforis.collect.metamodel.proxy.TimeAttributeDefinitionProxy;
	import org.openforis.collect.metamodel.proxy.UnitProxy;
	import org.openforis.collect.model.SurveySummary;
	import org.openforis.collect.model.UIConfiguration;
	import org.openforis.collect.model.UITab;
	import org.openforis.collect.model.proxy.AttributeProxy;
	import org.openforis.collect.model.proxy.CodeProxy;
	import org.openforis.collect.model.proxy.CoordinateProxy;
	import org.openforis.collect.model.proxy.DateProxy;
	import org.openforis.collect.model.proxy.EntityProxy;
	import org.openforis.collect.model.proxy.FieldProxy;
	import org.openforis.collect.model.proxy.IntegerRangeProxy;
	import org.openforis.collect.model.proxy.NodeProxy;
	import org.openforis.collect.model.proxy.RealRangeProxy;
	import org.openforis.collect.model.proxy.RecordProxy;
	import org.openforis.collect.model.proxy.TaxonOccurrenceProxy;
	import org.openforis.collect.model.proxy.TaxonProxy;
	import org.openforis.collect.model.proxy.TaxonVernacularNameProxy;
	import org.openforis.collect.model.proxy.TimeProxy;
	import org.openforis.collect.model.proxy.ValidationResultProxy;
	import org.openforis.collect.model.proxy.ValidationResultsProxy;
	import org.openforis.collect.remoting.service.UpdateResponse;

	public class ModelClassInitializer {
		

		public static function init():void {
			var array:Array = [
				BasicMap, 
				
				AttributeDefaultProxy,
				AttributeDefinitionProxy,
				AttributeProxy,
				BooleanAttributeDefinitionProxy,
				CodeAttributeDefinitionProxy,
				CodeListItemProxy,
				CodeListLabelProxy,
				CodeListLabelProxy$Type,
				CodeListLevelProxy,
				CodeListProxy,
				CodeListProxy$CodeScope,
				CodeListProxy$CodeType,
				CodeProxy,
				CoordinateAttributeDefinitionProxy,
				CoordinateProxy,
				DateAttributeDefinitionProxy,
				DateProxy,
				EntityDefinitionProxy,
				EntityProxy,
				FieldProxy,
				FileAttributeDefinitionProxy,
				IntegerRangeProxy,
				LanguageSpecificTextProxy,
				ModelVersionProxy,
				NodeLabelProxy,
				NodeLabelProxy$Type,
				PrecisionProxy,
				PromptProxy,
				PromptProxy$Type,
				RangeAttributeDefinitionProxy,
				RealRangeProxy,
				RecordProxy,
				SchemaProxy,
				SpatialReferenceSystemProxy,
				SurveyProxy,
				SurveySummary,
				TaxonAttributeDefinitionProxy,
				TaxonOccurrenceProxy,
				TaxonProxy,
				TaxonVernacularNameProxy,
				TextAttributeDefinitionProxy,
				TextAttributeDefinitionProxy$Type,
				TimeAttributeDefinitionProxy,
				TimeProxy,
				UnitProxy,
				
				UIConfiguration,
				UITab,
				
				ValidationResultsProxy,
				ValidationResultProxy,
				UpdateResponse,
				NodeProxy
				
			];
		}
		
	}
}