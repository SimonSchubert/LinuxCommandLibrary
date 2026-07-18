# TAGLINE

YAML templating tool that understands YAML structure

# TLDR

**Render** a template

```ytt -f [template.yml]```

**Overlay** data values

```ytt -f [template.yml] --data-value [key=value]```

**Multiple** files / directories

```ytt -f [config/] -f [values.yml]```

**Output** to a file

```ytt -f [template.yml] > [out.yml]```

# SYNOPSIS

**ytt** [*options*]

# DESCRIPTION

**ytt** (from Carvel) templates YAML by operating on the YAML structure rather than raw text, reducing indentation bugs common with string templates. It supports data values, overlays, functions, and modular libraries—popular for Kubernetes manifests alongside **kapp** and **kbld**.

Docs: https://carvel.dev/ytt/

# PARAMETERS

**-f**, **--file** *path*

> Template or data file/directory (repeatable).

**--data-value** *key=value*

> Set a data value.

**--data-values-file** *path*

> Load data values from YAML.

**--output-files** *dir*

> Write results as files.

See **ytt --help** for strict mode, warnings, and library paths.

# CAVEATS

Learning curve differs from Helm/Go templates. Invalid YAML inputs fail closed. Combine with **kapp** for deploy workflows.

# SEE ALSO

[kapp](/man/kapp)(1), [helm](/man/helm)(1), [gomplate](/man/gomplate)(1), [kustomize](/man/kustomize)(1)

# RESOURCES

```[Source code](https://github.com/carvel-dev/ytt)```

```[Homepage](https://carvel.dev/ytt/)```

```[Documentation](https://carvel.dev/ytt/docs/)```

<!-- verified: 2026-07-19 -->
