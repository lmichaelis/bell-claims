package dev.mizarc.bellclaims.utils

import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import dev.mizarc.bellclaims.listeners.ClaimPermission

fun ClaimPermission.getIcon(): ItemStack {
    return when (this) {
        ClaimPermission.Build -> ItemStack(Material.DIAMOND_PICKAXE)
        ClaimPermission.Inventory -> ItemStack(Material.CHEST)
        ClaimPermission.DisplayTake -> ItemStack(Material.ARMOR_STAND)
        ClaimPermission.VehicleManipulate -> ItemStack(Material.MINECART)
        ClaimPermission.SignEdit -> ItemStack(Material.OAK_SIGN)
        ClaimPermission.RedstoneUse -> ItemStack(Material.LEVER)
        ClaimPermission.DoorOpen -> ItemStack(Material.ACACIA_DOOR)
        ClaimPermission.VillagerTrade -> ItemStack(Material.EMERALD)
        ClaimPermission.EntityHurt -> ItemStack(Material.IRON_SWORD)
        ClaimPermission.EntityLeash -> ItemStack(Material.LEAD)
        ClaimPermission.EntityShear -> ItemStack(Material.SHEARS)
    }
}

fun ClaimPermission.getDisplayName(): String {
    return when (this) {
        ClaimPermission.Build -> "Build"
        ClaimPermission.Inventory -> "Inventories"
        ClaimPermission.DisplayTake -> "Display Manipulate"
        ClaimPermission.VehicleManipulate -> "Vehicle Manipulate"
        ClaimPermission.SignEdit -> "Sign Edit"
        ClaimPermission.RedstoneUse -> "Redstone Interact"
        ClaimPermission.DoorOpen -> "Open Doors"
        ClaimPermission.VillagerTrade -> "Villager Trade"
        ClaimPermission.EntityHurt -> "Mob Hurt"
        ClaimPermission.EntityLeash -> "Mob Leash"
        ClaimPermission.EntityShear -> "Mob Shear"
    }
}

fun ClaimPermission.getDescription(): String {
    return when (this) {
        ClaimPermission.Build -> "Grants permission to build"
        ClaimPermission.Inventory -> "Grants permission to open inventories (Chest, Furnace, Anvil)"
        ClaimPermission.DisplayTake -> "Grants permission to manipulate display items (Item Frames, Armour Stands, Flower Pots)"
        ClaimPermission.VehicleManipulate -> "Grants permission to break and place vehicles (Boats, Minecarts)"
        ClaimPermission.SignEdit -> "Grants permission to edit signs"
        ClaimPermission.RedstoneUse -> "Grants permission to use redstone interactions (Buttons, Levers, Pressure Plates)"
        ClaimPermission.DoorOpen -> "Grants permission to open and close doors"
        ClaimPermission.VillagerTrade -> "Grants permission to trade with villagers"
        ClaimPermission.EntityHurt -> "Grants permission to damage passive mobs"
        ClaimPermission.EntityLeash -> "Grants permission to use leads on passive mobs"
        ClaimPermission.EntityShear -> "Grants permission to use shears on passive mobs"
    }
}