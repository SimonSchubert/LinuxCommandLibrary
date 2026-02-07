# TAGLINE

GNOME Shell extension manager

# TLDR

**List** all the installed extensions

```gnome-extensions list```

Display **information** about a specific extension

```gnome-extensions info "[extension_id]"```

**Enable** a specific extension

```gnome-extensions enable "[extension_id]"```

**Disable** a specific extension

```gnome-extensions disable "[extension_id]"```

**Uninstall** a specific extension

```gnome-extensions uninstall "[extension_id]"```

Display **help** for a specific subcommand

```gnome-extensions help [subcommand]```

Display **version**

```gnome-extensions version```

# SYNOPSIS

**gnome-extensions** _command_ [_options_]

# PARAMETERS

**list**
> List installed extensions (--user for user-only, --enabled for enabled-only)

**info** _UUID_
> Show information about an extension

**enable** _UUID_
> Enable an extension

**disable** _UUID_
> Disable an extension

**uninstall** _UUID_
> Remove an extension

**create**
> Create a new extension from template

**pack**
> Package extension for distribution

**install** _BUNDLE_
> Install extension from bundle file

**prefs** _UUID_
> Open extension's preferences window

# DESCRIPTION

**gnome-extensions** is the command-line tool for managing GNOME Shell extensions. Extensions modify GNOME Shell's behavior and appearance, adding features like system monitors, window tiling, or custom themes.

Extensions are identified by UUIDs like **dash-to-dock@micxgx.gmail.com**. They are installed in **~/.local/share/gnome-shell/extensions/** (user) or **/usr/share/gnome-shell/extensions/** (system-wide).

# CAVEATS

Extensions can cause GNOME Shell instability or crashes. Extensions must be updated for each new GNOME Shell version. Disabling a problematic extension may require logging out or using a TTY.

# HISTORY

gnome-extensions was introduced in GNOME 3.34 (**2019**) as a modern replacement for the older gnome-shell-extension-tool. GNOME Shell extensions themselves have been available since GNOME 3.0 in **2011**.

# SEE ALSO

[gnome-shell](/man/gnome-shell)(1), [dconf](/man/dconf)(1)
