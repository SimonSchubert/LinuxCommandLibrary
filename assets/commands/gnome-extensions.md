# TAGLINE

GNOME Shell extension manager

# TLDR

**List** the installed extensions

```gnome-extensions list```

List only the ones that are **enabled**

```gnome-extensions list --enabled```

List the ones with an **update waiting**

```gnome-extensions list --updates```

Show an extension's **details**

```gnome-extensions info [extension_id]```

**Enable** an extension

```gnome-extensions enable [extension_id]```

**Disable** an extension

```gnome-extensions disable [extension_id]```

**Reset** an extension to its system default state

```gnome-extensions reset [extension_id]```

Open an extension's **preferences dialog**

```gnome-extensions prefs [extension_id]```

**Install** an extension from a zip file

```gnome-extensions install [path/to/extension.zip]```

Reinstall **over an existing copy**

```gnome-extensions install --force [path/to/extension.zip]```

**Uninstall** an extension

```gnome-extensions uninstall [extension_id]```

**Scaffold** a new extension interactively

```gnome-extensions create --interactive```

**Pack** an extension for distribution

```gnome-extensions pack [path/to/source]```

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

# INSTALL

```apt: sudo apt install gnome-shell```

```dnf: sudo dnf install gnome-shell```

```pacman: sudo pacman -S gnome-shell```

```apk: sudo apk add gnome-shell```

```zypper: sudo zypper install gnome-shell```

```nix: nix profile install nixpkgs#gnome-shell```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dconf](/man/dconf)(1)
