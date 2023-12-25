package com.company.pjlcargoconnect.view.masterdataproductcategory;

import com.company.pjlcargoconnect.entity.MasterdataProductCategory;

import com.company.pjlcargoconnect.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "masterdataProductCategories", layout = MainView.class)
@ViewController("MasterdataProductCategory.list")
@ViewDescriptor("masterdata-product-category-list-view.xml")
@LookupComponent("masterdataProductCategoriesDataGrid")
@DialogMode(width = "64em")
public class MasterdataProductCategoryListView extends StandardListView<MasterdataProductCategory> {
}