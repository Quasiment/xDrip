package com.eveningoutpost.dexdrip.Services;

/**
 * Created by jamorham on 19/01/2018.
 */

public interface CollectorStatus {

    // true if the service thinks its okay, false if not
    boolean isCollecting();
}
