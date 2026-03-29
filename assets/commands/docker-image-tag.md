# TAGLINE

Tag Docker images with repository and version identifiers

# TLDR

**Tag a local image with a name and version**

```docker image tag [source_image]:[tag] [target_image]:[version]```

**Tag an image for a private registry**

```docker image tag [image]:[tag] [registry.example.com:5000/image]:[tag]```

**Tag an image by its ID**

```docker image tag [image_id] [repository]:[tag]```

**Create a latest tag from a versioned image**

```docker image tag [image]:[version] [image]:latest```

# SYNOPSIS

**docker** **image** **tag** _SOURCE_IMAGE[:TAG]_ _TARGET_IMAGE[:TAG]_

# DESCRIPTION

**docker image tag** creates a tag that refers to an existing image. Tags are aliases for image IDs and are used to version images and push them to registries. Multiple tags can point to the same image, allowing different versioning schemes or registry locations without duplicating the image data.

A tag name must be valid ASCII and may contain lowercase and uppercase letters, digits, underscores, periods, and hyphens. It may not start with a period or hyphen and is limited to 128 characters.

If no tag is specified, **latest** is used by default for both the source and target.

# SEE ALSO

[docker-tag](/man/docker-tag)(1), [docker-image-ls](/man/docker-image-ls)(1), [docker-image-pull](/man/docker-image-pull)(1), [docker-image-rm](/man/docker-image-rm)(1), [docker-build](/man/docker-build)(1), [docker-pull](/man/docker-pull)(1)

