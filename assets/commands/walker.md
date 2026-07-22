# TAGLINE

Wayland application launcher and command runner

# TLDR

**Open** the launcher

```walker```

**Limit** results to one provider

```walker -m [desktopapplications|calc|clipboard|runner|...]```

**Run** in dmenu mode, reading choices from stdin

```printf "Choice1\nChoice2\nChoice3" | walker -d```

**Apply** a named theme

```walker -t [theme_name]```

**Keep** a background service running for faster launches

```walker --gapplication-service```

# SYNOPSIS

**walker** [_options_]

# PARAMETERS

**-m**, **--provider** _name_
> Restrict the launcher to a single Elephant provider (for example **desktopapplications**, **calc**, **clipboard**, **runner**).

**-d**, **--dmenu**
> Read items from **stdin**, print the selected item to **stdout** (dmenu-compatible mode).

**-t**, **--theme** _name_
> Load the theme named _name_ from **~/.config/walker/themes/**.

**--gapplication-service**
> Run Walker as a D-Bus/GApplication background service to reduce cold-start latency.

# DESCRIPTION

**walker** is a fast, customizable application launcher for Wayland desktops, written in Rust with GTK4. It depends on the **elephant** provider daemon and pluggable **elephant-*** providers for search sources.

Out of the box, Walker can launch desktop applications, run shell commands, evaluate calculator expressions, browse files, search the web, show clipboard history, pick symbols, manage bookmarks and todos, query Arch packages, and integrate with tools such as Bitwarden, WirePlumber, and Niri window-manager actions. Prefix characters in the search box switch providers (for example **=** for calculator, **/** for files, **:** for clipboard history).

Configuration lives under **~/.config/walker/** (**config.toml**, themes, per-provider item layouts). Themes inherit from the built-in default and can override CSS and GTK4 XML item templates per provider.

For lowest latency, run **walker --gapplication-service** once per session (often from your compositor autostart). Subsequent **walker** invocations attach to the service; a Unix socket at **/run/user/$UID/walker/walker.sock** allows instant open via **nc -U** when no extra flags are needed.

# CONFIGURATION

Default settings ship in the upstream **resources/config.toml**. User overrides go in **~/.config/walker/config.toml**: theme name, placeholder text, provider prefix mappings, and keybinds (modifiers **ctrl**, **alt**, **shift**, **super** plus GDK key names). Themes are directories under **~/.config/walker/themes/** with **style.css** and optional **layouts/** XML fragments.

# CAVEATS

Wayland only. **elephant** and at least one provider (for example **elephant-desktopapplications**) must be running before Walker shows results. Socket-only activation cannot pass command-line options.

# INSTALL

```nix: nix profile install nixpkgs#walker```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[fuzzel](/man/fuzzel)(1), [wofi](/man/wofi)(1), [rofi](/man/rofi)(1), [dmenu](/man/dmenu)(1)