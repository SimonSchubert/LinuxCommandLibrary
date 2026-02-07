# TAGLINE

Dynamic menu for Wayland and X11

# TLDR

**Display a menu** and output selected item

```echo -e "option1\noption2\noption3" | bemenu```

**Display a menu with a prompt**

```echo -e "firefox\nchromium\nvivaldi" | bemenu -p "Browser:"```

**Run selected command**

```echo -e "firefox\nchromium" | bemenu | xargs -r swaymsg exec --```

**Use as a program launcher** (with dmenu_path)

```dmenu_path | bemenu | sh```

**Customize appearance**

```bemenu --fn "monospace 12" --tb "#285577" --tf "#ffffff"```

**List installed applications**

```compgen -c | sort -u | bemenu```

**Password prompt** (hidden input)

```bemenu -x -p "Password:"```

# SYNOPSIS

**bemenu** [_options_]

**bemenu-run** [_options_]

# DESCRIPTION

**bemenu** is a dynamic menu library and client program inspired by dmenu. It reads items from stdin, presents them in a menu, and outputs the selected item to stdout. It supports multiple backends including Wayland, X11, and curses.

Unlike dmenu which only works on X11, bemenu provides native Wayland support, making it ideal for Sway and other Wayland compositors. The rendering is handled through backend libraries, allowing the same interface across different display servers.

**bemenu-run** is a wrapper that lists executables from PATH and runs the selected one, functioning as a simple application launcher.

# PARAMETERS

**-p**, **--prompt** _text_
> Set the prompt text.

**-i**
> Case-insensitive matching.

**-l**, **--list** _lines_
> Show items in a vertical list.

**-b**, **--bottom**
> Display at bottom of screen.

**-m**, **--monitor** _index_
> Show on specific monitor.

**-H**, **--line-height** _height_
> Set item height in pixels.

**-x**, **--password**
> Hide input (password mode).

**--fn** _font_
> Set font (Pango format).

**--tb** _color_
> Title bar background color.

**--tf** _color_
> Title bar foreground color.

**--fb** _color_
> Filter background color.

**--ff** _color_
> Filter foreground color.

**--nb** _color_
> Normal item background.

**--nf** _color_
> Normal item foreground.

**--hb** _color_
> Highlighted item background.

**--hf** _color_
> Highlighted item foreground.

**--binding** _vim|emacs_
> Set key binding style.

# CAVEATS

Requires appropriate backend library for the display server (wayland, x11, or curses). Colors are specified in #RRGGBB format. Font specification follows Pango format. On Wayland, bemenu needs the layer-shell protocol support from the compositor.

# HISTORY

**bemenu** was created as a cross-platform replacement for **dmenu** that could work on Wayland compositors. It was developed as part of the effort to bring traditional X11 utilities to the Wayland ecosystem. The project provides library bindings allowing integration into other applications, following a more modular design than the original dmenu.

# SEE ALSO

[dmenu](/man/dmenu)(1), [rofi](/man/rofi)(1), [fzf](/man/fzf)(1), [wofi](/man/wofi)(1)
