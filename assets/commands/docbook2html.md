# TAGLINE

DocBook to HTML converter

# TLDR

**Convert** a DocBook SGML document to chunked HTML in the current directory

```docbook2html [document.sgml]```

Convert to a **single HTML file**

```docbook2html --nochunks [document.sgml]```

Write output to a **specific directory**

```docbook2html -o [output_dir] [document.sgml]```

Use a **custom DSSSL stylesheet**

```docbook2html -d [custom.dsl] [document.sgml]```

**Set a stylesheet variable**

```docbook2html -V [variable]=[value] [document.sgml]```

Convert **DocBook XML** with the XSL stylesheets instead

```xsltproc /usr/share/xml/docbook/stylesheet/docbook-xsl/html/docbook.xsl [document.xml] > [output.html]```

# SYNOPSIS

**docbook2html** [_options_] _sgml-file_

# PARAMETERS

**-o**, **--output** _dir_
> Output directory for generated files; stylesheet-defined subdirectories go beneath it.

**-u**, **--nochunks**
> Produce a single large HTML file, overriding the stylesheet's chunking setting.

**-d**, **--dsl** _file_|_default_|_none_
> Use a custom DSSSL stylesheet. Append **#html** or **#print** to select a style specification.

**-V** _variable_[=_value_]
> Set a stylesheet variable.

**-c**, **--cat** _file_
> Add an extra SGML Open Catalog.

**-n**, **--nostd**
> Do not use the standard catalogs.

**-l**, **--dcl** _file_
> Use a custom SGML declaration.

**-s**, **--sgmlbase** _path_
> SGML base directory (default **/usr/share/sgml**).

**-p**, **--parser** _program_
> Use **jade** or **openjade** (jade is tried first).

**-i**, **--include** _section_
> Treat an SGML marked section as "include".

**-w**, **--warning** _type_|_list_
> Enable a warning type, or disable it with a **no-** prefix.

**-e**, **--error** _type_|_list_
> Disable an error type.

**-h**, **--help**
> Display help.

**-v**, **--version**
> Display version.

# DESCRIPTION

**docbook2html** converts DocBook documents to HTML format. DocBook is a semantic markup language for technical documentation that separates content from presentation.

It is part of **docbook-utils** and is a shortcut for **jw -b html**: a shell script that runs **Jade** or **OpenJade** with Norman Walsh's DocBook **DSSSL** stylesheets. By default it creates chunked output (multiple HTML files with navigation) in the current directory; **--nochunks** produces a single file.

The jw toolchain is designed for SGML. For DocBook XML, the modern approach is **xsltproc** (or **xmlto**) with the DocBook XSL stylesheets, which offers more control over transformation parameters.

# XSLTPROC ALTERNATIVE

**Chunked HTML**

```xsltproc --output [output_dir/] /usr/share/xml/docbook/stylesheet/docbook-xsl/html/chunk.xsl [document.xml]```

**Single HTML**

```xsltproc /usr/share/xml/docbook/stylesheet/docbook-xsl/html/docbook.xsl [document.xml] > [output.html]```

# CAVEATS

Requires Jade/OpenJade, the DocBook DTD and the DocBook DSSSL stylesheets. The jw scripts officially handle only SGML, not XML. docbook-utils has not seen a new upstream release since the mid-2000s and is kept alive by distributions. Output file names for chunked HTML are chosen by the stylesheet. Default HTML styling is plain.

# HISTORY

DocBook originated at **HaL Computer Systems** and **O'Reilly** in the early **1990s** as an SGML application for computer documentation. It transitioned to XML in the late 1990s. The docbook-utils package (formerly docbook-tools from Cygnus/Red Hat), including docbook2html, was created to simplify conversions. **Norman Walsh** has been the primary maintainer of DocBook XSL stylesheets since **1999**.

# SEE ALSO

[xsltproc](/man/xsltproc)(1), [xmlto](/man/xmlto)(1), [pandoc](/man/pandoc)(1), [xmllint](/man/xmllint)(1)

# RESOURCES

```[Homepage](https://sourceware.org/docbook-tools/)```

<!-- verified: 2026-11-23 -->
