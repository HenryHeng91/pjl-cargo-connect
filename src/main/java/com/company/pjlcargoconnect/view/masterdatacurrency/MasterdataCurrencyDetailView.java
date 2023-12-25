package com.company.pjlcargoconnect.view.masterdatacurrency;

import com.company.pjlcargoconnect.entity.MasterdataCurrency;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataCurrencies/:id", layout = MainView.class)
@ViewController("MasterdataCurrency.detail")
@ViewDescriptor("masterdata-currency-detail-view.xml")
@EditedEntityContainer("masterdataCurrencyDc")
public class MasterdataCurrencyDetailView extends StandardDetailView<MasterdataCurrency> {
}