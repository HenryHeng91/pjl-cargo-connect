package com.company.pjlcargoconnect.view.masterdatamodeoftransport;

import com.company.pjlcargoconnect.entity.MasterdataModeOfTransport;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataModeOfTransports", layout = MainView.class)
@ViewController("MasterdataModeOfTransport.list")
@ViewDescriptor("masterdata-mode-of-transport-list-view.xml")
@LookupComponent("masterdataModeOfTransportsDataGrid")
@DialogMode(width = "64em")
public class MasterdataModeOfTransportListView extends StandardListView<MasterdataModeOfTransport> {
}