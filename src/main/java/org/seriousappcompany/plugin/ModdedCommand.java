package org.seriousappcompany.plugin;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.basecommands.CommandBase;
import com.hypixel.hytale.server.core.util.EventTitleUtil;

import javax.annotation.Nonnull;

public class ModdedCommand extends CommandBase {
    public ModdedCommand() {
        super("moddedcommand", "A test command", false);
    }

    @Override
    protected void executeSync(@Nonnull CommandContext commandContext) {
        commandContext.sender().sendMessage(Message.raw("It's modded!"));
//        commandContext.senderAsPlayer().getWorld().execute(() -> {
//            EventTitleUtil.showEventTitleToPlayer(
//                    commandContext.senderAsPlayerRef(),
//                    Message.raw("It's modded!"),
//                    Message.raw("Fuck yeah, employed gamers!"),
//                    true,
//                    commandContext.senderAsPlayer().getWorld().getEntityStore().getStore()
//            );
//        });
    }
}
