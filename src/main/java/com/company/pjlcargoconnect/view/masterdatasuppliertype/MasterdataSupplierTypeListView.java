package com.company.pjlcargoconnect.view.masterdatasuppliertype;

import com.company.pjlcargoconnect.entity.MasterdataSupplierType;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataSupplierTypes", layout = MainView.class)
@ViewController("MasterdataSupplierType.list")
@ViewDescriptor("masterdata-supplier-type-list-view.xml")
@LookupComponent("masterdataSupplierTypesDataGrid")
@DialogMode(width = "64em")
public class MasterdataSupplierTypeListView extends StandardListView<MasterdataSupplierType> {
}