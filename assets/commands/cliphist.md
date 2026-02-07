# TAGLINE

Wayland clipboard history manager

# TLDR

**List** clipboard history entries

```cliphist list```

**Select** and copy a previous entry using fzf

```cliphist list | fzf | cliphist decode | wl-copy```

**Delete all** stored clipboard entries

```cliphist wipe```

**Delete** a specific clipboard entry by ID

```cliphist delete [id]```

**Save** the current clipboard content manually

```wl-paste | cliphist store```

# SYNOPSIS

**cliphist** _command_ [_arguments_]

# DESCRIPTION

**cliphist** is a clipboard history manager for Wayland compositors. It stores clipboard entries and allows retrieving previous items, supporting both text and image content. It works in conjunction with **wl-copy** and **wl-paste** from the wl-clipboard package.

To automatically capture clipboard entries as they are copied, run `wl-paste --watch cliphist store` as a background process, typically in your compositor's startup configuration. Entries can then be browsed and selected using tools like **fzf**, **dmenu**, or **wofi** for quick recall of previously copied content.

# PARAMETERS

**list**
> List all stored clipboard entries

**store**
> Store content from stdin

**decode**
> Decode an entry for pasting

**delete** _id_
> Delete a specific entry

**wipe**
> Delete all entries

# CAVEATS

Wayland-only, does not work with X11. Requires wl-clipboard (wl-copy, wl-paste). History is stored in memory by default. Images are supported but may consume significant memory.

# SEE ALSO

[wl-copy](/man/wl-copy)(1), [wl-paste](/man/wl-paste)(1), [xclip](/man/xclip)(1)
