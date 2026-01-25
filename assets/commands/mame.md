# TLDR

**Run arcade ROM**

```mame [romname]```

**List available games**

```mame -listfull```

**Run with fullscreen**

```mame -window 0 [romname]```

**Verify ROM set**

```mame -verifyroms [romname]```

**Show controls for game**

```mame -listctrl [romname]```

**Configure controls**

```mame [romname] -ui_active```

# SYNOPSIS

**mame** [_options_] [_system_] [_media_...]

# PARAMETERS

**-window**
> Run windowed (1) or fullscreen (0).

**-listfull**
> List all supported systems.

**-verifyroms**
> Verify ROM integrity.

**-rompath** _path_
> ROM directory.

**-listctrl**
> Show control configuration.

**-ui_active**
> Activate UI during emulation.

**-createconfig**
> Create default config.

# DESCRIPTION

**MAME** (Multiple Arcade Machine Emulator) emulates arcade game hardware. It preserves gaming history by documenting and emulating arcade machines, allowing original software to run on modern computers.

MAME supports thousands of arcade systems and some home consoles.

# DIRECTORY STRUCTURE

```
~/.mame/
├── roms/      # Game ROMs
├── cfg/       # Configurations
├── nvram/     # Saved data
└── snap/      # Screenshots
```

# CAVEATS

ROMs must be legally obtained. ROM sets change between versions. Some games need CHD files. Performance varies by emulated system.

# HISTORY

MAME was started by **Nicola Salmoria** in **1997**. It merged with MESS in 2015 to become a universal emulation project preserving both arcade and home systems.

# SEE ALSO

[retroarch](/man/retroarch)(1), [mednafen](/man/mednafen)(1), [dosbox](/man/dosbox)(1)
