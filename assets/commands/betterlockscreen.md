# TAGLINE

Customizable lock screen using i3lock

# TLDR

**Lock** screen

```betterlockscreen -l```

Set **background** image

```betterlockscreen -u path/to/image.png```

Lock with **custom** text

```betterlockscreen -l pixel --text "Custom text"```

Lock with **monitor** timeout

```betterlockscreen --off 5 -l```

# SYNOPSIS

**betterlockscreen** [_OPTIONS_]

# DESCRIPTION

**betterlockscreen** is a lock screen wrapper for i3lock-color that provides visually appealing lock screens with customizable background effects. It supports dim, blur, dimblur, and pixel effects applied to a wallpaper image.

Before locking, the background image must be cached using the **-u** flag, which generates processed versions with each effect. This makes subsequent locks instant since the effects are pre-computed. The tool can also set the desktop wallpaper using the same cached images.

# PARAMETERS

**-l**, **--lock** [_effect_]
> Lock the screen (effects: dim, blur, dimblur, pixel)

**-u**, **--update** _image_
> Cache the lock screen background image, pre-generating all effect variants

**-t**, **--text** _text_
> Display custom text on the lock screen

**--off** _seconds_
> Turn off monitor after specified seconds when locked

**-w**, **--wall** [_effect_]
> Set desktop wallpaper using the cached image

**--display** _n_
> Set the display number to draw the login box on (for multi-monitor setups)

**--span**
> Scale the image to span across multiple displays

# CONFIGURATION

**~/.config/betterlockscreenrc**
> Configuration file for default effects, colors, font settings, and lock screen appearance.

# CAVEATS

Requires i3lock-color and imagemagick. Background images are cached for faster locking. First-time setup requires running -u to generate cached images.

# HISTORY

**betterlockscreen** was originally created by **Pavan Jadhaw** and is now maintained at the betterlockscreen GitHub organization. It is a Bash wrapper script that adds blur, dim, and pixel effects on top of i3lock-color.

# SEE ALSO

[i3lock](/man/i3lock)(1), [xscreensaver](/man/xscreensaver)(1)
