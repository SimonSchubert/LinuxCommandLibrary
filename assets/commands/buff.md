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

**Add a dependency**

```buf dep add [buf.build/googleapis/googleapis]```

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
> Manage dependencies (add, update).

**export**
> Export module to a directory.

**--against** _reference_
> Reference to compare against for breaking changes.

**-w**, **--write**
> Write formatted output back to files.

**--config** _path_
> Path to buf.yaml configuration.

**--error-format** _format_
> Error output format: text, json, msvs, github-actions.

# DESCRIPTION

**buf** is a tool for working with Protocol Buffers, providing linting, breaking change detection, code generation, and a dependency management ecosystem. It addresses common pain points with protoc and large Protobuf codebases.

The linting engine enforces best practices and style consistency across Protobuf definitions. Breaking change detection compares against git branches or published versions, preventing accidental API incompatibilities.

Code generation is configured via **buf.gen.yaml**, replacing complex protoc command lines. The Buf Schema Registry (BSR) enables sharing and versioning Protobuf modules as dependencies, similar to package managers for other languages.

# CAVEATS

buf.yaml configuration is required for most operations. The BSR requires authentication for pushing modules. Breaking change detection may flag intentional changes as breaking; review carefully. Some protoc plugins may not be directly compatible with buf generate.

# HISTORY

Buf was created by the team behind gRPC at **Uber** and founded as a company in **2020**. It was developed to solve problems they encountered managing large Protobuf codebases, including inconsistent style, accidental breaking changes, and complex build configurations. The Buf Schema Registry launched to provide a npm/Maven-like experience for Protobuf dependencies.

# SEE ALSO

[protoc](/man/protoc)(1), [grpcurl](/man/grpcurl)(1), [grpc-tools](/man/grpc-tools)(1)
