# TAGLINE

Docker Registry v2 command-line client

# TLDR

**List repositories** on a registry

```reg ls [registry.example.com]```

**List tags** for an image

```reg tags [registry.example.com/image]```

**Show manifest** JSON

```reg manifest [registry.example.com/image:tag]```

**Show image digest**

```reg digest [registry.example.com/image:tag]```

**Delete** a reference

```reg rm [registry.example.com/image@sha256:digest]```

**Download a layer** to a file

```reg layer -o [layer.tar] [registry.example.com/image@sha256:digest]```

# SYNOPSIS

**reg** [*global-flags*] *command* [*args*]

# DESCRIPTION

**reg** is a Docker Registry HTTP API v2 client for listing repositories and tags, fetching manifests and digests, deleting references, downloading layers, serving a simple registry UI, and optionally querying a Clair server for vulnerabilities. It can use Docker config credentials or explicit **-u**/**-p** flags.

It targets Open Source Distribution-style registries. **reg ls** does not work against Docker Hub's divergent API.

# PARAMETERS

**ls** *registry*

> List repositories (can be slow on large registries).

**tags** *repository*

> List tags for a repository.

**manifest** *ref*

> Print image manifest JSON.

**digest** *ref*

> Print content digest.

**layer** *ref*

> Download a layer blob (**-o** for output path).

**rm** *ref*

> Delete a manifest reference (registry must allow deletes).

**vulns** **--clair** *url* *ref*

> Vulnerability report via Clair.

**server**

> Run static UI server for a registry.

**version**

> Show version.

**-u**, **--username** *user*

> Registry username.

**-p**, **--password** *pass*

> Registry password.

**-k**, **--insecure**

> Skip TLS certificate verification.

**-f**, **--force-non-ssl**

> Allow non-TLS registries.

**-d**

> Debug logging.

**--timeout** *duration*

> HTTP timeout (default 1m).

# CAVEATS

Deleting images requires registry configuration to enable deletes. Hub.docker.com listing is unsupported. Treat credentials carefully; prefer Docker credential helpers when possible.

# SEE ALSO

[docker](/man/docker)(1), [skopeo](/man/skopeo)(1), [crane](/man/crane)(1)

# RESOURCES

```[Source code](https://github.com/genuinetools/reg)```

```[Homepage](https://r.j3ss.co)```

<!-- verified: 2026-07-19 -->
