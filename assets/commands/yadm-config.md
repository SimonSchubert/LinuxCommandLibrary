# TLDR

**List configuration**

```yadm config --list```

**Set configuration**

```yadm config [name] [value]```

**Set local class**

```yadm config local.class [work]```

# SYNOPSIS

**yadm** **config** [_options_] [_name_] [_value_]

# PARAMETERS

**--list**
> List all settings.

**--get** _name_
> Get setting value.

**--unset** _name_
> Remove setting.

**local.class**
> System class for alternates.

**local.hostname**
> Override hostname.

# DESCRIPTION

**yadm config** manages yadm configuration. Sets local system properties for alternate file selection. Wraps git config for yadm-specific settings.

# SEE ALSO

[yadm](/man/yadm)(1), [yadm-alt](/man/yadm-alt)(1)

