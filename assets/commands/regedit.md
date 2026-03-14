# TAGLINE

Windows registry editor via Wine

# TLDR

**Open the graphical registry editor**

```regedit```

**Import a registry file**

```regedit [file.reg]```

**Silently import a registry file** (no confirmation dialog)

```regedit /S [file.reg]```

**Export a registry key** to a file

```regedit /E [output.reg] [HKEY_CURRENT_USER\Software\App]```

**Delete a registry key** (Wine-specific)

```regedit /D [HKEY_CURRENT_USER\Software\App]```

# SYNOPSIS

**regedit** [_/S_] [_file.reg_]
**regedit** **/E** _file_ _key_
**regedit** **/D** _key_

# PARAMETERS

**/E** _FILE_ _KEY_
> Export the specified registry key and all subkeys to a .reg file.

**/S**
> Silent mode; suppress confirmation dialogs when importing .reg files.

**/D** _KEY_
> Delete registry key and all its subkeys (Wine extension, not in Windows regedit).

**/C** _FILE_
> Create a new registry from the specified .reg file (replaces entire registry).

**/V**
> Open in advanced mode.

# DESCRIPTION

**regedit** is the Windows Registry Editor, available on Linux through the Wine compatibility layer. It provides a graphical interface for browsing, searching, and modifying the hierarchical Windows registry database that stores configuration settings for Windows applications running under Wine.

The tool supports importing and exporting registry files in the standard .reg format, enabling batch configuration changes and backup of registry sections. The **/S** flag allows silent imports for scripting, while **/E** exports specific registry keys and their subtrees. These operations are essential for configuring Windows applications that rely on registry settings to function correctly under Wine.

On Linux, regedit manages Wine's emulated registry stored in the user's Wine prefix directory (typically **~/.wine**). The registry is split into files: **system.reg** (HKEY_LOCAL_MACHINE), **user.reg** (HKEY_CURRENT_USER), and **userdef.reg** (HKEY_USERS\\.Default). Changes made through regedit affect how Windows applications behave within the Wine environment.

# CAVEATS

Requires Wine to be installed on Linux. The graphical interface requires a display server (X11 or Wayland via XWayland). The **/D** flag for deleting keys is a Wine extension not available in Windows regedit. Use **/C** with extreme caution as it replaces the entire registry. For scripting, the Wine-specific **wine reg** command may be more appropriate.

# HISTORY

**regedit** is Microsoft's registry editor, included in Windows since Windows 3.1. Wine provides a compatible implementation that operates on Wine's own registry files, enabling configuration of Windows applications running on Linux and macOS.

# SEE ALSO

[wine](/man/wine)(1), [winecfg](/man/winecfg)(1), [winetricks](/man/winetricks)(1)
