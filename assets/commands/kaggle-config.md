# TAGLINE

manages Kaggle CLI configuration settings

# TLDR

**View current configuration**

```kaggle config view```

**Set the default competition**

```kaggle config set -n competition -v [competition_name]```

**Set the default download path**

```kaggle config set -n path -v [/path/to/download/folder]```

**Set a proxy for HTTP requests**

```kaggle config set -n proxy -v [http://proxy:port]```

**Unset a configuration value**

```kaggle config unset -n [name]```

# SYNOPSIS

**kaggle** **config** _subcommand_ [_options_]

# PARAMETERS

**set** **-n** _name_ **-v** _value_
> Set a configuration option. Valid names: competition, path, proxy.

**view**
> Display current configuration values.

**unset** **-n** _name_
> Remove a configuration option, reverting to default behavior.

**-n** _NAME_, **--name** _NAME_
> Name of the configuration parameter.

**-v** _VALUE_, **--value** _VALUE_
> Value of the configuration parameter.

# DESCRIPTION

**kaggle config** manages Kaggle CLI configuration settings. Available configuration parameters are **competition** (default competition URL suffix), **path** (default download folder, defaults to current working directory), and **proxy** (HTTP request proxy). Configuration is stored in **~/.kaggle/kaggle.json**.

# SEE ALSO

[kaggle](/man/kaggle)(1)

