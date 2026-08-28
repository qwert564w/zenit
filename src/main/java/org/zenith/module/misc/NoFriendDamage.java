package org.zenith.module.misc;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.module.ModuleInfo;

@ModuleInfo(name = "NoFriendDamage", category = Category.MISC, description = "Дает рейкасту проходить сквозь друзей")
public final class NoFriendDamage extends Module {
   public static final NoFriendDamage noFriendDamage = new NoFriendDamage();
}
