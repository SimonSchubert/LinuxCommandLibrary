# TAGLINE

Command-line interface for Plesk hosting panel

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

**plesk** is the command-line interface for the Plesk web hosting control panel. It provides access to domain management, backup operations, service control, and system diagnostics without using the web interface.

The **bin** subcommand runs individual Plesk utilities for specific tasks like domain configuration, database management, and mail setup. The **repair** command diagnoses and fixes common installation issues.

# CAVEATS

Commercial software. Root access required. Server administration.

# HISTORY

Plesk CLI provides **command-line management** of Plesk hosting panel.

# SEE ALSO

[apache2ctl](/man/apache2ctl)(1), [nginx](/man/nginx)(1)

