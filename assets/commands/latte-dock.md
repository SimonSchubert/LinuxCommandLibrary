# TLDR

**Clear** QML cache

```latte-dock --clear-cache```

Import and load **default layout**

```latte-dock --default-layout```

Load a **specific layout**

```latte-dock --layout [layout_name]```

**Import** and load a layout from file

```latte-dock --import-layout [path/to/file]```

# SYNOPSIS

**latte-dock** [_options_]

# PARAMETERS

**--clear-cache**
> Clear the QML cache

**--default-layout**
> Import and load the default layout

**--layout** _NAME_
> Load a specific layout by name

**--import-layout** _FILE_
> Import and load a layout from file

**--available-layouts**
> List available layouts

# DESCRIPTION

**latte-dock** is a dock panel for KDE Plasma that provides an alternative to the default Plasma panel. It offers macOS-like dock functionality with animations, applets, and customizable layouts.

Multiple layouts can be saved and switched between, allowing different configurations for different activities or workflows. Latte integrates with Plasma's global themes and widgets.

# CAVEATS

KDE Plasma desktop required. Some features may require specific Plasma versions. Development of Latte Dock has slowed, and some users report compatibility issues with newer Plasma versions.

# HISTORY

Latte Dock was created as a more polished dock alternative for KDE Plasma, offering smooth animations and flexible customization. It became popular in the KDE community as a macOS-style dock replacement.

# SEE ALSO

[plasmashell](/man/plasmashell)(1), [krunner](/man/krunner)(1)
