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

# SYNOPSIS

**vagrant** **resume** [_options_] [_name_]

# PARAMETERS

**--provision**
> Run provisioners.

**--no-provision**
> Skip provisioners.

# DESCRIPTION

**vagrant resume** brings a suspended Vagrant machine back online. It restores the VM state from the point when it was suspended with **vagrant suspend**. Resuming is faster than a full boot from a halted state because it restores from a saved memory snapshot rather than performing a cold start. If the machine is not in a suspended state, this command has no effect.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-suspend](/man/vagrant-suspend)(1), [vagrant-halt](/man/vagrant-halt)(1), [vagrant-status](/man/vagrant-status)(1)

