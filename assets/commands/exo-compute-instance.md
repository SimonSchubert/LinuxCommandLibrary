# TLDR

**List instances**

```exo compute instance list```

**Create an instance**

```exo compute instance create [name] --zone [ch-gva-2] --template [Linux Ubuntu]```

**Show instance details**

```exo compute instance show [name]```

**Start an instance**

```exo compute instance start [name]```

**Stop an instance**

```exo compute instance stop [name]```

**Delete an instance**

```exo compute instance delete [name]```

**SSH into instance**

```exo compute instance ssh [name]```

# SYNOPSIS

**exo** **compute** **instance** _command_ [_options_]

# SUBCOMMANDS

**list**
> List instances.

**create**
> Create an instance.

**show**
> Show instance details.

**start**
> Start instance.

**stop**
> Stop instance.

**reboot**
> Reboot instance.

**delete**
> Delete instance.

**ssh**
> SSH into instance.

**resize**
> Resize instance.

# DESCRIPTION

**exo compute instance** manages Exoscale compute instances. Create, start, stop, and manage virtual machines in Exoscale cloud.

# SEE ALSO

[exo](/man/exo)(1), [exo-compute-block-storage](/man/exo-compute-block-storage)(1)

