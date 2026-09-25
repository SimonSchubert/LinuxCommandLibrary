# TAGLINE

Generate Podman Quadlet files from a command, Compose file, or existing object

# TLDR

Turn a **podman run** into a `.container` Quadlet (stdout)

```podlet podman run [quay.io/podman/hello]```

Write the file into the **current directory**, with an Install section

```podlet --file . --install --description "[Caddy]" podman run --restart always -p [8000:80] [docker.io/library/caddy:latest]```

Drop the file in the **user Quadlet directory**

```podlet --unit-directory podman run [image]```

Give the unit a **name and description**

```podlet --name [caddy] --description "[Caddy web server]" podman run [docker.io/library/caddy:latest]```

Convert a **Compose file** in the current directory

```podlet compose```

Convert a named Compose file into the **user unit directory**

```podlet --unit-directory compose [path/to/compose.yaml]```

Convert Compose into a **`.pod` plus containers**

```podlet compose --pod [path/to/compose.yaml]```

Generate a Quadlet from an **existing container**

```podlet generate container [hello]```

Target a **specific Podman Quadlet version**

```podlet --podman-version [5.2] podman run [image]```

# SYNOPSIS

**podlet** [_options_] _command_

# PARAMETERS

**podman** _subcommand_ [_podman-args_]
> Generate a Quadlet from a Podman command. Put `podlet` in front of the command you would run. Subcommands: **run** (`.container`), **pod** (`.pod`), **kube** (`.kube`), **network** (`.network`), **volume** (`.volume`), **build** (`.build`), **image** (`.image`), **artifact** (`.artifact`). Global Podman flags become `GlobalArgs=` in the Quadlet.

**compose** [_compose-file_] [**--pod**] [**--kube**]
> Generate Quadlets from a Compose file. With no file, Podlet looks in the current directory for `compose.yaml`, `compose.yml`, `docker-compose.yaml`, `docker-compose.yml`, `podman-compose.yaml`, then `podman-compose.yml`. **--pod** also writes a `.pod` file and links each `.container` to it. **--kube** writes Kubernetes Pod YAML plus a `.kube` Quadlet.

**generate** _kind_ _name_
> Generate a Quadlet from an existing Podman object. Kinds: **container**, **pod** (pod plus its containers), **network**, **volume**, **image**. Requires `podman` on `PATH`.

**-f**, **--file** [_FILE_]
> Write file(s) instead of printing to stdout. A directory argument (`.`) writes each Quadlet next to that path.

**-u**, **--unit-directory**
> Write into the Podman Quadlet unit directory (user: `~/.config/containers/systemd/`) instead of stdout.

**--quadlets-file** _NAME_
> Write a single `.quadlets` file for `podman quadlet install` instead of separate Quadlet files.

**-n**, **--name** _NAME_
> Override the generated file name (no extension). Default is taken from the image or object name.

**--overwrite**
> Replace existing files when writing to disk.

**-s**, **--split-options** _QUADLET_OPTION,..._
> Emit listed Quadlet keys as repeated lines instead of joining them. Allowed keys include `AddCapability`, `After`, `Annotation`, `Before`, `Environment`, `Label`, `WantedBy`, and the other values listed in `podlet --help`.

**--skip-services-check**
> Skip the check that refuses to generate a unit whose name already exists as a systemd service.

**-p**, **--podman-version** _VERSION_
> Emit Quadlet syntax for this Podman release (default **5.8**). Aliases: **--compatibility**, **--compat**. Accepted values run from 4.4 through 5.8.

**-a**, **--absolute-host-paths** [_RESOLVE_DIR_]
> Convert relative host paths in the Quadlet to absolute paths, resolving against _RESOLVE_DIR_ or the current directory.

**--service-name** _NAME_
> Set the systemd service name Quadlet will generate.

**-d**, **--description** _TEXT_
> Add a `Description=` to the `[Unit]` section.

**--wants** / **--requires** / **--binds-to** / **--part-of** / **--upholds** _UNIT_
> Add the corresponding systemd dependency.

**--before** / **--after** _UNIT_
> Add ordering dependencies.

**-i**, **--install**
> Add an `[Install]` section (WantedBy=`default.target` unless overridden).

**--wanted-by** / **--required-by** / **--upheld-by** _UNIT_
> Parent dependencies in the `[Install]` section.

**--disable-default-quadlet-dependencies**
> Do not emit Quadlet's default network dependencies.

**--no-start-with-pod**
> Do not start container units automatically with their associated pod.

**-h**, **--help**
> Print help.

**-V**, **--version**
> Print version.

# DESCRIPTION

**podlet** generates Podman Quadlet files from a Podman command, a Compose file, or an existing container, pod, network, volume, or image. Quadlets are small systemd-style unit files (`.container`, `.pod`, `.kube`, `.network`, `.volume`, `.build`, `.image`, `.artifact`) that Podman's generator turns into real systemd services on `daemon-reload`.

The usual workflow is to prefix a working `podman run` (or `podman pod create`, `podman kube play`, and so on) with `podlet`. Options such as `-p` and `-v` become `PublishPort=` and `Volume=` keys. `--file` or `--unit-directory` writes the result; without them, Podlet prints to stdout.

From Compose, Podlet can emit one `.container` per service, a `.pod` plus containers, Kubernetes YAML plus a `.kube` unit, or a `.quadlets` bundle. Generated files are a starting point: review them, then `systemctl --user daemon-reload` (or the system equivalent) and start the unit.

# CAVEATS

Podlet is a generator, not a Quadlet validator. Incompatible Podman flags, bad values, and most option combinations are passed through. Always read the file before enabling the unit.

Compose conversion does not cover the full Compose spec. Unsupported keys (especially when converting to Kubernetes YAML, where some options must apply to the whole pod) cause an error; comment them out or remove them. Compose interpolation (`${VAR}`) is not supported.

`generate` shells out to `podman`. The existing-service check can be skipped with **--skip-services-check**, but colliding unit names will still confuse systemd.

Default output targets Podman **5.8** Quadlet syntax. Use **--podman-version** when the host runs an older Podman.

# HISTORY

**podlet** is a Rust CLI written by **Paul Nettleton** (**k9withabone**). Version **0.1.0** was released on **14 April 2023**. The project joined the **containers** GitHub organization with **0.3.0** in **May 2024** (image moved to `ghcr.io/containers/podlet`). **0.3.2** (18 May 2026) tracks Quadlet options through Podman 5.8, including `.artifact` and `.quadlets` files. Licensed under the **Mozilla Public License 2.0**.

# INSTALL

```dnf: sudo dnf install podlet```

```pacman: sudo pacman -S podlet```

```zypper: sudo zypper install podlet```

```brew: brew install podlet```

```nix: nix profile install nixpkgs#podlet```

<!-- packages: 2026-09-25 -->

# SEE ALSO

[podman](/man/podman)(1), [podman-run](/man/podman-run)(1), [podman-compose](/man/podman-compose)(1), [docker-compose](/man/docker-compose)(1), [systemctl](/man/systemctl)(1), [systemctl-daemon-reload](/man/systemctl-daemon-reload)(1)

# RESOURCES

```[Source code](https://github.com/containers/podlet)```

```[Documentation](https://github.com/containers/podlet#readme)```

<!-- verified: 2026-09-25 -->
