public class TableClass implements Table {

    @Override
    public boolean get(Tuple position) {
        return position.isValue();
    }

    @Override
    public void set(Tuple position) {
//        Table[position.getPosition()] = true;
    }
}
