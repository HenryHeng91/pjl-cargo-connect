package com.company.pjlcargoconnect.view.masterdatamodeoftransport;

import com.company.pjlcargoconnect.entity.MasterdataModeOfTransport;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataModeOfTransports/:id", layout = MainView.class)
@ViewController("MasterdataModeOfTransport.detail")
@ViewDescriptor("masterdata-mode-of-transport-detail-view.xml")
@EditedEntityContainer("masterdataModeOfTransportDc")
public class MasterdataModeOfTransportDetailView extends StandardDetailView<MasterdataModeOfTransport> {
}