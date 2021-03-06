package edu.asu.plp.tool.prototype;

import java.io.File;

import edu.asu.plp.tool.prototype.model.Project;

@FunctionalInterface
public interface LoadFunction
{
	Project load(File file);
}
