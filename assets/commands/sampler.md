# TAGLINE

Terminal dashboard from shell commands with YAML configuration

# TLDR

**Launch a dashboard with a config file**

```sampler -c [config.yml]```

**Launch with environment variables**

```sampler -c [config.yml] -e "[VAR=value]"```

**Launch with multiple environment variables**

```sampler -c [config.yml] -e "[VAR1=value1]" -e "[VAR2=value2]"```

# SYNOPSIS

**sampler** **-c** _config.yml_ [_options_]

# PARAMETERS

**-c** _FILE_
> Path to the YAML configuration file.

**-e** _VAR=VALUE_
> Set environment variables for the dashboard.

# DESCRIPTION

**sampler** executes shell commands at configurable intervals and visualizes their output as runcharts, sparklines, barcharts, gauges, and text boxes in the terminal. It supports trigger-based alerts (visual, sound, terminal bell, or arbitrary shell commands) and works with databases, message queues, SSH, and JMX out of the box.

# CAVEATS

Windows support is experimental. Linux requires **libasound2-dev** for audio alerts.

# HISTORY

**sampler** was created by **Alexander Lukyanchikov** (sqshq) and is written in **Go**.

# SEE ALSO

[glances](/man/glances)(1), [htop](/man/htop)(1)
