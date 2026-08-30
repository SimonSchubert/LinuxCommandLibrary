# TAGLINE

displays and manipulates Logical Volume Manager configuration information

# TLDR

Print the settings **actually in force**

```lvmconfig --typeconfig current --mergedconfig```

Show only what **differs from the shipped defaults**

```lvmconfig --typeconfig diff```

Print the **full default** configuration

```lvmconfig --typeconfig default```

Include the **explanatory comments** and blank lines

```lvmconfig --typeconfig default --withcomments --withspaces```

Annotate each setting with the **version that introduced it**

```lvmconfig --typeconfig default --withversions```

List the **names** of every setting

```lvmconfig --list```

Print a **single section**

```lvmconfig devices```

Print a **single setting**

```lvmconfig devices/filter```

**Check** the configuration for errors

```lvmconfig --validate```

Show what a **particular LVM version** would understand

```lvmconfig --typeconfig default --atversion [2.03.11]```

Show settings **absent from the config file**

```lvmconfig --typeconfig missing```

**Save** the effective configuration to a file

```lvmconfig --typeconfig current --file [path/to/lvm.conf]```

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

# INSTALL

```apt: sudo apt install lvm2```

```dnf: sudo dnf install lvm2```

```pacman: sudo pacman -S lvm2```

```apk: sudo apk add lvm2```

```zypper: sudo zypper install lvm2```

```nix: nix profile install nixpkgs#lvm2```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lvm](/man/lvm)(8), [pvcreate](/man/pvcreate)(8), [vgcreate](/man/vgcreate)(8), [lvcreate](/man/lvcreate)(8)
