# TAGLINE

OBS Studio, an open-source streaming and recording program

# TLDR

**Start OBS Studio**

```obs```

**Start with specific scene**

```obs --scene "[scene_name]"```

**Start and begin recording**

```obs --startrecording```

**Start and begin streaming**

```obs --startstreaming```

**Start virtual camera**

```obs --startvirtualcam```

**Start minimized**

```obs --minimize-to-tray```

**Use specific profile and scene collection**

```obs --profile "[profile_name]" --collection "[collection_name]"```

# SYNOPSIS

**obs** [_options_]

# PARAMETERS

**--scene** _NAME_
> Start with scene.

**--profile** _NAME_
> Use profile.

**--startrecording**
> Begin recording on launch.

**--startstreaming**
> Begin streaming on launch.

**--startvirtualcam**
> Start virtual camera on launch.

**--startreplaybuffer**
> Start replay buffer on launch.

**--collection** _NAME_
> Use scene collection.

**--minimize-to-tray**
> Start minimized to system tray.

**--studio-mode**
> Enable studio mode.

**--multi**, **-m**
> Allow multiple instances without warning.

**--portable**, **-p**
> Use portable mode (settings stored in application directory).

**--always-on-top**
> Start in always-on-top mode.

**--verbose**
> Make log output more verbose.

**--version**, **-V**
> Print version information.

**--help**
> Display help information.

# DESCRIPTION

**obs** is OBS Studio, an open-source streaming and recording program.

The application provides video capture, scene composition, and streaming. Cross-platform.

# CAVEATS

Requires graphics hardware. Resource intensive. Plugin ecosystem available.

# HISTORY

OBS Studio was created by **Hugh Bailey** as free, open-source streaming software.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [vlc](/man/vlc)(1)

