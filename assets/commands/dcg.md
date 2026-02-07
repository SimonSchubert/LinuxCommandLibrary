# TAGLINE

schema-driven code generator for multiple languages

# TLDR

**Generate code** from specification

```dcg [specification.dcg] -o [output_dir]```

**Generate with specific** language target

```dcg [specification.dcg] --lang [go]```

**Generate with custom** templates

```dcg [specification.dcg] --template [template_dir]```

**Validate specification** without generating

```dcg [specification.dcg] --validate```

**List available generators**

```dcg --list-generators```

# SYNOPSIS

**dcg** [_options_] _specification_

# PARAMETERS

_SPECIFICATION_
> Input specification file to process.

**-o**, **--output** _DIR_
> Output directory for generated code.

**--lang** _LANGUAGE_
> Target programming language.

**--template** _DIR_
> Directory containing custom templates.

**--validate**
> Validate specification only.

**--list-generators**
> Show available code generators.

**--help**
> Display help information.

# DESCRIPTION

**dcg** (Data Code Generator) is a code generation tool that transforms data specifications or schemas into code for various programming languages. It automates the creation of data structures, serialization code, and related boilerplate.

The tool reads a specification file describing data types and their relationships, then applies language-specific templates to generate corresponding source code. This approach ensures consistency between documentation and implementation.

Code generators like dcg are valuable in projects with complex data models, multiple language implementations, or requirements for strict schema enforcement across system boundaries.

# CAVEATS

Generated code may require manual adjustments for edge cases. Custom templates require understanding of the template engine. Breaking changes in specifications may require regenerating all dependent code.

# HISTORY

dcg represents a category of code generation tools that emerged to address the challenge of maintaining consistent data representations across multiple languages and platforms. Various implementations exist with different specification formats and target languages.

# SEE ALSO

[protoc](/man/protoc)(1), [thrift](/man/thrift)(1), [swagger](/man/swagger)(1)
