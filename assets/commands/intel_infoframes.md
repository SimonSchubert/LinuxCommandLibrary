# TLDR

**Show HDMI infoframes**

```sudo intel_infoframes```

**Show specific port**

```sudo intel_infoframes -p [HDMI-A-1]```

**Verbose output**

```sudo intel_infoframes -v```

# SYNOPSIS

**intel_infoframes** [_options_]

# PARAMETERS

**-p** _PORT_
> Specific display port.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**intel_infoframes** displays HDMI and DisplayPort InfoFrame data. InfoFrames carry metadata about video format, audio, and HDCP.

The tool shows AVI, audio, and vendor-specific infoframes. Useful for debugging HDMI/DP handshake issues.

intel_infoframes shows display metadata.

# CAVEATS

Intel graphics only. Requires active display. Part of intel-gpu-tools.

# HISTORY

intel_infoframes is part of **intel-gpu-tools**, created for debugging digital display connections on Intel graphics.

# SEE ALSO

[intel_panel_fitter](/man/intel_panel_fitter)(1), [intel_reg_read](/man/intel_reg_read)(1), [xrandr](/man/xrandr)(1)
