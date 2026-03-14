# TAGLINE

Generate color schemes from images

# TLDR

**Generate colors from image**

```wal -i [image.png]```

**Light theme**

```wal -i [image.png] -l```

**Skip wallpaper setting**

```wal -i [image.png] -n```

**Use theme**

```wal --theme [theme-name]```

**List themes**

```wal --theme```

**Restore colors**

```wal -R```

# SYNOPSIS

**wal** [_-a alpha_] [_-b background_] [_-i image_] [_-l_] [_-n_] [_--theme name_] [_options_]

# PARAMETERS

**-i** _IMAGE_
> Input image or directory of images.

**-l**
> Generate light colorscheme.

**-n**
> Skip setting the wallpaper.

**--theme** _NAME_
> Use a theme file (use without argument to list themes).

**-R**
> Restore previous colorscheme.

**-c**
> Delete all cached colorschemes.

**-a** _ALPHA_
> Set terminal background transparency (URxvt only).

**-b** _COLOR_
> Custom background color to use.

**--backend** _BACKEND_
> Color backend to use (use without argument to list backends).

**--saturate** _0.0-1.0_
> Set color saturation level.

**-o** _SCRIPT_
> External script to run after wal finishes.

**-q**
> Quiet mode, suppress output.

**-s**
> Skip changing colors in terminals.

**-t**
> Skip changing colors in TTY.

# DESCRIPTION

**wal** (pywal) generates color schemes by extracting dominant colors from wallpaper images and applies them to the terminal emulator, shell, and other applications. It creates a cohesive visual theme across the desktop environment based on a single source image.

The extracted color palette is applied to terminal colors in real time and can be used to generate configuration files for other programs through a template system. This allows applications like i3, polybar, rofi, and many others to automatically adopt the same color scheme.

Generated themes are cached for quick switching, and previous color schemes can be restored on login. Both light and dark color variants are supported, and the wallpaper-setting step can be skipped when only the colors are needed.

# CAVEATS

Python required. Terminal support varies. X11/Wayland differences.

# HISTORY

**pywal** was created to generate and apply color schemes from images to terminals and applications.

# SEE ALSO

[feh](/man/feh)(1), [wpgtk](/man/wpgtk)(1), [flavours](/man/flavours)(1)
