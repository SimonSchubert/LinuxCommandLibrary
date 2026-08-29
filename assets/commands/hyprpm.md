# TAGLINE

plugin manager for Hyprland, a dynamic tiling Wayland compositor

# TLDR

**Add** a plugin repository from Git

```hyprpm add [https://github.com/hyprwm/hyprland-plugins]```

**List** all installed plugin repositories and plugins

```hyprpm list```

**Enable** a plugin by name

```hyprpm enable [plugin_name]```

**Disable** a plugin

```hyprpm disable [plugin_name]```

**Load** all enabled plugins into the running compositor

```hyprpm reload```

**Update** headers and rebuild all plugins after a Hyprland upgrade

```hyprpm update```

**Remove** a plugin repository

```hyprpm remove [author/name]```

**Wipe** the cache, built plugins, settings and headers

```hyprpm purge-cache```

# SYNOPSIS

**hyprpm** [_flags_] _command_ [_arguments_]

# PARAMETERS

**add** _URL_ [_git rev_]
> Install a new plugin repository from Git. The revision is optional; when set, commit locks are ignored.

**remove** _URL_|_NAME_|_AUTHOR/NAME_
> Remove an installed plugin repository.

**enable** _NAME_|_AUTHOR/NAME_
> Enable a plugin.

**disable** _NAME_|_AUTHOR/NAME_
> Disable a plugin.

**update**
> Check and update all plugins if needed, rebuilding them against current headers.

**reload**
> Reload hyprpm state and ensure all enabled plugins are loaded into the running Hyprland instance.

**list**
> List all installed plugins.

**purge-cache**
> Remove the entire hyprpm cache, built plugins, hyprpm settings and headers.

**-h**, **--help**
> Show the help menu.

**-v**, **--verbose**
> Enable verbose logging.

**-f**, **--force**
> Force an operation, ignoring checks (for example `hyprpm update -f`).

**-n**, **--notify**
> Send a Hyprland notification confirming a successful plugin load. Warnings and errors are notified regardless of this flag.

**-s**, **--no-shallow**
> Disable shallow cloning of the Hyprland sources.

**--no-nix**
> Disable `nix develop` for build commands, even when Hyprland is a Nix build.

**--hl-url** _URL_
> Use a custom Hyprland source URL when fetching headers.

# DESCRIPTION

**hyprpm** is the plugin manager shipped with Hyprland, a dynamic tiling Wayland compositor. It clones plugin repositories from Git, fetches Hyprland headers matching the running compositor, compiles each plugin against them, and loads the enabled ones into the live session.

Hyprland ships no plugins of its own, so a repository has to be added first with **hyprpm add**. Plugins in an added repository are inactive until enabled; **hyprpm reload** then hands the built `.so` files to the running compositor, the same mechanism as `hyprctl plugin load`.

Building requires `cpio`, `cmake`, `git`, `meson` and `gcc`, plus the development packages of Hyprland's dependencies on distributions that split headers from binaries. State, headers and built plugins live under `/var/cache/hyprpm/<username>`, so several operations ask for root privileges.

# CONFIGURATION

hyprpm has no config file of its own. To load plugins automatically at compositor startup, add an autostart entry to the Hyprland config, optionally with `-n` for a confirmation notification:

```exec-once = hyprpm reload -n```

When Hyprland's permission system is enabled, allow hyprpm to load plugins:

```hl.permission("/usr/(bin|local/bin)/hyprpm", "plugin", "allow")```

# CAVEATS

Plugins are C++ code that runs inside the compositor process. A malicious or broken plugin has the same power as Hyprland itself, so read the source of anything you install and never load `.so` files from untrusted sources.

Plugins are compiled against a specific Hyprland ABI. After upgrading Hyprland the headers go stale and **hyprpm add** refuses to run with "Headers outdated"; run **hyprpm update** first to refetch headers and rebuild every plugin.

If a plugin makes Hyprland crash on startup, disable it with **hyprpm disable** from a TTY. When Hyprland's permission system is in use, `hyprpm` needs an explicit `plugin` permission entry or it prompts on every load.

# HISTORY

**hyprpm** was added to the Hyprland tree in **December 2023** and first shipped in Hyprland **v0.34.0** (January 2024), replacing manual `hyprctl plugin load` workflows as the recommended way to install plugins.

# INSTALL

```pacman: sudo pacman -S hyprland```

```nix: nix profile install nixpkgs#hyprland```

<!-- packages: 2026-08-30 -->

# SEE ALSO

[hyprctl](/man/hyprctl)(1), [hyprland](/man/hyprland)(1), [hyprpaper](/man/hyprpaper)(1), [hyprshot](/man/hyprshot)(1), [cmake](/man/cmake)(1), [meson](/man/meson)(1)

# RESOURCES

```[Source code](https://github.com/hyprwm/Hyprland)```

```[Homepage](https://hypr.land/)```

```[Documentation](https://wiki.hypr.land/Plugins/Using-Plugins/)```

<!-- verified: 2026-08-30 -->
