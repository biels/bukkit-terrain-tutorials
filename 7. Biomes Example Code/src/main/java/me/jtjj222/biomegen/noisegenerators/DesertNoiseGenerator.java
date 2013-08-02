package me.jtjj222.biomegen.noisegenerators;

import org.bukkit.World;

public class DesertNoiseGenerator extends BiomeNoiseGenerator {

	public DesertNoiseGenerator(World world) {
		super(world);
		this.generator.setScale(1.0/64.0);
		this.magnitude = 6.0;
	}
	
	@Override
	public double get3dNoise(double x, double y, double z) {
		return 0;
	}
}