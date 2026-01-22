# TLDR

**Login to registry**

```ibmcloud cr login```

**List images**

```ibmcloud cr image-list```

**Create namespace**

```ibmcloud cr namespace-add [namespace]```

**Build image**

```ibmcloud cr build -t [registry/namespace/image:tag] [.]```

**Remove image**

```ibmcloud cr image-rm [image]```

**List namespaces**

```ibmcloud cr namespace-list```

# SYNOPSIS

**ibmcloud cr** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Container Registry command.

**login**
> Authenticate to registry.

**image-list**
> List images.

**namespace-add**
> Create namespace.

**build**
> Build and push image.

**image-rm**
> Remove image.

**--help**
> Display help information.

# DESCRIPTION

**ibmcloud cr** manages IBM Cloud Container Registry. It provides private Docker image storage and vulnerability scanning.

The tool handles namespaces, images, and registry authentication. It integrates with IBM Cloud Kubernetes Service.

ibmcloud cr manages container registry.

# CAVEATS

Registry plugin required. Namespace quotas apply. Vulnerability scanning available.

# HISTORY

ibmcloud cr is the Container Registry plugin for **IBM Cloud** CLI.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [docker](/man/docker)(1), [ibmcloud-ks](/man/ibmcloud-ks)(1)
