package com.volmit.iris.object;

import com.volmit.iris.util.Desc;
import com.volmit.iris.util.DontObfuscate;
import com.volmit.iris.util.MinNumber;
import com.volmit.iris.util.Required;

import lombok.Data;

@Desc("Translate objects")
@Data
public class IrisCaveLayer
{
	@Required
	@DontObfuscate
	@Desc("The vertical slope this cave layer follows")
	private IrisShapedGeneratorStyle verticalSlope = new IrisShapedGeneratorStyle();

	@Required
	@DontObfuscate
	@Desc("The horizontal slope this cave layer follows")
	private IrisShapedGeneratorStyle horizontalSlope = new IrisShapedGeneratorStyle();

	@MinNumber(0.001)
	@DontObfuscate
	@Desc("The cave zoom. Higher values makes caves spread out further and branch less often, but are thicker.")
	private double caveZoom = 1D;

	@MinNumber(0.001)
	@DontObfuscate
	@Desc("The cave thickness.")
	private double caveThickness = 1D;

	@DontObfuscate
	@Desc("If set to true, this cave layer can break the surface")
	private boolean canBreakSurface = false;

	public IrisCaveLayer()
	{

	}
}