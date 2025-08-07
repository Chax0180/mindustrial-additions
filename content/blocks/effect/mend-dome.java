        mendDome = new MendProjector("mend-dome"){{
            requirements(Category.effect, with(Items.lead, 180, Items.titanium, 80, Items.plastanium, 100, Items.silicon, 140));
            consumePower(3f);
            size = 3;
            reload = 300f;
            range = 140f;
            healPercent = 15f;
            phaseBoost = 15f;
            scaledHealth = 80;
            consumeItems(with(Items.phaseFabric, 1, Items.silicon, 1));
