# TAGLINE

Explore files in container image layers interactively

# TLDR

**Explore a local container image**

```sou [nginx:latest]```

**Explore a remote container image**

```sou [ghcr.io/user/image:latest]```

# SYNOPSIS

**sou** _image-name_

# DESCRIPTION

**sou** is a TUI tool for inspecting Docker/OCI container image layers. It lets you browse the filesystem within each layer, preview file contents, view image manifests and configuration, and export files locally. The name derives from the Japanese word for "layer."

# HISTORY

**sou** was created by **knqyf263** and is written in **Go**.

# SEE ALSO

[dive](/man/dive)(1), [docker](/man/docker)(1), [skopeo](/man/skopeo)(1)
