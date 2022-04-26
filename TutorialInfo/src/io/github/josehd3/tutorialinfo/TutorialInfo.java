package io.github.josehd3.tutorialinfo;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class TutorialInfo extends JavaPlugin {

	private PluginDescriptionFile pluginInfo = getDescription();
	private String pluginName = pluginInfo.getName();
	private String pluginVersion = pluginInfo.getVersion();
	private String pluginAuthors = pluginInfo.getAuthors().toString();
	
	@Override
	public void onEnable() {
		this.getCommand("tutorial").setExecutor(new CommandTutorial());
		this.getCommand("tutorialinfo").setExecutor(new CommandInfo(getPluginName(), getPluginVersion(), getPluginAuthors()));
	}
	
	@Override
	public void onDisable() {

	}
	
	public String getPluginName() {
		return pluginName;
	}
	
	public String getPluginVersion() {
		return pluginVersion;
	}
	
	public String getPluginAuthors() {
		return pluginAuthors;
	}
	
}
