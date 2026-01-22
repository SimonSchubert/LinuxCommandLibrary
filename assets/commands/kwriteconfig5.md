# TLDR

Set a **global configuration** key

```kwriteconfig5 --group [group_name] --key [key] [value]```

Set a key in a **specific file**

```kwriteconfig5 --file [path/to/file] --group [group_name] --key [key] [value]```

**Delete** a key

```kwriteconfig5 --group [group_name] --key [key] --delete```

Enable **systemd boot** for Plasma session

```kwriteconfig5 --file startkderc --group General --key systemdBoot true```

Hide title bar when **window is maximized**

```kwriteconfig5 --file ~/.config/kwinrc --group Windows --key BorderlessMaximizedWindows true```

# SYNOPSIS

**kwriteconfig5** [_options_]

# PARAMETERS

**--file** _FILE_
> Configuration file to write to

**--group** _GROUP_
> Configuration group (section)

**--key** _KEY_
> Key name to set

**--delete**
> Delete the key instead of setting it

**--type** _TYPE_
> Value type (bool, string, int, etc.)

# DESCRIPTION

**kwriteconfig5** writes values to KDE Plasma 5 configuration files. It enables scripted modification of KDE settings without manually editing configuration files.

Configuration files are stored in ~/.config/ with names like kdeglobals, kwinrc, plasmarc. Changes may require restarting the affected application or Plasma session to take effect.

# CAVEATS

KDE 5 specific; KDE 6 uses kwriteconfig6. Some changes require restarting Plasma or logging out. Groups and keys are case-sensitive.

# HISTORY

kwriteconfig5 is part of KDE Frameworks 5, complementing kreadconfig5 for reading settings. It enables automation of KDE configuration in scripts and dotfile management.

# SEE ALSO

[kreadconfig5](/man/kreadconfig5)(1), [kwriteconfig6](/man/kwriteconfig6)(1), [dconf](/man/dconf)(1)
