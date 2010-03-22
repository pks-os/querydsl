/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.dml;

import com.mysema.query.types.EBoolean;
import com.mysema.query.types.Path;

/**
 * UpdateClause defines a generic extensible interface for Update clauses
 * 
 * @author tiwe
 *
 * @param <C>
 */
public interface UpdateClause<C extends UpdateClause<C>> {
    
    /**
     * Defines the filter constraints
     * 
     * @param o
     * @return
     */
    C where(EBoolean... o);
    
    /**
     * Set the paths to be updated
     * 
     * @param <T>
     * @param path path to be updated
     * @param value value to set
     * @return
     */
    <T> C set(Path<T> path, T value);
     
    /**
     * Execute the delete clause and return the amount of updated rows/items
     * 
     * @return
     */
    long execute();

}
