package com.OrangeHRM.helpers;

import com.codeborne.selenide.SelenideElement;
import lombok.NonNull;

public abstract class CommonMethods {

    public static void clearAndSetValue(@NonNull final SelenideElement element, @NonNull final String value) {
        element.clear();
        element.setValue(value);
    }

}
