# TAGLINE

Resume a suspended Vagrant machine

# TLDR

**Resume** the default suspended VM

```vagrant resume```

**Resume** a specific VM by **name** or **ID**

```vagrant resume [name|id]```

**Resume** and run **provisioners** afterward

```vagrant resume --provision```

**Resume** and skip all **provisioners**

```vagrant resume --no-provision```

Run only **specific provisioners** afterward

```vagrant resume --provision-with [shell,ansible]```

# SYNOPSIS

**vagrant** **resume** [_options_] [_name_]

# PARAMETERS

**--provision**
> Force the provisioners to run. By default they do not run on resume.

**--no-provision**
> Skip provisioners.

**--provision-with** _x_,_y_,_z_
> Run only the given provisioners, by type or by name.

# DESCRIPTION

**vagrant resume** brings a suspended Vagrant machine back online. It restores the VM state from the point when it was suspended with **vagrant suspend**. Resuming is faster than a full boot from a halted state because it restores from a saved memory snapshot rather than performing a cold start. If the machine is not in a suspended state, this command has no effect.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-suspend](/man/vagrant-suspend)(1), [vagrant-halt](/man/vagrant-halt)(1), [vagrant-status](/man/vagrant-status)(1)

# RESOURCES

```[Source code](https://github.com/hashicorp/vagrant)```

```[Documentation](https://developer.hashicorp.com/vagrant/docs/cli/resume)```

<!-- verified: 2026-11-09 -->
