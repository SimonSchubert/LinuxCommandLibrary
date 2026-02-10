# TAGLINE

displays a cute cat that chases the mouse cursor around the screen

# TLDR

**Start oneko**

```oneko```

**Use different character**

```oneko -tora```

**Use dog instead**

```oneko -dog```

**Set foreground color**

```oneko -fg [blue]```

**Set animation speed**

```oneko -speed [16]```

**Follow specific window**

```oneko -name "[window_name]"```

# SYNOPSIS

**oneko** [_options_]

# PARAMETERS

**-tora**
> Tiger-striped cat.

**-dog**
> Use dog instead.

**-sakura**
> Sakura character.

**-tomoyo**
> Tomoyo character.

**-fg** _color_
> Foreground color.

**-bg** _color_
> Background color.

**-speed** _n_
> Animation speed.

**-name** _window_
> Follow named window.

# DESCRIPTION

**oneko** displays a cute cat (neko) that chases the mouse cursor around the screen. When the cursor stops, the cat sits and eventually falls asleep.

A classic X11 desktop toy dating back to the early Unix days.

# CHARACTERS

```
(default) - Regular cat
-tora     - Striped cat
-dog      - Dog
-sakura   - Sakura
-tomoyo   - Tomoyo
-bsd      - BSD daemon
```

# CAVEATS

X11 only. May not work with Wayland. Requires X11 compositor support. Can be distracting.

# HISTORY

oneko (お猫, "honorable cat") originated on the NEC PC-9801 in Japan. The X11 version was created by **Tatsuya Kato** in **1991**.

# SEE ALSO

[xeyes](/man/xeyes)(1), [xsnow](/man/xsnow)(1), [xscreensaver](/man/xscreensaver)(1)
