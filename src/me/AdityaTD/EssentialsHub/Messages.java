package me.AdityaTD.EssentialsHub;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Messages extends JavaPlugin implements Listener{

	public void onEnable(){
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		
		Player p = event.getPlayer();
		
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(" ");
		p.sendMessage(null);
		
	}
	
}
