/**
 * 
 */
package org.openforis.collect.designer.viewmodel;

import java.util.List;

import org.openforis.idm.metamodel.AttributeDefinition;
import org.openforis.idm.metamodel.validation.Check;
import org.zkoss.bind.annotation.Init;

/**
 * @author S. Ricci
 *
 */
public abstract class CheckVM<T extends Check<?>> extends SurveyObjectBaseVM<T> {

	protected AttributeDefinition parentDefinition;

	@Init(superclass=false)
	public void init(AttributeDefinition parentDefinition, T check, Boolean newItem ) {
		super.init();
		this.parentDefinition = parentDefinition;
		this.newItem = newItem;
		setEditedItem(check);
	}
	
	@Override
	protected List<T> getItemsInternal() {
		return null;
	}

	@Override
	protected void moveSelectedItem(int indexTo) {
	}

	@Override
	protected T createItemInstance() {
		return null;
	}

	@Override
	protected void addNewItemToSurvey() {
		parentDefinition.addCheck(editedItem);
	}

	@Override
	protected void deleteItemFromSurvey(T item) {
	}
	
}
