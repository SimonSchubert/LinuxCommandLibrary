# TAGLINE

displays all Jujutsu configuration values

# TLDR

**List all config values**

```jj config list```

**List user config only**

```jj config list --user```

**List repo config only**

```jj config list --repo```

**List with config source including overridden values**

```jj config list --include-overridden```

**List including default values**

```jj config list --include-defaults```

**List workspace-level config only**

```jj config list --workspace```

**List values using a custom template**

```jj config list -T [template]```

# SYNOPSIS

**jj** **config** **list** [_options_]

# PARAMETERS

**--user**
> Show user configuration only.

**--repo**
> Show repository configuration only.

**--workspace**
> Show workspace configuration only.

**--include-overridden**
> Include values overridden by higher-priority configs.

**--include-defaults**
> Include default values in the output.

**-T**, **--template** _TEMPLATE_
> Render output with a custom template.

# DESCRIPTION

**jj config list** displays all Jujutsu configuration values. Shows merged configuration from all sources (user, repo, workspace) by default. Useful for debugging configuration issues and understanding effective settings.

Available template fields: **name** (config name), **value** (TOML value), **overridden** (boolean), **source** (origin), **path** (config file path).

# SEE ALSO

[jj](/man/jj)(1), [jj-config-get](/man/jj-config-get)(1), [jj-config-set](/man/jj-config-set)(1), [jj-config-edit](/man/jj-config-edit)(1)
