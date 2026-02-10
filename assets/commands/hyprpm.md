# TAGLINE

plugin manager for Hyprland, a dynamic tiling Wayland compositor

# TLDR

**Add** a plugin from Git repository

```hyprpm add [git_url]```

**Remove** a plugin

```hyprpm remove [plugin_name]```

**Enable** a plugin

```hyprpm enable [plugin_name]```

**Disable** a plugin

```hyprpm disable [plugin_name]```

**Update** all plugins

```hyprpm update```

**List** all installed plugins

```hyprpm list```

**Force** an operation

```hyprpm -f [operation]```

# SYNOPSIS

**hyprpm** [_options_] _command_ [_arguments_]

# PARAMETERS

**add** _URL_
> Add a plugin from a Git repository URL

**remove** _NAME_
> Remove an installed plugin

**enable** _NAME_
> Enable a disabled plugin

**disable** _NAME_
> Disable an enabled plugin

**update**
> Update and rebuild all plugins

**list**
> List all installed plugins

**-f**, **--force**
> Force the operation even if it would normally fail

# DESCRIPTION

**hyprpm** is the plugin manager for Hyprland, a dynamic tiling Wayland compositor. It handles downloading, building, enabling, and updating Hyprland plugins from Git repositories.

Plugins extend Hyprland's functionality with features like borders, animations, workspaces modifications, and other compositor enhancements. Plugins are compiled against the current Hyprland version and may need rebuilding after Hyprland updates.

# CAVEATS

Plugins must be compatible with the current Hyprland version. After Hyprland updates, plugins may need to be rebuilt using hyprpm update. Requires build tools for plugin compilation.

# HISTORY

hyprpm was introduced as part of the Hyprland ecosystem to provide a standardized way to manage compositor plugins. Hyprland gained popularity starting in **2022** for its extensive customization options.

# SEE ALSO

[hyprctl](/man/hyprctl)(1), [hyprpaper](/man/hyprpaper)(1), [hyprland](/man/hyprland)(1)
