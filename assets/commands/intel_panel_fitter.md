# TLDR

**Show panel fitter status**

```sudo intel_panel_fitter```

**Show for specific pipe**

```sudo intel_panel_fitter -p [0]```

**Enable panel fitting**

```sudo intel_panel_fitter -e```

**Disable panel fitting**

```sudo intel_panel_fitter -d```

# SYNOPSIS

**intel_panel_fitter** [_options_]

# PARAMETERS

**-p** _PIPE_
> Display pipe number.

**-e**
> Enable panel fitter.

**-d**
> Disable panel fitter.

**--help**
> Display help information.

# DESCRIPTION

**intel_panel_fitter** controls the hardware scaler for Intel GPUs. The panel fitter scales content to match display resolution.

The tool shows current scaling settings and allows enabling/disabling hardware scaling. Useful for resolution mismatch debugging.

intel_panel_fitter controls display scaling.

# CAVEATS

Intel graphics only. May affect display. Part of intel-gpu-tools. Requires root.

# HISTORY

intel_panel_fitter is part of **intel-gpu-tools**, developed for testing Intel display hardware scaling functionality.

# SEE ALSO

[intel_infoframes](/man/intel_infoframes)(1), [xrandr](/man/xrandr)(1), [intel_reg_read](/man/intel_reg_read)(1)
