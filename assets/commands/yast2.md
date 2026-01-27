# TLDR

**Launch YaST graphical interface**

```sudo yast2```

**Launch YaST text interface**

```sudo yast2 --ncurses```

**Open specific module**

```sudo yast2 [sw_single]```

**List available modules**

```yast2 --list```

**Install packages**

```sudo yast2 --install [package_name]```

**Remove packages**

```sudo yast2 --remove [package_name]```

**Configure network**

```sudo yast2 lan```

# SYNOPSIS

**yast2** [_options_] [_module_] [_module-options_]

# PARAMETERS

**--ncurses**
> Force text-based interface.

**--qt**
> Force Qt graphical interface.

**--gtk**
> Force GTK graphical interface.

**--list**
> List available modules.

**--install** _pkg_
> Install package.

**--remove** _pkg_
> Remove package.

**--update** _pkg_
> Update package.

**--help**
> Display help.

# COMMON MODULES

**sw_single**: Software management.

**lan**: Network configuration.

**users**: User management.

**firewall**: Firewall configuration.

**disk**: Partitioner.

**bootloader**: Boot loader configuration.

**printer**: Printer setup.

**sound**: Sound card configuration.

# DESCRIPTION

**yast2** (Yet another Setup Tool 2) is the comprehensive system configuration tool for openSUSE and SUSE Linux Enterprise. It provides both graphical and text interfaces for system administration.

YaST can configure hardware, networking, security, software packages, system services, and users. Modules handle specific tasks, accessible from the control center or directly via command line.

The tool supports AutoYaST for automated installations using XML control files, enabling unattended deployment of multiple systems.

# CAVEATS

SUSE-specific; not available on other distributions. Some modules require root privileges. Being deprecated in favor of Cockpit and Agama in newer SUSE versions.

# HISTORY

**YaST** was first released in April 1995 with SuSE Linux. YaST2 appeared in SuSE 6.3 (1999) as an installer, becoming the full system tool in 6.4. It was released under GPL in 2004. On openSUSE Leap 16 and SLES 16, YaST is being replaced by web-based tools.

# SEE ALSO

[zypper](/man/zypper)(8), [systemctl](/man/systemctl)(1), [cockpit](/man/cockpit)(8)
