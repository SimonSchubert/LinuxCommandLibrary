# TAGLINE

Interactive Arch Linux update notifier and applier

# TLDR

Run a **full system update**, including news, orphans, pacnew files, and reboot checks

```arch-update```

**List pending updates** without applying them

```arch-update --list```

Include **AUR development packages** (-git, -svn, and similar) in the update

```arch-update --devel```

Show the latest **Arch Linux news** (default 5 items)

```arch-update --news```

Show the last **10 news posts**

```arch-update --news 10```

Start the **systray applet** and enable it at login

```arch-update --tray --enable```

Enable **periodic update checks** (at boot, then every 6 hours)

```arch-update --check --enable```

Generate a default **configuration file**

```arch-update --gen-config```

# SYNOPSIS

**arch-update** [_OPTION_]

# PARAMETERS

**-c**, **--check**
> Check for available updates, send a desktop notification if any exist, and refresh the systray icon. Combine with **--enable** to start the user systemd timer for periodic checks.

**-l**, **--list**
> Print the list of pending updates and exit.

**-d**, **--devel**
> Include AUR development packages when checking and applying updates.

**-n**, **--news** [_count_]
> Display recent Arch Linux news. _count_ defaults to 5 (or to **NewsNum** in the configuration file).

**-s**, **--services**
> Check for systemd services that need a restart after an upgrade.

**--gen-config**
> Write a default **arch-update.conf**. Add **--force** to overwrite an existing file.

**--show-config**
> Print the current configuration file.

**--edit-config**
> Open the configuration file in the configured editor.

**--tray**
> Start the systray applet. Combine with **--enable** to install an XDG Autostart desktop file so it starts at login.

**-D**, **--debug**
> Print debug traces.

**-V**, **--version**
> Print version information.

**-h**, **--help**
> Print the help message.

# DESCRIPTION

**arch-update** is an interactive update notifier and applier for Arch Linux. With no options it walks through the usual system-maintenance steps from the Arch Wiki: pending news, package upgrades (official repositories, and optionally AUR and Flatpak), orphan packages, old packages in the pacman cache, **pacnew**/**pacsave** files, a pending kernel that needs a reboot, and services that should be restarted after the upgrade.

On a desktop it is typically used through the systray applet: **arch-update --tray --enable** starts the icon and autostarts it at login; **arch-update --check --enable** turns on the user systemd timer (boot, then every 6 hours by default). Clicking the icon runs the full update in a terminal. On a headless machine the same CLI covers listing, checking, and applying updates without the tray.

Privilege elevation is done with **sudo**, **sudo-rs**, **doas**, or **run0**. AUR support uses **paru**, **yay**, or **pikaur** when installed. Desktop notifications require **libnotify**.

# CONFIGURATION

Optional file, read from **$XDG_CONFIG_HOME/arch-update/arch-update.conf** or **~/.config/arch-update/arch-update.conf**. Generate an example with **arch-update --gen-config**. Option names are case-sensitive.

**NoColor**
> Do not colorize output.

**NoVersion**
> Hide version changes when listing pending updates.

**NoAUR**
> Ignore AUR packages.

**NoFlatpak**
> Ignore Flatpak packages.

**NoNotification**
> Do not send desktop notifications.

**NewsNum=**_n_
> How many Arch news items to show (default 5).

**AURHelper=**_paru_|_yay_|_pikaur_
> AUR helper to use. If unset, the first of paru, yay, pikaur found on PATH is used.

**PrivilegeElevationCommand=**_sudo_|_sudo-rs_|_doas_|_run0_
> Privilege-elevation command. If unset, the first of those found on PATH is used.

**KeepOldPackages=**_n_
> Old package versions to keep in the pacman cache (default 3).

**KeepUninstalledPackages=**_n_
> Uninstalled package versions to keep in the cache (default 0).

**DiffProg=**_editor_
> Editor used when processing pacnew files (default **$DIFFPROG**, else **vimdiff**).

The check interval is not in this file: edit the user timer with **systemctl --user edit --full arch-update.timer** and change **OnUnitActiveSec**.

# CAVEATS

Arch Linux (and derivatives that use pacman) only. Applying updates needs a working privilege-elevation command; none installed is a hard error. GNOME Shell has no native systray, so the applet needs an AppIndicator extension. Clicking the tray icon uses **gio** to open a terminal; if no known emulator is installed, install **xdg-terminal-exec** and list one in **~/.config/xdg-terminals.list**. Two instances cannot run at once.

# HISTORY

**arch-update** is written by Robin Candau and released under GPL-3.0-or-later. It is packaged on the AUR as **arch-update**, with **arch-update-bin**, **arch-update-cli**, and **arch-update-git** variants.

# INSTALL

```aur: yay -S arch-update```

<!-- packages: 2026-09-15 -->

# SEE ALSO

[checkupdates](/man/checkupdates)(8), [pacman](/man/pacman)(8), [pacdiff](/man/pacdiff)(8), [paccache](/man/paccache)(8), [paru](/man/paru)(8), [yay](/man/yay)(8), [flatpak](/man/flatpak)(1)

# RESOURCES

```[Source code](https://github.com/Antiz96/arch-update)```

```[Documentation](https://github.com/Antiz96/arch-update/blob/main/README.md)```

<!-- verified: 2026-09-15 -->
