# TAGLINE

sets the X11 root window background

# TLDR

**Set solid color background**

```hsetroot -solid "[#1a1b26]"```

**Set wallpaper (fill)**

```hsetroot -fill [wallpaper.jpg]```

**Set wallpaper (center)**

```hsetroot -center [wallpaper.png]```

**Set wallpaper (tile)**

```hsetroot -tile [pattern.png]```

**Set gradient**

```hsetroot -add "[#1a1b26]" -add "[#24283b]" -gradient [0]```

**Set with cover mode**

```hsetroot -cover [wallpaper.jpg]```

# SYNOPSIS

**hsetroot** [_options_]

# PARAMETERS

**-solid** _color_
> Solid color background.

**-fill** _image_
> Scale to fill screen.

**-center** _image_
> Center image.

**-tile** _image_
> Tile image.

**-cover** _image_
> Cover screen, preserve aspect.

**-add** _color_
> Add color to gradient.

**-gradient** _angle_
> Create gradient at angle.

**-screens** _n_
> Apply to n screens.

**-brightness** _value_
> Adjust brightness.

**-contrast** _value_
> Adjust contrast.

# DESCRIPTION

**hsetroot** sets the X11 root window background. It's commonly used with minimal window managers that don't include wallpaper functionality, like dwm, bspwm, or i3.

The tool supports solid colors, images with various scaling modes, and gradients. It's lightweight and scriptable.
# Gradient background
hsetroot -add "#1a1b26" -add "#24283b" -gradient 45

# Fill with brightness adjustment
hsetroot -fill wallpaper.jpg -brightness -0.1

# Center on transparent background
hsetroot -solid "#000000" -center logo.png
```

# CAVEATS

X11 only; doesn't work with Wayland. Some compositors may override. Requires Imlib2. Color formats: #RRGGBB or names.

# HISTORY

hsetroot is a fork/rewrite of various root background setters. It's commonly used in the minimal/tiling window manager community where dedicated wallpaper handling is needed.

# SEE ALSO

[feh](/man/feh)(1), [nitrogen](/man/nitrogen)(1), [xwallpaper](/man/xwallpaper)(1), [xsetroot](/man/xsetroot)(1)
