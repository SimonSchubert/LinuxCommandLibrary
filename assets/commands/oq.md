# TAGLINE

Portable jq wrapper with XML and YAML support

# TLDR

**Query JSON** (same as jq)

```oq '.[0]' [file.json]```

**Convert YAML to JSON**

```oq -i yaml '.' [file.yaml]```

**Query XML and output as YAML**

```oq -i xml -o yaml '.root.element' [file.xml]```

# SYNOPSIS

**oq** [_options_] _filter_ [_file_]

# PARAMETERS

**-i** _FORMAT_
> Input format (json, yaml, xml). Default: json.

**-o** _FORMAT_
> Output format (json, yaml, xml). Default: json.

# DESCRIPTION

**oq** is a performant, portable jq wrapper that adds support for consuming and outputting formats beyond JSON, including XML and YAML. All jq filters work as expected — oq handles format conversion on input and output transparently.

# CAVEATS

Requires jq to be installed. XML-to-JSON conversion follows specific mapping rules that may not preserve all XML semantics.

# HISTORY

**oq** was created by **Blacksmoke16** and is written in **Crystal**.

# SEE ALSO

[jq](/man/jq)(1), [yq](/man/yq)(1), [xq](/man/xq)(1)
