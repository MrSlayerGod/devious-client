import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
   @ObfuscatedName("au")
   @Export("ArchiveDiskActionHandler_thread")
   static Thread ArchiveDiskActionHandler_thread;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnu;Lnu;I)I",
      garbageValue = "-1449096527"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.getOfferName().compareTo(var2.getOfferName());
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1926093694"
   )
   @Export("getWindowedMode")
   static int getWindowedMode() {
      return Client.isResizable ? 2 : 1;
   }
}
