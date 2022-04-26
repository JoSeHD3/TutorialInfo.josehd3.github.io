package io.github.josehd3.tutorialinfo;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.ChatColor;

public class CommandTutorial implements CommandExecutor{
	

	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			ItemStack book = new ItemStack(Material.WRITTEN_BOOK, 1);
			
			BookMeta meta = (BookMeta) book.getItemMeta();
			meta.setTitle(ChatColor.GREEN + "TestBook");
			meta.setAuthor(ChatColor.DARK_RED + "Server");
			meta.addPage(
					ChatColor.GRAY + "Tutorial Book\n" + ChatColor.AQUA + "--SPIS TRESCI--\n" + ChatColor.BLACK + "1. Wybor klasy\n" + ChatColor.BLACK + "2. Handel\n" + ChatColor.BLACK + "3. Wytrzymalosc\n" + ChatColor.BLACK + "4. Umiejetnosci\n" + ChatColor.BLACK + "5. Ekonomia\n" + ChatColor.BLACK + "6. Dungeony\n" + ChatColor.BLACK + "7. Opis Przedmiotow\n",
					ChatColor.RED + "Wybor klasy\n" + ChatColor.BLACK + "Na poczatku naszej przygody wybieramy jedna z szesciu dostepnych klas na spawnie. Decyduja one o naszych statystykach, ekwipunku oraz przyszlych questach fabularnych zwiazanych z tymi klasami. Do wyboru mamy: Rogue, Cleric,", "Knight, Ranger, Adveturer oraz Farmer. Dwie ostatnie sa klasami o poziomie trudnosci \"EASY\", w zwiazku z czym nie posiadaja one wlasnego rodzaju ekwipunku czy tez sciezek fabularnych, jednak rozgrywka nimi na samym poczatku jest zdecydowanie latwiejsza.", "Pamietaj, ze wybor klasy jest jednorazowy!",
					ChatColor.RED + "Handel\n" + ChatColor.BLACK + "Zarowno w miescie jak i poza nim mozemy spotkac sie z NPC, ktorzy beda sklonni do handlu z nami. W momencie klikniecia PPM na NPC, ktory posiada mozliwosc Handlu, otworzy nam sie okno, w ktorym bedziemy mogli wykonac jedna z akcji: Zakupu, Sprzedazy albo", "Wymiany. Rodzaj wykonywanej akcji jest opisany w prawym dolnym rogu okna Handlu. Aby podjac sie Handlu nalezy najechac na interesujacy nas przedmiot, gdzie nastepnie zostana wyswietlone jego parametry oraz cena oferowana za ten przedmiot.", "Nastepnie nalezy kliknac LPM lub PPM by dokonac Handlu.",
					ChatColor.RED + "Wytrzymalosc\n" + ChatColor.BLACK + "Wszystkie przedmioty posiadaja swoja wytrzymalosc, ktora jest oznaczona przez kwadraciki widniejace u dolu opisow naszych przedmiotow. W momencie, w ktorym wszystkie kwadraciki zmienia swoj kolor na czerwony,", "wtedy nasz przedmiot bedzie niezdatny do uzytku. Naprawa przedmiotow nastepuje poprzez klikniecie klawiszow SHIFT + PPM na przedmiocie sluzacym do naprawy przedmiotu, ktory jest zuzyty i posiadamy go w ekwipunku.",
					ChatColor.RED + "Umiejetnosci\n" + ChatColor.BLACK + "Wszystkie klasy posiadaja swoje unikalne drzewka umiejetnosci, ktore sa wymienione na spawnie przy wyborze klasy. Opisy drzewek umiejetnosci znajduja sie pod komenda /<nazwa drzewka>, np. /swords.", "Znajdziemy tam opisy naszych drzewek, oraz umiejetnosci, ktore nabylismy podczas levelowania. Pod komenda /mctop znajdziemy powerrank (laczny level wszystkich drzewek umiejetnosci) wszystkich graczy.",
					ChatColor.RED + "Ekonomia\n" + ChatColor.BLACK + "Na serwerze dziala system ekonomii. Ilosc naszej gotowki mozemy zobaczyc pod komenda /balance, a liste z iloscia gotowki wszystkich graczy mamy dostepna pod komenda /balancetop.", "Aby zdobyc wieksza ilosc pieniedzy mozemy handlowac z NCPtami, polowac na potwory, konczyc dungeony lub wykonywac zadania. Wszystko jest dotepne na calej mapie.",
					ChatColor.RED + "Dungeony\n" + ChatColor.BLACK + "W celu wejscia do dungeonu musimy najpierw znalezc jego teleport. Znajduja sie one na mapie w dosyc charakterystycznych miejscach oraz znajduja sie przy nich tabliczki z menu dungeonow.", "W celu stworzenia party klikamy PPM na tabliczke \"New Party\", a zeby dolaczyc do stworzonej juz grupy klikamy PPM na tablicze \"Join Party\". Liczba minimalnej i maksymalnej ilosci graczy, ktorzy moga sie znalezc w jednym party jest ustalona z gory.", "Po uformowaniu grupy mozemy wejsc do teleportu, gdzie zostaniemy przeniesieni na odddzielna instancje z dungeonem. Aby go ukonczyc nalezy wykonac cel danego dungeonu, po czym zostaniemy przeteleportowani z powrotem przed portal i ", "zostana przyznane nagrody.",
					ChatColor.RED + "Opis Przedmiotow\n" + ChatColor.BLACK + "Opisy przedmiotow przedstawiaja unikalne statystyki przedmiotow takie jak: Damage - 1 = +0.5 obrazen do serc,\n Health - 1 = +0.5 serca,\n Movement Speed - dodatkowy % predkosci ruchu,\n", "Armor - 1 = +0.5 armora,\n Attack Speed - % szybkosci ataku wzgledem podstawowego ataku z reki (100%)"
					);
			book.setItemMeta(meta);
			
			player.openBook(book);
			
		} else {
			sender.sendMessage("You ran a tutorial command!");
		}
		
		
		return true;
	}
	

	
}