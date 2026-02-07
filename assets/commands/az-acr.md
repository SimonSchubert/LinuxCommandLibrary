# TAGLINE

Manage Azure Container Registries

# TLDR

**Create a container registry**

```az acr create -n [registry-name] -g [resource-group] --sku [Standard]```

**Log in** to a registry

```az acr login -n [registry-name]```

**List all registries** in the subscription

```az acr list -o table```

**Build and push an image**

```az acr build -t [image:tag] -r [registry-name] [./source-directory]```

**Import an image** from another registry

```az acr import -n [registry-name] --source [source-registry.azurecr.io/repo:tag]```

**List repositories** in a registry

```az acr repository list -n [registry-name] -o table```

**Show registry details**

```az acr show -n [registry-name]```

**Check registry health**

```az acr check-health -n [registry-name]```

# SYNOPSIS

**az acr** _subcommand_ [_options_]

# DESCRIPTION

**az acr** manages Azure Container Registries (ACR), a private Docker registry service for storing and managing container images. ACR integrates with Azure Kubernetes Service, App Service, and other Azure services.

The command group supports registry creation, image management, authentication, geo-replication, automated builds with ACR Tasks, and advanced features like artifact streaming and supply chain security.

# SUBCOMMANDS

**Registry Management**
> create, delete, update, show, list, show-usage, show-endpoints, check-name, check-health

**Authentication**
> login, credential show, credential renew, token create, token delete

**Image Operations**
> build, run, import, repository list, repository show-manifests, repository delete

**Tasks**
> task create, task run, task list, task show, task update, task logs

**Replication**
> replication create, replication delete, replication list, replication show

**Advanced**
> webhook create, webhook list, private-endpoint-connection, config content-trust, manifest list-metadata

# PARAMETERS

**-n, --name** _value_
> Name of the container registry

**-g, --resource-group** _value_
> Name of the resource group

**--sku** _value_
> Registry SKU: Basic, Standard, or Premium

**-t, --image** _value_
> Image name and tag (name:tag format)

**-r, --registry** _value_
> Registry name for build operations

# CAVEATS

Registry names must be globally unique and 5-50 characters. The **Premium** SKU is required for geo-replication and private endpoints. ACR Tasks pricing is based on compute time. Log in tokens expire after a period; use **az acr login** to refresh.

# HISTORY

Azure Container Registry launched in **2017** as a managed Docker registry service. It has expanded to support Helm charts, OCI artifacts, and integrated security scanning with Microsoft Defender for Cloud.

# SEE ALSO

[az](/man/az)(1), [az-aks](/man/az-aks)(1), [docker](/man/docker)(1)
