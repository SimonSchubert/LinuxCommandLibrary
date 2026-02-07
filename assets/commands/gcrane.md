# TAGLINE

Google Container Registry management tool

# TLDR

**List repositories and tags** in a GCR path

```gcrane ls [gcr.io/project-id]```

**List tags for a specific image**

```gcrane ls [gcr.io/project-id/image]```

**Copy an image** to another location

```gcrane cp [gcr.io/project-id/image:tag] [gcr.io/other-project/image:tag]```

**Copy images recursively** from one path to another

```gcrane cp -r [gcr.io/project-id/repo] [gcr.io/other-project/repo]```

**Find untagged images** that can be garbage collected

```gcrane gc [gcr.io/project-id/repo]```

**Delete untagged images** (garbage collection)

```gcrane gc [gcr.io/project-id/repo] | xargs -n1 gcrane delete```

**Delete a specific image** by digest

```gcrane delete [gcr.io/project-id/image@sha256:digest]```

# SYNOPSIS

**gcrane** _COMMAND_ [_FLAGS_]

# COMMANDS

**ls** _REPOSITORY_
> List tags, manifests, and sub-repositories. More detailed than crane ls.

**cp** [**-r**] _SRC_ _DST_
> Copy images. Use -r for recursive copying of entire repositories.

**gc** _REPOSITORY_
> List images that can be garbage collected (untagged images).

**delete** _IMAGE_
> Delete an image by reference (tag or digest).

**digest** _IMAGE_
> Get the digest of an image.

**manifest** _IMAGE_
> Get the manifest of an image.

**config** _IMAGE_
> Get the config of an image.

# PARAMETERS

**-r**
> Copy images recursively (for cp command).

**--platform** _PLATFORM_
> Specify platform for multi-arch images.

**-v**, **--verbose**
> Enable verbose output.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**gcrane** is a Google Container Registry-specific variant of crane with enhanced features for GCR and Artifact Registry. It provides richer output for listing operations and garbage collection support not available in standard crane.

Key enhancements over crane include recursive copying with **-r** flag (useful for backups, geo-replication, or mass renaming), detailed repository exploration, and the ability to identify untagged images for cleanup.

gcrane implements a superset of crane commands plus GCR-specific operations. It relies on GCR implementation details that may not be consistent with the general registry specification.

# CAVEATS

Relies on GCR-specific implementation details and may break with registry changes. Requires appropriate GCP authentication (gcloud auth, service account, etc.). The gc command only identifies candidates for deletion; actual deletion requires piping to gcrane delete.

# HISTORY

gcrane is part of the **go-containerregistry** project developed by Google. It was created to provide enhanced tooling for Google Container Registry and Artifact Registry users, extending the general-purpose crane tool with Google-specific features for container image management at scale.

# SEE ALSO

[crane](/man/crane)(1), [docker](/man/docker)(1), [skopeo](/man/skopeo)(1), [gcloud](/man/gcloud)(1)
