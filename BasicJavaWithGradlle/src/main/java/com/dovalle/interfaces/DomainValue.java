package com.dovalle.interfaces;

public interface DomainValue {

    default String showDetails(Integer code, String description, String initials) {
        StringBuilder details = new StringBuilder();
        details.append(String.format("\nCode: %s \nDescription: %s \nInitials: %s", code, description, initials));
        return details.toString();
    }

}
