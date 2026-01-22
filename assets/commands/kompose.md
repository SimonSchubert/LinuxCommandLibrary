# TLDR

**Convert to Kubernetes**

```kompose convert```

**Convert specific file**

```kompose convert -f [docker-compose.yml]```

**Convert to Helm chart**

```kompose convert -c```

**Output to directory**

```kompose convert -o [output/]```

**Convert with replicas**

```kompose convert --replicas [3]```

**Apply directly to cluster**

```kompose up```

# SYNOPSIS

**kompose** _command_ [_options_]

# PARAMETERS

**convert**
> Convert compose to Kubernetes.

**up**
> Deploy to Kubernetes.

**down**
> Remove from Kubernetes.

**-f** _FILE_
> Compose file to convert.

**-c**, **--chart**
> Output Helm chart.

**-o** _DIR_
> Output directory.

**--replicas** _N_
> Set replica count.

**--help**
> Display help information.

# DESCRIPTION

**kompose** converts Docker Compose files to Kubernetes resources. It generates deployments, services, and other manifests.

The tool simplifies migration from Compose to Kubernetes. It supports various output formats including Helm.

kompose converts Compose to K8s.

# CAVEATS

Not all Compose features translate. May need manual adjustment. CNCF project.

# HISTORY

kompose was created to help users migrate from Docker Compose to Kubernetes, becoming a CNCF sandbox project.

# SEE ALSO

[kubectl](/man/kubectl)(1), [docker-compose](/man/docker-compose)(1), [helm](/man/helm)(1)
