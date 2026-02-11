# TAGLINE

Windows registry editor via Wine

# TLDR

**Open registry editor**

```regedit```

**Import registry file**

```regedit [file.reg]```

**Export registry key**

```regedit /E [output.reg] [HKEY_CURRENT_USER\Software\App]```

**Silent import**

```regedit /S [file.reg]```

**Delete key (Wine)**

```regedit /D [HKEY_CURRENT_USER\Software\App]```

# SYNOPSIS

**regedit** [_/E file key_] [_/S_] [_file.reg_]

# PARAMETERS

**/E** _FILE KEY_
> Export key to file.

**/S**
> Silent mode.

**/D** _KEY_
> Delete key (Wine).

**/C**
> Create from file.

**/V**
> Advanced mode.

# DESCRIPTION

**regedit** is the Windows Registry Editor, available on Linux through the Wine compatibility layer. It provides a graphical interface for browsing, searching, and modifying the hierarchical Windows registry database that stores configuration settings for Windows applications running under Wine.

The tool supports importing and exporting registry files in the standard .reg format, enabling batch configuration changes and backup of registry sections. The **/S** flag allows silent imports for scripting, while **/E** exports specific registry keys and their subtrees. These operations are essential for configuring Windows applications that rely on registry settings to function correctly under Wine.

On Linux, regedit manages Wine's emulated registry stored in the user's Wine prefix directory. Changes made through regedit affect how Windows applications behave within the Wine environment, making it a key tool for troubleshooting compatibility issues.

# CAVEATS

Wine required on Linux. Windows registry format. GUI needs display.

# HISTORY

**regedit** is Microsoft's registry editor. Wine provides a compatible implementation for running Windows applications on Linux.

# SEE ALSO

[wine](/man/wine)(1), [winecfg](/man/winecfg)(1)
