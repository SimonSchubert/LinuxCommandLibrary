# TAGLINE

Flexible command-line template renderer

# TLDR

**Render** a template file

```gomplate -f [template.tmpl]```

**Render** with an environment datasource

```gomplate -d [config=env:] -f [template.tmpl]```

**Render** from stdin

```cat [template.tmpl] | gomplate```

**Output** to a file

```gomplate -f [in.tmpl] -o [out.txt]```

# SYNOPSIS

**gomplate** [*options*]

# DESCRIPTION

**gomplate** is a template CLI built on Go templates. It can pull **datasources** from files, HTTP, environment variables, AWS/GCP metadata, Consul, Vault, and more, then render text configs, scripts, or manifests. Popular for generating Kubernetes YAML, dotenv files, and bootstrapping scripts without a full programming run.

# PARAMETERS

**-f**, **--file** *path*

> Template file (repeatable / dir modes available).

**-o**, **--out** *path*

> Output file (default stdout).

**-d**, **--datasource** *alias=url*

> Define a named datasource (e.g. **config=file:///…**, **env:/**).

**-c**, **--context** *alias=url*

> Attach datasource into the template context.

**--input-dir** / **--output-dir**

> Batch-render directory trees.

Extensive datasource URL schemes are documented at https://docs.gomplate.ca/

# CAVEATS

Template injection risks apply if templates or datasources are untrusted. Network datasources need connectivity and credentials. Syntax is Go text/template plus gomplate functions—not Jinja/Mustache.

# INSTALL

```apk: sudo apk add gomplate```

```brew: brew install gomplate```

```nix: nix profile install nixpkgs#gomplate```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[envsubst](/man/envsubst)(1), [jinja2](/man/jinja2)(1), [ytt](/man/ytt)(1), [helm](/man/helm)(1)

# RESOURCES

```[Source code](https://github.com/hairyhenderson/gomplate)```

```[Documentation](https://docs.gomplate.ca/)```

<!-- verified: 2026-07-19 -->
