# TAGLINE

retrieves configuration values from Jujutsu config files

# TLDR

**Get config value**

```jj config get [user.name]```

**Get value from user config only**

```jj config get --user [key]```

**Get value from repo config only**

```jj config get --repo [key]```

# SYNOPSIS

**jj** **config** **get** [_options_] _name_

# PARAMETERS

**--user**
> Read from user configuration only.

**--repo**
> Read from repository configuration only.

# DESCRIPTION

**jj config get** retrieves configuration values from Jujutsu config files. Reads from both user and repo config by default, with repo config taking precedence. Returns the value for the specified key.

# SEE ALSO

[jj](/man/jj)(1), [jj-config-set](/man/jj-config-set)(1), [jj-config-list](/man/jj-config-list)(1)

