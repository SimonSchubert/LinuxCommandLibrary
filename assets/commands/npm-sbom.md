# TAGLINE

generates Software Bill of Materials

# TLDR

**Generate SBOM**

```npm sbom```

**SPDX format**

```npm sbom --sbom-format spdx```

**CycloneDX format**

```npm sbom --sbom-format cyclonedx```

**Output to file**

```npm sbom > [sbom.json]```

**Include dev deps**

```npm sbom --omit dev```

# SYNOPSIS

**npm** **sbom** [_options_]

# PARAMETERS

**--sbom-format** _FORMAT_
> Output format (spdx, cyclonedx).

**--omit** _TYPE_
> Omit dependency type.

**--help**
> Display help information.

# DESCRIPTION

**npm sbom** generates Software Bill of Materials. Lists all dependencies.

The command creates SBOM document. Supports SPDX and CycloneDX formats.

# CAVEATS

Added in npm 9. Supply chain security. Multiple formats supported.

# HISTORY

npm sbom was added to support **software supply chain security** initiatives.

# SEE ALSO

[npm](/man/npm)(1), [npm-audit](/man/npm-audit)(1), [npm-ls](/man/npm-ls)(1)

