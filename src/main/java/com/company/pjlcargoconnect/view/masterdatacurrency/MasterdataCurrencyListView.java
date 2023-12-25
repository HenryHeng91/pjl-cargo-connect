package com.company.pjlcargoconnect.view.masterdatacurrency;

import com.company.pjlcargoconnect.entity.MasterdataCurrency;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataCurrencies", layout = MainView.class)
@ViewController("MasterdataCurrency.list")
@ViewDescriptor("masterdata-currency-list-view.xml")
@LookupComponent("masterdataCurrenciesDataGrid")
@DialogMode(width = "64em")
public class MasterdataCurrencyListView extends StandardListView<MasterdataCurrency> {
}