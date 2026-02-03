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

**pip config** manages pip's configuration files. Configure index URLs, trusted hosts, and other pip settings. Settings can be per-user, site-wide, or global.

# SEE ALSO

[pip](/man/pip)(1)

