# TAGLINE

remove container images from a registry

# TLDR

**Delete an image by tag**

```crane delete [registry.example.com/repo:tag]```

**Delete an image by digest**

```crane delete [registry.example.com/repo]@[sha256:abc123...]```

**Delete with verbose output**

```crane delete -v [registry.example.com/repo:tag]```

# SYNOPSIS

**crane** **delete** [_options_] _image_ref_

# PARAMETERS

**-v**, **--verbose**
> Enable verbose logging.

**--platform** _PLATFORM_
> Specifies the platform in the form os/arch (e.g., linux/amd64).

**--insecure**
> Allow image references to be fetched without TLS.

# DESCRIPTION

**crane delete** removes an image manifest from a container registry by tag or digest reference. The image reference must include the full registry path.

When deleting by tag, the registry removes the tag-to-manifest mapping. When deleting by digest, the manifest itself is removed. Use with caution as deletion may be permanent depending on registry configuration and policies.

This command sends an HTTP DELETE request to the registry's manifest endpoint. It requires appropriate authentication and authorization for the target repository.

# CAVEATS

Some registries do not support deletion or require special permissions. Deleting a tag does not necessarily free storage until garbage collection runs. Deleting a manifest by digest may affect other tags pointing to the same manifest. Docker Hub and some hosted registries may have rate limits or restrictions on deletion.

# SEE ALSO

[crane](/man/crane)(1), [crane-tag](/man/crane-tag)(1), [crane-digest](/man/crane-digest)(1), [crane-ls](/man/crane-ls)(1), [crane-manifest](/man/crane-manifest)(1)
