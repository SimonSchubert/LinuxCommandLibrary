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

**kitex** generates Go code from Thrift or Protobuf IDL files. It creates server and client code for the Kitex RPC framework.

The tool is part of ByteDance's CloudWeGo ecosystem. It supports high-performance microservice development.

kitex generates RPC service code.

# CAVEATS

Part of CloudWeGo. Go-specific. Thrift or Protobuf IDL required.

# HISTORY

kitex is the code generator for **Kitex**, a high-performance RPC framework created by **ByteDance**.

# SEE ALSO

[thrift](/man/thrift)(1), [protoc](/man/protoc)(1), [go](/man/go)(1)
