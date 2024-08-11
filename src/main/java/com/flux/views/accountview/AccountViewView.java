package com.flux.views.accountview;

import com.flux.data.SamplePerson;
import com.flux.services.SamplePersonService;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

@PageTitle("Account View")
@Menu(icon = "line-awesome/svg/newspaper-solid.svg", order = 2)
@Route(value = "account-view")
@Uses(Icon.class)
public class AccountViewView extends Composite<VerticalLayout> {

    public AccountViewView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        Paragraph textSmall = new Paragraph();
        FormLayout formLayout2Col = new FormLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        DatePicker datePicker = new DatePicker();
        EmailField emailField = new EmailField();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        TextArea textArea = new TextArea();
        FormLayout formLayout3Col = new FormLayout();
        H2 h2 = new H2();
        H2 h22 = new H2();
        Button buttonPrimary = new Button();
        Grid stripedGrid = new Grid(SamplePerson.class);
        FormLayout formLayout3Col2 = new FormLayout();
        H2 h23 = new H2();
        H2 h24 = new H2();
        Button buttonPrimary2 = new Button();
        MenuBar menuBar = new MenuBar();
        Grid multiSelectGrid = new Grid(SamplePerson.class);
        H2 h25 = new H2();
        Grid stripedGrid2 = new Grid(SamplePerson.class);
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutColumn2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.addClassName(Padding.SMALL);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        textSmall.setText("Account Number: PU-Cust-000001");
        textSmall.setWidth("100%");
        textSmall.getStyle().set("font-size", "var(--lumo-font-size-xs)");
        formLayout2Col.setWidth("100%");
        textField.setLabel("First name");
        textField.setWidth("min-content");
        textField2.setLabel("Last Name");
        textField2.setWidth("min-content");
        datePicker.setLabel("Birthdate");
        datePicker.setWidth("min-content");
        emailField.setLabel("Email");
        emailField.setWidth("min-content");
        textField3.setLabel("Mobile");
        textField3.setWidth("min-content");
        textField4.setLabel("Landline");
        textField4.setWidth("min-content");
        textArea.setLabel("Address");
        textArea.setWidth("100%");
        formLayout3Col.setWidth("100%");
        formLayout3Col.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        h2.setText("Opportunities");
        h2.setWidth("max-content");
        h22.setText("blank text");
        h22.setWidth("max-content");
        buttonPrimary.setText("New quote");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        stripedGrid.addThemeVariants(GridVariant.LUMO_ROW_STRIPES);
        stripedGrid.setWidth("100%");
        stripedGrid.getStyle().set("flex-grow", "0");
        setGridSampleData(stripedGrid);
        formLayout3Col2.setWidth("100%");
        formLayout3Col2.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        h23.setText("Activities");
        h23.setWidth("max-content");
        h24.setText("blank text");
        h24.setWidth("max-content");
        buttonPrimary2.setText("New Activity");
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        menuBar.setWidth("min-content");
        setMenuBarSampleData(menuBar);
        multiSelectGrid.setSelectionMode(Grid.SelectionMode.MULTI);
        multiSelectGrid.setWidth("100%");
        multiSelectGrid.getStyle().set("flex-grow", "0");
        setGridSampleData(multiSelectGrid);
        h25.setText("Policies");
        h25.setWidth("max-content");
        stripedGrid2.addThemeVariants(GridVariant.LUMO_ROW_STRIPES);
        stripedGrid2.setWidth("100%");
        stripedGrid2.getStyle().set("flex-grow", "0");
        setGridSampleData(stripedGrid2);
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(textSmall);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(textField);
        formLayout2Col.add(textField2);
        formLayout2Col.add(datePicker);
        formLayout2Col.add(emailField);
        formLayout2Col.add(textField3);
        formLayout2Col.add(textField4);
        formLayout2Col.add(textArea);
        layoutColumn2.add(formLayout3Col);
        formLayout3Col.add(h2);
        formLayout3Col.add(h22);
        formLayout3Col.add(buttonPrimary);
        layoutColumn2.add(stripedGrid);
        layoutColumn2.add(formLayout3Col2);
        formLayout3Col2.add(h23);
        formLayout3Col2.add(h24);
        formLayout3Col2.add(buttonPrimary2);
        layoutColumn2.add(menuBar);
        layoutColumn2.add(multiSelectGrid);
        layoutColumn2.add(h25);
        layoutColumn2.add(stripedGrid2);
    }

    private void setGridSampleData(Grid grid) {
        grid.setItems(query -> samplePersonService.list(
                PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());
    }

    @Autowired()
    private SamplePersonService samplePersonService;

    private void setMenuBarSampleData(MenuBar menuBar) {
        menuBar.addItem("View");
        menuBar.addItem("Edit");
        menuBar.addItem("Share");
        menuBar.addItem("Move");
    }
}
