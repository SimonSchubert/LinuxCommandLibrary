# TAGLINE

dynamic menu for X11

# TLDR

Display menu from **ls output**

```ls | dmenu```

Display menu with **custom items**

```echo -e "[red]\n[green]\n[blue]" | dmenu```

**Save** selected item to file

```echo -e "[red]\n[green]\n[blue]" | dmenu > [color.txt]```

Launch on **specific monitor**

```ls | dmenu -m [1]```

Display at **bottom** of screen

```ls | dmenu -b```

# SYNOPSIS

**dmenu** [_options_]

# DESCRIPTION

**dmenu** is a dynamic menu for X11. It reads items from stdin, displays them in a horizontal menu, and outputs the selected item to stdout.

Commonly used as an application launcher, file picker, or general selection interface in tiling window managers.

# PARAMETERS

**-b**
> Display at bottom of screen

**-m** _monitor_
> Display on specified monitor

**-l** _lines_
> Vertical list with n lines

**-p** _prompt_
> Display prompt text

**-fn** _font_
> Font or font pattern

**-nb** _color_
> Normal background color

**-nf** _color_
> Normal foreground color

**-sb** _color_
> Selected background color

**-sf** _color_
> Selected foreground color

# CAVEATS

X11 only (see bemenu for Wayland). Items must be newline-separated. Part of suckless tools. Highly customizable through patches.

# SEE ALSO

[rofi](/man/rofi)(1), [bemenu](/man/bemenu)(1), [fzf](/man/fzf)(1)
