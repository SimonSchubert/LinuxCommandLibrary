# TAGLINE

data templating language that generates JSON

# TLDR

**Evaluate Jsonnet file**

```jsonnet [file.jsonnet]```

**Output to file**

```jsonnet [file.jsonnet] -o [output.json]```

**Evaluate with external variable**

```jsonnet --ext-str [name=value] [file.jsonnet]```

**Multi-file output**

```jsonnet -m [output_dir] [file.jsonnet]```

**Evaluate expression**

```jsonnet -e "[{a: 1, b: 2}]"```

**Format Jsonnet file**

```jsonnetfmt [file.jsonnet]```

# SYNOPSIS

**jsonnet** [_options_] _file_

# PARAMETERS

**-o** _file_
> Output file.

**-m** _dir_
> Multi-file output directory.

**-e** _code_
> Evaluate expression.

**--ext-str** _name=value_
> External string variable.

**--ext-code** _name=code_
> External code variable.

**-J** _dir_
> Add library search path.

**-S**, **--string**
> Output as string.

**--tla-str** _name=value_
> Top-level argument string.

# DESCRIPTION

**Jsonnet** is a data templating language that generates JSON. It adds variables, conditionals, functions, and imports to JSON, making configuration files more maintainable.

Jsonnet is used for generating Kubernetes manifests, Prometheus configurations, and other JSON/YAML configs. It evaluates to pure JSON.

# EXAMPLE

```jsonnet
local person(name, age) = {
  name: name,
  age: age,
};

{
  people: [
    person("Alice", 30),
    person("Bob", 25),
  ]
}
```

# CAVEATS

Output is always JSON (use for YAML via conversion). No side effects; pure functional. Libraries need -J path. Not for runtime config.

# HISTORY

Jsonnet was developed at **Google** by **Dave Cunningham** around **2014**. It addressed the need for DRY configuration in cloud infrastructure, gaining adoption in the Kubernetes ecosystem.

# SEE ALSO

[jq](/man/jq)(1), [yq](/man/yq)(1), [dhall](/man/dhall)(1), [cue](/man/cue)(1)
