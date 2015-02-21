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
		Player p = event.getPlayer();
		p.sendMessage(Main.this.getConfig().getString("JoinMOTD1").replaceAll("&", "\u00A7").replaceAll("%player%", event.getPlayer().getName()));
		p.sendMessage(Main.this.getConfig().getString("JoinMOTD2").replaceAll("&", "\u00A7").replaceAll("%player%", event.getPlayer().getName()));
		p.sendMessage(Main.this.getConfig().getString("JoinMOTD3").replaceAll("&", "\u00A7").replaceAll("%player%", event.getPlayer().getName()));
		p.sendMessage(Main.this.getConfig().getString("JoinMOTD4").replaceAll("&", "\u00A7").replaceAll("%player%", event.getPlayer().getName()));
		
		event.setJoinMessage(null);
		if (event.getPlayer().hasPermission("msg.joinshout")){
			Bukkit.broadcastMessage(Main.this.getConfig().getString("JoinShout").replaceAll("&", "\u00A7").replaceAll("%player%", event.getPlayer().getName()));
		}
	}
	
	public void onDisable(){
		
	}
	
	
}
