# TLDR

Display the **effective configuration** in use (after merging all config sources)

```lvmconfig --typeconfig current --mergedconfig```

Show only settings that **differ from defaults**

```lvmconfig --typeconfig diff```

**List all configuration keys**

```lvmconfig -l```

Print the **default configuration** with full comments and extra spacing

```lvmconfig --typeconfig default --withcomments --withspaces```

**Validate** the full merged configuration and report errors

```lvmconfig --mergedconfig --validate```

**Write** the current effective configuration to a file

```lvmconfig --typeconfig current -f [path/to/output.conf]```

# SYNOPSIS

**lvmconfig** [_options_] [_section_]

# PARAMETERS

**--typeconfig _type_**
> Specify configuration type: current, default, diff, full, list, missing, new, profilable, or profilable-command

**--mergedconfig**
> Merge all configuration sources before display

**-l, --list**
> List all configuration keys

**--withcomments**
> Include explanatory comments in output

**--withspaces**
> Add extra spacing for readability

**--validate**
> Check configuration for errors and report problems

**-f, --file _path_**
> Write output to a file instead of stdout

**--config _string_**
> Override configuration settings from the command line

# DESCRIPTION

**lvmconfig** displays and manipulates Logical Volume Manager (LVM) configuration information. It reads configuration from multiple sources (command line, environment, config files) and can show the effective merged configuration.

The tool supports different configuration views: **current** shows active settings, **default** shows built-in defaults, **diff** shows only non-default values, and **full** shows everything. It can also validate configuration files for syntax errors and deprecated options.

Configuration sections include global settings, device filters, activation options, and allocation policies for volume groups and logical volumes.

# CAVEATS

Configuration changes made with lvmconfig are not persistent; edit **/etc/lvm/lvm.conf** directly for permanent changes. The **--validate** option may not catch all configuration issues, particularly those that depend on runtime conditions.

# SEE ALSO

[lvm](/man/lvm)(8), [lvm.conf](/man/lvm.conf)(5), [pvcreate](/man/pvcreate)(8), [vgcreate](/man/vgcreate)(8), [lvcreate](/man/lvcreate)(8)
