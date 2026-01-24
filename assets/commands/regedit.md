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

**regedit** edits Windows registry. On Linux, it runs under Wine.

GUI registry editor. Browse and modify keys.

Import REG files. Apply registry settings.

Export for backup. Save registry sections.

Wine compatibility layer. Windows apps on Linux.

# CAVEATS

Wine required on Linux. Windows registry format. GUI needs display.

# HISTORY

**regedit** is Microsoft's registry editor. Wine provides a compatible implementation for running Windows applications on Linux.

# SEE ALSO

[wine](/man/wine)(1), [winecfg](/man/winecfg)(1)
