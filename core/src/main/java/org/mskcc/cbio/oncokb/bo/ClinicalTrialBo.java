
package org.mskcc.cbio.oncokb.bo;

import java.util.Collection;
import java.util.List;

import org.mskcc.cbio.oncokb.model.*;

/**
 *
 * @author jgao
 */
public interface ClinicalTrialBo extends GenericBo<ClinicalTrial> {
    
    /**
     * 
     * @param nciId
     * @return 
     */
    ClinicalTrial findClinicalTrialByNctId(String nciId);
    
    /**
     * 
     * @param tumorTypes
     * @param drugs
     * @return 
     */
    List<ClinicalTrial> findClinicalTrialByTumorTypeAndDrug(Collection<TumorType> tumorTypes, Collection<Drug> drugs, boolean openTrialsOnly);
    
    /**
     * 
     * @param tumorTypes
     * @param alterations
     * @param openTrialsOnly
     * @return 
     */
    List<ClinicalTrial> findClinicalTrialByTumorTypeAndAlteration(Collection<TumorType> tumorTypes, Collection<Alteration> alterations, boolean openTrialsOnly);

    /**
     * 
     * @param tumorTypes
     * @return 
     */
    List<ClinicalTrial> findClinicalTrialByTumorType(Collection<TumorType> tumorTypes, boolean openTrialsOnly);
}
