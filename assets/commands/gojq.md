# TAGLINE

Pure Go implementation of jq JSON processor

# TLDR

**Pretty print JSON**

```cat [file.json] | gojq .```

**Extract a field**

```cat [file.json] | gojq '.[field]'```

**Filter array elements**

```cat [file.json] | gojq '.[] | select(.active == true)'```

**Map and transform**

```cat [file.json] | gojq '[.[] | {name: .title, id: .uuid}]'```

**Read from file directly**

```gojq '.users[]' [file.json]```

**Process YAML input**

```gojq --yaml-input '.spec.containers[]' [deployment.yaml]```

**Output as YAML**

```gojq --yaml-output '.data' [file.json]```

**Use variables**

```gojq --arg name "[value]" '.items[] | select(.name == $name)' [file.json]```

# SYNOPSIS

**gojq** [_options_] _filter_ [_file_...]

# PARAMETERS

**-r**, **--raw-output**
> Output strings without JSON quotes.

**-c**, **--compact-output**
> Compact output instead of pretty-printed.

**-n**, **--null-input**
> Don't read input; useful with --argjson.

**-e**, **--exit-status**
> Set exit code based on output.

**-s**, **--slurp**
> Read all inputs into array.

**-S**, **--sort-keys**
> Sort object keys in output.

**-C**, **--color-output**
> Force colored output.

**-M**, **--monochrome-output**
> Disable colored output.

**--tab**
> Use tabs for indentation.

**--indent** _n_
> Set indentation level.

**--yaml-input**
> Parse input as YAML.

**--yaml-output**
> Output as YAML instead of JSON.

**--arg** _name_ _value_
> Set variable to string value.

**--argjson** _name_ _json_
> Set variable to JSON value.

**--slurpfile** _name_ _file_
> Set variable to file contents as array.

**--rawfile** _name_ _file_
> Set variable to raw file contents.

**-f**, **--from-file** _file_
> Read filter from file.

**-L** _path_
> Add directory to module search path.

# DESCRIPTION

**gojq** is a pure Go implementation of jq, the JSON processor. It provides the same query language for filtering, transforming, and extracting data from JSON, with additional native YAML support.

The filter language uses **|** for pipelines, **.** for field access, **[]** for iteration, and **select()** for filtering. Complex transformations combine these with object construction, array slicing, and built-in functions.

YAML input and output make gojq particularly useful for Kubernetes and other YAML-heavy workflows. Variables with **--arg** enable parameterized queries for scripting.

# CAVEATS

Some advanced jq features have minor behavioral differences. Performance may differ from C jq on very large files. Module paths are searched differently than jq. SQL-style operators are not implemented.

# HISTORY

gojq was created by **itchyny** and first released around **2019**. It was developed to provide jq functionality in a single Go binary without C dependencies. YAML support was added as a distinguishing feature. The project maintains close compatibility with jq while serving as a library for Go applications needing JSON transformation.

# SEE ALSO

[jq](/man/jq)(1), [yq](/man/yq)(1), [jless](/man/jless)(1), [fx](/man/fx)(1)
