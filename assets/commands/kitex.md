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

**Generate with templates**

```kitex -module [module] -template [dir] [idl.thrift]```

# SYNOPSIS

**kitex** [_options_] _idl_file_

# PARAMETERS

_IDL_FILE_
> Thrift or Protobuf IDL file.

**-module** _NAME_
> Go module name.

**-service** _NAME_
> Service name.

**-client**
> Generate client code only.

**-template** _DIR_
> Custom template directory.

**--help**
> Display help information.

# DESCRIPTION

**kitex** is a code generation tool for the Kitex high-performance RPC framework, part of ByteDance's open-source CloudWeGo ecosystem. It reads Thrift or Protocol Buffers interface definition language (IDL) files and generates Go scaffolding code for both servers and clients, including service interfaces, request/response types, serialization logic, and a runnable project skeleton.

The generated code is designed for building Go microservices with features like connection pooling, load balancing, and circuit breaking built into the Kitex framework. By default, kitex produces both server and client code, but the `-client` flag restricts output to client stubs only. Custom code templates can be provided via the `-template` option to control the structure and style of the generated project.

# CAVEATS

Part of CloudWeGo. Go-specific. Thrift or Protobuf IDL required.

# HISTORY

kitex is the code generator for **Kitex**, a high-performance RPC framework created by **ByteDance**.

# SEE ALSO

[thrift](/man/thrift)(1), [protoc](/man/protoc)(1), [go](/man/go)(1)
