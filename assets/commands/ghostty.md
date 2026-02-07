# TAGLINE

GPU-accelerated terminal emulator with modern features

# TLDR

**Start Ghostty** terminal emulator

```ghostty```

**Run a command** in a new terminal window

```ghostty -e [command]```

**Start with a specific working directory**

```ghostty --working-directory=[/path/to/directory]```

**Use a custom configuration file**

```ghostty --config-file=[path/to/config]```

**Start in fullscreen mode**

```ghostty --fullscreen```

**Set custom window title**

```ghostty --title="[My Terminal]"```

**Override a configuration option**

```ghostty -o [font-size=14]```

**List available actions** for keybindings

```ghostty +list-actions```

# SYNOPSIS

**ghostty** [_-e command_] [_-o option=value_] [_--config-file file_] [_--working-directory path_] [_options_]

# PARAMETERS

**-e** _command_
> Execute command instead of the default shell.

**-o** _option=value_
> Override a configuration option.

**--config-file** _path_
> Use alternate configuration file.

**--working-directory** _path_
> Set initial working directory.

**--fullscreen**
> Start in fullscreen mode.

**--title** _string_
> Set window title.

**--class** _string_
> Set window class (Wayland/X11).

**--help**
> Show help information.

**--version**
> Show version information.

**+list-actions**
> List available actions for keybindings.

**+list-colors**
> List available color names.

**+list-fonts**
> List available fonts.

**+list-keybinds**
> List current keybindings.

**+list-themes**
> List available themes.

**+show-config**
> Show current configuration.

# DESCRIPTION

**Ghostty** is a fast, feature-rich terminal emulator that uses GPU acceleration for rendering. It combines the speed of minimal terminals with advanced features while maintaining native platform integration.

The terminal supports true color (24-bit), Unicode with ligatures and emoji, images (Sixel, iTerm2, Kitty protocols), hyperlinks, and advanced text rendering with font fallback. It provides tabs, splits, and multiple windows with fully customizable keybindings.

# CONFIGURATION

**~/.config/ghostty/config** (Linux)
> Main configuration file with key-value pairs for all settings including fonts, colors, keybindings, and behavior.

**~/Library/Application Support/com.mitchellh.ghostty/config** (macOS)
> Main configuration file on macOS systems.

# CAVEATS

Requires GPU with OpenGL 3.3+ (Linux) or Metal (macOS). Some legacy terminal applications may have compatibility issues. Currently supports macOS and Linux only.

# HISTORY

**Ghostty** was created by Mitchell Hashimoto (founder of HashiCorp) and publicly released in **December 2024** after several years of development. The project is open source and written in Zig.

# SEE ALSO

[kitty](/man/kitty)(1), [alacritty](/man/alacritty)(1), [wezterm](/man/wezterm)(1), [foot](/man/foot)(1)
