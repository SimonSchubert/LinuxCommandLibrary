# TLDR

**Start compositor**

```picom```

**Start with config file**

```picom --config [~/.config/picom/picom.conf]```

**Start in background**

```picom -b```

**Start with backend**

```picom --backend [glx]```

**Disable shadows**

```picom --no-shadow```

**Enable transparency**

```picom -i [0.9]```

# SYNOPSIS

**picom** [_options_]

# DESCRIPTION

**picom** is a standalone compositor for X11 window managers. It provides window transparency, shadows, blur, and other visual effects.

The tool is a fork of compton, itself derived from xcompmgr. It's commonly used with tiling window managers to add visual polish.

# PARAMETERS

**-b**, **--daemon**
> Run as daemon.

**--config** _file_
> Configuration file.

**--backend** _type_
> Rendering backend (xrender, glx, xr_glx_hybrid).

**-i** _opacity_
> Default window opacity.

**--shadow**
> Enable shadows.

**--no-shadow**
> Disable shadows.

**--blur-background**
> Blur background.

**--vsync**
> Enable vsync.

**--fade-in-step** _n_
> Fade in step.

**--fade-out-step** _n_
> Fade out step.

# CAVEATS

Requires compositing-compatible WM. GLX backend needs GPU support. Some effects resource-intensive. Conflicts with other compositors.

# HISTORY

**picom** is a fork of **compton**, which itself forked from **xcompmgr-dana** and **xcompmgr**. It's maintained by **yshui** and became the community standard after compton became unmaintained.

# SEE ALSO

[xcompmgr](/man/xcompmgr)(1), [compton](/man/compton)(1), [compiz](/man/compiz)(1)
