# TLDR

**Bootstrap** a new Ceph cluster

```sudo cephadm bootstrap --mon-ip [monitor_ip]```

**Add** a new host to the cluster

```sudo cephadm add-host [hostname] [ip_address]```

**Deploy** a specific service

```sudo cephadm deploy [service_type] --name [service_name]```

Check **status** of cluster services

```sudo cephadm shell -- ceph -s```

Enter a **shell** inside the Ceph container

```sudo cephadm shell```

**Remove** a service from the cluster

```sudo cephadm rm-service [service_type] --name [service_name]```

# SYNOPSIS

**cephadm** [_options_] _command_ [_arguments_]

# DESCRIPTION

**cephadm** deploys and manages Ceph clusters using containers (Docker or Podman). It is the modern orchestration tool for Ceph, replacing older deployment methods like ceph-deploy.

The tool handles container lifecycle, service placement, and cluster bootstrapping in a declarative manner.

# SUBCOMMANDS

**bootstrap**
> Initialize a new Ceph cluster

**add-host**
> Add a host to the cluster

**rm-host**
> Remove a host from the cluster

**deploy**
> Deploy a daemon

**rm-daemon**
> Remove a daemon

**shell**
> Enter interactive shell in Ceph container

**logs**
> View daemon logs

# PARAMETERS

**--mon-ip** _ip_
> Monitor IP address for bootstrap

**--name** _name_
> Service or daemon name

**--image** _image_
> Container image to use

# CAVEATS

Requires container runtime (Podman preferred, Docker supported). Bootstrap creates initial admin credentials. Services are managed through the orchestrator, not directly.

# SEE ALSO

[ceph](/man/ceph)(8), [podman](/man/podman)(1)
