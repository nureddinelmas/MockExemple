public class Service {

    private Database database;

    public Service(Database database) {
        this.database = database;
    }

    public boolean query(String query) {
        if (database.isAvailable()){
            int result = database.runQuery(query);
            return true;
        }

        return false;
    }


    @Override
    public String toString() {
        return "Using database with id: " + String.valueOf(database.getUniqueId());
    }
}
