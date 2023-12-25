package com.company.pjlcargoconnect.view.masterdatacontainersize;

import com.company.pjlcargoconnect.entity.MasterdataContainerSize;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataContainerSizes/:id", layout = MainView.class)
@ViewController("MasterdataContainerSize.detail")
@ViewDescriptor("masterdata-container-size-detail-view.xml")
@EditedEntityContainer("masterdataContainerSizeDc")
public class MasterdataContainerSizeDetailView extends StandardDetailView<MasterdataContainerSize> {
}