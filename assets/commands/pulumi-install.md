# TAGLINE

Install Pulumi project dependencies and plugins

# TLDR

**Install project dependencies and plugins**

```pulumi install```

**Install without language dependencies**

```pulumi install --no-dependencies```

**Install without plugins**

```pulumi install --no-plugins```

**Reinstall all plugins even if they exist**

```pulumi install --reinstall```

**Install with custom parallelism**

```pulumi install --parallel [8]```

**Use language version tools to set up the runtime**

```pulumi install --use-language-version-tools```

# SYNOPSIS

**pulumi** **install** [_options_]

# PARAMETERS

**--no-dependencies**
> Skip installing language dependencies.

**--no-plugins**
> Skip installing plugins.

**--reinstall**
> Reinstall plugins even if they already exist.

**--parallel** _int_
> Max number of concurrent installs (default 4).

**--use-language-version-tools**
> Use language version tools to setup and install the language runtime.

# DESCRIPTION

**pulumi install** installs packages and plugins required by your Pulumi program or policy pack. If your **Pulumi.yaml** file contains a 'packages' section, this command automatically installs SDKs for all declared packages. Run after cloning a project or updating dependencies.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-plugin](/man/pulumi-plugin)(1), [pulumi-new](/man/pulumi-new)(1), [pulumi-up](/man/pulumi-up)(1)
