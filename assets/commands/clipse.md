# TAGLINE

Configurable TUI clipboard manager for Unix

# TLDR

**Open** the clipboard history TUI

```clipse```

**Start** the background clipboard listener

```clipse -listen```

**Copy text** to system clipboard via pipe

```echo "hello" | clipse -c```

**Add text** to clipboard history without copying to system clipboard

```echo "some data" | clipse -a```

**Print** current clipboard content to stdout

```clipse -p```

**Wipe** clipboard history except pinned items

```clipse -clear```

**Pause** clipboard monitoring for 5 minutes

```clipse -pause 5m```

# SYNOPSIS

**clipse** [_flags_] [_command_]

# PARAMETERS

**-listen**
> Run a background listener process that monitors clipboard changes.

**--listen-shell**
> Run the listener in the current terminal for debugging.

**-a** _string_
> Add string to clipboard history without copying to system clipboard. Accepts stdin.

**-c** _string_
> Copy string to the system clipboard. Accepts stdin.

**-p**
> Print the current clipboard content to the console.

**-output-all**
> Print entire clipboard history to stdout.

**-clear**
> Wipe all clipboard history except pinned items.

**-clear-all**
> Wipe the entire clipboard history including pinned items.

**-clear-images**
> Wipe all images from clipboard history.

**-clear-text**
> Wipe all text items from clipboard history.

**-clean**
> Sanitize existing text entries and remove orphaned image entries.

**-kill**
> Kill any existing background listener processes.

**-pause** _duration_
> Pause clipboard monitoring for a specified duration (e.g., 5m, 1h).

**-v**
> Print the version.

**keep**
> Keep the TUI open after selecting an item to copy.

**-help**
> Display help information.

# DESCRIPTION

**clipse** is a clipboard manager written in Go that provides a terminal user interface for browsing, searching, and managing clipboard history. It supports both text and images, works on Wayland, X11, and macOS, and is built with the BubbleTea TUI framework.

Key features include fuzzy search and filtering, multi-select for bulk operations, pinning important entries to persist through clears, duplicate filtering, configurable history limits (default 100 entries), auto-paste support, and the ability to exclude specific applications from monitoring. The TUI appearance and keybindings are fully customizable.

# CONFIGURATION

Configuration stored at **~/.config/clipse/configuration.json**. Theme stored separately as **custom_theme.json** in the same directory. Options include **maxHistory**, duplicate filtering, auto-paste keybind, excluded apps/windows, and custom theme colors.

# CAVEATS

On **Wayland**, requires **wl-clipboard** installed for text and image clipboard access. Auto-paste on Wayland requires access to **/dev/uinput**. On **X11**, may require xlib API headers for building from source. The background listener (**clipse -listen**) must be started on login/boot to capture clipboard history.

# HISTORY

**clipse** was created by **savedra1** on GitHub. The first stable release (v1.0.0) arrived in **July 2023** with multi-select, custom theme support, and image/text previews. Version 1.1.0 (October 2023) added custom keybinds, and v1.2.0 (December 2024) brought a major performance overhaul with C API integration for X11/Darwin, auto-paste, and excluded apps support.

# SEE ALSO

[xclip](/man/xclip)(1), [xsel](/man/xsel)(1), [wl-copy](/man/wl-copy)(1), [pbcopy](/man/pbcopy)(1)
