# TAGLINE

Generate API client code from OpenAPI specs

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

**swagger-codegen** generates API client libraries, server stubs, and documentation from OpenAPI (Swagger) specification files. It reads a YAML or JSON API definition and produces code in dozens of target languages and frameworks including Java, Python, TypeScript, Go, Ruby, and many more.

Client generation creates ready-to-use SDK code with models, API classes, and serialization logic matching the API specification. Server stub generation scaffolds backend code with route definitions and request/response models. Documentation generation produces HTML or other formats.

The tool uses Mustache templates that can be customized to control the exact output format. A configuration file can specify additional options such as package names, model naming conventions, and library preferences for the target language.

# CAVEATS

Java required. Large dependency. Consider openapi-generator.

# HISTORY

**swagger-codegen** was created for generating API client libraries from OpenAPI/Swagger specifications.

# SEE ALSO

[openapi-generator](/man/openapi-generator)(1), [oapi-codegen](/man/oapi-codegen)(1)
