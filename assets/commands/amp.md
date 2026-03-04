# TAGLINE

Vi/Vim-inspired terminal text editor

# TLDR

**Open a file** for editing

```amp [path/to/file]```

**Open multiple files**

```amp [file1] [file2]```

**Open a directory** to browse files

```amp [path/to/directory]```

# SYNOPSIS

**amp** [_files..._|_directory_]

# DESCRIPTION

**amp** is a modal text editor for the terminal, inspired by Vim but designed with simplicity and zero configuration in mind. It includes all essential features out of the box with no plugin system: syntax highlighting for most languages, a file finder (Space), jump mode (f) for quick navigation, symbol jumping (Enter), Git integration, flexible YAML-based keymaps, theme support, and format-on-save.

Written in Rust, amp uses a Vi-like modal interface (normal, insert, visual, command modes) with familiar keybindings. It supports 24-bit color, system clipboard integration including Wayland, and can suspend to the shell with **z**.

# CONFIGURATION

Configuration is via a YAML file in amp's config directory. Options include **theme**, **tab_width**, **soft_tabs**, **line_length_guide**, **line_wrapping**, per-file-type settings, custom keymaps, and format-on-save tools.

# CAVEATS

Uses a custom license rather than a standard open-source license. Building from source requires libxcb, openssl, zlib, cmake, and python3. No plugin system by design.

# HISTORY

**amp** was created by **Jordan MacDonald** (jmacdonald), who started the project around 2015 after growing frustrated with Vim. Written in Rust, it reached version 0.7.1 in 2024. MacDonald has been using amp as his daily editor since its creation.

# SEE ALSO

[vim](/man/vim)(1), [kakoune](/man/kakoune)(1), [helix](/man/helix)(1), [nano](/man/nano)(1)
