# TLDR

**Run** applications

```fuzzel```

Run fuzzel in **dmenu mode**

```fuzzel -d```

Display a **menu** of the output of a command

```ls | fuzzel -d```

Display a menu with **custom items** separated by newline

```echo -e "red\ngreen\nblue" | fuzzel -d```

Let the user choose between items and **save** the selected one

```echo -e "red\ngreen\nblue" | fuzzel -d > color.txt```

**Reset** apps usage count

```rm -v $HOME/.cache/fuzzel```

Launch fuzzel on a **specific monitor**

```fuzzel -o "DP-1"```

Use fuzzel for **online search**

```fuzzel -d -l 0 --placeholder "Type your search" | xargs firefox --search```

# SYNOPSIS

**fuzzel** [_options_]

# PARAMETERS

**-d**, **--dmenu**
> Run in dmenu mode, reading items from stdin

**-o**, **--output** _OUTPUT_
> Show on specified Wayland output (monitor)

**-l**, **--lines** _N_
> Maximum number of lines to show (0 for single line)

**-w**, **--width** _N_
> Window width in characters

**-f**, **--font** _FONT_
> Font specification

**-b**, **--background** _COLOR_
> Background color in RRGGBBAA format

**-t**, **--text-color** _COLOR_
> Text color in RRGGBBAA format

**-p**, **--prompt** _TEXT_
> Set prompt text

**--placeholder** _TEXT_
> Placeholder text when input is empty

**-i**, **--icon-theme** _THEME_
> Icon theme name

**-T**, **--terminal** _CMD_
> Terminal command for launching terminal apps

# DESCRIPTION

**fuzzel** is a Wayland-native application launcher with fuzzy matching, inspired by rofi and dmenu. It scans XDG application directories and presents a searchable list of installed applications.

In dmenu mode (**-d**), fuzzel reads items from stdin and outputs the selected item to stdout, making it useful for scripting and building interactive menus. The fuzzy matching algorithm prioritizes matches at word boundaries and beginning of strings.

Configuration is stored in **~/.config/fuzzel/fuzzel.ini** with extensive customization for appearance, behavior, and keybindings.

# CAVEATS

Wayland-only; does not work on X11. Application icons require an icon theme installed. Cache file in **~/.cache/fuzzel** tracks usage frequency for sorting; delete to reset.

# HISTORY

fuzzel was created by Daniel Eklof (the same developer as foot terminal) and first released around **2020**. It was designed specifically for Wayland compositors as a lightweight alternative to rofi, which primarily targets X11.

# SEE ALSO

[rofi](/man/rofi)(1), [dmenu](/man/dmenu)(1), [wofi](/man/wofi)(1), [bemenu](/man/bemenu)(1)
