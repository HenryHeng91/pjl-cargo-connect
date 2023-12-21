package com.company.pjlcargoconnect.view.masterdatacountry;

import com.company.pjlcargoconnect.entity.ContinentEnum;
import com.company.pjlcargoconnect.entity.MasterdataCountry;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataCountries/:id", layout = MainView.class)
@ViewController("MasterdataCountry.detail")
@ViewDescriptor("masterdata-country-detail-view.xml")
@EditedEntityContainer("masterdataCountryDc")
public class MasterdataCountryDetailView extends StandardDetailView<MasterdataCountry> {
    @Subscribe
    public void onInitEntity(final InitEntityEvent<MasterdataCountry> event) {
        MasterdataCountry country = event.getEntity();
        country.setContinent(ContinentEnum.ASIA);
    }
}