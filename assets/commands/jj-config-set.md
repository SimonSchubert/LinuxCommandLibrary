# TAGLINE

sets configuration values in Jujutsu config files

# TLDR

**Set user config value**

```jj config set --user [user.name] "[John Doe]"```

**Set repo config value**

```jj config set --repo [key] "[value]"```

**Set user email**

```jj config set --user user.email "[email@example.com]"```

# SYNOPSIS

**jj** **config** **set** [_options_] _name_ _value_

# PARAMETERS

**--user**
> Set in user configuration.

**--repo**
> Set in repository configuration.

# DESCRIPTION

**jj config set** sets configuration values in Jujutsu config files. User config applies globally while repo config applies only to the current repository. Values are stored in TOML format.

# SEE ALSO

[jj](/man/jj)(1), [jj-config-get](/man/jj-config-get)(1), [jj-config-unset](/man/jj-config-unset)(1)

