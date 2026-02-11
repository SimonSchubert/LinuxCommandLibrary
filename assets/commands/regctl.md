# TAGLINE

Manage container registry images and tags

# TLDR

**List tags for an image**

```regctl tag ls [registry/image]```

**Inspect an image** without pulling

```regctl image inspect [registry/image:tag]```

**Copy an image** between registries

```regctl image copy [source/image:tag] [dest/image:tag]```

**Get image digest**

```regctl image digest [registry/image:tag]```

**Delete a tag** from registry

```regctl tag rm [registry/image:tag]```

**Export an image to OCI layout**

```regctl image export [registry/image:tag] [output.tar]```

**List repositories** in a registry

```regctl repo ls [registry]```

**Check Docker Hub rate limits**

```regctl registry ratelimit docker.io```

# SYNOPSIS

**regctl** _command_ [_subcommand_] [_options_] [_arguments_]

# PARAMETERS

**image inspect** _ref_
> Display image configuration and metadata

**image copy** _src_ _dest_
> Copy image between registries (efficient layer reuse)

**image digest** _ref_
> Get image digest

**image export** _ref_ _file_
> Export image to tar file (OCI or Docker format)

**image import** _ref_ _file_
> Import image from tar file

**tag ls** _repository_
> List tags in a repository

**tag rm** _ref_
> Delete a tag from registry

**repo ls** _registry_
> List repositories in a registry

**manifest get** _ref_
> Get raw manifest content

**manifest put** _ref_
> Upload manifest to registry

**blob get** _ref_
> Download blob content

**registry login** _registry_
> Authenticate with a registry

**--platform** _os/arch_
> Filter by platform (linux/amd64, linux/arm64)

**--format** _template_
> Output format (Go template)

**-v**, **--verbosity** _level_
> Set logging verbosity

# DESCRIPTION

**regctl** is a CLI tool for interacting with OCI-compliant container registries without requiring a container runtime or privileged access. It provides efficient image operations by working directly with registry APIs.

The tool excels at copying images between registries, transferring only layers that don't exist at the destination. This makes it efficient for mirroring, promoting images between environments, or synchronizing across air-gapped systems.

Regctl supports multi-platform images, OCI artifacts, and can work with OCI Layout directories as local registry equivalents. It automatically imports credentials from Docker CLI configuration.

Common workflows include inspecting remote images, copying between registries, managing tags, checking rate limits, and exporting/importing images for offline transfer.

# CONFIGURATION

**~/.regctl/config.json**
> Main configuration file storing registry credentials, default settings, and registry-specific options.

**~/.docker/config.json**
> Docker CLI credential store, automatically imported by regctl for registry authentication.

# CAVEATS

Delete operations require registries to support the delete API, which some (like Docker Hub for free accounts) may restrict.

Authentication is inherited from Docker CLI config by default. Use **regctl registry login** for separate credential management.

Multi-platform images require **--platform** to select a specific architecture when operations cannot handle manifests lists (like some exports).

Rate limits apply to Docker Hub and other registries. Use **regctl registry ratelimit** to check current status before bulk operations.

# SEE ALSO

[docker](/man/docker)(1), [skopeo](/man/skopeo)(1), [crane](/man/crane)(1), [podman](/man/podman)(1)
