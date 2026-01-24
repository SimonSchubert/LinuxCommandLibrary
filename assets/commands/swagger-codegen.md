# TLDR

**Generate client**

```swagger-codegen generate -i [api.yaml] -l [java] -o [output/]```

**List languages**

```swagger-codegen langs```

**Generate with config**

```swagger-codegen generate -i [api.yaml] -l [python] -c [config.json] -o [output/]```

**Validate spec**

```swagger-codegen validate -i [api.yaml]```

**Show help for language**

```swagger-codegen config-help -l [typescript-angular]```

# SYNOPSIS

**swagger-codegen** _command_ [_-i input_] [_-l language_] [_-o output_] [_options_]

# PARAMETERS

**generate**
> Generate code.

**langs**
> List languages.

**validate**
> Validate spec.

**-i** _FILE_
> Input spec file.

**-l** _LANG_
> Target language.

**-o** _DIR_
> Output directory.

**-c** _FILE_
> Config file.

# DESCRIPTION

**swagger-codegen** generates API code. It reads OpenAPI specs.

Client generation. Many languages.

Server stubs. Backend scaffolding.

Documentation output. HTML docs.

Customizable templates. Mustache-based.

# CAVEATS

Java required. Large dependency. Consider openapi-generator.

# HISTORY

**swagger-codegen** was created for generating API client libraries from OpenAPI/Swagger specifications.

# SEE ALSO

[openapi-generator](/man/openapi-generator)(1), [oapi-codegen](/man/oapi-codegen)(1)
