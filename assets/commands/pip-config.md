# TAGLINE

Manage pip configuration files and settings

# TLDR

**List configuration**

```pip config list```

**Get specific setting**

```pip config get [key]```

**Set configuration value**

```pip config set [key] [value]```

**Edit config file**

```pip config edit```

**Delete setting**

```pip config unset [key]```

# SYNOPSIS

**pip** **config** _command_ [_options_]

# PARAMETERS

**list**
> List active configuration.

**get** _key_
> Get configuration value.

**set** _key_ _value_
> Set configuration value.

**unset** _key_
> Remove configuration value.

**edit**
> Edit config file in editor.

**debug**
> Show configuration files and values.

**--global**
> Use global configuration file.

**--user**
> Use user configuration file.

**--site**
> Use site configuration file.

# DESCRIPTION

**pip config** manages pip's configuration files at different scopes. It provides a command-line interface for reading, writing, and editing pip settings without manually locating and editing INI-format configuration files.

Configuration is organized into three levels: global (system-wide), user (per-account), and site (per-virtualenv). Settings cascade so that more specific scopes override broader ones. Common settings include custom package index URLs, trusted hosts for private registries, and default installation options.

Use **pip config list** to see all active settings and their sources, or **pip config debug** to display the full search path and which files exist. The **edit** subcommand opens the appropriate config file in your default editor.

# CONFIGURATION

**~/.config/pip/pip.conf** (Linux), **~/Library/Application Support/pip/pip.conf** (macOS), **%APPDATA%\pip\pip.ini** (Windows)
> User-level configuration file.

**/etc/pip.conf** (Linux/macOS), **C:\ProgramData\pip\pip.ini** (Windows)
> Global system-wide configuration file.

**$VIRTUAL_ENV/pip.conf**
> Site-level configuration file within a virtual environment.

**PIP_CONFIG_FILE**
> Environment variable to override the default config file location.

# SEE ALSO

[pip](/man/pip)(1)

