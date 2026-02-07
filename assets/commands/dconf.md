# TAGLINE

GNOME configuration database management tool

# TLDR

**Read** a key value

```dconf read /[path/to/key]```

**List** subdirectories and keys

```dconf list /[path/to/directory]/```

**Write** a key value

```dconf write /[path/to/key] "[value]"```

**Reset** a key to default

```dconf reset /[path/to/key]```

**Watch** for changes

```dconf watch /[path/to/key]```

**Dump** directory in INI format

```dconf dump /[path/to/directory]/```

# SYNOPSIS

**dconf** _command_ [_arguments_]

# DESCRIPTION

**dconf** is a low-level configuration system for GNOME and GTK applications. It provides a simple key-value database organized in a hierarchical structure similar to a filesystem, storing settings in a binary format for fast read access.

The database uses a path-based key structure (like /org/gnome/desktop/interface/font-name) and values are stored in GVariant format, which supports typed data including strings, integers, booleans, and arrays. Changes written to dconf take effect immediately for running applications that monitor the database.

For most users, gsettings provides a higher-level, schema-validated interface. dconf is useful for bulk operations, scripting configuration changes, and backup/restore operations using the dump and load commands. It's particularly valuable for system administrators managing multiple GNOME systems or creating configuration profiles.

# PARAMETERS

**read** _key_
> Read a key value

**write** _key_ _value_
> Write a key value

**reset** _key_
> Reset key to default

**list** _dir_
> List keys and subdirectories

**watch** _path_
> Watch for changes

**dump** _dir_
> Dump directory as INI

**load** _dir_
> Load from INI format

# CONFIGURATION

**~/.config/dconf/user**
> Binary database file storing user configuration values for GNOME and GTK applications.

# CAVEATS

Values must be in GVariant format. Strings need single quotes inside double quotes. Changes take effect immediately. For schema-validated settings, prefer gsettings.

# SEE ALSO

[gsettings](/man/gsettings)(1), [dconf-read](/man/dconf-read)(1), [dconf-write](/man/dconf-write)(1)
