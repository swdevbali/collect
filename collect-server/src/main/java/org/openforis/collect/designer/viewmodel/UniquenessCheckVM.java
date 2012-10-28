/**
 * 
 */
package org.openforis.collect.designer.viewmodel;

import org.openforis.collect.designer.form.CustomCheckFormObject;
import org.openforis.collect.designer.form.SurveyObjectFormObject;
import org.openforis.idm.metamodel.AttributeDefinition;
import org.openforis.idm.metamodel.validation.CustomCheck;
import org.zkoss.bind.annotation.ExecutionArgParam;
import org.zkoss.bind.annotation.Init;

/**
 * @author S. Ricci
 *
 */
public class UniquenessCheckVM extends CheckVM<CustomCheck> {

	@Init(superclass=false)
	@Override
	public void init(@ExecutionArgParam("parentDefinition") AttributeDefinition parentDefinition,
			@ExecutionArgParam("check") CustomCheck check, @ExecutionArgParam("newItem") Boolean newItem ) {
		super.init(parentDefinition, check, newItem);
	}
	
	@Override
	protected SurveyObjectFormObject<CustomCheck> createFormObject() {
		return new CustomCheckFormObject();
	}

}
