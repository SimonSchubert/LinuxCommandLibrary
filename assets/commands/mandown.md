# TAGLINE

Man-page inspired Markdown viewer

# TLDR

**View a Markdown file**

```mdn [path/to/file.md]```

# SYNOPSIS

**mdn** [_options_] _file_

# DESCRIPTION

**mandown** (command: **mdn**) is a man-page inspired Markdown viewer for the terminal. It renders Markdown documents with a familiar man-page style interface, supporting mouse scrolling, vim-like and less-like navigation keybindings.

Navigation keys include **j**/**k** or arrow keys for line scrolling, **f**/**b** or Page Down/Page Up for page scrolling, and **q** to quit.

# CONFIGURATION

**~/.config/mdn/mdnrc**
> Configuration file for mouse support, indent length, and control scheme (mdn, vim, less).

# CAVEATS

Requires libncurses(w), libxml2, and libconfig as compile-time dependencies.

# HISTORY

**mandown** was created by **Titor8115** and is written in **C**.

# SEE ALSO

[man](/man/man)(1), [glow](/man/glow)(1), [mdcat](/man/mdcat)(1), [bat](/man/bat)(1)
