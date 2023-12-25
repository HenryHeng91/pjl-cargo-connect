package com.company.pjlcargoconnect.view.masterdatacontainersize;

import com.company.pjlcargoconnect.entity.MasterdataContainerSize;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataContainerSizes", layout = MainView.class)
@ViewController("MasterdataContainerSize.list")
@ViewDescriptor("masterdata-container-size-list-view.xml")
@LookupComponent("masterdataContainerSizesDataGrid")
@DialogMode(width = "64em")
public class MasterdataContainerSizeListView extends StandardListView<MasterdataContainerSize> {
}