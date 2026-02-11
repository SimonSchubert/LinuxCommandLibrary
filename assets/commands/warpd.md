# TAGLINE

Keyboard-driven mouse cursor control

# TLDR

Run in **normal** mode

```warpd --normal```

Run in **hint** mode

```warpd --hint```

# SYNOPSIS

**warpd** [_OPTIONS_]

# KEY BINDINGS

**h**
> Move cursor left

**j**
> Move cursor down

**k**
> Move cursor up

**l**
> Move cursor right

**m**
> Left click

# DESCRIPTION

**warpd** is a modal keyboard-driven pointer manipulation program. It allows controlling the mouse cursor using keyboard shortcuts, similar to vim-style navigation.

Normal mode uses hjkl for cursor movement. Hint mode overlays letters on clickable elements for quick navigation.

# CAVEATS

Requires X11 or Wayland. Key bindings may conflict with other applications. Learning curve for modal interaction style.

# SEE ALSO

[xdotool](/man/xdotool)(1), [keynav](/man/keynav)(1)
