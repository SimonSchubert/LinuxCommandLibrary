# TLDR

**Tag an image**

```docker image tag [source_image] [target_image]:[tag]```

**Tag with registry prefix**

```docker image tag [image] [registry.example.com/image]:[tag]```

**Tag by image ID**

```docker image tag [image_id] [repository]:[tag]```

# SYNOPSIS

**docker** **image** **tag** _source_image[:tag]_ _target_image[:tag]_

# DESCRIPTION

**docker image tag** creates a tag that refers to an existing image. Tags are references to specific image versions and are used to push images to registries.

# SEE ALSO

[docker-tag](/man/docker-tag)(1), [docker-image-push](/man/docker-image-push)(1)

