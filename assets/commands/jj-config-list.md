# TLDR

**List all config values**

```jj config list```

**List user config only**

```jj config list --user```

**List repo config only**

```jj config list --repo```

**List with config source**

```jj config list --include-overridden```

# SYNOPSIS

**jj** **config** **list** [_options_]

# PARAMETERS

**--user**
> Show user configuration only.

**--repo**
> Show repository configuration only.

**--include-overridden**
> Include values overridden by higher-priority configs.

# DESCRIPTION

**jj config list** displays all Jujutsu configuration values. Shows merged configuration from all sources by default. Useful for debugging configuration issues and understanding effective settings.

# SEE ALSO

[jj](/man/jj)(1), [jj-config-get](/man/jj-config-get)(1)

