# TLDR

**Set configuration value**

```kaggle config set -n [competition] -v [value]```

**View configuration**

```kaggle config view```

**Unset configuration value**

```kaggle config unset -n [name]```

# SYNOPSIS

**kaggle** **config** _subcommand_ [_options_]

# PARAMETERS

**set** **-n** _name_ **-v** _value_
> Set configuration option.

**view**
> Display current configuration.

**unset** **-n** _name_
> Remove configuration option.

# DESCRIPTION

**kaggle config** manages Kaggle CLI configuration settings. Stores preferences like default competition, output paths, and proxy settings. Configuration is stored in ~/.kaggle/kaggle.json.

# SEE ALSO

[kaggle](/man/kaggle)(1)

