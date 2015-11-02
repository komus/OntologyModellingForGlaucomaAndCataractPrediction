package Ontology.impl;

import Ontology.*;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultFAMILY_HISTORY <br>
 * @version generated on Mon Nov 02 00:41:37 WAT 2015 by oyindolapo
 */
public class DefaultFAMILY_HISTORY extends WrappedIndividualImpl implements FAMILY_HISTORY {

    public DefaultFAMILY_HISTORY(OWLOntology ontology, IRI iri) {
        super(ontology, iri);
    }





    /* ***************************************************
     * Data Property http://www.semanticweb.org/oyindolapo/ontologies/2015/9/updated_ontology#has_family_history
     */
     
    public Collection<? extends String> getHas_family_history() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_FAMILY_HISTORY, String.class);
    }

    public boolean hasHas_family_history() {
		return !getHas_family_history().isEmpty();
    }

    public void addHas_family_history(String newHas_family_history) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_FAMILY_HISTORY, newHas_family_history);
    }

    public void removeHas_family_history(String oldHas_family_history) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_FAMILY_HISTORY, oldHas_family_history);
    }


}