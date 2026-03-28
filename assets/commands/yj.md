# TAGLINE

Convert between YAML, JSON, TOML, and HCL

# TLDR

Convert a **YAML file to JSON**

```cat [file.yaml] | yj```

Convert a **YAML file to TOML**

```cat [file.yaml] | yj -yt```

Convert a **JSON file to YAML**

```cat [file.json] | yj -jy```

Convert a **TOML file to JSON** with **indented output**

```cat [file.toml] | yj -ti```

Convert an **HCL file to JSON**

```cat [file.hcl] | yj -c```

Convert a **JSON file to TOML** with **indented output**

```cat [file.json] | yj -jti```

# SYNOPSIS

**yj** [**-**][_ytjcrneikhv_]

# PARAMETERS

**-yj**, **-y**
> Convert YAML to JSON (default)

**-yy**
> Convert YAML to YAML

**-yt**
> Convert YAML to TOML

**-yc**
> Convert YAML to HCL

**-jy**, **-r**
> Convert JSON to YAML

**-jj**
> Convert JSON to JSON

**-jt**
> Convert JSON to TOML

**-jc**
> Convert JSON to HCL

**-tj**, **-t**
> Convert TOML to JSON

**-ty**
> Convert TOML to YAML

**-tt**
> Convert TOML to TOML

**-tc**
> Convert TOML to HCL

**-cj**, **-c**
> Convert HCL to JSON

**-cy**
> Convert HCL to YAML

**-ct**
> Convert HCL to TOML

**-cc**
> Convert HCL to HCL

**-n**
> Do not convert inf, -inf, and NaN to/from strings (YAML or TOML only)

**-e**
> Escape HTML characters in output (JSON only)

**-i**
> Indent output (JSON or TOML only)

**-k**
> Attempt to parse keys as objects or numeric types (YAML output only)

**-h**
> Show help

**-v**
> Show version

# DESCRIPTION

**yj** is a lightweight command-line tool for converting between **YAML**, **JSON**, **TOML**, and **HCL** serialization formats. It reads from **stdin** and writes to **stdout**, making it easy to compose with other Unix tools via piping.

A key feature of yj is that it **preserves map key order** during conversion, which many similar tools do not. The default behavior converts YAML to JSON. Conversion direction is specified by combining format letters: the first letter is the input format and the second is the output format (e.g. **-yt** for YAML to TOML).

Supported format versions are YAML v1.2, TOML v1.0.0, JSON RFC 7159, and HCL v1.

# CAVEATS

Only **HCL v1** is supported. Modern Terraform files using HCL2 syntax may not parse correctly. The tool reads exclusively from stdin and writes to stdout; there are no flags for specifying input or output files directly. JSON and TOML output is compact by default and requires **-i** for human-readable indented output.

# HISTORY

**yj** was created by **Stephen Levine** and first released in **March 2017**. It is written in **Go** and is available on GitHub at sclevine/yj. The tool is installable via Homebrew and as pre-built binaries for Linux, macOS, and Windows. It is licensed under the Apache License 2.0.

# SEE ALSO

[jq](/man/jq)(1), [yq](/man/yq)(1), [toml](/man/toml)(1), [python](/man/python)(1)
