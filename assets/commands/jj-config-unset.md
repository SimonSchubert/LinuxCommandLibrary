# TLDR

**Unset user config value**

```jj config unset --user [key]```

**Unset repo config value**

```jj config unset --repo [key]```

# SYNOPSIS

**jj** **config** **unset** [_options_] _name_

# PARAMETERS

**--user**
> Remove from user configuration.

**--repo**
> Remove from repository configuration.

# DESCRIPTION

**jj config unset** removes configuration values from Jujutsu config files. The value is deleted from the specified config file, allowing defaults or lower-priority configs to take effect.

# SEE ALSO

[jj](/man/jj)(1), [jj-config-set](/man/jj-config-set)(1)

