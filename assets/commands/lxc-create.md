# TLDR

Create container **interactively**

```sudo lxc-create -n [container_name] -t download```

Create in **custom directory**

```sudo lxc-create -P /path/to/dir/ -n [container_name] -t download```

Create with **specific distro**

```sudo lxc-create -n [container_name] -t download -- -d [distro] -r [release] -a [arch]```

Display **help**

```lxc-create --help```

# SYNOPSIS

**lxc-create** **-n** _name_ **-t** _template_ [_options_]

# DESCRIPTION

**lxc-create** creates a new Linux container from a template. It sets up the container's root filesystem and configuration based on the specified template.

# PARAMETERS

**-n, --name NAME**
> Container name

**-t, --template TEMPLATE**
> Template to use (download, ubuntu, debian, etc.)

**-P, --lxcpath PATH**
> Container storage directory

**-B, --bdev TYPE**
> Backing store type (dir, lvm, btrfs, zfs)

**-- TEMPLATE_OPTIONS**
> Options passed to template (-d distro, -r release, -a arch)

**-?, --help**
> Display help information

# CAVEATS

Requires root privileges. Default storage at /var/lib/lxc/. Templates vary by distribution.

# SEE ALSO

[lxc-destroy](/man/lxc-destroy)(1), [lxc-start](/man/lxc-start)(1), [lxc-ls](/man/lxc-ls)(1)
