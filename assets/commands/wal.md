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

**wal** generates color schemes. It uses pywal.

Image-based colors. Extract palette.

Terminal colors. Apply to shell.

Template support. Generate configs.

Theme cache. Quick switching.

# CAVEATS

Python required. Terminal support varies. X11/Wayland differences.

# HISTORY

**pywal** was created to generate and apply color schemes from images to terminals and applications.

# SEE ALSO

[feh](/man/feh)(1), [wpgtk](/man/wpgtk)(1), [flavours](/man/flavours)(1)
