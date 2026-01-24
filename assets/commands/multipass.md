# TLDR

**Launch a new Ubuntu instance**

```multipass launch --name [myvm]```

**Launch with specific Ubuntu version**

```multipass launch [22.04] --name [myvm]```

**Launch with custom resources**

```multipass launch --name [myvm] --cpus [2] --memory [4G] --disk [20G]```

**List all instances**

```multipass list```

**Open shell in instance**

```multipass shell [instance_name]```

**Execute command in instance**

```multipass exec [instance_name] -- [command]```

**Stop an instance**

```multipass stop [instance_name]```

**Delete and purge instance**

```multipass delete [instance_name] && multipass purge```

# SYNOPSIS

**multipass** _command_ [_options_] [_arguments_]

# PARAMETERS

**launch** [_image_]
> Create and start a new instance.

**list**, **ls**
> List all instances.

**shell** _instance_
> Open shell in instance.

**exec** _instance_ **--** _command_
> Run command in instance.

**start** _instance_
> Start stopped instance.

**stop** _instance_
> Stop running instance.

**restart** _instance_
> Restart instance.

**delete** _instance_
> Delete instance (recoverable until purge).

**purge**
> Permanently remove deleted instances.

**recover** _instance_
> Restore deleted instance.

**info** _instance_
> Show instance details.

**mount** _source_ _instance:target_
> Mount host directory in instance.

**umount** _mount_
> Unmount directory.

**transfer** _source_ _destination_
> Copy files between host and instance.

**find**
> List available images.

**--name** _NAME_
> Instance name.

**--cpus** _NUM_
> Number of CPUs.

**--memory** _SIZE_
> RAM allocation (e.g., 2G).

**--disk** _SIZE_
> Disk size (e.g., 10G).

**--cloud-init** _FILE_
> Cloud-init configuration file.

# DESCRIPTION

**Multipass** is a lightweight VM manager for Ubuntu instances. Developed by Canonical, it provides a fast way to launch Ubuntu virtual machines on Linux, macOS, and Windows, optimized for cloud-style workflows.

Instances boot quickly from cached cloud images. The hypervisor backend varies by platform: QEMU or LXD on Linux, Hyperkit or QEMU on macOS, and Hyper-V on Windows. Instances get DHCP networking with host connectivity out of the box.

Cloud-init support enables automated provisioning. You can pass cloud-init YAML to install packages, configure users, run scripts, and more during first boot - matching cloud deployment workflows locally.

Mount functionality shares host directories with instances, useful for development. File transfers work both directions. Multiple instances can run simultaneously, limited by system resources.

The tool is particularly useful for testing Ubuntu server configurations, developing cloud applications locally, and quick disposable development environments.

# CAVEATS

Ubuntu images only - other distributions not supported. Requires hardware virtualization support. Hypervisor conflicts possible (VirtualBox, Docker Desktop). Default instance resources are modest. Network bridge configuration varies by backend. Some features require specific hypervisor backends.

# HISTORY

**Multipass** was developed by **Canonical** and released around **2017** to provide a streamlined Ubuntu VM experience across platforms. It grew from the need for quick, consistent Ubuntu environments for development and testing. The project emphasizes simplicity over full virtualization features, targeting developers who need Ubuntu instances without complex VM management.

# SEE ALSO

[lxc](/man/lxc)(1), [vagrant](/man/vagrant)(1), [docker](/man/docker)(1), [qemu](/man/qemu)(1)
