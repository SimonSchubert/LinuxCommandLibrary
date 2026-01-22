# TLDR

**Login to cluster**

```oc login [https://api.cluster:6443]```

**Get resources**

```oc get [pods|services|deployments]```

**Create from YAML**

```oc apply -f [manifest.yaml]```

**Switch project**

```oc project [project_name]```

**View logs**

```oc logs [pod_name]```

**Execute in pod**

```oc exec -it [pod_name] -- [command]```

# SYNOPSIS

**oc** [_command_] [_options_]

# PARAMETERS

**login** _URL_
> Authenticate to cluster.

**get** _RESOURCE_
> List resources.

**apply** **-f** _FILE_
> Apply configuration.

**project** _NAME_
> Switch project/namespace.

**logs** _POD_
> View pod logs.

**exec** _POD_
> Execute in pod.

**--help**
> Display help information.

# DESCRIPTION

**oc** is the OpenShift CLI. Manages OpenShift/Kubernetes clusters.

The tool extends kubectl with OpenShift features. Primary interface for OpenShift.

oc manages OpenShift clusters.

# CAVEATS

OpenShift specific extensions. Compatible with kubectl. Requires cluster access.

# HISTORY

oc was developed by **Red Hat** as the command-line interface for OpenShift Container Platform.

# SEE ALSO

[kubectl](/man/kubectl)(1), [docker](/man/docker)(1), [podman](/man/podman)(1)

