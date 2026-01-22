# TLDR

Use alternate **config directory**

```postconf -c [path/to/config_dir]```

**Edit** configuration parameters

```postconf -e```

Show **default** settings

```postconf -d```

Show parameters from **specific class**

```postconf -C [builtin|service|user|all]```

List **SASL** plugin types

```postconf -a```

List **lookup table** types

```postconf -m```

# SYNOPSIS

**postconf** [**-c** _dir_] [**-d**] [**-e**] [**-C** _class_] [_parameters_...]

# PARAMETERS

**-c _directory_**
> Alternate configuration directory

**-d**
> Show default parameter values

**-e**
> Edit main.cf with name=value pairs

**-C _class_**
> Filter by parameter class

**-a**
> List available SASL plugin types

**-m**
> List available lookup table types

**-n**
> Show only parameters with non-default values

# DESCRIPTION

**postconf** displays and modifies Postfix mail server configuration. It reads and writes main.cf parameters, shows default values, and reports configuration warnings.

The tool validates parameter names and warns about typos. It's essential for administering Postfix without manually editing configuration files.

# CAVEATS

Changes via -e require postfix reload to take effect. Some parameters require restart. Modifying running server config requires care. Backup configuration before major changes.

# HISTORY

**postconf** is part of **Postfix**, the mail transfer agent created by **Wietse Venema** as a secure alternative to Sendmail. It provides safe configuration management for the complex mail system.

# SEE ALSO

[postfix](/man/postfix)(1), [postqueue](/man/postqueue)(1), [postmap](/man/postmap)(1)
