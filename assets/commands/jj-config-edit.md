# TAGLINE

opens the Jujutsu configuration file in your default editor

# TLDR

**Edit user config in editor**

```jj config edit --user```

**Edit repository config**

```jj config edit --repo```

# SYNOPSIS

**jj** **config** **edit** [_options_]

# PARAMETERS

**--user**
> Edit user-level configuration.

**--repo**
> Edit repository-level configuration.

# DESCRIPTION

**jj config edit** opens the Jujutsu configuration file in your default editor. User config applies globally while repo config applies only to the current repository. Configuration uses TOML format.

# SEE ALSO

[jj](/man/jj)(1), [jj-config-get](/man/jj-config-get)(1), [jj-config-set](/man/jj-config-set)(1)

