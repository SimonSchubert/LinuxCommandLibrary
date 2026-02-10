# TAGLINE

generates Go code from OpenAPI 3

# TLDR

**Generate Go server code**

```oapi-codegen -generate server -package [api] [spec.yaml] > [server.go]```

**Generate Go client code**

```oapi-codegen -generate client -package [api] [spec.yaml] > [client.go]```

**Generate types only**

```oapi-codegen -generate types -package [api] [spec.yaml] > [types.go]```

**Generate with config file**

```oapi-codegen --config [config.yaml] [spec.yaml]```

**Generate all components**

```oapi-codegen -generate server,client,types -package [api] [spec.yaml]```

# SYNOPSIS

**oapi-codegen** [_options_] _spec_

# PARAMETERS

**-generate** _type_
> server, client, types, spec, chi-server, gin-server, echo-server.

**-package** _name_
> Go package name.

**-o** _file_
> Output file.

**--config** _file_
> Config file.

**-include-tags** _tags_
> Include only these tags.

**-exclude-tags** _tags_
> Exclude these tags.

# DESCRIPTION

**oapi-codegen** generates Go code from OpenAPI 3.0 specifications. It can generate server boilerplate, clients, and type definitions.

Supports multiple server frameworks including Chi, Gin, and Echo.

# CONFIG FILE

```yaml
# config.yaml
package: api
generate:
  - types
  - chi-server
  - client
output: api.gen.go
```

# CAVEATS

OpenAPI 3.0+ only. Generated code may need modification. Large specs produce large files.

# HISTORY

oapi-codegen was created by **DeepMap, Inc.** to provide high-quality Go code generation from OpenAPI specifications.

# SEE ALSO

[openapi-generator](/man/openapi-generator)(1), [swagger](/man/swagger)(1), [go-swagger](/man/go-swagger)(1)
