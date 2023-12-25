package com.company.pjlcargoconnect.view.masterdataunit;

import com.company.pjlcargoconnect.entity.MasterdataUnit;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataUnits", layout = MainView.class)
@ViewController("MasterdataUnit.list")
@ViewDescriptor("masterdata-unit-list-view.xml")
@LookupComponent("masterdataUnitsDataGrid")
@DialogMode(width = "64em")
public class MasterdataUnitListView extends StandardListView<MasterdataUnit> {
}