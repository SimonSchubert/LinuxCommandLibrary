# TAGLINE

Set the current Docker Buildx builder instance

# TLDR

**Switch to** a named builder

```docker buildx use [builder_name]```

**Use a Docker context's** default builder

```docker buildx use [context_name]```

**Make the builder the default** for the current context

```docker buildx use --default [builder_name]```

**Keep the builder selected** across context switches

```docker buildx use --global [builder_name]```

# SYNOPSIS

**docker buildx use** [_options_] _name_

# PARAMETERS

**--default**
> Set this builder as the default for the current Docker context.

**--global**
> Persist the selection so it survives Docker context changes.

**--builder** _name_
> Override the configured builder for this invocation (same as **docker buildx --builder**).

# DESCRIPTION

**docker buildx use** selects which builder later **docker buildx build** commands run on. _name_ is a builder from **docker buildx ls**, or a Docker context name to switch to that context's default builder.

Without **--global**, the selection is tied to the current Docker context: changing context with **docker context use** can change the active builder. **--global** keeps the same builder after context switches. **--default** records the builder as the default for the current context.

The **BUILDX_BUILDER** environment variable and the **--builder** flag override the selected builder for a single command without changing the stored default.

# CAVEATS

**docker buildx use** only changes the default for **docker buildx build**. Plain **docker build** still uses the **default** builder unless you pass **--builder** or run **docker buildx install** so **docker build** is aliased to Buildx. The selected builder must already exist; this command does not create one.

# INSTALL

```apt: sudo apt install docker-cli```

```dnf: sudo dnf install docker-cli```

```pacman: sudo pacman -S docker```

```apk: sudo apk add docker-cli```

```zypper: sudo zypper install docker```

```brew: brew install docker```

```nix: nix profile install nixpkgs#docker```

<!-- packages: 2026-09-02 -->

# SEE ALSO

[docker-buildx-ls](/man/docker-buildx-ls)(1), [docker-buildx-create](/man/docker-buildx-create)(1), [docker-buildx-inspect](/man/docker-buildx-inspect)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/docker/buildx)```

```[Documentation](https://docs.docker.com/reference/cli/docker/buildx/use/)```

<!-- verified: 2026-09-02 -->
