# TAGLINE

collects diagnostic information about the LVM2 subsystem for troubleshooting

# TLDR

Generate a **basic dump**

```lvmdump```

Generate an **extended dump** with metadata and daemon info

```lvmdump -a -l -m```

Dump the information into a **directory** instead of a tarball

```lvmdump -d [path/to/directory]```

Display **help**

```lvmdump -h```

# SYNOPSIS

**lvmdump** [_options_]

# PARAMETERS

**-a**
> Include advanced diagnostic information

**-l**
> Include lvmetad cache state (if running)

**-m**
> Include LVM metadata from all volume groups

**-d _directory_**
> Output to a directory instead of a compressed tarball

**-h**
> Display help information

# DESCRIPTION

**lvmdump** collects diagnostic information about the LVM2 (Logical Volume Manager) subsystem for troubleshooting purposes. By default, it creates a compressed tar archive in the home directory containing system information, LVM configuration, and status data.

The dump includes output from commands like **pvs**, **vgs**, **lvs**, configuration files, dmsetup info, and relevant system information. When used with the **-m** flag, it also captures the raw metadata from all volume groups.

This tool is primarily used when reporting LVM issues to developers or support teams, providing all the context needed to diagnose problems.

# CAVEATS

The dump may contain sensitive information about storage configuration. Review contents before sharing externally. The **-m** option creates a larger dump that includes volume group metadata. Requires root privileges.

# SEE ALSO

[lvm](/man/lvm)(8), [pvs](/man/pvs)(8), [vgs](/man/vgs)(8), [lvs](/man/lvs)(8), [dmsetup](/man/dmsetup)(8)
