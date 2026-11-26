# TAGLINE

Manage Podman volumes

# TLDR

**List** volumes

```podman volume ls```

**Create** a named volume

```podman volume create [volume]```

**Export** a volume to a tar archive

```podman volume export -o [path/to/file.tar] [volume]```

**Import** a tar archive into an existing volume

```podman volume import [volume] [path/to/file.tar]```

**Inspect** a volume

```podman volume inspect [volume]```

Remove volumes that **no container uses**

```podman volume prune```

# SYNOPSIS

**podman volume** _subcommand_

# PARAMETERS

**create** _name_
> Create a volume. With no name, Podman generates one.

**ls**
> List volumes. **list** is an alias of **ls**.

**inspect** _volume_...
> Print detailed information about one or more volumes.

**export** _volume_
> Write the volume contents as a tar archive. **-o** sets the output file.

**import** _volume_ _file_
> Copy a tar archive into a volume that already exists.

**rm** _volume_...
> Remove one or more volumes.

**prune**
> Remove volumes that no container is using.

**exists** _volume_
> Exit successfully when the volume exists.

**mount** _volume_
> Mount a volume and print the mount point.

**unmount** _volume_
> Unmount a volume.

**rename** _old_ _new_
> Rename a volume.

**reload**
> Reload volumes from volume plugins.

# DESCRIPTION

**podman volume** manages named volumes for Podman containers. A volume is storage that outlives the container that uses it. Containers attach a volume with **podman run -v** or **--mount**. This command creates, lists, copies, and deletes those volumes. It is a subcommand of **podman**, not a separate program.

**export** and **import** move the files inside a volume as a tar archive. Import writes into a volume that **create** (or a previous container) already made. **prune** deletes only volumes that no container still references.

# CAVEATS

**rm** and **prune** refuse a volume that a container still uses. Export and import do not create the volume for you. A volume plugin must be available before **reload** can see the volumes it provides.

# INSTALL

```apt: sudo apt install podman```

```dnf: sudo dnf install podman```

```pacman: sudo pacman -S podman```

```apk: sudo apk add podman```

```zypper: sudo zypper install podman```

```brew: brew install podman```

```nix: nix profile install nixpkgs#podman```

<!-- packages: 2026-11-26 -->

# SEE ALSO

[podman](/man/podman)(1), [podman-run](/man/podman-run)(1)

# RESOURCES

```[Source code](https://github.com/containers/podman)```

```[Documentation](https://docs.podman.io/en/latest/markdown/podman-volume.1.html)```

<!-- verified: 2026-11-26 -->
