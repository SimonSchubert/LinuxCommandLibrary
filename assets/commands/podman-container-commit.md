# TAGLINE

Create an image from a container's changes

# TLDR

**Create an image** from a container

```podman container commit [container] [image:tag]```

**Set the author**

```podman container commit --author "[Jane Doe]" [container] [image:tag]```

**Apply image instructions** while committing

```podman container commit --change "CMD [/bin/bash]" --change "LABEL [blue=image]" [container] [image:tag]```

**Commit a running container** without pausing it

```podman container commit --pause=false [container] [image:tag]```

**Print only the new image ID**

```podman container commit --quiet [container] [image:tag]```

**Squash the committed layers** into one

```podman container commit --squash [container] [image:tag]```

# SYNOPSIS

**podman container commit** [_options_] _container_ [_image_]

**podman commit** [_options_] _container_ [_image_]

# PARAMETERS

_CONTAINER_
> Name or ID of the container to commit.

_IMAGE_
> Name and optional tag for the new image. If omitted, the repository and tag are `<none>`. A name with no registry component is stored under **localhost**.

**-a**, **--author** _AUTHOR_
> Set the image author.

**-c**, **--change** _INSTRUCTION_
> Apply one image instruction: **CMD**, **ENTRYPOINT**, **ENV**, **EXPOSE**, **LABEL**, **ONBUILD**, **STOPSIGNAL**, **USER**, **VOLUME**, or **WORKDIR**. Repeat the flag for more than one instruction.

**--config** _FILE_
> Merge a JSON Schema2Config blob into the image configuration as the image is committed.

**-f**, **--format** _oci_|_docker_
> Manifest and metadata format. The default is **oci**.

**--iidfile** _FILE_
> Write the new image ID to a file.

**--include-volumes**
> Include volumes that were added to the container with **--volume** or **--mount**. Off by default.

**-m**, **--message** _MESSAGE_
> Set the commit message. The message field is not stored when the format is **oci** (the default).

**-p**, **--pause**=_true_|_false_
> Pause the container while the image is created. The default is **true**.

**-q**, **--quiet**
> Hide copy progress. The new image ID is still printed.

**-s**, **--squash**
> Squash the newly built layers into a single layer.

# DESCRIPTION

**podman container commit** creates an image from the changed root filesystem of a container. It is the same command as **podman commit**, registered under the **podman container** group. The container is paused while the snapshot is taken, unless **--pause** is set to false. When the commit finishes, Podman prints the ID of the new image.

The image records the container's current filesystem, plus any instructions passed with **--change**. It does not record a Containerfile, so the result cannot be rebuilt from a recipe the way **podman build** can.

# CAVEATS

The default format is **oci**, and OCI images do not store the commit message set with **--message**. Pass **--format docker** when that message must be kept.

Volumes added with **--volume** or **--mount** are left out unless **--include-volumes** is set.

Pausing is on by default so other processes cannot change the root filesystem mid-commit. **--pause=false** leaves the container running and can capture an inconsistent snapshot if writes are in flight.

# HISTORY

The **podman-commit** manual page was first compiled in December 2017 by Urvashi Mohnani. **podman container commit** is the same command under Podman's container subcommand group.

# INSTALL

```apt: sudo apt install podman```

```dnf: sudo dnf install podman```

```pacman: sudo pacman -S podman```

```apk: sudo apk add podman```

```zypper: sudo zypper install podman```

```brew: brew install podman```

```nix: nix profile install nixpkgs#podman```

<!-- packages: 2026-09-24 -->

# SEE ALSO

[podman](/man/podman)(1), [podman-commit](/man/podman-commit)(1), [podman-build](/man/podman-build)(1), [podman-run](/man/podman-run)(1), [docker-container-commit](/man/docker-container-commit)(1)

# RESOURCES

```[Source code](https://github.com/containers/podman)```

```[Homepage](https://podman.io)```

```[Documentation](https://docs.podman.io/en/latest/markdown/podman-commit.1.html)```

<!-- verified: 2026-09-24 -->
