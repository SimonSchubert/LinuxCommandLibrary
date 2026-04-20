# TAGLINE

container-based Ceph cluster deployment

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

**cephadm** deploys and manages Ceph distributed storage clusters using containers (Podman preferred, Docker supported). It is the modern orchestration tool for Ceph, replacing older deployment methods like ceph-deploy and ceph-ansible.

The tool handles the complete cluster lifecycle: bootstrapping a new cluster on a single node, adding hosts, deploying daemons (monitors, OSDs, managers, gateways), and upgrading the cluster. Each Ceph daemon runs in its own container, providing isolation and simplified upgrades.

The `bootstrap` command creates an initial single-node cluster with a monitor and manager, generates admin credentials, and sets up the orchestrator for subsequent operations. The `shell` command provides an interactive environment inside a Ceph container with all management tools available.

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

**enter**
> Run a command inside an existing Ceph container

**ls**
> List all Ceph daemons running on this host

**ps**
> Show status of daemons (alias of `ls --no-extra-info`)

**check-host**
> Verify host prerequisites (packages, time sync, container runtime)

**prepare-host**
> Install missing prerequisites

**gather-facts**
> Collect host inventory information

**adopt**
> Adopt a daemon from a legacy (non-cephadm) deployment

**logs**
> View daemon logs

**rm-cluster**
> Destroy the local cluster state (dangerous)

# PARAMETERS

**--mon-ip** _ip_
> Monitor IP address for bootstrap

**--cluster-network** _CIDR_
> Restrict the OSD replication network to the given subnet.

**--ssh-user** _USER_
> User cephadm should SSH to remote hosts as (default `root`).

**--initial-dashboard-user**, **--initial-dashboard-password**
> Credentials for the Ceph Dashboard created during bootstrap.

**--skip-dashboard**
> Do not enable the dashboard.

**--fsid** _UUID_
> Reuse an existing cluster FSID instead of generating one.

**--name** _name_
> Service or daemon name

**--image** _image_
> Container image to use

**--docker**
> Force the use of Docker instead of Podman.

**-v**, **--verbose**
> Increase logging verbosity.

# CAVEATS

Requires container runtime (Podman preferred, Docker supported). Bootstrap creates initial admin credentials. Services are managed through the orchestrator, not directly.

# SEE ALSO

[ceph](/man/ceph)(8), [podman](/man/podman)(1)
