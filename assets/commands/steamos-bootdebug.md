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

**Enable kernel debug** for a specific image only

```sudo steamos-bootdebug kernel-debug [image]```

# SYNOPSIS

**steamos-bootdebug** **menu** | **verbose** | **quiet** | **status**

**steamos-bootdebug** **log** **enable** | **disable** | **show**

**steamos-bootdebug** **kernel-debug** | **kernel-debug-once** | **kernel-quiet** [_image_]

# PARAMETERS

**menu**
> Enable the chainloader boot menu, allowing GRUB editing and A/B slot selection at boot.

**verbose**
> Send chainloader log output to the system console.

**quiet**
> Disable both the menu and verbose console output.

**log enable**
> Persist chainloader logs to **steamcl-debug.log**, a fixed-size circular file next to the chainloader on the EFI System Partition (**/esp**).

**log disable**
> Stop persisting chainloader logs to the filesystem.

**log show**
> Print the contents of the chainloader log file, sorted by line number. This is the default for **log** without an argument.

**kernel-debug** [_image_]
> Enable kernel logging to the console for the named _image_ (as listed by **steamos-bootconf list-images**), or for the default image if omitted.

**kernel-debug-once** [_image_]
> Enable kernel debug for **only the next boot**, then automatically revert.

**kernel-quiet** [_image_]
> Restore the standard silent kernel boot.

**-h**, **--help**, **help**
> Show usage information.

**status**
> Print the menu, console-logging, and log-file state of each chainloader, the kernel logging state of every image, and the current, next, and default boot paths.

# DESCRIPTION

**steamos-bootdebug** is a small administration script that ships with SteamOS 3+ on the **Steam Deck**. It surfaces controls for the SteamOS **chainloader** (**steamcl**, the stage 1 bootloader that decides which of the two A/B system images to load) and for the kernel logging setting stored per image.

The chainloader runs before GRUB and normally boots the active slot silently. **steamos-bootdebug menu** creates a **steamcl-menu** flag file in **/esp/efi/boot** and **/esp/efi/steamos**, which flips it into interactive mode so the user can edit GRUB entries (useful for adding **systemd.unit=rescue.target**, alternate **root=** parameters, and so on). **verbose** (flag file **steamcl-verbose**) and **quiet** toggle whether chainloader log lines go to the console or are suppressed; **log enable**/**disable**/**show** capture those lines to a file in the EFI System Partition for post-mortem inspection.

The **kernel-debug**/**kernel-quiet** family sets the **verbose** option of an image through **steamos-bootconf** (1 for on, 0 for off, 255 for next boot only), so the kernel logs to the console during boot. This is invaluable for diagnosing display, GPU, or storage init issues. **kernel-debug-once** is the safest option: it self-reverts after a single boot, so you cannot accidentally leave the system in a noisy state.

# CAVEATS

**Read-only rootfs**: SteamOS uses an immutable root, so **steamos-bootdebug** writes to the EFI System Partition rather than **/etc**. Boot menu output is rendered on whichever display the firmware picks; if you boot the Steam Deck while docked and undock during the menu, the menu may be lost on the internal panel and you must blindly navigate or reboot. All commands, including **status**, require root. The optional _image_ argument must match a name from **steamos-bootconf list-images**; if omitted, **steamos-bootconf** applies the change to its default image.

# HISTORY

**steamos-bootdebug** is shipped by Valve in **SteamOS 3** (the Arch-based Linux distribution running on the Steam Deck since **February 2022**). It is part of Valve's **steamos-efi** project, which also provides the **steamcl** chainloader used by the read-only A/B image model on the Deck.

# SEE ALSO

[grub](/man/grub)(8), [steamos-readonly](/man/steamos-readonly)(1), [bootctl](/man/bootctl)(1), [efibootmgr](/man/efibootmgr)(8)
