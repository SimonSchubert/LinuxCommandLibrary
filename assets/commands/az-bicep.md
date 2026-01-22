# TLDR

**Build a Bicep file** to ARM template

```az bicep build --file [main.bicep]```

**Decompile an ARM template** to Bicep

```az bicep decompile --file [template.json]```

**Format a Bicep file**

```az bicep format --file [main.bicep]```

**Lint a Bicep file** for errors

```az bicep lint --file [main.bicep]```

**Generate a parameters file** from Bicep

```az bicep generate-params --file [main.bicep]```

**Install the Bicep CLI**

```az bicep install```

**Upgrade Bicep** to the latest version

```az bicep upgrade```

**Publish a module** to a registry

```az bicep publish --file [main.bicep] --target "br:[registry.azurecr.io/bicep/modules/name:v1]"```

# SYNOPSIS

**az bicep** _subcommand_ [_options_]

# DESCRIPTION

**az bicep** manages the Bicep CLI for Infrastructure as Code on Azure. Bicep is a domain-specific language (DSL) that uses declarative syntax to deploy Azure resources, serving as a transparent abstraction over ARM templates.

The command group provides tools for building, validating, formatting, and publishing Bicep files, as well as converting existing ARM templates to Bicep format.

# SUBCOMMANDS

**Build & Compile**
> build, build-params, decompile, decompile-params

**Validation**
> lint, format

**Parameters**
> generate-params

**Module Management**
> publish, restore

**CLI Management**
> install, uninstall, upgrade, version, list-versions

# PARAMETERS

**--file** _value_
> Path to the Bicep file

**--outdir** _value_
> Output directory for built files

**--outfile** _value_
> Output file path for the built result

**--stdout**
> Output to stdout instead of file

**--target** _value_
> Module registry target for publishing

**--version** _value_
> Specific Bicep CLI version to install

# CAVEATS

Decompilation from ARM templates produces functionally equivalent Bicep but may require manual refinement for readability. Bicep CLI is automatically installed on first use if not present. Module publishing requires a container registry with appropriate permissions.

# HISTORY

Bicep was announced in **August 2020** as a new language for Azure deployments, reaching version 1.0 in **May 2021**. It was designed to simplify the ARM template authoring experience while maintaining full compatibility with the Azure Resource Manager.

# SEE ALSO

[az](/man/az)(1), [az-deployment](/man/az-deployment)(1), [az-group](/man/az-group)(1)
