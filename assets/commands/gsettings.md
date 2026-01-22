# TLDR

**Set** the value of a key

```gsettings set [org.example.schema] [example-key] [value]```

**Get** the value of a key

```gsettings get [org.example.schema] [example-key]```

**Reset** a key to its schema default value

```gsettings reset [org.example.schema] [example-key]```

Display all schemas, keys, and **values recursively**

```gsettings list-recursively```

Display keys and values from **one schema**

```gsettings list-recursively [org.example.schema]```

Display **allowed values** for a key

```gsettings range [org.example.schema] [example-key]```

Display the **description** of a key

```gsettings describe [org.example.schema] [example-key]```

# SYNOPSIS

**gsettings** _command_ [_arguments_]

# PARAMETERS

**get** _SCHEMA_ _KEY_
> Get the value of a key

**set** _SCHEMA_ _KEY_ _VALUE_
> Set a key's value (must match schema type)

**reset** _SCHEMA_ _KEY_
> Reset key to schema default

**list-schemas**
> List installed schemas

**list-keys** _SCHEMA_
> List keys in a schema

**list-recursively** [_SCHEMA_]
> List all settings (optionally filtered by schema)

**range** _SCHEMA_ _KEY_
> Show valid values for a key

**describe** _SCHEMA_ _KEY_
> Show human-readable description

**monitor** _SCHEMA_ [_KEY_]
> Watch for changes

# DESCRIPTION

**gsettings** is the command-line interface for GSettings, GNOME's configuration system. It provides schema-validated access to dconf settings, ensuring type safety and valid values.

Settings are organized in schemas (like org.gnome.desktop.interface) containing typed keys. Unlike direct dconf access, gsettings validates values against the schema before applying them.

Common uses include customizing GNOME desktop settings, scripting configuration changes, and debugging application preferences.

# COMMON SCHEMAS

**org.gnome.desktop.interface** - Desktop appearance settings
**org.gnome.desktop.wm.preferences** - Window manager preferences
**org.gnome.shell** - GNOME Shell settings

# CAVEATS

Only works with applications using GSettings (primarily GNOME). Some settings require logout or restart to take effect. Schema must be installed for settings to work.

# HISTORY

GSettings was introduced in GLib 2.26 (**2010**) as a replacement for GConf. It uses dconf as its backend while providing schema validation, making configuration more robust and introspectable.

# SEE ALSO

[dconf](/man/dconf)(1), [gconf](/man/gconf)(1)
