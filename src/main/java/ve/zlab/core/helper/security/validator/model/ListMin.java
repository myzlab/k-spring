package ve.zlab.core.helper.security.validator.model;

import java.util.List;
import ve.zlab.k.helper.KExceptionHelper;
import ve.zlab.k.KException;

public class ListMin extends KRule {
    
    private Integer min;
    
    public ListMin(final Integer min, final String message) {
        super(message, KRule.LIST_MIN);
        
        this.min = min;
    }
    
    public void validate(final List value) throws KException {
        if (value == null) {
            return;
        }
        
        if (value.size() < min) {
            throw KExceptionHelper.badRequest(message);
        }
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }
    
}
