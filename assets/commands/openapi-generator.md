# TLDR

**Generate client library**

```openapi-generator generate -i [spec.yaml] -g [python] -o [./client]```

**Generate server stub**

```openapi-generator generate -i [spec.yaml] -g [spring] -o [./server]```

**List available generators**

```openapi-generator list```

**Generate with config file**

```openapi-generator generate -i [spec.yaml] -g [typescript-axios] -c [config.yaml] -o [./client]```

**Validate spec**

```openapi-generator validate -i [spec.yaml]```

**Generate documentation**

```openapi-generator generate -i [spec.yaml] -g [html2] -o [./docs]```

# SYNOPSIS

**openapi-generator** _command_ [_options_]

# PARAMETERS

**generate**
> Generate code.

**validate**
> Validate spec.

**list**
> List generators.

**-i** _file_
> Input spec file.

**-g** _generator_
> Generator name.

**-o** _dir_
> Output directory.

**-c** _file_
> Config file.

**-p** _params_
> Additional properties.

# DESCRIPTION

**OpenAPI Generator** generates API clients, server stubs, and documentation from OpenAPI (Swagger) specifications. It supports 50+ languages and frameworks.

The tool is a fork of Swagger Codegen with active community development.

# POPULAR GENERATORS

```
Clients: python, typescript-axios, go, java
Servers: spring, python-flask, go-server
Docs: html2, markdown
```

# CAVEATS

Generated code may need customization. Large specs produce many files. Some generators more mature than others.

# HISTORY

OpenAPI Generator was forked from Swagger Codegen in **2018** by **William Cheng** and others to create a more community-driven project.

# SEE ALSO

[swagger](/man/swagger)(1), [oapi-codegen](/man/oapi-codegen)(1), [redoc](/man/redoc)(1)
