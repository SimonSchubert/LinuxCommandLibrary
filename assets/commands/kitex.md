# TAGLINE

generates Go code from Thrift or Protobuf IDL files

# TLDR

**Generate service code**

```kitex -module [module] [idl_file.thrift]```

**Generate client code**

```kitex -module [module] -client [idl_file.thrift]```

**Specify service name**

```kitex -module [module] -service [svc] [idl.thrift]```

**Use Protobuf**

```kitex -module [module] [idl.proto]```

**Specify IDL include path**

```kitex -module [module] -I [path/to/includes] [idl.thrift]```

**Reuse existing kitex_gen directory**

```kitex -module [module] -service [svc] -use [import/path/to/kitex_gen] [idl.thrift]```

# SYNOPSIS

**kitex** [_options_] _idl_file_

# PARAMETERS

_IDL_FILE_
> Thrift or Protobuf IDL file.

**-module** _NAME_
> Go module name.

**-service** _NAME_
> Service name.

**-I** _PATH_
> Add search path for IDL includes. Can be specified multiple times.

**-use** _PATH_
> Skip generating kitex_gen and use the specified import path instead.

**-v**, **-verbose**
> Output more logs during generation.

**-type** _TYPE_
> Specify IDL type when it cannot be detected from the file extension.

**-combine-service**
> Combine all services in the IDL into a single service (Thrift only).

**-gen-path** _DIR_
> Specify output directory for generated code (default: kitex_gen).

**-thrift** _VALUE_
> Pass an argument to the thriftgo compiler.

**-protobuf** _VALUE_
> Pass an argument to the protoc compiler.

# DESCRIPTION

**kitex** is a code generation tool for the Kitex high-performance RPC framework, part of ByteDance's open-source CloudWeGo ecosystem. It reads Thrift or Protocol Buffers interface definition language (IDL) files and generates Go scaffolding code for both servers and clients, including service interfaces, request/response types, serialization logic, and a runnable project skeleton.

The generated code is designed for building Go microservices with features like connection pooling, load balancing, and circuit breaking built into the Kitex framework. By default, kitex produces both server and client code, but the `-client` flag restricts output to client stubs only. Custom code templates can be provided via the `-template` option to control the structure and style of the generated project.

# CAVEATS

Part of CloudWeGo. Go-specific. Thrift or Protobuf IDL required.

# HISTORY

kitex is the code generator for **Kitex**, a high-performance RPC framework created by **ByteDance**.

# SEE ALSO

[thrift](/man/thrift)(1), [protoc](/man/protoc)(1), [go](/man/go)(1)
