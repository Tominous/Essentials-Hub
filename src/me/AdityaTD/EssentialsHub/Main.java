package me.AdityaTD.EssentialsHub;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public void onEnable(){
		this.saveDefaultConfig();
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event){
		event.setJoinMessage(null);
		Player p = event.getPlayer();
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("JoinMOTD1")).replaceAll("%player%", event.getPlayer().getName()));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("JoinMOTD2")).replaceAll("%player%", event.getPlayer().getName()));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("JoinMOTD3")).replaceAll("%player%", event.getPlayer().getName()));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("JoinMOTD4")).replaceAll("%player%", event.getPlayer().getName()));
		
		if (p.hasPermission("msg.joinshout")){
			Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("JoinShout")).replaceAll("%player%", event.getPlayer().getName()));
		}
	}
	
	public void onDisable(){
		
	}
	
	
}
