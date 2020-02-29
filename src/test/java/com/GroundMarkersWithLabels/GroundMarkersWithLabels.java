package com.GroundMarkersWithLabels;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class GroundMarkersWithLabels
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(GroundMarkerWithLabelsPlugin.class);
		RuneLite.main(args);
	}
}