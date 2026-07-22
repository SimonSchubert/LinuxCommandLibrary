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

# INSTALL

```apt: sudo apt install docker-cli```

```dnf: sudo dnf install docker-cli```

```pacman: sudo pacman -S docker```

```apk: sudo apk add docker-cli```

```zypper: sudo zypper install docker```

```brew: brew install docker```

```nix: nix profile install nixpkgs#docker```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[docker-image-tag](/man/docker-image-tag)(1)

