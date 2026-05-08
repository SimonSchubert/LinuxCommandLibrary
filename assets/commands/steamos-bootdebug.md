# TAGLINE

Configure SteamOS chainloader and kernel boot debugging

# TLDR

**Show** the current chainloader/kernel debug status

```sudo steamos-bootdebug status```

**Enable the GRUB chainloader menu** at boot (lets you pick A/B slots or edit kernel params)

```sudo steamos-bootdebug menu```

**Enable verbose** chainloader logging to the console

```sudo steamos-bootdebug verbose```

**Disable** menu and verbose output (silent boot)

```sudo steamos-bootdebug quiet```

**Enable kernel debug** output to the console (loud kernel messages)

```sudo steamos-bootdebug kernel-debug```

**Enable kernel debug** for the **next boot only**, then revert

```sudo steamos-bootdebug kernel-debug-once```

**Restore** the normal silent kernel boot

```sudo steamos-bootdebug kernel-quiet```

**Write** the chainloader log to the **EFI** partition

```sudo steamos-bootdebug log enable```

**Show** the contents of the on-disk chainloader log

```sudo steamos-bootdebug log show```

# SYNOPSIS

**steamos-bootdebug** _command_ [_image_]

# PARAMETERS

**menu**
> Enable the chainloader boot menu, allowing GRUB editing and A/B slot selection at boot.

**verbose**
> Send chainloader log output to the system console.

**quiet**
> Disable both the menu and verbose console output.

**log enable**
> Persist chainloader logs to a file on the EFI System Partition (**/esp**).

**log disable**
> Stop persisting chainloader logs to the filesystem.

**log show**
> Print the contents of the chainloader log file.

**kernel-debug** [_image_]
> Enable kernel debug output (no **quiet** parameter, debug messages on console) for the named slot _image_, or both if omitted.

**kernel-debug-once** [_image_]
> Enable kernel debug for **only the next boot**, then automatically revert.

**kernel-quiet** [_image_]
> Restore the standard silent kernel boot.

**status**
> Print the current debug configuration of both slots.

# DESCRIPTION

**steamos-bootdebug** is a small administration script that ships with SteamOS 3+ on the **Steam Deck**. It surfaces controls for the SteamOS **chainloader** — the small bootloader stub that decides which of the two A/B system images to load — and for the kernel command line baked into each image.

The chainloader runs before GRUB and normally boots the active slot silently. **steamos-bootdebug menu** flips it into interactive mode so the user can edit GRUB entries (useful for adding **systemd.unit=rescue.target**, alternate **root=** parameters, and so on). **verbose** and **quiet** toggle whether chainloader log lines go to the console or are suppressed; **log enable**/**disable**/**show** capture those lines to a file in the EFI System Partition for post-mortem inspection.

The **kernel-debug**/**kernel-quiet** family edits the kernel command line of one or both A/B images: enabling kernel debug removes the **quiet** parameter, enables verbose printk output, and is invaluable for diagnosing display, GPU, or storage init issues. **kernel-debug-once** is the safest option — it self-reverts after a single boot, so you cannot accidentally leave the system in a noisy state.

# CAVEATS

**Read-only rootfs**: SteamOS uses an immutable root, so **steamos-bootdebug** writes to the EFI System Partition rather than **/etc**. Boot menu output is rendered on whichever display the firmware picks; if you boot the Steam Deck while docked and undock during the menu, the menu may be lost on the internal panel and you must blindly navigate or reboot. The optional _image_ argument selects the **A** or **B** slot — if omitted, both slots are modified.

# HISTORY

**steamos-bootdebug** is shipped by Valve in **SteamOS 3** (the Arch-based Linux distribution running on the Steam Deck since **February 2022**). It is part of the **steamos-customizations** family of scripts that adapt a stock Arch install to the read-only A/B image model used on the Deck.

# SEE ALSO

[grub](/man/grub)(8), [steamos-readonly](/man/steamos-readonly)(1), [bootctl](/man/bootctl)(1), [efibootmgr](/man/efibootmgr)(8)
