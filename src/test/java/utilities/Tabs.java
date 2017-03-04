package utilities;

public enum Tabs {
    CUSTOMERS("Customers"),
    STORES("Stores"),
    CONTACTS("Contacts"),
    CUSTOMERREQUESTS("Customer Requests"),
    PERSONS("Persons"),
    ALL("All");

    private String tabName;

    Tabs(String tabName) {
        this.tabName = tabName;
    }

    public String getTabName() {
        return this.tabName;
    }

    @Override
    public String toString() {
        return this.getTabName();
    }
}
