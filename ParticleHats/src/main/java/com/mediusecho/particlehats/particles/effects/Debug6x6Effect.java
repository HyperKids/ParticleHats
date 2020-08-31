package com.mediusecho.particlehats.particles.effects;

import java.util.Arrays;
import java.util.List;

import com.mediusecho.particlehats.particles.properties.ParticleLocation;
import com.mediusecho.particlehats.particles.properties.ParticleTracking;
import com.mediusecho.particlehats.util.ResourceUtil;

public class Debug6x6Effect extends PixelEffect {

	public Debug6x6Effect ()
	{
		super(ResourceUtil.getImage("debug_6x6.png"), "debug_6x6");
	}
	
	@Override
	public String getName() {
		return "debug_6x6";
	}

	@Override
	public String getDisplayName() {
		return "Debug 6x6";
	}

	@Override
	public String getDescription() {
		return "&cYou're not supposed to see this";
	}

	@Override
	public int getParticlesSupported() {
		return 1;
	}

	@Override
	public ParticleLocation getDefaultLocation() {
		return ParticleLocation.FEET;
	}

	@Override
	public List<ParticleTracking> getSupportedTrackingMethods() {
		return Arrays.asList(ParticleTracking.values());
	}

	@Override
	public ParticleTracking getDefaultTrackingMethod() {
		return ParticleTracking.TRACK_NOTHING;
	}

	@Override
	public boolean supportsAnimation() {
		return false;
	}

	@Override
	public boolean isCustom() {
		return false;
	}
}
