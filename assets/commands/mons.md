# TLDR

Enable only the **primary monitor**

```mons -o```

Enable only the **secondary monitor**

```mons -s```

**Duplicate** primary monitor onto secondary (primary resolution)

```mons -d```

**Mirror** primary monitor onto secondary (secondary resolution)

```mons -m```

**Extend** primary monitor to the right

```mons -e right```

**List** connected monitors

```mons```

Enable a **specific monitor** by ID

```mons -O [id]```

# SYNOPSIS

**mons** [**-o**] [**-s**] [**-d**] [**-m**] [**-e** _side_] [**-O** _id_] [**-S** _id1,id2:pos_] [**--dpi** _value_]

# PARAMETERS

**-o**
> Enable primary monitor only

**-s**
> Enable secondary monitor only

**-d**
> Duplicate primary monitor output onto secondary

**-m**
> Mirror primary display onto secondary

**-e _side_**
> Extend primary monitor; side: top, left, right, bottom

**-n _side_**
> Cycle through display modes sequentially

**-O _id_**
> Enable specific monitor by identifier

**-S _id1,id2:pos_**
> Enable two specific monitors; pos: R (right), T (top)

**-a**
> Daemon mode; auto-enable display on monitor changes

**-x _script_**
> Execute custom script on monitor count changes

**--dpi _value_**
> Set display DPI (0-27432 range)

**--primary _name_**
> Designate primary output monitor

**-h**
> Display help

**-v**
> Show version

# DESCRIPTION

**mons** is a POSIX-compliant shell script for managing multi-monitor displays on X Window System. It simplifies switching between display configurations without extensive dependencies.

The tool wraps xrandr to provide intuitive commands for common dual-monitor setups: primary only, secondary only, duplicate, mirror, and extend modes. It supports daemon mode for automatic display management when monitors are connected or disconnected.

# CAVEATS

Requires X Window System and xrandr. Does not work with Wayland compositors. Limited to configurations that xrandr supports. The secondary monitor is determined by connection order; use -O or -S for explicit control with multiple monitors.

# HISTORY

**mons** was developed by **Thomas� Venturini** (Ventto) as a lightweight alternative to graphical display configuration tools. It provides a minimal, scriptable interface for common multi-monitor operations.

# SEE ALSO

[xrandr](/man/xrandr)(1), [autorandr](/man/autorandr)(1), [arandr](/man/arandr)(1)
