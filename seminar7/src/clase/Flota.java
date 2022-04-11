package clase;

import java.util.ArrayList;
import java.util.List;

public class Flota implements IItem{
    private String nume;
    private List<IItem> items;

    public Flota(String nume) {
        this.nume = nume;
        items = new ArrayList<>();
    }

    @Override
    public void adaugaItem(IItem iItem) throws Exception{
        items.add(iItem);
    }

    @Override
    public void stergeItem(IItem iItem) throws Exception{
        items.remove(iItem);

    }

    @Override
    public void descriereItem() {
        System.out.println(items.toString());//afisare info pt nodul curent
        for(IItem item:items){
            item.descriereItem();//afisare copii
        }
    }

    @Override
    public IItem getItem(int pozitie) throws Exception{
        return items.get(pozitie);
    }

    @Override
    public float calculeazaSumaGarantata(float pretPerLoc) {
        float suma = 0;
        for (IItem item : items) {
            suma=item.calculeazaSumaGarantata(pretPerLoc);
        }
        return suma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flota{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
