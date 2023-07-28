package Stardustry.content;

import Stardustry.world.HeatTractorBeamTurret;
import arc.graphics.*;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.ctype.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.power.*;

import static mindustry.type.ItemStack.*;

public class StBlocks implements ContentList {
    public static Block testturret;

    @Override
    public void load() {

        testturret = new HeatTractorBeamTurret("testturret") {
            {
                requirements(Category.turret, with(Items.silicon, 120, Items.titanium, 90, Items.graphite, 30));

                health = 1500;
                damage = 2000;
                hasPower = true;
                size = 4;
                force = 12f;
                scaledForce = 6f;
                range = 240f;
                rotateSpeed = 10;

                consumes.powerCond(3f, (HeatTractorBeamBuild e) -> e.target != null);
            }
        };
    }
}
