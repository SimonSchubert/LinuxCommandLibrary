# TLDR

**Show version**

```plesk version```

**List domains**

```plesk bin domain --list```

**Create backup**

```plesk bin pleskbackup --domains-name [domain] --output-file [backup]```

**Repair installation**

```plesk repair all```

**Check status**

```plesk bin service --status```

# SYNOPSIS

**plesk** [_command_] [_options_]

# PARAMETERS

**bin** _COMMAND_
> Run Plesk utility.

**repair** _COMPONENT_
> Repair component.

**version**
> Show version.

**--help**
> Display help.

# DESCRIPTION

**plesk** manages Plesk hosting panel. Web hosting automation.

The tool controls domains, mail, and services. CLI interface.

plesk manages hosting.

# CAVEATS

Commercial software. Root access required. Server administration.

# HISTORY

Plesk CLI provides **command-line management** of Plesk hosting panel.

# SEE ALSO

[apache2ctl](/man/apache2ctl)(1), [nginx](/man/nginx)(1)

