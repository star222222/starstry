package Stardustry.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.Item;

public class StItems implements ContentList
{
    public static Item
    //item
    uranium, uraniumore;

    public void load()

    {
        uranium = new Item("uranium", Color.green)
        {
            {
                flammability = 5f;
            }
        };
    }
}
