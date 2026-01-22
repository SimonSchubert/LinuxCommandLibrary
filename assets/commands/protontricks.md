# TLDR

Run **GUI**

```protontricks --gui```

Run Winetricks for **specific game**

```protontricks [appid] [winetricks_args]```

Run **command** in game directory

```protontricks -c "[command]" [appid]```

**List** installed games

```protontricks -l```

**Search** for game by name

```protontricks -s [game_name]```

**Launch** executable in Proton environment

```protontricks-launch --appid [appid] [path/to/file.exe]```

# SYNOPSIS

**protontricks** [**--gui**] [**-l**|**--list**] [**-s** _name_] [**-c** _cmd_] [_appid_] [_args_...]

# PARAMETERS

**--gui**
> Launch graphical interface

**-l, --list**
> List installed Steam games

**-s, --search _name_**
> Search for game App ID by name

**-c, --command _cmd_**
> Run command in game's Wine prefix

**--no-bwrap**
> Disable bubblewrap sandboxing

**-h, --help**
> Display help information

# DESCRIPTION

**protontricks** runs Winetricks commands for Proton-enabled Steam games. It allows installing Windows components, fonts, and libraries into game prefixes to fix compatibility issues.

The tool locates game prefixes automatically and sets up the correct Proton environment. It works with games installed through Steam using Proton compatibility layer.

# CAVEATS

Requires Steam and Proton. Game must have been run at least once to create prefix. Some winetricks verbs may not work with all Proton versions.

# HISTORY

**protontricks** was created by **Matoking** to bridge Winetricks and Proton, addressing the common need to install Windows dependencies in Proton game prefixes.

# SEE ALSO

[winetricks](/man/winetricks)(1), [wine](/man/wine)(1), [steam](/man/steam)(1)
