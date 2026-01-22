# TLDR

**Build HTML documentation**

```daps -d [DC-file] html```

**Build PDF documentation**

```daps -d [DC-file] pdf```

**Validate DocBook XML** sources

```daps -d [DC-file] validate```

**Build single HTML** page

```daps -d [DC-file] html --single```

**Build EPUB** format

```daps -d [DC-file] epub```

**Show document status**

```daps -d [DC-file] status```

# SYNOPSIS

**daps** [_global-options_] **-d** _DC-file_ _subcommand_ [_options_]

# PARAMETERS

**-d** _DC-FILE_
> Doc config file specifying the document to process.

**-v**, **--verbosity** _LEVEL_
> Set verbosity level (0-3).

**--builddir** _DIR_
> Custom build directory.

**--force**
> Force rebuild of all targets.

**html**
> Build HTML output (chunked by default).

**pdf**
> Build PDF output.

**epub**
> Build EPUB output.

**validate**
> Validate XML sources.

**status**
> Show document status and statistics.

**--single**
> Generate single-page HTML.

**--help**
> Display help information.

# DESCRIPTION

**DAPS** (DocBook Authoring and Publishing Suite) is a toolchain for authoring, translating, and publishing documentation written in DocBook XML. It provides a unified interface for building various output formats from a single source.

DAPS automates the complex process of transforming DocBook sources into professional documentation. It handles XSLT transformations, image conversions, PDF generation through FOP, and packaging for distribution. The suite supports modular documentation with XIncludes and conditional profiling.

The tool is designed for technical writers and documentation teams who need consistent, high-quality output across multiple formats while maintaining a single source of truth.

# CAVEATS

Requires DocBook stylesheets and supporting tools (xmllint, xsltproc, fop). Large documents may have significant build times. PDF generation requires additional Java dependencies. Some features are specific to SUSE documentation workflows.

# HISTORY

DAPS was developed by **SUSE** for their documentation team, released as open source around **2012**. It evolved from internal tooling to support the complex requirements of enterprise documentation with translations, versioning, and multiple output formats.

# SEE ALSO

[xmllint](/man/xmllint)(1), [xsltproc](/man/xsltproc)(1), [fop](/man/fop)(1), [asciidoctor](/man/asciidoctor)(1)
