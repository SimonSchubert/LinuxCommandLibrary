# TAGLINE

create tags for Docker images

# TLDR

**Tag an image**

```docker tag [source_image] [target_image]:[tag]```

**Tag for private registry**

```docker tag [image] [registry.example.com/image]:[tag]```

**Tag by image ID**

```docker tag [image_id] [repository]:[tag]```

**Add latest tag**

```docker tag [image]:[version] [image]:latest```

# SYNOPSIS

**docker** **tag** _source_image[:tag]_ _target_image[:tag]_

# DESCRIPTION

**docker tag** creates a tag that references an existing image. An image can have multiple tags. Tags are used to version images and prepare them for pushing to registries.

# SEE ALSO

[docker-image-tag](/man/docker-image-tag)(1), [docker-push](/man/docker-push)(1)

