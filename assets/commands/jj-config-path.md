# TAGLINE

displays the file system path to Jujutsu configuration files

# TLDR

**Show user config path**

```jj config path --user```

**Show repo config path**

```jj config path --repo```

# SYNOPSIS

**jj** **config** **path** [_options_]

# PARAMETERS

**--user**
> Show user-level configuration file path (typically ~/.config/jj/config.toml).

**--repo**
> Show repository-level configuration file path (.jj/repo/config.toml).

**--help**
> Display help information.

# DESCRIPTION

**jj config path** displays the file system path to Jujutsu configuration files. Useful for locating config files for manual editing, scripting, or troubleshooting. If the target config file does not yet exist, the command still prints the path where it would be created.

# CAVEATS

Exactly one of **--user** or **--repo** must be specified. The **--repo** variant must be run from within a Jujutsu repository.

# SEE ALSO

[jj](/man/jj)(1), [jj-config-edit](/man/jj-config-edit)(1)

