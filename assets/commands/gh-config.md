# TLDR

**Get config value**

```gh config get [key]```

**Set config value**

```gh config set [key] [value]```

**List all configuration**

```gh config list```

**Set default editor**

```gh config set editor [vim]```

**Set default browser**

```gh config set browser [firefox]```

# SYNOPSIS

**gh config** _command_ [_options_]

# PARAMETERS

**get** _KEY_
> Get a configuration value.

**set** _KEY_ _VALUE_
> Set a configuration value.

**list**
> List all configuration settings.

**--host** _HOSTNAME_
> Apply to specific GitHub host.

**--help**
> Display help information.

# DESCRIPTION

**gh config** manages configuration for the GitHub CLI. It controls behavior settings like preferred editor, browser, default prompts, and protocol preferences.

Configuration is stored per-host, allowing different settings for github.com and GitHub Enterprise instances. Settings can be environment-specific or global.

Common settings include git_protocol (https/ssh), editor, browser, and pager.

# CAVEATS

Config stored in ~/.config/gh/config.yml. Environment variables may override settings. Some settings require reauthentication to take effect.

# HISTORY

gh config is part of the **GitHub CLI**, providing user customization following XDG Base Directory conventions on Unix systems.

# SEE ALSO

[gh](/man/gh)(1), [gh-auth](/man/gh-auth)(1)
