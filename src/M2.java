public class M2 {
    //fo constant declaration
    public static void main(String[] args) {
        final String WEBSITE_NAME="Vans Academy";
        System.out.println(WEBSITE_NAME);
        // from the blow example also
        M2.SiteName();
    }
    //can be also and called to the main class
    public static void SiteName() {
        final String SITE_NAME;
        SITE_NAME="Khan Academy";
        System.out.println(SITE_NAME);
    }
}
