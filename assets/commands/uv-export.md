# TAGLINE

Export dependencies to requirements format

# TLDR

**Export to requirements.txt format**

```uv export > requirements.txt```

**Export to a specific file**

```uv export --output-file [requirements.txt]```

**Export without dev dependencies**

```uv export --no-dev > requirements.txt```

**Export without hashes**

```uv export --no-hashes > requirements.txt```

**Export in pylock.toml format (PEP 751)**

```uv export --format pylock.toml --output-file [pylock.toml]```

**Export as CycloneDX SBOM**

```uv export --format cyclonedx1.5 --output-file [sbom.json]```

**Export script dependencies**

```uv export --script [script.py]```

# SYNOPSIS

**uv** **export** [_options_]

# PARAMETERS

**--format** _format_
> Output format: requirements.txt (default), pylock.toml, or cyclonedx1.5.

**--locked**
> Assert lockfile is up-to-date before exporting.

**--frozen**
> Export without updating the lockfile.

**--no-dev**
> Exclude dev dependencies.

**--no-hashes**
> Exclude hashes from output.

**-o**, **--output-file** _file_
> Write to specified file instead of stdout.

**--script** _file_
> Export dependencies for a PEP 723 script.

# DESCRIPTION

**uv export** exports project dependencies to various formats. The default format is requirements.txt, compatible with pip. It also supports pylock.toml (PEP 751) and CycloneDX SBOM for security auditing and compliance. Useful for deployment environments that don't use uv.

# SEE ALSO

[uv](/man/uv)(1), [uv-lock](/man/uv-lock)(1), [uv-run](/man/uv-run)(1), [pip](/man/pip)(1)

