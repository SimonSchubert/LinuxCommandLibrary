# TAGLINE

Lint, format, and manage Protocol Buffer files

# TLDR

**Lint Protocol Buffer files**

```buf lint [path/to/protos]```

**Build and verify Protobuf files**

```buf build [path/to/protos]```

**Check for breaking changes**

```buf breaking --against [.git#branch=main]```

**Generate code from Protobuf**

```buf generate```

**Format Protobuf files**

```buf format -w [path/to/protos]```

**Push module to BSR**

```buf push```

**Update dependencies** and the lock file

```buf dep update```

**Check formatting** in CI

```buf format --diff --exit-code```

**Log in** to the Buf Schema Registry

```buf registry login```

# SYNOPSIS

**buf** _command_ [_options_] [_path_]

# PARAMETERS

**lint**
> Run linting rules on Protobuf files.

**build**
> Build Protobuf files and verify they compile.

**breaking**
> Check for breaking API changes.

**generate**
> Generate code using configured plugins.

**format**
> Format Protobuf files.

**push**
> Push module to Buf Schema Registry (BSR).

**dep**
> Manage module dependencies (graph, prune, update).

**convert**
> Convert a message between binary, text, or JSON.

**curl**
> Invoke an RPC endpoint, similar to cURL.

**export**
> Export proto files from one location to another.

**config**
> Work with buf configuration files.

**registry**
> Manage assets on the Buf Schema Registry.

**plugin**
> Manage check plugins declared in configuration (prune, push, update).

**policy**
> Manage policies declared in configuration (prune, push, update).

**stats**
> Print statistics for an input.

**--against** _reference_
> Reference to compare against for breaking changes.

**-w**, **--write**
> Write formatted output back to files.

**-d**, **--diff**
> Display a diff instead of the formatted content (format).

**--exit-code**
> Exit with a non-zero status if the diff is not empty (format).

**-o**, **--output** _path_
> Output location (build, format) or base output directory (generate).

**--template** _path_
> Alternate buf.gen.yaml location or inline data (generate).

**--path** _path_
> Limit the operation to the given files or directories (repeatable).

**--exclude-path** _path_
> Exclude the given files or directories (repeatable).

**--config** _path_
> Path to buf.yaml configuration.

**--error-format** _format_
> Error output format: text, json, msvs, junit, github-actions, or gitlab-code-quality. **buf lint** also accepts config-ignore-yaml.

# DESCRIPTION

**buf** is a tool for working with Protocol Buffers, providing linting, breaking change detection, code generation, and a dependency management ecosystem. It addresses common pain points with protoc and large Protobuf codebases.

The linting engine enforces best practices and style consistency across Protobuf definitions. Breaking change detection compares against git branches or published versions, preventing accidental API incompatibilities.

Code generation is configured via **buf.gen.yaml**, replacing complex protoc command lines. The Buf Schema Registry (BSR) enables sharing and versioning Protobuf modules as dependencies, similar to package managers for other languages.

# CONFIGURATION

**buf.yaml**
> Module configuration defining linting rules, breaking change policies, and dependencies.

**buf.gen.yaml**
> Code generation configuration specifying plugins and output directories.

**buf.lock**
> Dependency lock file for reproducible builds.

# CAVEATS

Without a buf.yaml, buf falls back to default settings; a configuration file is needed to declare dependencies, workspaces, and custom rules. The BSR requires authentication for pushing modules. Breaking change detection may flag intentional changes as breaking; review carefully. Some protoc plugins may not be directly compatible with buf generate.

# HISTORY

Buf was created by **Peter Edge**, a former Uber engineer, and founded as **Buf Technologies** in **2020**. It was developed to solve problems encountered managing large Protobuf codebases, including inconsistent style, accidental breaking changes, and complex build configurations. The Buf Schema Registry launched to provide a npm/Maven-like experience for Protobuf dependencies.

# SEE ALSO

[protoc](/man/protoc)(1), [grpcurl](/man/grpcurl)(1)

# RESOURCES

```[Source code](https://github.com/bufbuild/buf)```

```[Homepage](https://buf.build/)```

```[Documentation](https://buf.build/docs/)```

<!-- verified: 2026-11-09 -->
