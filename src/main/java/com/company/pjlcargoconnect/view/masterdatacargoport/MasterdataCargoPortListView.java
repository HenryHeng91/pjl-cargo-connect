package com.company.pjlcargoconnect.view.masterdatacargoport;

import com.company.pjlcargoconnect.entity.MasterdataCargoPort;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataCargoPorts", layout = MainView.class)
@ViewController("MasterdataCargoPort.list")
@ViewDescriptor("masterdata-cargo-port-list-view.xml")
@LookupComponent("masterdataCargoPortsDataGrid")
@DialogMode(width = "64em")
public class MasterdataCargoPortListView extends StandardListView<MasterdataCargoPort> {
}