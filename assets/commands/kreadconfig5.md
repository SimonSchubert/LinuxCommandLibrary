# TLDR

Read a key from **global configuration**

```kreadconfig5 --group [group_name] --key [key_name]```

Read a key from **specific file**

```kreadconfig5 --file [path/to/file] --group [group_name] --key [key_name]```

Check **systemd boot** setting

```kreadconfig5 --file startkderc --group General --key systemdBoot```

# SYNOPSIS

**kreadconfig5** [_options_]

# PARAMETERS

**--file** _FILE_
> Configuration file to read from

**--group** _GROUP_
> Configuration group (section)

**--key** _KEY_
> Key name to read

**--default** _VALUE_
> Default value if key doesn't exist

# DESCRIPTION

**kreadconfig5** reads values from KDE Plasma 5 configuration files. KConfig is KDE's configuration system, storing settings in INI-style files with groups and key-value pairs.

Configuration files are typically stored in ~/.config/ with names like kdeglobals, kwinrc, plasmarc, etc. The tool is useful for scripting and automation involving KDE settings.

# CAVEATS

KDE 5 specific; KDE 6 uses kreadconfig6. File paths can be relative to ~/.config or absolute. Groups and keys are case-sensitive.

# HISTORY

kreadconfig5 is part of the KDE Frameworks, providing command-line access to KDE's configuration system. It complements kwriteconfig5 for reading settings in scripts.

# SEE ALSO

[kwriteconfig5](/man/kwriteconfig5)(1), [kreadconfig6](/man/kreadconfig6)(1), [dconf](/man/dconf)(1)
