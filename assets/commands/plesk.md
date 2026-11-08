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

**Check for problems without repairing**

```plesk repair all -n```

**Generate a one-time login link**

```plesk login```

**Open the Plesk database console**

```plesk db```

# SYNOPSIS

**plesk** [_command_] [_options_]

# PARAMETERS

**bin** _COMMAND_
> Run Plesk utility.

**repair** _ASPECT_
> Check and repair an aspect: all, mail, web, dns, ftp, db, mysql, fs or installation. **-n** only checks, **-y** repairs without asking.

**login** [_USER_]
> Generate a one-time login link.

**db** [_SQL_]
> Open the database console or run a query.

**log** _NAME_
> View a log file.

**conf** _NAME_
> Edit a configuration file such as panel.ini.

**daily** [_TASK_]
> Run the daily maintenance script.

**installer**
> Run the Plesk installer.

**sbin** _COMMAND_
> Run an internal utility.

**version**
> Show version.

**--help**
> Display help.

# DESCRIPTION

**plesk** is the command-line interface for the Plesk web hosting control panel. It provides access to domain management, backup operations, service control, and system diagnostics without using the web interface.

The **bin** subcommand runs individual Plesk utilities for specific tasks like domain configuration, database management, and mail setup. The **repair** command diagnoses and fixes common installation issues.

# CAVEATS

Commercial software. Root access required. One-time login links can be used once and expire after 24 hours.

# HISTORY

Plesk CLI provides **command-line management** of Plesk hosting panel.

# SEE ALSO

[apache2ctl](/man/apache2ctl)(1), [nginx](/man/nginx)(1)

# RESOURCES

```[Homepage](https://www.plesk.com/)```

```[Documentation](https://docs.plesk.com/en-US/obsidian/cli-linux/plesk-utility.75661/)```

<!-- verified: 2026-11-08 -->
