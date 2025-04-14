package org.evangelion.evacommandservice.model.enums;

public enum Result {

    SUCCESS("THE MISSION WAS SUCCESSFUL"),

    FAILURE("THE MISSION WAS FAILED"),

    ABORTED("THE MISSION WAS ABORTED"),

    PENDING("THE MISSION IS PENDING");

    Result(String s) {

    }
}
