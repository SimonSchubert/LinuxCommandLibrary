# TAGLINE

high-performance remote procedure call framework

# TLDR

**Generate Go code from proto**

```protoc --go_out=. --go-grpc_out=. [service.proto]```

**Generate Python code**

```python -m grpc_tools.protoc -I. --python_out=. --grpc_python_out=. [service.proto]```

**Call gRPC service**

```grpcurl -plaintext [localhost:50051] [package.Service/Method]```

**List services**

```grpcurl -plaintext [localhost:50051] list```

# DESCRIPTION

**gRPC** is a high-performance RPC framework using Protocol Buffers for serialization. It enables efficient communication between services with features like streaming, authentication, and load balancing.

gRPC uses HTTP/2 for transport and provides code generation for multiple languages from .proto service definitions.

# PROTO FILE EXAMPLE

```protobuf
syntax = "proto3";

service Greeter {
  rpc SayHello (HelloRequest) returns (HelloReply);
  rpc SayHelloStream (HelloRequest) returns (stream HelloReply);
}

message HelloRequest {
  string name = 1;
}

message HelloReply {
  string message = 1;
}
```

# TOOLS

```
protoc          Protocol buffer compiler
grpcurl         Command-line gRPC client
grpc_cli        Official gRPC CLI
evans           Interactive gRPC client
```

# CAVEATS

Requires protocol buffer definitions. HTTP/2 needed; some proxies don't support it. Debugging harder than REST. Browser support requires gRPC-Web.

# HISTORY

gRPC was developed by **Google** and open-sourced in **2015**. It's based on Google's internal Stubby RPC framework and is now a CNCF project used extensively in cloud-native applications.

# SEE ALSO

[protoc](/man/protoc)(1), [grpcurl](/man/grpcurl)(1), [curl](/man/curl)(1)
