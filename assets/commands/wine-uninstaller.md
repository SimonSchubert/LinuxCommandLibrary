# TAGLINE

List and remove Windows applications installed in a Wine prefix

# TLDR

Open the graphical **Add/Remove Programs** dialog

```wine uninstaller```

**List** installed applications and their registry keys

```wine uninstaller --list```

**Remove** an application by its registry key

```wine uninstaller --remove [{GUID}]```

Remove **without GUI prompts** (combine with **--remove**)

```wine uninstaller --silent --remove [{GUID}]```

Display **help**

```wine uninstaller --help```

# SYNOPSIS

**wine uninstaller** [**--list**]

**wine uninstaller** [**--silent**] **--remove** _key_

**wine uninstaller** **--help**

# PARAMETERS

**--list**
> Print every registered application as **key|||display name**, one per line, then exit. The key is the subkey under **Software\Microsoft\Windows\CurrentVersion\Uninstall** (often a GUID in braces).

**--remove** _key_
> Run that application's uninstall command. For Windows Installer products the command is **msiexec /x** plus the product code; otherwise it is the **UninstallString** from the registry.

**--silent**
> Force English messages and print them on the console instead of a message box. Useful when scripting **--remove**.

**--help**
> Print usage and exit.

# DESCRIPTION

**wine uninstaller** is Wine's equivalent of the Windows "Add/Remove Programs" (appwiz.cpl) applet. With no options it opens that GUI so you can pick a program and uninstall it. From the command line, **--list** shows what is registered in the prefix and **--remove** runs the stored uninstall command.

Entries are read from **HKEY_LOCAL_MACHINE** and **HKEY_CURRENT_USER** under **Software\Microsoft\Windows\CurrentVersion\Uninstall**. On a 64-bit prefix the 32-bit (WOW64) uninstall key is included as well. Keys marked **SystemComponent=1** are skipped. If the current process is 32-bit on a 64-bit prefix, the tool restarts itself as 64-bit **uninstaller.exe** so both views of the registry are visible.

The tool operates on the prefix named by **WINEPREFIX** (default **~/.wine**). It removes a single Windows application from that prefix; it does not uninstall Wine itself and does not delete the prefix directory.

# CAVEATS

Not every application registers a working **UninstallString**; some leave menu entries or files behind. If the uninstall process fails, the GUI may offer to delete the registry key anyway, which hides the program from the list without removing its files. **--remove** matches the registry key, not the display name from **--list**. Wiping a prefix (**rm -rf ~/.wine**) is the reliable way to remove every installed Windows app at once.

# HISTORY

Wine's uninstaller was started by Andreas Mohr in **2000** and extended through the mid-2000s into both a control-panel applet and a **--list** / **--remove** CLI, so prefixes can be cleaned from scripts as well as from the desktop.

# INSTALL

```dnf: sudo dnf install wine```

```pacman: sudo pacman -S wine```

```apk: sudo apk add wine```

```zypper: sudo zypper install wine```

```nix: nix profile install nixpkgs#wine```

<!-- packages: 2026-09-15 -->

# SEE ALSO

[wine](/man/wine)(1), [wine-reg](/man/wine-reg)(1), [wineboot](/man/wineboot)(1), [winetricks](/man/winetricks)(1)

# RESOURCES

```[Source code](https://gitlab.winehq.org/wine/wine)```

```[Homepage](https://www.winehq.org/)```

```[Documentation](https://www.winehq.org/help)```

<!-- verified: 2026-09-15 -->
