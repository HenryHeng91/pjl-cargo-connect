package com.company.pjlcargoconnect.view.masterdatacontainertype;

import com.company.pjlcargoconnect.entity.MasterdataContainerType;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataContainerTypes", layout = MainView.class)
@ViewController("MasterdataContainerType.list")
@ViewDescriptor("masterdata-container-type-list-view.xml")
@LookupComponent("masterdataContainerTypesDataGrid")
@DialogMode(width = "64em")
public class MasterdataContainerTypeListView extends StandardListView<MasterdataContainerType> {
}