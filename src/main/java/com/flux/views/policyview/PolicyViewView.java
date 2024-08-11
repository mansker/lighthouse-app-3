package com.flux.views.policyview;

import com.flux.data.SamplePerson;
import com.flux.services.SamplePersonService;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

@PageTitle("Policy View")
@Menu(icon = "line-awesome/svg/car-side-solid.svg", order = 3)
@Route(value = "policy-view")
@Uses(Icon.class)
public class PolicyViewView extends Composite<VerticalLayout> {

    public PolicyViewView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        Paragraph textSmall = new Paragraph();
        FormLayout formLayout2Col = new FormLayout();
        Accordion accordion = new Accordion();
        Accordion accordion2 = new Accordion();
        FormLayout formLayout3Col = new FormLayout();
        H2 h2 = new H2();
        H2 h22 = new H2();
        Button buttonPrimary = new Button();
        Grid multiSelectGrid = new Grid(SamplePerson.class);
        Hr hr = new Hr();
        H2 h23 = new H2();
        TabSheet tabSheet = new TabSheet();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        FormLayout formLayout2Col2 = new FormLayout();
        H4 h4 = new H4();
        Paragraph textMedium = new Paragraph();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        textSmall.setText("Policy Number: PU-Policy-000001");
        textSmall.setWidth("100%");
        textSmall.getStyle().set("font-size", "var(--lumo-font-size-xs)");
        formLayout2Col.setWidth("100%");
        accordion.setWidth("100%");
        setAccordionSampleData(accordion);
        accordion2.setWidth("100%");
        setAccordionSampleData(accordion2);
        formLayout3Col.setWidth("100%");
        formLayout3Col.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        h2.setText("Activities");
        h2.setWidth("max-content");
        h22.setText("blank text");
        h22.setWidth("max-content");
        buttonPrimary.setText("New Activity");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        multiSelectGrid.setSelectionMode(Grid.SelectionMode.MULTI);
        multiSelectGrid.setWidth("100%");
        multiSelectGrid.getStyle().set("flex-grow", "0");
        setGridSampleData(multiSelectGrid);
        h23.setText("Insurance Details");
        h23.setWidth("max-content");
        tabSheet.setWidth("100%");
        setTabSheetSampleData(tabSheet);
        layoutColumn3.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        formLayout2Col2.setWidth("100%");
        h4.setText("Coverage name");
        h4.setWidth("max-content");
        textMedium.setText(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        textMedium.setWidth("100%");
        textMedium.getStyle().set("font-size", "var(--lumo-font-size-m)");
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(textSmall);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(accordion);
        formLayout2Col.add(accordion2);
        layoutColumn2.add(formLayout3Col);
        formLayout3Col.add(h2);
        formLayout3Col.add(h22);
        formLayout3Col.add(buttonPrimary);
        layoutColumn2.add(multiSelectGrid);
        layoutColumn2.add(hr);
        layoutColumn2.add(h23);
        layoutColumn2.add(tabSheet);
        layoutColumn2.add(layoutColumn3);
        layoutColumn3.add(formLayout2Col2);
        formLayout2Col2.add(h4);
        formLayout2Col2.add(textMedium);
    }

    private void setAccordionSampleData(Accordion accordion) {
        Span name = new Span("Sophia Williams");
        Span email = new Span("sophia.williams@company.com");
        Span phone = new Span("(501) 555-9128");
        VerticalLayout personalInformationLayout = new VerticalLayout(name, email, phone);
        personalInformationLayout.setSpacing(false);
        personalInformationLayout.setPadding(false);
        accordion.add("Personal information", personalInformationLayout);
        Span street = new Span("4027 Amber Lake Canyon");
        Span zipCode = new Span("72333-5884 Cozy Nook");
        Span city = new Span("Arkansas");
        VerticalLayout billingAddressLayout = new VerticalLayout();
        billingAddressLayout.setSpacing(false);
        billingAddressLayout.setPadding(false);
        billingAddressLayout.add(street, zipCode, city);
        accordion.add("Billing address", billingAddressLayout);
        Span cardBrand = new Span("Mastercard");
        Span cardNumber = new Span("1234 5678 9012 3456");
        Span expiryDate = new Span("Expires 06/21");
        VerticalLayout paymentLayout = new VerticalLayout();
        paymentLayout.setSpacing(false);
        paymentLayout.setPadding(false);
        paymentLayout.add(cardBrand, cardNumber, expiryDate);
        accordion.add("Payment", paymentLayout);
    }

    private void setGridSampleData(Grid grid) {
        grid.setItems(query -> samplePersonService.list(
                PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());
    }

    @Autowired()
    private SamplePersonService samplePersonService;

    private void setTabSheetSampleData(TabSheet tabSheet) {
        tabSheet.add("Dashboard", new Div(new Text("This is the Dashboard tab content")));
        tabSheet.add("Payment", new Div(new Text("This is the Payment tab content")));
        tabSheet.add("Shipping", new Div(new Text("This is the Shipping tab content")));
    }
}
