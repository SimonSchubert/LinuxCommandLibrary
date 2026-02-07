# TAGLINE

provision and manage Docker hosts on virtual machines

# TLDR

**List machines**

```docker-machine ls```

**Create a machine**

```docker-machine create --driver [virtualbox] [name]```

**Start a machine**

```docker-machine start [name]```

**Stop a machine**

```docker-machine stop [name]```

**Get machine IP**

```docker-machine ip [name]```

**SSH into machine**

```docker-machine ssh [name]```

**Set environment for machine**

```eval $(docker-machine env [name])```

# SYNOPSIS

**docker-machine** _command_ [_options_] [_args_]

# SUBCOMMANDS

**ls**
> List machines.

**create**
> Create a machine.

**start**
> Start a machine.

**stop**
> Stop a machine.

**rm**
> Remove a machine.

**ssh**
> SSH into machine.

**ip**
> Get machine IP address.

**env**
> Display environment variables.

**status**
> Get machine status.

**inspect**
> Inspect machine info.

# DESCRIPTION

**docker-machine** creates and manages Docker hosts on local hypervisors or cloud providers. Allows running Docker Engine on remote machines. It automates the process of creating virtual machines, installing Docker, and configuring the Docker client to connect to them. Supports multiple drivers including VirtualBox, VMware, AWS, Azure, and Digital Ocean.

# CAVEATS

Docker Machine is deprecated. Docker Desktop or cloud-native solutions are now preferred for managing Docker environments.

# SEE ALSO

[docker](/man/docker)(1), [docker-context](/man/docker-context)(1)

