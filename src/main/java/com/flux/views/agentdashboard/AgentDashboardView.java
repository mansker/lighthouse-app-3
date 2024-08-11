package com.flux.views.agentdashboard;

import com.flux.data.SamplePerson;
import com.flux.data.models.Account;
import com.flux.services.AccountService;
import com.flux.services.SamplePersonService;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

@PageTitle("Agent Dashboard")
@Menu(icon = "line-awesome/svg/person-booth-solid.svg", order = 1)
@Route(value = "agent-dashboard")
@Uses(Icon.class)
public class AgentDashboardView extends Composite<VerticalLayout> {

    public AgentDashboardView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        FormLayout formLayout2Col = new FormLayout();
        Paragraph textSmall = new Paragraph();
        Paragraph textSmall2 = new Paragraph();
        FormLayout formLayout3Col = new FormLayout();
        H2 h2 = new H2();
        H2 h22 = new H2();
        Button buttonPrimary = new Button();
        //Grid stripedGrid = new Grid(SamplePerson.class);
        Grid stripedGrid = new Grid(Account.class);
        FormLayout formLayout3Col2 = new FormLayout();
        H2 h23 = new H2();
        H2 h24 = new H2();
        Button buttonPrimary2 = new Button();
        MenuBar menuBar = new MenuBar();
        //Grid multiSelectGrid = new Grid(SamplePerson.class);
        Grid multiSelectGrid = new Grid(Account.class);
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutColumn2.addClassName(Padding.XLARGE);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn2.setJustifyContentMode(JustifyContentMode.START);
        layoutColumn2.setAlignItems(Alignment.START);
        formLayout2Col.setWidth("100%");
        textSmall.setText("Agent Name: James Bond");
        textSmall.setWidth("100%");
        textSmall.getStyle().set("font-size", "var(--lumo-font-size-m)"); //mans
        textSmall2.setText("Agent Number: 007");
        textSmall2.setWidth("100%");
        textSmall2.getStyle().set("font-size", "var(--lumo-font-size-m)"); //mans
        formLayout3Col.setWidth("100%");
        formLayout3Col.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        h2.setText("Opportunities");
        h2.setWidth("max-content");
//        Todo: placeholder text
        h22.setText(" ");
        h22.setWidth("max-content");
        buttonPrimary.setText("New Opportunity");
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
//        Todo: placeholder text
        h24.setText(" ");
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
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(textSmall);
        formLayout2Col.add(textSmall2);
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
    }

    private void setGridSampleData(Grid grid) {
        /*grid.setItems(query -> samplePersonService.list(
                PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());*/
        grid.setItems(query -> accountService.list(
                        PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());
    }

    @Autowired()
    private SamplePersonService samplePersonService;

    @Autowired()
    private AccountService accountService;

    private void setMenuBarSampleData(MenuBar menuBar) {
        menuBar.addItem("View");
        menuBar.addItem("Edit");
        menuBar.addItem("Share");
        menuBar.addItem("Move");
    }
}
