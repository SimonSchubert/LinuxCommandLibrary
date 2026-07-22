# TAGLINE

environment specification exporter

# TLDR

**Export current environment**

```conda export > [environment.yml]```

**Export without builds**

```conda export --no-builds > [environment.yml]```

**Export from history** only

```conda export --from-history > [environment.yml]```

# SYNOPSIS

**conda** **export** [_options_]

# PARAMETERS

**-n**, **--name** _name_
> Name of environment to export. Defaults to the active environment.

**-p**, **--prefix** _path_
> Full path to the environment to export (alternative to **--name**).

**-f**, **--file** _file_
> Write output to a file. Format is auto-detected from the filename. Defaults to standard output.

**--format** _format_
> Output format: yaml (default), json, explicit, or requirements.

**--no-builds**
> Exclude build strings from the dependency list, making the file more portable.

**--from-history**
> Only include packages explicitly requested, omitting transitive dependencies.

**-c**, **--channel** _channel_
> Additional channel to include in the export.

**--override-channels**
> Do not include channels from .condarc.

**--ignore-channels**
> Do not prepend channel names to package specs.

**--json**
> Report output as JSON, suitable for programmatic use.

# CONFIGURATION

**~/.condarc**
> User-level conda configuration for channels, package settings, and solver options.

**/opt/conda/.condarc**
> System-wide conda configuration.

# DESCRIPTION

**conda export** outputs the current environment specification in YAML format by default. This can be used to recreate the environment on another system with **conda env create -f environment.yml**.

**conda export** is the newer subcommand and supports multiple output formats via **--format**. The traditional **conda env export** remains supported and produces equivalent YAML.

Use **--from-history** for more portable exports that omit transitive dependencies and platform-specific build strings.

# INSTALL

```dnf: sudo dnf install conda```

```nix: nix profile install nixpkgs#conda```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[conda](/man/conda)(1), [conda-env](/man/conda-env)(1), [conda-list](/man/conda-list)(1)
