# TAGLINE

manages IBM Cloud Container Registry

# TLDR

**Log Docker in** to the registry

```ibmcloud cr login```

**Log Podman in** to the registry

```ibmcloud cr login --client podman```

**Set the target region**

```ibmcloud cr region-set [us-south]```

**Create a namespace** in a resource group

```ibmcloud cr namespace-add -g [resource_group] [namespace]```

**List images**

```ibmcloud cr image-list```

**List images in one namespace** as repository:tag

```ibmcloud cr image-list --restrict [namespace] -q```

**Show the vulnerability report** for an image

```ibmcloud cr va [us.icr.io/namespace/image:tag]```

**Remove an image**

```ibmcloud cr image-rm [us.icr.io/namespace/image:tag]```

**Restore a deleted image** from the trash

```ibmcloud cr image-restore [us.icr.io/namespace/image@digest]```

# SYNOPSIS

**ibmcloud cr** _command_ [_options_]

# PARAMETERS

**login** [**--client** _docker_|_podman_]
> Log the local Docker or Podman client in to the registry (needed for push/pull).

**region-set** [_REGION_]
> Target a registry region (e.g. _us-south_, _eu-de_, _jp-tok_, _global_); lists regions when run without an argument.

**namespace-add** [**-g** _GROUP_] _NAME_
> Create a namespace, optionally in a resource group.

**namespace-list**
> List namespaces in the targeted account.

**namespace-rm** _NAME_
> Delete a namespace and the images in it.

**image-list** (alias **images**)
> List tagged images. **--restrict** limits to a namespace/repository, **-q** prints only repository:tag, **--no-trunc** shows full digests.

**image-digests**
> List all images, including untagged ones, with full digests.

**image-inspect** _IMAGE_
> Show details about an image.

**image-tag** _SOURCE_ _TARGET_
> Add a tag to an existing image.

**image-untag** _IMAGE_
> Remove a tag from an image.

**image-rm** _IMAGE_...
> Delete images; they move to the trash for 30 days.

**image-prune-untagged**
> Delete all untagged images.

**trash-list**, **image-restore** _IMAGE_
> List images in the trash and restore one.

**vulnerability-assessment** (alias **va**) _IMAGE_...
> Show the Vulnerability Advisor report for images.

**retention-policy-set**, **retention-run**
> Configure or run image retention to keep only the newest images per repository.

**quota**, **quota-set**
> Show or set storage and pull-traffic quotas.

**plan**, **plan-upgrade**
> Show or upgrade the registry service plan.

**info**
> Show the registry domain and account.

**--help**
> Display help information.

# DESCRIPTION

**ibmcloud cr** is the IBM Cloud CLI plugin for **IBM Cloud Container Registry**, a managed private registry for OCI/Docker images. Images live in namespaces under a regional domain such as **us.icr.io** or **de.icr.io**, or the global **icr.io**.

The plugin manages namespaces, images, tags, quotas, retention, and Vulnerability Advisor scans. Images themselves are pushed and pulled with **docker** or **podman** after **ibmcloud cr login**. It integrates with IBM Cloud Kubernetes Service and Red Hat OpenShift on IBM Cloud.

# CAVEATS

Requires the **container-registry** plugin (**ibmcloud plugin install container-registry**) and an **ibmcloud login**. The former **ibmcloud cr build** command was removed; build images locally and push them, or use a CI service. Namespace names must be unique within a region. Free plan quotas apply to storage and pull traffic.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [docker](/man/docker)(1), [podman](/man/podman)(1), [ibmcloud-ks](/man/ibmcloud-ks)(1)

# RESOURCES

```[Homepage](https://www.ibm.com/products/container-registry)```

```[Documentation](https://cloud.ibm.com/docs/Registry?topic=Registry-containerregcli)```

<!-- verified: 2026-11-23 -->
