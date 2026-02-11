# TAGLINE

Screen backlight brightness control

# TLDR

**Get brightness**

```ybacklight -get```

**Set brightness**

```ybacklight -set [50]```

**Increase brightness**

```ybacklight -inc [10]```

**Decrease brightness**

```ybacklight -dec [10]```

# SYNOPSIS

**ybacklight** [_-get_] [_-set value_] [_-inc value_] [_-dec value_]

# PARAMETERS

**-get**
> Show current level.

**-set** _VAL_
> Set to percentage.

**-inc** _VAL_
> Increase by amount.

**-dec** _VAL_
> Decrease by amount.

# DESCRIPTION

**ybacklight** controls the display backlight brightness from the command line. It provides a simple interface for getting, setting, and adjusting the screen brightness level as a percentage value.

Brightness can be set to an absolute percentage with **-set**, or adjusted relative to the current level with **-inc** and **-dec**. The **-get** option queries the current brightness level.

The tool serves as an alternative to **xbacklight**, providing similar functionality for systems where xbacklight does not work correctly due to driver or hardware differences.

# CAVEATS

Hardware dependent. May need permissions. Backlight control.

# HISTORY

**ybacklight** is a backlight control utility, similar to xbacklight, for adjusting display brightness.

# SEE ALSO

[xbacklight](/man/xbacklight)(1), [brightnessctl](/man/brightnessctl)(1), [light](/man/light)(1)
