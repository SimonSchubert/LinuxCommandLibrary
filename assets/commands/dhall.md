# TLDR

**Evaluate a Dhall expression**

```dhall <<< "[expression]"```

**Evaluate a Dhall file**

```dhall < [config.dhall]```

**Convert Dhall to JSON**

```dhall-to-json <<< "[expression]"```

**Convert Dhall to YAML**

```dhall-to-yaml < [config.dhall]```

**Type check a Dhall file**

```dhall type < [config.dhall]```

**Format a Dhall file**

```dhall format < [config.dhall]```

**Convert JSON to Dhall**

```json-to-dhall '[Type]' < [data.json]```

# SYNOPSIS

**dhall** [_command_] [_options_]

# PARAMETERS

**type**
> Infer and display the type of an expression.

**normalize**
> Normalize an expression.

**format**
> Format Dhall source code.

**lint**
> Improve Dhall expressions.

**diff**
> Show differences between two expressions.

**hash**
> Compute semantic hash of expression.

**freeze**
> Add integrity checks to imports.

**encode** / **decode**
> Binary encoding/decoding.

**--explain**
> Provide detailed error explanations.

**--ascii**
> Use ASCII output instead of Unicode.

# DESCRIPTION

**Dhall** is a programmable configuration language that guarantees termination. It provides the power of a programming language (functions, types, imports) while ensuring configurations always produce a result without infinite loops.

Dhall expressions can be converted to JSON, YAML, or other formats for consumption by applications. The language features a strong type system that catches configuration errors at evaluation time.

Key features include: remote imports with integrity checking (content-addressed dependencies), a total type system (no runtime errors), and built-in functions for common transformations.

# EXAMPLE

```dhall
-- config.dhall
let Config = { name : Text, port : Natural }

let defaults = { name = "myapp", port = 8080 }

in  defaults // { port = 9000 }
```

# CAVEATS

Learning curve for those unfamiliar with typed functional programming. Large configurations can be slow to evaluate. Not all tools natively support Dhall; conversion to JSON/YAML adds a build step. Import caching behavior may surprise users.

# HISTORY

Dhall was created by **Gabriella Gonzalez** and first released in **2016**. The name comes from a Hindu grain. It was designed to address the limitations of YAML and JSON for complex configurations while avoiding the Turing-completeness issues that make other templating languages unpredictable. The language has gained adoption for Kubernetes configurations and infrastructure-as-code.

# SEE ALSO

[jq](/man/jq)(1), [yq](/man/yq)(1), [jsonnet](/man/jsonnet)(1)
