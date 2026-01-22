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

**betterlockscreen** is a minimal lock screen wrapper for i3lock. It provides a simple and visually pleasing lock screen with customizable background images and effects.

# PARAMETERS

**-l, --lock** [_effect_]
> Lock the screen (effects: dim, blur, dimblur, pixel)

**-u, --update** _image_
> Update lock screen background image

**--text** _text_
> Display custom text on lock screen

**--off** _seconds_
> Turn off monitor after specified seconds

**-w, --wall** [_effect_]
> Set desktop wallpaper

# CAVEATS

Requires i3lock-color and imagemagick. Background images are cached for faster locking. First-time setup requires running -u to generate cached images.

# HISTORY

**betterlockscreen** is a wrapper script enhancing i3lock with blur and pixel effects.

# SEE ALSO

[i3lock](/man/i3lock)(1), [xscreensaver](/man/xscreensaver)(1)
