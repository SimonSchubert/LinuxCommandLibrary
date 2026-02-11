# TAGLINE

Wallpaper-based colorscheme manager

# TLDR

**Add wallpaper to collection**

```wpg -a [/path/to/image.jpg]```

**Set wallpaper and apply colorscheme**

```wpg -s [wallpaper.jpg]```

**List added wallpapers**

```wpg -l```

**Show current wallpaper**

```wpg -c```

**Shuffle wallpaper's colorscheme**

```wpg -z [wallpaper.jpg]```

**Import JSON colorscheme**

```wpg -i [wallpaper.jpg] [colorscheme.json]```

**Apply colorscheme to terminal**

```wpg -t```

**Launch GUI**

```wpgtk```

# SYNOPSIS

**wpg** [_options_] [_wallpaper_]

**wpgtk**

# PARAMETERS

**-a** _image_
> Add wallpaper to collection.

**-s** _wallpaper_ [_fallback_]
> Set wallpaper and colorscheme.

**-l**
> List added wallpapers.

**-c**
> Print current wallpaper name.

**-d** _wallpaper_
> Delete wallpaper from collection.

**-t**
> Apply colorscheme to terminal.

**-z** _wallpaper_
> Shuffle/regenerate colorscheme.

**-i** _wallpaper_ _json_
> Import colorscheme from JSON file.

**--auto** _wallpaper_
> Auto-generate foreground colors.

**-h**
> Display help.

# DESCRIPTION

**wpgtk** is a colorscheme, wallpaper, and template manager for Unix-like systems. It uses pywal as its backend to extract colors from wallpapers and apply them system-wide through configurable templates.

The tool generates coordinated colorschemes from wallpaper images, applying them to terminals, GTK themes, window managers, and other applications. Templates define how colors are applied to each application's configuration files. Both a CLI (wpg) and GUI (wpgtk) interface are provided.

Colorschemes are saved with their wallpapers, allowing instant theme switching. Colors can be manually edited, imported from JSON (compatible with terminal.sexy), or auto-adjusted for better contrast.

# CAVEATS

Requires pywal as backend. Template files need manual setup for each application. Some applications require restart to apply new colors. GTK theme changes may need session restart.

# HISTORY

**wpgtk** was created by deviantfero to provide a user-friendly interface on top of pywal. While pywal handles color extraction and basic application, wpgtk adds wallpaper management, color editing, template management, and a graphical interface for users who prefer visual configuration.

# SEE ALSO

[wal](/man/wal)(1), [feh](/man/feh)(1), [nitrogen](/man/nitrogen)(1)
