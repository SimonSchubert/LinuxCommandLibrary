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

**wal** [_-i image_] [_-l_] [_-n_] [_--theme name_] [_options_]

# PARAMETERS

**-i** _IMAGE_
> Input image.

**-l**
> Light colors.

**-n**
> Skip wallpaper.

**--theme** _NAME_
> Use theme.

**-R**
> Restore last.

**-c**
> Clear cache.

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
