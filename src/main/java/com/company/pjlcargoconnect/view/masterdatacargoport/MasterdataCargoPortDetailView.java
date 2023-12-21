package com.company.pjlcargoconnect.view.masterdatacargoport;

import com.company.pjlcargoconnect.entity.MasterdataCargoPort;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataCargoPorts/:id", layout = MainView.class)
@ViewController("MasterdataCargoPort.detail")
@ViewDescriptor("masterdata-cargo-port-detail-view.xml")
@EditedEntityContainer("masterdataCargoPortDc")
public class MasterdataCargoPortDetailView extends StandardDetailView<MasterdataCargoPort> {
}