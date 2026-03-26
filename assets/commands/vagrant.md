# TAGLINE

Manage portable virtual development environments

# TLDR

**Initialize a new Vagrantfile with a base box**

```vagrant init [ubuntu/jammy64]```

**Start and provision VM**

```vagrant up```

**SSH into a running VM**

```vagrant ssh```

**Stop a running VM**

```vagrant halt```

**Destroy VM and remove all resources**

```vagrant destroy```

**Show status of all VMs**

```vagrant status```

**Suspend VM** (save state to disk)

```vagrant suspend```

**Show all Vagrant VMs across the system**

```vagrant global-status```

# SYNOPSIS

**vagrant** _command_ [_options_]

# PARAMETERS

**init** [_BOX_]
> Initialize a new Vagrantfile, optionally with a specified base box.

**up** [_NAME_]
> Start and provision the VM. Optionally specify a machine name in multi-machine setups.

**ssh** [_NAME_]
> SSH into a running VM.

**halt** [_NAME_]
> Gracefully stop a running VM.

**destroy** [_NAME_]
> Remove a VM and all its resources.

**reload** [_NAME_]
> Restart a VM and reload Vagrantfile configuration.

**suspend** [_NAME_]
> Pause a running VM, saving its current state.

**resume** [_NAME_]
> Resume a previously suspended VM.

**provision** [_NAME_]
> Run configured provisioners on a running VM.

**status** [_NAME_]
> Show the status of VMs in the current environment.

**global-status**
> Show the status of all Vagrant VMs across the system.

**snapshot push**
> Save a snapshot of the current VM state.

**snapshot pop**
> Restore the most recent snapshot.

**validate**
> Check the Vagrantfile for syntax errors.

**package**
> Package a running VM into a reusable box.

**plugin install** _NAME_
> Install a Vagrant plugin.

**box add** _BOX_
> Download and add a box image.

**box list**
> List locally available boxes.

**box remove** _BOX_
> Remove a locally stored box.

**--provider** _NAME_
> Specify the provider (virtualbox, vmware, etc.).

**-f**, **--force**
> Force the operation without confirmation.

**-h**, **--help**
> Display help information for any command.

# DESCRIPTION

**vagrant** manages virtual development environments. It automates VM creation, configuration, and provisioning.

Vagrantfile defines the VM configuration. It specifies the base box, network settings, shared folders, and provisioning scripts.

Boxes are base images. Many are available from Vagrant Cloud. Custom boxes can be created and shared.

Providers handle virtualization. VirtualBox is default, with support for VMware, Hyper-V, Docker, and cloud providers.

Provisioners configure VMs after boot. Shell scripts, Ansible, Puppet, and Chef are supported.

Multi-machine setups define several VMs in one Vagrantfile. They can model complex environments like clusters.

# CAVEATS

Requires virtualization software. Large boxes need download time and disk space. Provider-specific features may vary.

# HISTORY

**Vagrant** was created by **Mitchell Hashimoto** in **2010** and later developed by **HashiCorp**. It revolutionized development environment management, enabling reproducible setups.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [docker](/man/docker)(1), [ansible](/man/ansible)(1), [packer](/man/packer)(1), [ssh](/man/ssh)(1)
