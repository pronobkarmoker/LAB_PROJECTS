public class CitySeracher implements ISearcher{
    @Override
    public Boolean Cheackcondition(Person p) {
        return p.city.equals("Dhaka");
    }
}
