# TLDR

**Create a container instance**

```az container create -g [resource-group] --name [container-name] --image [image:tag] --cpu [1] --memory [1]```

**Create with public IP** and DNS name

```az container create -g [resource-group] --name [container-name] --image [image:tag] --ports [80] --dns-name-label [myapp]```

**List container groups** in a resource group

```az container list -g [resource-group]```

**View container logs**

```az container logs -g [resource-group] --name [container-name]```

**Execute a command** in a running container

```az container exec -g [resource-group] --name [container-name] --exec-command "[/bin/bash]"```

**Show container details**

```az container show -g [resource-group] --name [container-name]```

**Stop a container group**

```az container stop -g [resource-group] --name [container-name]```

**Delete a container group**

```az container delete -g [resource-group] --name [container-name]```

# SYNOPSIS

**az container** _subcommand_ [_options_]

# DESCRIPTION

**az container** manages Azure Container Instances (ACI), providing the fastest way to run containers in Azure without managing virtual machines or adopting orchestration services.

ACI is ideal for isolated containers, simple applications, task automation, and build jobs. For scenarios requiring full container orchestration, use Azure Kubernetes Service (AKS).

# SUBCOMMANDS

**Lifecycle**
> create, delete, start, stop, restart

**Information**
> show, list, logs

**Interaction**
> attach, exec, export

**Profiles**
> container-group-profile create, container-group-profile delete, container-group-profile list

# PARAMETERS

**-g, --resource-group** _value_
> Name of the resource group

**--name** _value_
> Name of the container group

**--image** _value_
> Container image (e.g., nginx:latest)

**--cpu** _value_
> Number of CPU cores (default: 1)

**--memory** _value_
> Memory in GB (default: 1.5)

**--ports** _value_
> Space-separated list of ports to open

**--dns-name-label** _value_
> DNS name label for the public IP

**--os-type** _value_
> Operating system type: Linux or Windows

# CAVEATS

Container groups with public IPs are charged even when stopped; delete to avoid charges. Windows containers have limited image support and higher resource requirements. Environment variables containing secrets should use secure values. Maximum resource limits apply per region and subscription.

# HISTORY

Azure Container Instances launched in **July 2017** as the first serverless container service on any public cloud. It enabled running containers without managing infrastructure, bridging the gap between VMs and full orchestration platforms.

# SEE ALSO

[az](/man/az)(1), [az-aks](/man/az-aks)(1), [docker](/man/docker)(1)
