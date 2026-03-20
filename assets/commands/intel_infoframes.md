# TAGLINE

view and change HDMI InfoFrames sent by the GPU

# TLDR

**View HDMI infoframes**

```sudo intel_infoframes```

**Display help** with field descriptions

```intel_infoframes --help```

# SYNOPSIS

**intel_infoframes** [_options_]

# PARAMETERS

**-h**, **--help**
> Display help information and field descriptions.

# DESCRIPTION

**intel_infoframes** is a debugging tool that views and changes the HDMI InfoFrames sent by the GPU. InfoFrames carry metadata about video format, audio, and other display parameters.

Descriptions of the InfoFrame fields can be found in the HDMI and CEA-861 specifications. Not all HDMI monitors respect the InfoFrames sent to them. In some cases (e.g., when changing modes) the Kernel will undo the changes made by this tool.

# CAVEATS

Intel graphics only (GEN 4 or newer). Requires active display. Part of intel-gpu-tools (igt-gpu-tools).

# HISTORY

intel_infoframes is part of **intel-gpu-tools**, created for debugging digital display connections on Intel graphics.

# SEE ALSO

[intel_panel_fitter](/man/intel_panel_fitter)(1), [intel_reg_read](/man/intel_reg_read)(1), [xrandr](/man/xrandr)(1)
