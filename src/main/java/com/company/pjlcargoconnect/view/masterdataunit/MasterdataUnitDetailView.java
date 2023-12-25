package com.company.pjlcargoconnect.view.masterdataunit;

import com.company.pjlcargoconnect.entity.MasterdataUnit;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataUnits/:id", layout = MainView.class)
@ViewController("MasterdataUnit.detail")
@ViewDescriptor("masterdata-unit-detail-view.xml")
@EditedEntityContainer("masterdataUnitDc")
public class MasterdataUnitDetailView extends StandardDetailView<MasterdataUnit> {
}