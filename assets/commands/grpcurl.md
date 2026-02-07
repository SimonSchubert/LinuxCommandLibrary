# TAGLINE

command-line gRPC client like curl

# TLDR

**List services** on a gRPC server (with reflection)

```grpcurl [localhost:50051] list```

**Describe a service**

```grpcurl [localhost:50051] describe [package.ServiceName]```

**Call a method** with JSON input

```grpcurl -d '{"name": "[value]"}' [localhost:50051] [package.Service/Method]```

**Call using proto file** instead of reflection

```grpcurl -proto [service.proto] -d '{"id": 1}' [localhost:50051] [package.Service/Method]```

**Call with plaintext** (no TLS)

```grpcurl -plaintext [localhost:50051] [package.Service/Method]```

**Add metadata/headers**

```grpcurl -H "Authorization: Bearer [token]" [localhost:50051] [package.Service/Method]```

**Stream data from file**

```grpcurl -d @ [localhost:50051] [package.Service/Method] < [data.json]```

**List methods** of a service

```grpcurl [localhost:50051] list [package.ServiceName]```

# SYNOPSIS

**grpcurl** [_options_] _target_ [_method_] [_request_]

# PARAMETERS

**-d** _data_
> Request data as JSON string (use @ to read from stdin).

**-proto** _file_
> Proto file defining the service (alternative to reflection).

**-protoset** _file_
> Pre-compiled proto descriptor file.

**-import-path** _path_
> Path to search for proto imports.

**-plaintext**
> Use plaintext (no TLS) connection.

**-insecure**
> Skip TLS certificate verification.

**-H** _header_
> Add header as "name: value" (repeatable).

**-rpc-header** _header_
> Add gRPC metadata header.

**-authority** _name_
> Set :authority pseudo-header.

**-connect-timeout** _seconds_
> Connection timeout.

**-max-time** _seconds_
> Maximum time for the call.

**-format** _fmt_
> Output format: json (default) or text.

**-v**
> Verbose output (show headers).

**list**
> List services or methods.

**describe**
> Describe service, method, or message.

# DESCRIPTION

**grpcurl** is a command-line tool for interacting with gRPC servers, similar to how curl works for HTTP APIs. It can invoke RPC methods, inspect services, and help debug gRPC-based applications.

The tool can discover services in two ways: server reflection (where the server describes its own API) or by providing proto files. Reflection is convenient but must be enabled on the server. Proto files work with any server but require having the service definitions.

For unary calls, request data is provided as JSON via the -d flag. Streaming calls can read multiple messages from stdin. Response data is output as JSON by default, making it easy to parse with jq or other tools.

**grpcurl** handles the complexity of gRPC's HTTP/2 transport, protobuf encoding, and TLS. The -plaintext flag is needed for non-TLS servers (common in development). For production servers with TLS, proper certificates may be required.

# CAVEATS

Server must have reflection enabled for discovery, or proto files must be provided. JSON representation of protobuf has edge cases (especially with bytes, enums, and 64-bit integers). Streaming calls have different interaction patterns. Some gRPC features like deadlines need explicit configuration.

# HISTORY

**grpcurl** was created by FullStory Inc. and released as open-source. It emerged from the need for a curl-equivalent for the gRPC ecosystem, which was gaining adoption for microservices communication. The tool is written in Go and uses the official gRPC-Go libraries.

# SEE ALSO

[curl](/man/curl)(1), [protoc](/man/protoc)(1), [grpc_cli](/man/grpc_cli)(1), [evans](/man/evans)(1)
