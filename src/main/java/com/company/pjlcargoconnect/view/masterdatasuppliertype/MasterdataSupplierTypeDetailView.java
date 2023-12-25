package com.company.pjlcargoconnect.view.masterdatasuppliertype;

import com.company.pjlcargoconnect.entity.MasterdataSupplierType;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataSupplierTypes/:id", layout = MainView.class)
@ViewController("MasterdataSupplierType.detail")
@ViewDescriptor("masterdata-supplier-type-detail-view.xml")
@EditedEntityContainer("masterdataSupplierTypeDc")
public class MasterdataSupplierTypeDetailView extends StandardDetailView<MasterdataSupplierType> {
}