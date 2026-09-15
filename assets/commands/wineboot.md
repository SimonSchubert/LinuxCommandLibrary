# TAGLINE

Initialize, reboot, or shut down a Wine prefix

# TLDR

Perform a **simulated reboot** of the current Wine prefix

```wineboot```

**Initialize or update** the prefix (for example after upgrading Wine)

```wineboot --update```

**Initialize** a new prefix without a full boot

```WINEPREFIX=[~/.wine-app] wineboot --init```

**Restart** Wine without the normal startup sequence

```wineboot --restart```

**Shut down** the Wine session without rebooting

```wineboot --shutdown```

End the session and **force** unresponsive processes to exit

```wineboot --end-session --force```

**Kill** every process in the prefix with no cleanup

```wineboot --kill```

# SYNOPSIS

**wineboot** [_options_]

# PARAMETERS

**-h**, **--help**
> Display a help message.

**-i**, **--init**
> Initialize the WINEPREFIX (create the prefix layout if it does not exist).

**-u**, **--update**
> Update the WINEPREFIX (for example after a Wine upgrade).

**-r**, **--restart**
> Restart only; skip normal startup operations.

**-s**, **--shutdown**
> Shut down only; do not reboot.

**-e**, **--end-session**
> End the current session cleanly.

**-f**, **--force**
> Force processes that do not exit cleanly to terminate. Often combined with **--end-session**.

**-k**, **--kill**
> Kill running processes without any cleanup.

# DESCRIPTION

**wineboot** performs the initial creation and setup of a WINEPREFIX for **wine**. It can also simulate a Windows reboot or shutdown for applications running in that prefix.

With no options, **wineboot** runs a simulated reboot: it shuts down Wine processes in the prefix and starts them again, which is how Wine applies prefix updates and runs programs registered for startup. **--init** and **--update** are the usual ways to create a prefix or refresh it after installing a newer Wine.

Each prefix is selected with the **WINEPREFIX** environment variable (default **~/.wine**). **wineboot** is part of the Wine distribution and is typically invoked automatically when **wine** first uses a prefix; calling it explicitly is useful after upgrades, when a prefix is stuck, or when you want a clean shutdown.

# CAVEATS

**--kill** terminates processes immediately and can leave the prefix in an inconsistent state. **--force** is only meaningful together with a shutdown-style operation such as **--end-session**. Changes apply to the prefix named by **WINEPREFIX**; a missing or wrong prefix path creates or updates a different environment than the one your applications use.

# HISTORY

**wineboot** is part of **Wine**, the Windows compatibility layer begun in **1993**. It exists so Wine can run the same first-boot, reboot, and shutdown tasks a Windows session would, including creating the prefix directory tree and applying updates after a Wine upgrade.

# INSTALL

```dnf: sudo dnf install wine```

```pacman: sudo pacman -S wine```

```apk: sudo apk add wine```

```nix: nix profile install nixpkgs#wine```

<!-- packages: 2026-09-15 -->

# SEE ALSO

[wine](/man/wine)(1), [wineserver](/man/wineserver)(1), [winecfg](/man/winecfg)(1), [winetricks](/man/winetricks)(1)

# RESOURCES

```[Source code](https://gitlab.winehq.org/wine/wine)```

```[Homepage](https://www.winehq.org/)```

```[Documentation](https://www.winehq.org/help)```

<!-- verified: 2026-09-15 -->
