# TAGLINE

Generate a Software Bill of Materials for the project

# TLDR

**Generate SBOM** in default format

```npm sbom```

**Generate in SPDX** format

```npm sbom --sbom-format spdx```

**Generate in CycloneDX** format

```npm sbom --sbom-format cyclonedx```

**Output to file**

```npm sbom --sbom-format cyclonedx > [sbom.json]```

**Omit dev dependencies**

```npm sbom --omit dev```

**Use only package-lock.json** (ignore node_modules)

```npm sbom --package-lock-only```

# SYNOPSIS

**npm** **sbom** [_options_]

# PARAMETERS

**--sbom-format** _FORMAT_
> Output format: spdx or cyclonedx.

**--omit** _TYPE_
> Omit dependency type (dev, optional, peer).

**--package-lock-only**
> Use package-lock.json only, ignoring node_modules.

**--workspace** _name_
> Run in the context of a specific workspace.

**--workspaces**
> Run for all configured workspaces.

# DESCRIPTION

**npm sbom** generates a Software Bill of Materials (SBOM) listing all dependencies of the current project. It supports the **SPDX** and **CycloneDX** formats, which are industry standards for documenting software supply chain components. The output includes package names, versions, licenses, and dependency relationships.

# CAVEATS

Requires npm 9.5.0 or later. A package-lock.json or node_modules must exist. The --sbom-format option is required for usable output.

# SEE ALSO

[npm](/man/npm)(1), [npm-audit](/man/npm-audit)(1), [npm-ls](/man/npm-ls)(1)

