# TAGLINE

Suspend running Vagrant machines

# TLDR

**Suspend VM**

```vagrant suspend```

**Suspend specific VM**

```vagrant suspend [name|id]```

**Suspend all running VMs on the system**

```vagrant suspend --all-global```

# SYNOPSIS

**vagrant** **suspend** [_options_] [_name_|_id_]

# PARAMETERS

**-a**, **--all-global**
> Suspend all running VMs globally.

# DESCRIPTION

**vagrant suspend** saves the exact point-in-time state of the VM and stops it, so that a later **vagrant resume** continues immediately instead of doing a full boot. It generally needs extra disk space to store the guest's RAM contents, but while suspended the guest consumes no host RAM or CPU.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-resume](/man/vagrant-resume)(1), [vagrant-halt](/man/vagrant-halt)(1)

# RESOURCES

```[Source code](https://github.com/hashicorp/vagrant)```

```[Documentation](https://developer.hashicorp.com/vagrant/docs/cli/suspend)```

<!-- verified: 2026-11-09 -->
