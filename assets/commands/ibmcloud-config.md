# TAGLINE

manages IBM Cloud CLI configuration

# TLDR

**Show configuration**

```ibmcloud config --list```

**Set HTTP timeout**

```ibmcloud config --http-timeout [60]```

**Set trace**

```ibmcloud config --trace [true]```

**Set color output**

```ibmcloud config --color [true]```

**Set locale**

```ibmcloud config --locale [en_US]```

# SYNOPSIS

**ibmcloud config** [_options_]

# PARAMETERS

**--list**
> Show all settings.

**--http-timeout** _SEC_
> HTTP timeout.

**--trace** _BOOL_
> Enable tracing.

**--color** _BOOL_
> Color output.

**--locale** _LOCALE_
> Output locale.

**--check-version** _BOOL_
> Version check.

**--help**
> Display help information.

# DESCRIPTION

**ibmcloud config** manages IBM Cloud CLI configuration. It sets options for timeouts, output formatting, and behavior.

The command stores settings for the current user. Settings persist across sessions and affect all ibmcloud commands.

# CAVEATS

User-specific settings. Some settings require restart. Part of ibmcloud CLI.

# HISTORY

ibmcloud config is part of the **IBM Cloud** CLI configuration system.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-login](/man/ibmcloud-login)(1)
