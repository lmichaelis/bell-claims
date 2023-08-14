package dev.mizarc.bellclaims.listeners

import net.milkbowl.vault.chat.Chat
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import dev.mizarc.bellclaims.infrastructure.Config
import dev.mizarc.bellclaims.infrastructure.players.PlayerStateRepository
import dev.mizarc.bellclaims.domain.players.PlayerState

class PlayerRegistrationListener(val config: Config, val metadata: Chat,
                                 val playerStateRepository: PlayerStateRepository
) : Listener {

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        val playerState = PlayerState(event.player, config, metadata)
        playerStateRepository.add(playerState)
    }
}