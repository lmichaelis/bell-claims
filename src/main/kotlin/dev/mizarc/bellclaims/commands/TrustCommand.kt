package dev.mizarc.bellclaims.commands

import co.aikar.commands.annotation.*
import co.aikar.commands.bukkit.contexts.OnlinePlayer
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import dev.mizarc.bellclaims.listeners.ClaimPermission

@CommandAlias("claim")
class TrustCommand : ClaimCommand() {

    @Subcommand("trust")
    @CommandPermission("solidclaims.command.trust")
    fun onTrust(player: Player, otherPlayer: OnlinePlayer, claimPermission: ClaimPermission) {
        val partition = getPartitionAtPlayer(player) ?: return
        if (!isPlayerHasClaimPermission(player, partition)) {
            return
        }

        val claim = claims.getById(partition.claimId)!!
        if (playerAccessRepository.doesPlayerHaveAccess(claim, otherPlayer.player)) {
            player.sendMessage(
                "§6${Bukkit.getPlayer(player.uniqueId)?.name} §calready has permission §6${claimPermission.name}§c.")
            return
        }

        playerAccessRepository.add(claim, otherPlayer.player, claimPermission)
        player.sendMessage(
            "§6${Bukkit.getPlayer(otherPlayer.player.uniqueId)?.name} " +
            "§ahas been given the permission §6${claimPermission.name} §afor this claim.")
    }
}