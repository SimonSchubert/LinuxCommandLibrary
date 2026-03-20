# TAGLINE

converts Docker Compose files to Kubernetes resources

# TLDR

**Convert to Kubernetes**

```kompose convert```

**Convert specific file**

```kompose convert -f [docker-compose.yml]```

**Convert to Helm chart**

```kompose convert -c```

**Convert with specific** controller type

```kompose convert --controller [daemonSet]```

**Output as JSON** to stdout

```kompose convert --json --stdout```

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
> Set replica count (default 1).

**--controller** _TYPE_
> Set output controller type (deployment, daemonSet, replicationController).

**--volumes** _TYPE_
> Volume generation type (persistentVolumeClaim, emptyDir, hostPath, configMap). Default persistentVolumeClaim.

**--json**
> Generate resource files in JSON format.

**--stdout**
> Print converted objects to stdout.

**--provider** _PROVIDER_
> Target provider (kubernetes, openshift). Default kubernetes.

**--help**
> Display help information.

# DESCRIPTION

**kompose** is a conversion tool that translates Docker Compose files into Kubernetes resource manifests. It parses `docker-compose.yml` definitions and generates corresponding Deployments, Services, PersistentVolumeClaims, and other Kubernetes objects, providing a migration path for applications originally designed to run with Docker Compose.

The tool supports multiple output formats including standard Kubernetes YAML, JSON, and Helm charts. It can also deploy converted resources directly to a cluster with `kompose up` or tear them down with `kompose down`. As a CNCF sandbox project, kompose handles common Compose directives such as port mappings, volumes, environment variables, and replica counts, though some Compose-specific features may require manual adjustment after conversion.

# CAVEATS

Not all Compose features translate. May need manual adjustment. CNCF project.

# HISTORY

kompose was created to help users migrate from Docker Compose to Kubernetes, becoming a CNCF sandbox project.

# SEE ALSO

[kubectl](/man/kubectl)(1), [docker-compose](/man/docker-compose)(1), [helm](/man/helm)(1)
