package com.company.pjlcargoconnect.view.masterdataproductcategory;

import com.company.pjlcargoconnect.entity.MasterdataProductCategory;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataProductCategories/:id", layout = MainView.class)
@ViewController("MasterdataProductCategory.detail")
@ViewDescriptor("masterdata-product-category-detail-view.xml")
@EditedEntityContainer("masterdataProductCategoryDc")
public class MasterdataProductCategoryDetailView extends StandardDetailView<MasterdataProductCategory> {
}