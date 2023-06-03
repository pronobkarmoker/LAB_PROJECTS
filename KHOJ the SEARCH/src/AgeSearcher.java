public class AgeSearcher implements ISearcher{
    @Override
    public Boolean Cheackcondition(Person p) {
        return p.age>=18;
    }
}
