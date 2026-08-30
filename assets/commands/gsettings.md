# TAGLINE

GNOME desktop configuration command-line interface

# TLDR

List every **schema** installed on the system

```gsettings list-schemas```

List the **keys** a schema defines

```gsettings list-keys [org.gnome.desktop.interface]```

**Read** a key

```gsettings get [org.gnome.desktop.interface] [color-scheme]```

**Write** a key

```gsettings set [org.gnome.desktop.interface] [color-scheme] [prefer-dark]```

Show what a key is **for**

```gsettings describe [org.gnome.desktop.interface] [color-scheme]```

Show the values a key will **accept**

```gsettings range [org.gnome.desktop.interface] [color-scheme]```

Check whether a key is **writable** or locked down by policy

```gsettings writable [org.gnome.desktop.interface] [color-scheme]```

**Watch** a key and print every change as it happens

```gsettings monitor [org.gnome.desktop.interface] [color-scheme]```

Dump **every key and value** in one schema

```gsettings list-recursively [org.gnome.desktop.wm.keybindings]```

**Undo** a single customization

```gsettings reset [org.gnome.desktop.interface] [color-scheme]```

Undo **every customization** in a schema

```gsettings reset-recursively [org.gnome.desktop.interface]```

Use schemas from a **directory that is not installed system-wide**

```gsettings --schemadir [path/to/schemas] list-schemas```

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

# COMMON SCHEMAS

**org.gnome.desktop.interface** - Desktop appearance settings
**org.gnome.desktop.wm.preferences** - Window manager preferences
**org.gnome.shell** - GNOME Shell settings

# CAVEATS

Only works with applications using GSettings (primarily GNOME). Some settings require logout or restart to take effect. Schema must be installed for settings to work.

# HISTORY

GSettings was introduced in GLib 2.26 (**2010**) as a replacement for GConf. It uses dconf as its backend while providing schema validation, making configuration more robust and introspectable.

# INSTALL

```apt: sudo apt install libglib2.0-bin```

```dnf: sudo dnf install glib```

```apk: sudo apk add glib```

```brew: brew install glib```

```nix: nix profile install nixpkgs#glib```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dconf](/man/dconf)(1)
