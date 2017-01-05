import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class pluginMain extends JavaPlugin implements Listener{
	
	public pluginMain plugin;
	
	public void onDisable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		getLogger().warning("SMDAfterShockZAPI V."+ pdfFile.getVersion()+ " disabled! ");
		Bukkit.broadcastMessage(ChatColor.RED+"SMDAfterShockZAPI "+ChatColor.GRAY+"V."+ pdfFile.getVersion()+ " disabled! ");
		for (Player p : Bukkit.getOnlinePlayers()) {
			p.playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 1);
		}
	}
	public void onEnable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		getLogger().warning("SMDAfterShockZAPI V."+ pdfFile.getVersion()+ " enabled! ");
		getLogger().warning("--------------------------------");
		getLogger().warning("");
		getLogger().warning("SMD_AfterShockZAPI by SMilyDay_xD");
		getLogger().warning("Version: "+pdfFile.getVersion());
		getLogger().warning("Only available for AfterShockZ Server!");
		getLogger().warning("Contact: fb.com/palapon2545");
		getLogger().warning("");
		getLogger().warning("--------------------------------");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
		Bukkit.broadcastMessage(ChatColor.RED+"SMDAfterShockZAPI "+ChatColor.GRAY+"V."+ pdfFile.getVersion()+ " enabled! ");
		for (Player p : Bukkit.getOnlinePlayers()) {
			p.playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 1);
		}
	}
	@EventHandler
	public void Join(PlayerJoinEvent e){
		Player player = e.getPlayer();
		e.setJoinMessage(ChatColor.BLUE+"Join> "+ChatColor.GREEN+player.getName()+ChatColor.WHITE+" ได้เข้ามาป่วนในเซิฟเวอร์แล้ว!"+ChatColor.LIGHT_PURPLE+ChatColor.BOLD+" o(≧o≦)o");
	}
	@EventHandler
	public void Quit(PlayerQuitEvent e){
		Player player = e.getPlayer();
		e.setQuitMessage(ChatColor.BLUE+"Left> "+ChatColor.RED+player.getName()+ChatColor.WHITE+" ได้ออกจากเซิฟเวอร์แล้ว, ไว้เจอกันใหม่นะ! "+ChatColor.LIGHT_PURPLE+ChatColor.BOLD+"(≧3≦)");
	}
	@EventHandler
	public void Chat(AsyncPlayerChatEvent e) {
		String f = e.getMessage().toLowerCase();

		String f1 = f.replaceAll("ควย", "§4§mΘΘΘ§r");
		String f2 = f1.replaceAll("หี", "§4§mΘΘ§r");
		String f3 = f2.replaceAll("สัส", "§4§mΘΘΘ§r");
		String f4 = f3.replaceAll("พ่อง", "§4§mΘΘΘΘ§r");
		String f5 = f4.replaceAll("แม่ง", "§4§mΘΘΘΘ§r");
		String f6 = f5.replaceAll("กาก", "§4§mΘΘΘ§r");
		String f7 = f6.replaceAll("กาก", "§4§mΘΘΘ§r");
		String f8 = f7.replaceAll("สาส", "§4§mΘΘΘ§r");
		String f9 = f8.replaceAll("สาส", "§4§mΘΘΘ§r");
		String f10 = f9.replaceAll("เหี้ย", "§4§mΘΘΘΘ§r");
		String f11 = f10.replaceAll("มึง", "§4§mΘΘΘ§r");
		String f12 = f11.replaceAll("กู", "§4§mΘΘ§r");
		String f13 = f12.replaceAll("เชี่ย", "§4§mΘΘΘΘΘ§r");
		String f14 = f13.replaceAll("เย็ด", "§4§mΘΘΘΘ§r");
		String f15 = f14.replaceAll("ไอ่", "§4§mΘΘΘ§r");
		String f16 = f15.replaceAll("หำ", "§4§mΘΘΘ§r");
		String f17 = f16.replaceAll("จิ๋ม", "§4§mΘΘΘΘ§r");
		String f18 = f17.replaceAll("อีดอกทอง", "§4§mΘΘΘΘΘΘΘΘ§r");
		String f19 = f18.replaceAll("หมอย", "§4§mΘΘΘΘ§r");
		String f20 = f19.replaceAll("อี", "§4§mΘΘ§r");
		String f21 = f20.replaceAll("Fuck", "§4§mΘΘΘΘ§r");
		String f22 = f21.replaceAll("Kuy", "§4§mΘΘΘ§r");
		String f23 = f22.replaceAll("Bitch", "§4§mΘΘΘΘ§r");
		String f24 = f23.replaceAll("Dick", "§4§mΘΘΘΘ§r");
		String f25 = f24.replaceAll("WTF", "§4§mΘΘΘ§r");
		String f26 = f25.replaceAll("Pussy", "§4§mΘΘΘΘΘ§r");
		String f27 = f26.replaceAll("มิง", "§4§mΘΘΘ§r");
		String f28 = f27.replaceAll("Stupid", "§4§mΘΘΘΘΘΘ§r");
		String f29 = f28.replaceAll("สัด", "§4§mΘΘΘ§r");
		String f30 = f29.replaceAll("ฆวย", "§4§mΘΘΘ§r");
		String f31 = f30.replaceAll("ฅวย", "§4§mΘΘΘ§r");
		String f32 = f31.replaceAll("8;p", "§4§mΘΘΘ§r");
		e.setMessage(f32);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
		Player player = (Player) sender;
		String playerName = player.getName();
		String message = "";
		for (String part : args) {
			if (message != "")
				message += " ";
			message += part;
		}
		if (player.isOp()) {
		if (cmd.getName().equalsIgnoreCase("systemupdate")) {
			for (Player p : Bukkit.getOnlinePlayers()) {
				p.sendMessage(ChatColor.BLUE+"Server> "+ChatColor.GRAY+"System "+ChatColor.GREEN+args[0]+ChatColor.GRAY+" is "+ChatColor.YELLOW+"Updating "+ChatColor.GRAY+"by "+ChatColor.LIGHT_PURPLE+playerName);
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 1);
			}
		}
		if (cmd.getName().equalsIgnoreCase("systeminstalled")) {
			for (Player p : Bukkit.getOnlinePlayers()) {
					p.sendMessage(ChatColor.BLUE+"Server> "+ChatColor.GRAY+"System "+ChatColor.GREEN+args[0]+ChatColor.GRAY+" is "+ChatColor.BLUE+"Installed "+ChatColor.GRAY+"by "+ChatColor.LIGHT_PURPLE+playerName);
					p.playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 1);
				}
			}
		}
		return false;
	}
	public static boolean isInt(String sender) {
			try {
				Integer.parseInt(sender);
			} 
			catch (NumberFormatException nfe) {
				return false;
			}
		return true;
	}
}