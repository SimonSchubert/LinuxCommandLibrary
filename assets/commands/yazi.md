# TAGLINE

Fast async terminal file manager

# TLDR

**Start file manager**

```yazi```

**Open specific directory**

```yazi [/path/to/directory]```

**Change directory on exit**

```ya () { local tmp="$(mktemp -t "yazi-cwd.XXXXX")"; yazi "$@" --cwd-file="$tmp"; cd "$(cat "$tmp")"; rm "$tmp"; }```

**Start with specific config**

```yazi --config-dir [~/.config/yazi]```

# SYNOPSIS

**yazi** [_path_] [_--cwd-file file_] [_--chooser-file file_] [_options_]

# PARAMETERS

**--cwd-file** _FILE_
> Write CWD to file on exit.

**--chooser-file** _FILE_
> Write selected files to file.

**--config-dir** _DIR_
> Custom config directory.

**--clear-cache**
> Clear thumbnail cache.

**--version**
> Show version.

**--help**
> Show help.

# KEYBOARD SHORTCUTS

**h / l**
> Navigate parent / enter directory.

**j / k**
> Move down / up.

**gg / G**
> Go to first / last item.

**Space**
> Toggle selection.

**Enter**
> Open file.

**y**
> Yank (copy) selection.

**d**
> Delete selection.

**p**
> Paste.

**r**
> Rename.

**a**
> Create file.

**/**
> Search.

**n / N**
> Next / previous search result.

**Tab**
> Switch to next tab.

**q**
> Quit.

**~**
> Go to home directory.

**?**
> Show help.

# DESCRIPTION

**yazi** is a blazingly fast terminal file manager written in Rust. It emphasizes performance through async I/O and modern rendering.

Navigation uses vim-like keybindings by default. Preview pane shows file contents, images (via terminal graphics), videos, PDFs, and archives. Syntax highlighting applies to code files.

Selection works across directories. Multiple files can be yanked and pasted in batch operations. Cut/copy/paste mirrors GUI file manager behavior.

Tabs enable multiple directory views. Split panes compare directories side by side. Marks bookmark frequently accessed locations.

Plugins extend functionality through Lua scripting. Themes customize colors and icons. Configuration covers keybindings, sorting, and preview behavior.

Image preview works in terminals supporting graphics protocols (Kitty, iTerm2, Sixel). Fallback uses ASCII art.

# CAVEATS

Terminal graphics require compatible terminal. Some features need external tools (ffmpegthumbnailer for video). Configuration in Lua may have learning curve. Newer project with evolving features. Shell wrapper needed for cd-on-exit.

# HISTORY

**yazi** was created by **sxyazi** around **2023**. The name means "duck" in Chinese. Written in Rust with async architecture, it emerged as a faster alternative to ranger and lf. The project gained rapid adoption for its performance and modern features.

# SEE ALSO

[ranger](/man/ranger)(1), [lf](/man/lf)(1), [nnn](/man/nnn)(1), [vifm](/man/vifm)(1)
