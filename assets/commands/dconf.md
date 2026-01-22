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

**dconf** is a low-level configuration system for GNOME and GTK applications. It provides a simple key-value database organized in a hierarchical structure similar to a filesystem.

For most users, gsettings provides a higher-level interface. dconf is useful for bulk operations and scripting.

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

# CAVEATS

Values must be in GVariant format. Strings need single quotes inside double quotes. Changes take effect immediately. For schema-validated settings, prefer gsettings.

# SEE ALSO

[gsettings](/man/gsettings)(1), [dconf-read](/man/dconf-read)(1), [dconf-write](/man/dconf-write)(1)
