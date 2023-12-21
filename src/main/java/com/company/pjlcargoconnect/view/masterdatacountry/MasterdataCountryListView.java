package com.company.pjlcargoconnect.view.masterdatacountry;

import com.company.pjlcargoconnect.entity.MasterdataCountry;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataCountries", layout = MainView.class)
@ViewController("MasterdataCountry.list")
@ViewDescriptor("masterdata-country-list-view.xml")
@LookupComponent("masterdataCountriesDataGrid")
@DialogMode(width = "64em")
public class MasterdataCountryListView extends StandardListView<MasterdataCountry> {
}