package customer.app.driveaze.driveaze;

public class DrawerNavItem {

    public int icon;
    public String title;

    public DrawerNavItem() {
    }

    public DrawerNavItem(int icon, String title) {
        this.icon = icon;
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}