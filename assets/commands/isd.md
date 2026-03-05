# TAGLINE

Interactive systemd unit manager TUI

# TLDR

**Launch isd** to browse systemd units

```isd```

**Browse user units**

```isd --user```

# SYNOPSIS

**isd** [**--user**] [_options_]

# DESCRIPTION

**isd** (interactive systemd) is a TUI for managing **systemd** units with fuzzy search, auto-refreshing previews, and smart sudo handling. It provides a fluid layout that adapts to terminal size, a command palette with keyboard shortcuts, and YAML configuration with auto-completion.

The tool offers features for both power users and newcomers, including the ability to switch between system and user units, pager support for viewing unit details, and input state caching for frequently used entries.

# CAVEATS

Requires **Python 3.11** or newer. Only works on Linux systems with systemd. Some operations require root privileges, which isd handles with smart sudo detection.

# HISTORY

**isd** was created by **kainctl** and is written in **Python**. It was designed as a more user-friendly alternative to the systemctl command for daily systemd management tasks.

# SEE ALSO

[systemctl](/man/systemctl)(1), [journalctl](/man/journalctl)(1)
