# TAGLINE

Generate Telegram themes from pywal

# TLDR

Generate with **wal** palette

```wal-telegram```

Use **background** image

```wal-telegram --background=[path/to/image]```

Use **tiled** color background

```wal-telegram --tiled```

Apply **blur** to background

```wal-telegram -g```

Set **destination**

```wal-telegram --destination=[path/to/destination]```

**Restart** Telegram after generation

```wal-telegram --restart```

# SYNOPSIS

**wal-telegram** [_OPTIONS_]

# PARAMETERS

**--background** _PATH_
> Use specified background image

**--tiled**
> Use colored background from palette

**-g**
> Apply gaussian blur to background

**--destination** _PATH_
> Output location for generated theme

**--restart**
> Restart Telegram after generating theme

# DESCRIPTION

**wal-telegram** generates Telegram desktop themes (`.tdesktop-theme`) coloured to match a pywal palette. It reads the cached colors from `~/.cache/wal/colors.json` and writes a theme file that the Telegram desktop client can load via *Settings → Chat Settings → Theme → Apply theme from file*.

By default the wallpaper used in the chat background is the current image set with **feh** (read from `~/.fehbg`); pass `--background` to override it or `--tiled` to use a tiled palette colour instead.

# CAVEATS

Requires **pywal** to have been run at least once so that `colors.json` exists. Wallpaper auto-detection only works with **feh**; other wallpaper setters need an explicit `--background` argument. The generated theme has to be re-applied in Telegram's settings each time it is regenerated unless `--restart` is used.

# INSTALL

```apk: sudo apk add py3-pywal```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[wal](/man/wal)(1)
