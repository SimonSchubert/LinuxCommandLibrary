# TAGLINE

TUI for trimming OpenAPI specifications

# TLDR

**Open a local OpenAPI spec file**

```apisnip [input.yaml]```

**Trim and save to a specific output file**

```apisnip [input.yaml] [output.yaml]```

**Open a remote OpenAPI spec** from a URL

```apisnip [https://petstore.swagger.io/v2/swagger.json] [output.yaml]```

# SYNOPSIS

**apisnip** _input_ [_output_]

# PARAMETERS

_input_
> Local file path or remote URL to an OpenAPI specification (required)

_output_
> Output file path (default: apisnip.out.yaml)

# DESCRIPTION

**apisnip** is a terminal user interface for selectively trimming OpenAPI specifications. It presents an interactive list of all API endpoints where you can toggle which ones to keep, then generates a smaller specification file containing only the selected endpoints with all necessary $ref references and components preserved.

Written in Rust using Ratatui, apisnip supports both JSON and YAML formats, fuzzy search with weighted scoring, HTTP method syntax highlighting, automatic theme detection, mouse support, and smart grouping of selected endpoints at the top of the list.

# CAVEATS

Output preserves the original specification structure and ordering. Only endpoints can be selectively included; component schemas are automatically resolved based on selected endpoint references.

# HISTORY

**apisnip** was created by **Michiel Roos** (Tuurlijk) as an open-source Rust project under the MIT license.

# SEE ALSO

[jq](/man/jq)(1), [yq](/man/yq)(1), [curl](/man/curl)(1)
