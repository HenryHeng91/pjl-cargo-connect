package com.company.pjlcargoconnect.view.masterdatacontainertype;

import com.company.pjlcargoconnect.entity.MasterdataContainerType;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataContainerTypes/:id", layout = MainView.class)
@ViewController("MasterdataContainerType.detail")
@ViewDescriptor("masterdata-container-type-detail-view.xml")
@EditedEntityContainer("masterdataContainerTypeDc")
public class MasterdataContainerTypeDetailView extends StandardDetailView<MasterdataContainerType> {
}